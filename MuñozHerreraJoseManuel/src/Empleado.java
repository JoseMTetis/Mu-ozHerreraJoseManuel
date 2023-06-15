
public class Empleado {

	private String nombre;
	private int sueldo;
	
	public Empleado ( String nombre, int sueldo) {
		this.sueldo=sueldo;
	}
	

	public boolean tieneSueldoBajo() {
		boolean esSueldoBajo=false;
		if (getSueldo() >= 0 && getSueldo() < 1200) {
			esSueldoBajo=true;
		}
		return esSueldoBajo;
	}
	
	public boolean tieneSueldoAlto() {
		boolean esSueldoAlto=false;
		if (getSueldo() > 3000) {
			esSueldoAlto=true;
		}
		return esSueldoAlto;
	}


	public int getSueldo() {
		return sueldo;
	}
	//Escribo este comentario para poder hacer el segundo commit
}
