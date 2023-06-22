package tema5EjerciciosArraysUnidimensionales;


import java.util.Scanner;

/*
	Ejercicio 7
	Cambio optimo: Crea un vector con monedas y pide por teclado una cantidad y que devuelva el mínimo número de billetes.
	*/
public class Ejercicio8 {
	public static void main(String[] args) {
		char res;
		Scanner tecladoScanner = new Scanner(System.in);
		int[] moneda = {  200, 100, 50, 20, 10, 5, 2, 1 };

		do {
			System.out.println("Introduce cantidad para darte el cambio");
			int cant = tecladoScanner.nextInt();
			calcularcant(moneda, cant);

			System.out.println("Quieres continuar??");
			res = tecladoScanner.next().charAt(0);
			res = Character.toLowerCase(res);
		} while (res == 's');
		System.out.println("Fin Programa");
		tecladoScanner.close();

	}

	public static void calcularcant(int[] arraymoneda, int cant) {
		int cuantos=0;
		for (int i = 0; i < arraymoneda.length; i++) {
			if (cant>=arraymoneda[i]) {
				cuantos=cant/arraymoneda[i];
				System.out.println("Necesitas " + cuantos + " billetes de " + arraymoneda[i]);
				//cant = cant -arraymoneda[i];//Es lo mismo que restarselo
				cant = cant % arraymoneda[i];
			}
		}
		
		

	}

}
