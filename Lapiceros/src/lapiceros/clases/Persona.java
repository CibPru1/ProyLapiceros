package lapiceros.clases;

public class Persona {
	private String nombre;
	private String apellido;
	private Double sueldo;
	private String fecNacimiento;
	private String email;

	public Persona() {

	}

	public Persona(String nombre, String apellido, Double sueldo, String fecNacimiento, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		this.fecNacimiento = fecNacimiento;
		this.email = email;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFecNacimiento() {
		return fecNacimiento;
	}

	public void setFecNacimiento(String fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + ", fecNacimiento="
				+ fecNacimiento + ", email=" + email + "]";
	}

	
	

}
