package exNF9;

import java.io.FileNotFoundException;
import java.io.IOException;

class Examen {

	public static void main(String[] args) {
		//Empleados	
		Empleat empleado1 = crearEmpleado("Empleado1","Cognom1","Responsable", 15000);
		Empleat empleado2 = crearEmpleado("Empleado2","Cognom2","SubResponsable", 15000);
		Empleat empleado3 = crearEmpleado("Empleado3","Cognom3","empleado", 15000);
		Empleat empleado4 = crearEmpleado("Empleado4","Cognom4","empleado", 15000);
		Empleat empleado5 = crearEmpleado("Empleado5","Cognom5","empleado", 15000);
		
		// Jefes
		Jefe gabriel = crearJefe("Gabriel","Calle","Presidente",40000,5000);
		Jefe samir = crearJefe("Samir","Torrez","SubPresidente",30000,3000);
		
		System.out.println(empleado2);
		System.out.println(empleado3);
		System.out.println(empleado4);
		System.out.println(empleado5);
		
		System.out.println(gabriel);
		System.out.println(samir);
		System.out.println("---------------------------------------");
		
		System.out.println("subida de sueldo a los empleados.\n");
		pujarSou(empleado1, 0);
		pujarSou(empleado2, -1);
		pujarSou(empleado3, 3);
		pujarSou(empleado4, -5);
		pujarSou(empleado5, 5);
	
		System.out.println("---------------------------------------");
		System.out.println("No he hecho el ejercicio 4");
		CalculBonus();
		System.out.println("---------------------------------------");
		
		try {
			metodo1(true);
			//metodo1(false);
			//metodo2(true);
			//metodo2(false);
		} catch (ArrayIndexOutOfBoundsException ee) {
			System.out.println(ee.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("---------------------------------------");
		// Final del main
		try {
			metodeFinal();
			System.out.println("Final normal");
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally{
			System.out.println("Final en qualsevol cas");
		}
		
	}

	public static void CalculBonus() {
		
	}

	public static void metodeFinal() throws Exception {
		throw new Exception("ERROR: canvi de fluxe");	
	}

	public static void metodo1(boolean bol) throws FileNotFoundException{
		if (bol){
			throw new FileNotFoundException("ERROR: Fichero no encontrado");
		}else{
			System.out.println("No se ha hecho nada.");
		}
	}
	public static void metodo2(boolean bol) throws ArrayIndexOutOfBoundsException {
		if (bol){
			throw new ArrayIndexOutOfBoundsException("ERROR: Array, fuera de limites");
		}else{
			System.out.println("No se ha hecho nada.");
		}
	}
	
	public static void pujarSou(Empleat empleado, double porcentaje){
		try {
			if (porcentaje < 0){
				throw new AlertaSueldo(empleado.getNom() + ", no s'accepten pujades negatives.");
			}else if (porcentaje == 0){
				throw new AlertaSueldo(empleado.getNom() + ", no pujaràs res.");
			}else{
				empleado.pujarSou(porcentaje);
				System.out.println(empleado.getNom() + ", se ha subido el sueldo.");
			}
		} catch (AlertaSueldo e) {
			System.out.println(e.msg);
		} finally{
			System.out.println("Resultado: "+empleado.getNom()+ ", con sueldo: " + empleado.getSouAnual());
		}
	}	
	
	public static Jefe crearJefe(String nombre, String apellido, String cargo, double sueldoAnual, double bonusAnual){
		Jefe jefe = new Jefe(nombre, apellido, cargo, sueldoAnual, bonusAnual); 
		return jefe;
	}
	public static Empleat crearEmpleado(String nombre, String apellido, String cargo, double sueldoAnual){
		Empleat empleat = new Empleat(nombre, apellido, cargo, sueldoAnual); 
		return empleat;
	}

}
