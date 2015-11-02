package nodos;

public class AlertaNuls extends NullPointerException {

	private static final long serialVersionUID = 1290122981516556980L;
	/**
	 * 
	 */
	
	String msg;

	public AlertaNuls(String c) {
		this.msg = c;
	}

	public String toString() {
		return "Avís en Gestió de cues: " + msg;
	}
}
