package exceptions;

public class Exercici1 {

	public static void main(String[] args) {
		System.out.println("main");
		funcio1();
		System.out.println("   main fin");
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
		finally{
			System.out.println("Finally");
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







