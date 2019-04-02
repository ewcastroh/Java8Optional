package optional;

import java.util.Optional;

public class OptionalPrueba {

	public static void main(String[] args) {
		probarOptional("Eimer");
		// probarOptional(null);
		
		orElseOptional("Eimer");
		orElseOptional(null);
		
		orElseThrow("Wilfer");
		// orElseThrow(null);
		
		isPresent("Castro");
		isPresent(null);

	}
	
	public static void probarOptional(String nombre) {
		System.out.println(nombre.length());
	}
	
	public static void crearOptional() {
		Optional<String> optional = Optional.empty();
		optional.get();
	}
	
	public static void orElseOptional(String nombre) {
		Optional<String> optional = Optional.ofNullable(nombre);
		// <String> optional1 = Optional.of(nombre);
		
		String nombreOfNullable = optional.orElse("Llegó null");
		// String nombreOf = optional1.orElse("También llegó null");
		
		System.out.println(nombreOfNullable);
		// System.out.println(nombreOf);
	}
	
	public static void orElseThrow(String nombre) {
		Optional<String> optional = Optional.ofNullable(nombre);
		optional.orElseThrow(NullPointerException::new);
		String nombre1 = optional.get();
		System.out.println(nombre1);
	}
	
	public static void isPresent(String nombre) {
		Optional<String> optional = Optional.ofNullable(nombre);
		System.out.println(optional.isPresent());
	}

}
