package Biblioteca;

public enum Genero {

	FICCION("Ficcion"), POESIA("Poesia"), HISTORIA("Historia");

	private String genero;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	private Genero(String genero) {
		this.genero = genero;
	}
}
