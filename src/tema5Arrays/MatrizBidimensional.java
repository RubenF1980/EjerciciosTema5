package tema5Arrays;	

import java.util.Scanner;

public class MatrizBidimensional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int[][] a = new int[3][2];
		System.out.println("Lectura de elementos de la matriz: ");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print("a[" + i + "][" + j + "]= ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("valores introducidos:");
		for (i = 0; i < a.length; i++) { //número filas
			for (j = 0; j < a[i].length; j++) { //número de columnas de cada fila
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
