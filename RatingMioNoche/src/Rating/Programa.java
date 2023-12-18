package Rating;

public class Programa {

	private Integer numeroCanal;
	private String nombre;
	private double rating;

	public Programa(Integer numeroCanal, String nombre, double rating) {
		this.numeroCanal = numeroCanal;
		this.nombre = nombre;
		this.rating = rating;
	}

	public Programa() {

	}

	@Override
	public String toString() {
		return "Programa [numeroCanal=" + numeroCanal + ", nombre=" + nombre + ", rating=" + rating + "]";
	}

	public Integer getNumeroCanal() {
		return numeroCanal;
	}

	public String getNombre() {
		return nombre;
	}

	public double getRating() {
		return rating;
	}

}
