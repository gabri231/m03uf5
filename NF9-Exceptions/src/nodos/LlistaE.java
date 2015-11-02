package nodos;

public class LlistaE implements Cua {
	private int mida;
	private Node head;
	private Node tail;

	public LlistaE() {
		this.mida = 0 ;
		this.head = null;
		this.tail = null;
	}

	@Override
	public void encuar(Object item) {
		if (item == null) throw new AlertaNuls("Encuament d'objecte nul");
		
		Node nou = new Node(item);
		if (mida == 0){
			this.head = nou;
		}
		
		else {
			this.tail.setNext(nou);
		}
		tail = nou;
		mida++;
	}

	@Override
	public Object desencuar() {
		Node eliminat;
		if (mida == 0){
			eliminat = null;
			throw new AlertaNuls("Cua ja és buida!");
		}
		else {
			eliminat = head;
			head = head.getNext();
			mida--;
		}
		return eliminat.getValue();
	}

	@Override
	public Object primer() {
		if (this.head.getValue() == null) throw new AlertaNuls("No hi ha primer perquè la cua és buida");
				
		return this.head.getValue();
		
	}

	@Override
	public int mida() {
		if (mida<1) throw new AlertaNuls("Cua buida, mida és <1");
		return mida;
	}

	@Override
	public boolean esBuida() {
		return mida==0;
	}

	@Override
	public void eliminar() {
		if (mida<1) throw new AlertaNuls("Cua ja buida!");
		this.mida = 0;
		this.head = null;
		this.tail = null;
	}
}
