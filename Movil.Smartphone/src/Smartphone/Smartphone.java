package Smartphone;

public class Smartphone {

	// atributos nuevos de la clases hijo (herencia)
	private String marca;
	private String modelo;
	private String color;
	private int PixelesCamara;
	private int MemoriaInterna;
	private int MemoriaExterna;
	private String nombre;

	// Constructor con las viejas y nuevas caracteristicas
	public Smartphone(String marca, String modelo, String color, String nombre, int PixelesCamara, int MemoriaDiscoDuro,
			int MemoriaSD) {

		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.nombre = nombre;
		this.PixelesCamara = PixelesCamara;
		this.MemoriaInterna = MemoriaDiscoDuro;
		this.MemoriaExterna = MemoriaSD;

	}

	public Smartphone() {
	}

	@Override
	public String toString() {

		return super.toString() + ",Pixelescamara:" + PixelesCamara + ",MemoriaInterna:" + MemoriaInterna
				+ ",MemoriaExterna:" + MemoriaExterna;

	}

	public float getPixelesCamara() {
		return PixelesCamara;
	}

	public void setPixelesCamara(int pixelesCamara) {
		PixelesCamara = pixelesCamara;
	}

	public float getMemoriaInterna() {
		return MemoriaInterna;
	}

	public void setMemoriaInterna(int memoriaInterna) {
		MemoriaInterna = memoriaInterna;
	}

	public float getMemoriaExterna() {
		return MemoriaExterna;
	}

	public void setMemoriaExterna(int memoriaExterna) {
		MemoriaExterna = memoriaExterna;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
