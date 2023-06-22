package tema5EjerciciosStringConSolucion;

import java.util.Scanner;

public class Ejercicio_13 {

//	Pedir al usuario dos cadenas de caracteres y un número.
//	El programa debe insertar la segunda cadena en la primera,
//	a partir del carácter de la primera cadena que está en la posición indicada por el número.

	public static void main(String[] args) {

		//Pedir los datos
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dos palabras y un número entero");
		String palabra1=sc.nextLine();
		String palabra2=sc.nextLine();
		int numero=sc.nextInt();
		//Validación
		if (numero>palabra1.length()||numero<0) {
		System.out.println("No es posible añadir la segunda palabra a la primera");
		}else {
		palabra1=palabra1.substring(0, numero)+palabra2+palabra1.substring(numero);
		System.out.println(palabra1);
		}

	}
}
