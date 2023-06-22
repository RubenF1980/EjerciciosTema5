package hotel;

import java.util.Scanner;

public class MainAlojamiento {

	public static void main(String[] args) {
		int[] habitacion = { 1, 2, 3, 4 };
		int[] precio = { 60, 90, 110, 120 };
		Scanner teclado = new Scanner(System.in);
		int numPersonas;
		System.out.println("Introduzca el num de personas titulares");
		numPersonas = teclado.nextInt();
		// Defino el alojamiento con la clase
		Alojamiento Aloja[] = new Alojamiento[numPersonas];

		rellenadatos(Aloja, habitacion);

		mostrar(Aloja, precio);
		teclado.close();
	}

	// creo un metodo para rellenar habitacion con el precio
	public static void rellenadatos(Alojamiento[] aloja, int[] habit) {
		Scanner teclado = new Scanner(System.in);
		int dias, numhab;
		String nombre;
		int tipohab;
		for (int i = 0; i < aloja.length; i++) {
			System.out.println("Introduce el num de habitacion");
			numhab = teclado.nextInt();
			teclado.nextLine();  //Limpio el teclado para meter un dato distinto
			System.out.println("Introduce el nombre del cliente ");
			nombre = teclado.nextLine();
			System.out.println("Introduce el num de dias de estancia");
			dias = teclado.nextInt();
			teclado.nextLine();//Limpio el teclado para meter un dato distinto
			System.out.println("Introduce el tipo de habitacion");
			tipohab = teclado.nextInt();
			System.out.println();
			aloja[i] = new Alojamiento(numhab, nombre, dias, tipohab);

		}
		teclado.close();
	}

	public static int precioHab(Integer tipo, int[] precio, int dias) {
		int precioxdia = 0;
		//int preciodia = 0;
		switch (tipo) {
		case 1:
			precioxdia = precio[0] * dias;
			break;
		case 2:
			precioxdia = precio[1] * dias;
			break;
		case 3:
			precioxdia = precio[2] * dias;
			break;
		case 4:
			precioxdia = precio[3] * dias;
			break;
		default:
			break;
		}
		return precioxdia;
	}

	public static void mostrar(Alojamiento[] a, int[] arrprecio) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("*******HOTEL*******");
			System.out.print("N�mero de habitacion: ");
			System.out.println(a[i].getNumHabitacion());
			System.out.print("Tipo de habitacion: ");
			System.out.println(a[i].getTipoHab());
			System.out.print("Cliente: ");
			System.out.println(a[i].getNombreCli());
			System.out.print("Num. D�as: ");
			System.out.println(a[i].getNumDiasEstan());
			System.out.print("Precio Hab/D�a: ");
			int precio = precioHab(a[i].getTipoHab(), arrprecio, a[i].getNumDiasEstan());
			System.out.println(precio/a[i].getNumDiasEstan());
			System.out.print("Importe de la factura: ");
			int precio1 = precioHab(a[i].getTipoHab(), arrprecio, a[i].getNumDiasEstan());
			System.out.println(precio1);
//			System.out.print("Importe de la factura: ");
//			System.out.println(f[i]);
			System.out.println();
		}
	}

}
