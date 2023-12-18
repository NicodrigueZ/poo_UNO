package Rating;

public class Programa implements Comparable<Programa> {

	private Integer numeroCanal;
	private String nombre;
	private double rating;

	public Programa(Integer numeroCanal, String nombre, double rating) {
		this.numeroCanal = numeroCanal;
		this.nombre = nombre;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "[numeroCanal=" + numeroCanal + ", nombre=" + nombre + ", rating=" + rating + "]";
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

	@Override
	public int compareTo(Programa o) {

		return (Double.compare(rating, o.rating));

	}

}
