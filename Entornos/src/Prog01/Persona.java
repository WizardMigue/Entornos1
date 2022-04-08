package Prog01;

/**
 * 
 * Clase Persona es para crear objetos que hacen referencia a personas
 * 
 * Nuestras personas sólo tienen una edad y un nombre
 * 
 * @author Miguel
 * @version 1.0
 *
 */

public class Persona {

	private String nombre;
	private int edad;

	/**
	 * Metodo constructor con los parámetros edad(entero) y nombre (String).
	 * 
	 * @param nombre sin restricción.
	 * @param edad   es un entero y de momento no controlamos nada,
	 */

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
