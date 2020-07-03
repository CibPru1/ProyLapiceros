package lapiceros.prueba3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import lapiceros.clases.Persona;
import lapiceros.utils.Salarios;

public class Prueba3 {
	
	public static void main(String[] args) {
		
		List<Persona> listPersonas = Arrays.asList(
				new Persona("Fausto", "Rodriguez", Salarios.BAJO.getSalario(),"1876-09-15", "fausto@gmail.com"),
				new Persona("Enrique", "Rodriguez", Salarios.ALTO.getSalario(),"1876-09-15", "fausto@gmail.com"),
				new Persona("Maria", "Rodriguez", Salarios.MEDIO.getSalario(),"1876-09-15", "fausto@gmail.com"),
				new Persona("Sofia", "Rodriguez", Salarios.MEDIO.getSalario(),"1876-09-15", "fausto@gmail.com")
				);
		listPersonas.forEach(System.out::println);
	}

}
