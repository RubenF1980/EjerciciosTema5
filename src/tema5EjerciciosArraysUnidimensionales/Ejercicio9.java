package tema5EjerciciosArraysUnidimensionales;

import java.util.Scanner;

/*
	Programa que lee por teclado la nota de los alumnos de una clase y 
	calcula la nota media del grupo. También muestra los alumnos con notas 
	superiores a la media. El número de alumnos se lee por teclado.
	*/
public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numAlum;

		// pedimos el num de alumnos mientras sea positivo
		do {
			System.out.println("Introduce num de alumnos");
			numAlum = teclado.nextInt();
		} while (numAlum <= 0);
		// creamos un array para los alumnos y sus nombres 
		double[] notaalumno = new double[numAlum];
		String[] nombresAlumn = new String[numAlum];
		leernotas(notaalumno, nombresAlumn);
		// calculamedia(notaalumno, numAlum);
		Double notamedia = calculamedia(notaalumno, numAlum);
		System.out.println("La nota media es " + notamedia);
		mediamayor(notaalumno, notamedia, nombresAlumn);

	}

	public static void leernotas(double[] notas, String[] nombres) {
		// Se lee la nota de cada alummo y se guarda
		// en cada elemento del array
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Introduce el nombre del alumno");
			nombres[i] = teclado.nextLine();
			System.out.println("Introduce su nota ");
			notas[i] = teclado.nextDouble();
			teclado.nextLine();
		}
	}

	public static Double calculamedia(double[] nota, int alumnos) {
		double sumanota = 0;
		double notamedia;
		for (int i = 0; i < nota.length; i++) {
			sumanota += nota[i];
		}
		//Calcula la media dividida por los alumnos
		notamedia = sumanota / alumnos;
		// System.out.println("La nota media es " + notamedia);
		return notamedia;
	}

	public static void mediamayor(double[] notas, double notamedia, String[] nombresAlumn) {
		int superamedia = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= notamedia) {
				superamedia++;
				System.out.println(nombresAlumn[i] + " supera la media con un " + notas[i] );
			}

		}

	}

}
