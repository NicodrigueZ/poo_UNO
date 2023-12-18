package Parcial;

public class Cancion implements Comparable<Cancion> {

	private String interprete;
	private String nombre;
	private Integer duracion;

	public Cancion(String interprete, String nombre, Integer duracion) {
		this.interprete = interprete;
		this.nombre = nombre;
		this.duracion = duracion;
	}

	public String getInterprete() {
		return interprete;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getDuracion() {
		return duracion;
	}

	@Override
	public int compareTo(Cancion o) {

		return this.duracion.compareTo(o.duracion);
	}

}
