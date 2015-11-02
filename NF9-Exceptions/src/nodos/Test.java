package nodos;

public class Test {
	public static void main(String[] args) {
		Cua cua = new LlistaE();
		try {
			//cua.desencuar();
			
			Integer num = new Integer(1);
			Integer num2 = new Integer(2);
			Integer num3 = new Integer(3);
			
			cua.encuar(num);
			cua.encuar(num2);
			cua.encuar(num3);
			
			System.out.println("la mida es: "+cua.mida());
			
			int mida = cua.mida();
			for (int i = 0; i < mida ; i++) {
				
				System.out.println(cua.primer());
				cua.desencuar();
			}
			System.out.println("la mida es: "+cua.mida());
			
		} catch (AlertaNuls e) {
			System.out.println(e.toString());
		} 
	}
}
