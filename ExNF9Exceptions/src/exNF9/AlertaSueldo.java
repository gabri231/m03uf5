package exNF9;

public class AlertaSueldo extends Exception {
	
	private static final long serialVersionUID = 1L;
	String msg;

	public AlertaSueldo(String string) {
		this.msg = string;
		// TODO Auto-generated constructor stub
	}

	public void AlertaEmpleados(Empleat empleado, String c) {
		this.msg = c;
	}

	public String toString() {
		return "Aviso de sueldo: " + msg;
	}
}