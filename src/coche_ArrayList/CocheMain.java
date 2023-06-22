package coche_ArrayList;

import java.util.Scanner;

public class CocheMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		

		ListaCoches objCoches = new ListaCoches();
		
		objCoches.leerCoches();
		objCoches.mostrarCoches();
		objCoches.mostrarCoches2();
		System.out.println();
		
		System.out.println("Introduce la marca para ver si esta ");
		String marcacoche = teclado.next();
		objCoches.mostrarPorMarca(marcacoche);
		System.out.println();
		
		System.out.println("Introduce km para mostrar los que tengan menos ");
		int km = teclado.nextInt();		
		objCoches.mostraconxkm(km);
		System.out.println();
		
		Coche auxcochemaskm = new Coche();
		auxcochemaskm = objCoches.CocheMaskm();
		System.out.println("Coche con mas km" + auxcochemaskm);
		System.out.println();
		
		System.out.println("Coches por km de menor a mayor ");
		objCoches.ordenarCoches();
		objCoches.mostrarCoches2();
		System.out.println();
		
		System.out.println("Borrar coche por marca.introduce marca a borrar ");
		String marcaaborrarString;
		marcaaborrarString = teclado.next();		
		objCoches.borrarCoche(marcaaborrarString);
		System.out.println();
		System.out.println("-----Borrar por marca-----");
		objCoches.mostrarCoches2();
		System.out.println();
	
		
		System.out.println("Añadir coches");
		objCoches.addcoches();
		objCoches.mostrarCoches2();		
		//System.out.println();
		
	

	}

}
