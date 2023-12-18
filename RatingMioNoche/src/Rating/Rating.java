package Rating;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Rating {

	private static Map<Integer, List<Programa>> programas = new TreeMap<Integer, List<Programa>>();

	public static void leerArchivo(String Entrada) throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(new File(Entrada));
		Scanner sc = new Scanner(fr);
		String linea = "";

		try {
			while (sc.hasNext()) {
				linea = sc.nextLine();
				String[] dato = linea.split(",");
				Integer numeroCanal = Integer.parseInt(dato[0]);
				String nombre = dato[1];
				double rating = Double.parseDouble(dato[2]);
				Programa pro = new Programa(numeroCanal, nombre, rating);
				ArrayList<Programa> programa = new ArrayList<Programa>();

				programa.add(pro);
				programas.put(pro.getNumeroCanal(), programa);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();

	}

	public static void escribirArchivo(String Salida) throws IOException {
		FileWriter fr = new FileWriter(new File(Salida));
		PrintWriter pw = new PrintWriter(fr);
		List<Programa> Aux;
		for (Map.Entry<Integer, List<Programa>> cu : programas.entrySet()) {

			Aux = cu.getValue();
			for (Programa programa : Aux) {

			}
			pw.println(cu.getKey());
		}

		pw.close();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Rating.leerArchivo("./src/Rating/Rating.txt");
		Rating.escribirArchivo("./src/Rating/RatingOut.txt");
	}

}
