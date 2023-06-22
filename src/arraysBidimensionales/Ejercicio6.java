package arraysBidimensionales;
/*
Hacer un programa que cree una matriz de 10 por 10, 
le asigne valores de unos en la diagonal principal y 
valores de ceros en el resto de las posiciones.
*/

public class Ejercicio6 {

	public static void main(String[] args) {

		int[][] matriz = new int[10][10];
		rellenar(matriz);
		mostrar(matriz);
		System.out.println();
		rellenarDiagonal(matriz);
		mostrar(matriz);

	}

	public static void rellenar(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = 0;
			}
		}
	}

	public static void rellenarDiagonal(int[][] matriz) {
		for (int i = 0; i < 10; i++) {
			matriz[i][i] = 1;
		}
	}

	public static void mostrar(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
