package Biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Biblioteca {

	private ArrayList<Libro> libros;

	public Biblioteca() {
		libros = new ArrayList<Libro>();

	}

	public boolean agregarLibro(Libro libroNuevo) {

		return libros.add(libroNuevo);
	}

	public int cantidadLibros() {
		int cant = 0;
		for (int i = 0; i < libros.size(); i++) {
			cant++;
		}
		
		return cant;
	}

	public ArrayList<Libro> librosDelGenero(Genero genero) {
		ArrayList<Libro> librosGenero = new ArrayList<Libro>();
		for (Libro libro : libros) {

			if (libro.getGenero() == genero) {
				librosGenero.add(libro);
			}
		}

		return librosGenero;
	}

	public Libro libroConMasPaginas() {
		Libro libroMayor = null;
		Integer MayorPags = -1;
		for (Libro libro : libros) {
			if (libro.getPaginas() > MayorPags) {
				MayorPags = libro.getPaginas();
				libroMayor = libro;
			}

		}

		return libroMayor;
	}

	public int cuantosLibrosDelAutor(String autor) {
		int cont = 0;

		for (Libro libro : libros) {
			if (libro.getAutor() == autor) {
				cont++;
			}
		}

		return cont;
	}

	public ArrayList<Libro> librosDelAutor(String autor) {
		ArrayList<Libro> librosAutor = new ArrayList<Libro>();

		for (Libro libro : libros) {
			if (libro.getAutor() == autor) {
				librosAutor.add(libro);
			}
		}
		return librosAutor;
	}

	public Map<Genero, Integer> librosPorGenero() {
		Map<Genero, Integer> mapaLibroPorGenero = new TreeMap<Genero, Integer>();

		Integer cantidadPoesia = 0;
		Integer cantidadHistoria = 0;
		Integer cantidadFiccion = 0;

		for (Libro libro : libros) {

			if (libro.getGenero() == Genero.FICCION) {

				cantidadFiccion++;
			}

			else if (libro.getGenero() == Genero.HISTORIA) {

				cantidadHistoria++;

			}

			else if (libro.getGenero() == Genero.POESIA) {

				cantidadPoesia++;

			}

		}

		mapaLibroPorGenero.put(Genero.FICCION, cantidadFiccion);
		mapaLibroPorGenero.put(Genero.HISTORIA, cantidadHistoria);
		mapaLibroPorGenero.put(Genero.POESIA, cantidadPoesia);

		// System.out.println(cantidadPoesia);

		return mapaLibroPorGenero;
	}

}
