package exceptions;

// Fes un mètode anomenat divisió aquest mètode crearà un objecte Excepció en cas de que els divisor
// sigui 0. Crida el mètode divisió des del main i encapsula el codi en un bloc try catch.

public class Exercici3 {

	public static void main(String[] args) {
		try{
			int dividendo = 10;
			int divisor = 0;
			divisio(dividendo, divisor);
		}catch(ArithmeticException e){
			System.out.println("Error de división. Estás dividiendo por cero");
			System.out.println("Tipo de error: " + e.getClass().getName());
		}
	}

	static int divisio(int dividendo, int divisor) throws ArithmeticException{
		if (divisor == 0){
			throw new ArithmeticException();
		}else{
			return dividendo/divisor;	
		}
		
	}	
}







