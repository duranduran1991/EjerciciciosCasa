package Movil.Smartphone;

public class Movil {

	// Ejemplo: Voy a crear una clase celular, con sus atributos: color, modelo,
	// marca, con dos constructores y
	// los m�todos llamar, cortar llamada, informar caracter�sticas y los
	// m�todos getters y setters que permiten
	// acceder a los atributos de la clase.

	// atributos
	private String marca;
	private String modelo;
	private String color;
	private String nombre;
	
	// constructor
	public Movil(String marca, String modelo, String color,String nombre) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.nombre= nombre ;
	}
	// constructor vacio

	public Movil() {

	}

	// toString
	@Override
	public String toString() {
		return "marca=" + marca + ",modelo=" + modelo + ",color= " + color;
	}

	
	
}