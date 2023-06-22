package tema5Arrays;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int [] edadTrabajador;
		// edadTrabajador = new int[100];
		int[] edadTrabajador2 = new int[4];
		edadTrabajador2[0] = 5;
		edadTrabajador2[1] = 10;
		edadTrabajador2[2] = 15;
		edadTrabajador2[3] =18;

		for (int i = 0; i < edadTrabajador2.length; i++) {
			System.out.println("Edad de trabajador " + i + " es " + edadTrabajador2[i]);
		}

		int suma = edadTrabajador2[0] + edadTrabajador2[2];
		System.out.println("La suma es " + suma);

		// Array de 2 dimensiones
		// int[][]array2=new int [100][20];

	}

}
