package lapiceros.utils;

public enum Salarios {
	BAJO(90.5),
	MEDIO(150.5),
	ALTO(250.5);
	
	private double sueldo = 0.0;
	
	private Salarios(double sueldo) {
		this.sueldo = sueldo;
	}
	public double getSalario() {
		return sueldo;
	}

}
