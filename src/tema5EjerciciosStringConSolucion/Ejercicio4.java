package tema5EjerciciosStringConSolucion;

import java.util.Scanner;

public class Ejercicio4 {
//	Programa que lea un número telefónico en formato de cadena y 
//  luego lo convierta de la siguiente manera:
//		Número Telefónico: 5256284000
//		Nueva Cadena: (52)-5-6284000
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		String numcadena;

		do { //Validacion
			System.out.println("Introduce un numero de 10 cifras ");
			numcadena = teclado.nextLine();

		} while (numcadena.length() != 10);

		String subCadena1 = numcadena.substring(0, 2);
		String subCadena2 = numcadena.substring(2, 3);
		String subCadena3 = numcadena.substring(3);//si no le pongo el seg parametro va al final 

		System.out.println("El num es " + "(" + subCadena1 + ")-" + subCadena2 + "-" + subCadena3);

	}// main

}
