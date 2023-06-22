package tema5EjerciciosArraysUnidimensionales.Ejercicio11Mio;

import java.util.Scanner;

/*
Crear un programa en Java que muestre por pantalla la nota media global 
de una clase de 5 alumnos. De cada alumno se tiene que pedir por pantalla 
el nombre y su nota media y guardarlo en un array.
*/
public class AlumnoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreIntroducida;
		double notaIntroducida = 0;
		Scanner teclado = new Scanner(System.in);

		// Define la estructura, un array de 5 alumnos
		// pero no crea los objetos
		Alumno arraAlumno[] = new Alumno[3];

		// Pido las notas de los alumnos
		for (int i = 0; i < arraAlumno.length; i++) {
			// Defino un objeto alumno y lo almaceno en mi array en esa posicion
			arraAlumno[i] = new Alumno();
			
			System.out.println("Introduce el nombre del alumno ");
			nombreIntroducida = teclado.next();
			arraAlumno[i].setNombre(nombreIntroducida);
			System.out.println("Introduce la nota del alumno ");
			notaIntroducida = teclado.nextDouble();
			arraAlumno[i].setNotaMedia(notaIntroducida);
		} // for
		sacarMedia(notaIntroducida, arraAlumno);
		teclado.close();
	}// main
		// creo un metodo para calcular la media de las medias de lso 5 alumnos

	public static void sacarMedia(double medias, Alumno[] ArraAlum) {
		// Recorro el array y lo voy mostrando
		double sumaMedias = 0;
		for (int i = 0; i < ArraAlum.length; i++) {
			System.out.println("Alumno " + (i + 1));
			System.out.println("Nombre " + ArraAlum[i].getNombre());
			System.out.println("Nota alumno " + ArraAlum[i].getNotaMedia());
			sumaMedias += ArraAlum[i].getNotaMedia();
		}
		System.out.println("Las medias de los 5 alumnos es " + sumaMedias / ArraAlum.length);
	}

}
