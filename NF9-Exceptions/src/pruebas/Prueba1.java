package pruebas;

public class Prueba1 {
	 static void f1() throws Exception {
	   System.out.print("1");
	   try {
	     System.out.print("2");
	     f2();
	     System.out.print("3");
	     }
	   catch (Exception e) { 
		   	System.out.print("4");
		   	throw e;
		   	}
	   finally {  
		   	System.out.print("5");
		   	}
	  System.out.println("6");
	 }

	 static void f2 () throws Exception {
	   if (true) throw new Exception();
	 }

	 public static void main(String s[]) throws Exception { 
	       f1();
	 }
}