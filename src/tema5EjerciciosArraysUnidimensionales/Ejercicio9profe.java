
package tema5EjerciciosArraysUnidimensionales;
/*
 *Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo. 
  También muestra los alumnos con notas superiores a la media. El número de alumnos se lee por teclado. 
 */
import java.util.Scanner;

public class Ejercicio9profe {
	
	public static void leerNotas(double[] notas, String[] nombres) {
		// Se lee la nota de cada alummo y se guarda
		// en cada elemento del array
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Introduce el nombre y el apellido del alumno: ");
			nombres[i] = sc.nextLine();
			System.out.print(" Nota: ");
			notas[i] = sc.nextDouble();
			sc.nextLine();
		}
	}

	public static double calculoMedia(double[] notas) {
		// Sumar todas las notas
		double suma = 0, media;
		for (int i = 0; i < notas.length; i++) {
			suma = suma + notas[i];
		}
		// Calcular la media
		media = suma / notas.length;
		return media;

	}

	public static void superMedia(double[] notas, double media, String[] nombres) {
		// Mostrar los valores superiores a la media
		System.out.println();
		System.out.println("Listado de notas superiores a la media: ");
		System.out.println("********************************************");

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > media) {
				System.out.printf("Alumno: " + nombres[i] + "  Nota : %.2f %n", notas[i]);
				// System.out.println("Alumno: " + nombres[i]+ " Nota: " + notas[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numAlum;
		double mediaAlum;

		// Lectura del n�mero de alumnos. Debe ser un valor positivo
		do {
			System.out.print("N�mero de alumnos de la clase: ");
			numAlum = sc.nextInt();
		} while (numAlum <= 0);

		// se crea un array llamado notas de numAlumn elementos de tipo double
		double[] notasAlum = new double[numAlum];
		String[] nombresAlum = new String[numAlum];
		leerNotas(notasAlum, nombresAlum);
		mediaAlum = calculoMedia(notasAlum);
		// Mostrar la media
		System.out.printf("Nota media del curso: %.2f %n", mediaAlum);

		superMedia(notasAlum, mediaAlum, nombresAlum);

	}

}
