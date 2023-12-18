package Parcial;

import java.util.Arrays;
import java.util.Iterator;

public class PlayList {

	private Cancion[] cancion;

	public PlayList(int maxCantidadDeCanciones) {

	}

	public void agregarCancion(Cancion Cancion) {
		for (int i = 0; i < cancion.length; i++) {
			if (cancion[i] == null) {
				cancion[i] = Cancion;
			}
		}
	}

	public void getCantidadDeCanciones() {
		int cont = 0;

		for (int i = 0; i < cancion.length; i++) {
			if (cancion[i] != null) {
				cont++;
				System.out.println(cont);
			}
		}

	}

	public Cancion cancionEnLaPosicion(int posicion) {
		Cancion c = null;
		for (int i = 0; i < cancion.length; i++) {
			if (i == posicion) {
				c = cancion[i];
			}
		}

		return c;

	}

	public Cancion cancionMayorDuracion() {
		Cancion c = null;
		for (int i = 0; i < cancion.length; i++) {
			Arrays.sort(cancion);
			c = cancion[i];
		}
		return c;
	}

	public Cancion[] cancionesDelInterprete(String interprete) {
		Cancion[] arr = null;
		for (int i = 0; i < cancion.length; i++) {
			if (cancion[i].getInterprete() == interprete) {
				arr = cancion;
			}
		}

		return arr;
	}

	public String tiempoParaEscucharLaPlayList() {
		Integer Acum = null;
		for (int i = 0; i < cancion.length; i++) {
			Acum = Acum + cancion[i].getDuracion();
		}
		return "Tiempo de Reproduccion total de la PlayList" + Acum;
	}

}
