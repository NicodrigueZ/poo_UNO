package Biblioteca;

public class Test {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Libro l1 = new Libro("Libro1", "Jorge", 20, Genero.FICCION);
		Libro l2 = new Libro("Libro2", "Luis", 5, Genero.HISTORIA);
		Libro l3 = new Libro("Libro3", "Sergio", 10, Genero.POESIA);
		Libro l4 = new Libro("Libro4", "Manuel", 15, Genero.FICCION);
		Libro l5 = new Libro("Libro5", "Manuel", 16, Genero.FICCION);

		biblioteca.agregarLibro(l1);
		biblioteca.agregarLibro(l2);
		biblioteca.agregarLibro(l3);
		biblioteca.agregarLibro(l4);
		biblioteca.agregarLibro(l5);

		System.out.println("Cantidad total de libros: " + biblioteca.cantidadLibros());

		System.out.println("---------------------------------");

		System.out.println(biblioteca.librosDelGenero(Genero.FICCION));
		System.out.println(biblioteca.librosDelGenero(Genero.HISTORIA));
		System.out.println(biblioteca.librosDelGenero(Genero.POESIA));

		System.out.println("---------------------------------");

		System.out.println(biblioteca.libroConMasPaginas());

		System.out.println("---------------------------------");

		System.out.println("Cantidad de Libros de este Autor Son: " + biblioteca.cuantosLibrosDelAutor("Manuel"));

		System.out.println("---------------------------------");

		System.out.println(biblioteca.librosDelAutor("Manuel"));

		System.out.println("---------------------------------");

		System.out.println(biblioteca.librosPorGenero());

		System.out.println("---------------------------------");
	}
}
