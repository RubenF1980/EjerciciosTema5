package maderas;

import java.text.DecimalFormat;
import java.util.Iterator;
//MADERAS
//Caoba Cedro Roble Nogal Teca
//3 mm: 2.5 3.5 4.5 5.5 6.5
//5 mm: 1.5 2.3 3.4 5.4 7.2
//7 mm: 1.5 2.3 4.3 4.5 6.2
//10 mm: 3.5 2.5 3.5 6.5 4.2

//• Introducir los precios por teclado.
//• Visualizar los datos como figuran en la imagen.
//• Calcular y visualizar el valor medio por tipo (nombre) de madera.
//• Visualizar el tipo de madera de menor precio medio y su precio medio.
//• Realizar metodos. 

public class Maderas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] precios = { { 2.5, 3.5, 4.5, 0.5, 6.5 }, { 1.5, 2.3, 3.4, 5.4, 7.2 }, { 1.5, 2.3, 4.3, 4.5, 6.2 },
				{ 3.5, 2.5, 3.5, 6.5, 4.2 } };
		double[] media = new double[5];
		String[] madera = { "Caoba", "Cedro", "Roble", "Nogal", "Teca" };
		String[] grosor = { "3 mm", "5 mm", "7 mm", "10mm" };
		double mediamenor=1000;
		String tipoMenorString = null;

		visualizar(precios, madera, grosor);
		System.out.println();
		// hago un df para formatear el total y que de con 2 decimales
		DecimalFormat df = new DecimalFormat("###.##");
		// hago este metodo para tener los totales de cada posicion
		mediaMadera(media, precios);
		// lo recorro y lo divido por la longitud del array de grososr (4)
		for (int i = 0; i < media.length; i++) {
			if ((media[i] / grosor.length)<mediamenor) {
				mediamenor=(media[i] / grosor.length);
				tipoMenorString= madera[i];
			}
			System.out.println("La media de precios de " + madera[i] + " es " + df.format(media[i] / grosor.length));		
		}
		System.out.println("La madera con menor precio medio es " + tipoMenorString + " y vale " +  mediamenor);
		//System.out.println();
		menorPrecio(precios, madera, grosor);
	}

	public static void visualizar(double[][] precios, String[] madera, String[] grosor) {
		// Primero muestro los tipos de madera
		System.out.print("Esp     ");
		for (int i = 0; i < madera.length; i++) {
			System.out.print(madera[i] + "\t");
		}
		System.out.println();
		// Muestro lo demas
		for (int i = 0; i < precios.length; i++) {
			System.out.print(grosor[i] + "      ");
			for (int j = 0; j < precios[i].length; j++) {
				System.out.print(precios[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void mediaMadera(double[] media, double[][] precios) {
		// recorro y voy almacenando en cada posicion del array los valores totales
		for (int i = 0; i < precios.length; i++) {
			for (int j = 0; j < precios[i].length; j++) {
				media[j] = media[j] + precios[i][j];
			}
		}
	}

	public static void menorPrecio(double[][] precios, String[] madera, String[] grosor) {
		double menor = 1000;
		int a = 0, b = 0;
		for (int i = 0; i < precios.length; i++) {
			for (int j = 0; j < precios[i].length; j++) {
				if (precios[i][j] < menor) {
					menor = precios[i][j];
					a = i;
					b = j;
				}
			}
		}
		System.out.println("La madera con menor precio es " + madera[b] + " de " + grosor[a] + " costando " + menor);

	}

}
