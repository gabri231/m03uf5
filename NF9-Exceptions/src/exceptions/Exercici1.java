package exceptions;

public class Exercici1 {

	public static void main(String[] args) {
		System.out.println("main");
		funcio1();
		System.out.println("   main fin");
//		try{
//			String str = "Java Code Geeks!";
//			System.out.println("Length: " + str.length());
//			char ch = str.charAt(50);
//		}
//		catch(StringIndexOutOfBoundsException e){
//			System.out.println("ERROR String. El missatge d'error és el següent:");
//			System.out.println(e.getMessage());
//		}
//		finally{
//			System.out.println("Finally");
//		}

	}

	static void funcio3(){
		System.out.println("Funcio3");
		try{
			String[] name = {"string0", "string1", "string2"};
			for(int i = 0; i<=name.length; i++) {
			  System.out.print("\t"+i+name[i] +'\n');
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error en funcio3");
		}
		System.out.println("Funcio3 fin");
	}
	static void funcio2(){
		System.out.println("Funcio2");
		funcio3();
		System.out.println("Funcio2 fin");
	}
	static void funcio1(){
		System.out.println("Funcio1");
		funcio2();
		System.out.println("Funcio1 fin");
	}	
}







