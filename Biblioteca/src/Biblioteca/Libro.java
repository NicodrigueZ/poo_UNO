package Biblioteca;

public class Libro {

	private String titulo;
	private String autor;
	private Integer paginas;
	private Genero genero;

	public Libro(String titulo, String autor, Integer paginas, Genero genero) {
		this.autor = autor;
		this.titulo = titulo;
		this.paginas = paginas;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "[titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + ", genero=" + genero + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public Genero getGenero() {
		return genero;
	}

}
