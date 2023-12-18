package Rating;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Rating {

	private static ArrayList<Programa> programas = new ArrayList<Programa>();

	public static void leerArchivo(String Entrada) throws IOException {

		FileReader fr = new FileReader(new File(Entrada));
		Scanner sc = new Scanner(fr);
		String linea = "";
		try {
			while (sc.hasNext()) {
				linea = sc.nextLine();
				String[] dato;
				dato = linea.split(",");
				Integer numeroCanal = Integer.parseInt(dato[0]);
				String nombre = dato[1];
				double rating = Double.parseDouble(dato[2]);

				System.out.println(dato);
				Programa p = new Programa(numeroCanal, nombre, rating);
				programas.add(p);
				Collections.sort(programas);

			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

	public static void escribirArchivo(String Salida) throws IOException {

		FileWriter fr = new FileWriter(new File(Salida));
		PrintWriter pw = new PrintWriter(fr);

//		for(int i = 0; i < programas.size(); i++) {
//			pw.println(programas.get(i));
//		}

		Collections.reverse(programas);
		for (Programa programa : programas) {

			if (programa.getRating() >= 5)

				pw.println(programa.getNombre() + " " + programa.getRating());
		}

		pw.close();
	}

	public static void main(String[] args) throws IOException {

		Rating.leerArchivo("./src/Rating/rating.txt");
		Rating.escribirArchivo("./src/Rating/ratingOut.txt");

	}
}
