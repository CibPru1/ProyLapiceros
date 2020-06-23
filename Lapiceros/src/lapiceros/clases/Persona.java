package lapiceros.clases;

public class Persona {
	private String nombre;
	private Double sueldo;

	public Persona() {

	}

	public Persona(String nombre, Double sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
	

}
