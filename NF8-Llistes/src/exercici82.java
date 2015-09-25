// http://jagonzalez.org/arraylist-de-objetos-en-java-con-ejemplo-practico/
import java.util.ArrayList;
import java.util.ListIterator;
public class exercici82 {

	public static void main(String[] args) {
		coche car1 = new coche("Alfa Romero","Giulia",2900,6);
		coche car2 = new coche("Dacia","Sandero",1200,4);
		coche car3 = new coche("Ford","Focus",2000,4);
		coche car4 = new coche("Opel","Insignia",2200,4);
		coche car5 = new coche("Seat","Ibiza",1600,4);
		
		ArrayList<coche> array = new ArrayList<coche>();
		array.add(car1);
		array.add(car2);
		array.add(car3);
		array.add(car4);
		array.add(car5);
		
		/*
		System.out.println("for normal**********************************************************************************");
		*/
		
		for(int i=0; i<array.size(); i++){
			System.out.print(array.get(i).getMarca() + " ");
			System.out.print(array.get(i).getModelo() + " ");
			System.out.print(array.get(i).getCilindrada() + " ");
			System.out.print(array.get(i).getCilindres() + " \n");
		}
		
		System.out.println(" ");
		
		
		// For each		
		/*
		System.out.println("\nfor each************************************************************************************");
		for( array.get(0) : array){
			System.out.print( array.get()+ " ");
		}
		*/
		
		/*
		System.out.println("Iterator**********************************************************************************");
		*/
		ListIterator<coche> iterCoche = array.listIterator();
		while(iterCoche.hasNext()){
			coche c = iterCoche.next();
			System.out.println(""
					+ c.getMarca() + " "
					+ c.getModelo() + " "
					+ c.getCilindrada() + " "
					+ c.getCilindres() );
		}
			
		
		
		int potenciaFiscal = 0;
		System.out.println("\n+-------------------------------------------------------+");
		System.out.println("| "+String.format("%1$-13s",car1.getMarca())+"|  "+String.format("%1$-10s",car1.getModelo())+"|   "+car1.getCilindrada()+"\t|   "+car1.getCilindres()+"\t|   "+String.format("%1$-4s",potenciaFiscal)+"|");
		System.out.println("+-------------------------------------------------------+");
		System.out.println("| "+String.format("%1$-13s",car2.getMarca())+"|  "+String.format("%1$-10s",car2.getModelo())+"|   "+car2.getCilindrada()+"\t|   "+car2.getCilindres()+"\t|   "+String.format("%1$-4s",potenciaFiscal)+"|");
		System.out.println("+-------------------------------------------------------+");
		System.out.println("| "+String.format("%1$-13s",car3.getMarca())+"|  "+String.format("%1$-10s",car3.getModelo())+"|   "+car3.getCilindrada()+"\t|   "+car3.getCilindres()+"\t|   "+String.format("%1$-4s",potenciaFiscal)+"|");
		System.out.println("+-------------------------------------------------------+");
		System.out.println("| "+String.format("%1$-13s",car4.getMarca())+"|  "+String.format("%1$-10s",car4.getModelo())+"|   "+car4.getCilindrada()+"\t|   "+car4.getCilindres()+"\t|   "+String.format("%1$-4s",potenciaFiscal)+"|");
		System.out.println("+-------------------------------------------------------+");
		System.out.println("| "+String.format("%1$-13s",car5.getMarca())+"|  "+String.format("%1$-10s",car5.getModelo())+"|   "+car5.getCilindrada()+"\t|   "+car5.getCilindres()+"\t|   "+String.format("%1$-4s",potenciaFiscal)+"|");
		System.out.println("+-------------------------------------------------------+");
	}

}
