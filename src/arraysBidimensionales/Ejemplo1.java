package arraysBidimensionales;


import java.util.Scanner;

public class Ejemplo1 {
	/*
	 * Crear una matriz 3x2, introducir valores y luego visualizarlos por consola
	 */
	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][2];
		//int i,j;
		
		System.out.println("Vamos a rellenar la matriz");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Introduce " + i + " " +j );
				matriz[i][j]= teclado.nextInt();
			}
		}
		//Mostramos la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Valor de " + i + " " +j + " es "+ matriz[i][j]);
				
			}
		}
		teclado.close();

	}

}
