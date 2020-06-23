package lapiceros.prueba3;

import java.util.Scanner;

import lapiceros.clases.Persona;
import lapiceros.utils.Salarios;

public class Prueba3 {
	
	public static void main(String[] args) {
		
		String nombre = pedirDatos();
		Double salario = Salarios.BAJO.getSalario();
		
		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setSueldo(salario);
		
		System.out.println(persona);
	}

	private static String pedirDatos() {
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		System.out.println("Escriba su nombre");
		nombre = sc.nextLine();
		return nombre;
		
	}

}
