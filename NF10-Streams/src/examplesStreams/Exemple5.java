package examplesStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Exemple5 {
		public static void main(String[] args) throws IOException {
				
				String url = "http://www.elpais.es";
				BufferedReader br = null;
				
				try {
					URL miUrl = new URL(url);
					
					InputStreamReader in = new InputStreamReader(miUrl.openStream()); 
					br = new BufferedReader(in);
					
					String inputLine = "";
					
					while ( (inputLine = br.readLine() )!= null ){
						if (inputLine.matches("<link href.*")){
							System.out.println(inputLine.replaceAll("<link href=\"", "").replaceAll(".css.*", ".css"));
							urlToFile(inputLine.replaceAll("<link href=\"", "").replaceAll(".css.*", ".css"));
						}
							
					}
					
				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					br.close();
				}
		}
			
		public static void urlToFile(String url) throws IOException{
			BufferedReader br = null;
			BufferedWriter out = null;
			try {
				URL miUrl = new URL(url);
				
				InputStreamReader in = new InputStreamReader(miUrl.openStream()); 
				br = new BufferedReader(in);
				
				String [] name = url.split("/");
				out = new BufferedWriter(new FileWriter(name[name.length-1])); 
				
				String inputLine = "";
				
				while ( (inputLine = br.readLine() )!= null ){
					out.write(inputLine + "\n");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				br.close();
				out.close();
				
			}
		}
}