package Prog02;

/**
 * Clase Coche es para crear objetos que hacen referencia a coches
 * 
 * Los coches solo tienen una marca, modelo, matricula.
 * Los coches pueden tener diferentes precios y colores.
 * 
 * @author Miguel Ovejero Piedrafita.
 * @version 1.0.
 *
 */

public class Coche {

	private String marca;
	private String modelo;
	private int matricula;
	private double precio;
	private String color;

	/**
	 * 
	 * @param marca define el atributo marca que devuelve un texto.
	 * @param modelo define el atributo modelo que devuelve un texto.
	 * @param matricula define el atributo matricula que devuelve un entero.
	 * @param precio define el atributo precio que devuelve un real.
	 * @param color define el atributo color que devuelve un texto.
	 */

	public Coche(String marca, String modelo, int matricula, double precio, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.precio = precio;
		this.color = color;
		/**
		 * Metodo constructor con los parámetros marca(texto), modelo(texto),
		 * matricula(entero), precio(real) y color(texto).
		 */
	}

	/**
	 * @return devulve la marca del coche.
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param establece la marca del coche
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return devuelve el modelo del coche.
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param establece el modelo del coche
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return devuelve la matricula del coche.
	 */
	public int getMatricula() {
		return matricula;
	}

	/**
	 * @param establece la matricula del coche
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return devuelve el precio del coche.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param establece el precio del coche
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return devuelve el color del coche.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param establece el color del coche
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", precio=" + precio
				+ ", color=" + color + "]";
	}

}
