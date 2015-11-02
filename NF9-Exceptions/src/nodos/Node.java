package nodos;

public class Node {
	
	Object value;
	Node next;
	
	
	public Node(Object value) {
		super();
		if (value == null) 
			throw new AlertaNuls("Error: valor nul");
		this.value = value;
	}


	public Object getValue() {
		if (value == null) 
			throw new AlertaNuls("Error: no retorno valors nuls");
		return value;
	}


	public void setValue(Object value) {
		if (value == null) 
			throw new AlertaNuls("Error: no assigno valors nuls");
		this.value = value;
	}


	public Node getNext() {
		if (next == null) 
			throw new AlertaNuls("No hi ha següent");
		return next;
	}


	public void setNext(Node next) {
		if (next == null) 
			throw new AlertaNuls("No es pot afegir un següent que sigui nul");
		this.next = next;
	}
	

} 
