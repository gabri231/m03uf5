package exceptions;

public class Exercici5 {
	public static void main(String[] args) {
		Persona a = new Persona();
		a.setEdat(10);
		System.out.println(a.getEdat());
		
		Persona b = new Persona();
		try {
			b.setEdat(-1);
			System.out.println(b.getEdat());
		} catch (IllegalArgumentException e) {
			System.out.println("Error negativo. Tipo error: "+e.getClass().getName()+"\n");
		}

		Persona c = new Persona();
		c.setEdat(-1);
		System.out.println(c.getEdat());
	}
	
	public static class Persona{
		private int edat;
	    
		public void setEdat(int edat) {
			if (edat < 0){
				throw new IllegalArgumentException();
			}else{
				this.edat = edat;
			}
	    }
		public int getEdat() {
	        return edat;
	    }
	}
}







