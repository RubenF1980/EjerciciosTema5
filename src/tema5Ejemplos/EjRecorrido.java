package tema5Ejemplos;

import java.util.Scanner;

public class EjRecorrido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//usando 2 bucles 
		Scanner teclado = new Scanner(System.in);
		int[] edadTrabajador = new int[2];
		for (int trabajador = 0; trabajador < 2; trabajador++) {
			System.out.print("Introduce la edad para el trabajador:");
			edadTrabajador[trabajador] = teclado.nextInt();
			System.out.println();
		}
		int[] alturaTrabajador = new int[2];
		for (int trabajador = 0; trabajador < 2; trabajador++) {
			System.out.print("Introduce la altura para el trabajador:");
			alturaTrabajador[trabajador] = teclado.nextInt();
			System.out.println();
		}

		/// Con solo un bucle
		Scanner teclado2 = new Scanner(System.in);
		int[] edadTrabajador2 = new int[2];
		int[] alturaTrabajador2 = new int[2];
		for (int trabajador = 0; trabajador < 2; trabajador++) {
			System.out.println("Introduce la altura para el trabajador:");
			edadTrabajador[trabajador] = teclado.nextInt();
			System.out.println("Introduce la edad para el trabajador: ");
			alturaTrabajador[trabajador] = teclado.nextInt();
		}

	}

}
