package tema5Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrayListInt = new ArrayList<Integer>();
		// Guardo datos en el ArrayList
		arrayListInt.add(3);
		arrayListInt.add(4);
		arrayListInt.add(2);
		arrayListInt.add(6);
		arrayListInt.add(5);
		arrayListInt.add(1);
		arrayListInt.add(7);
		// Sin ordenar
		for (int numeros : arrayListInt) {
			System.out.print(numeros);
		}
		System.out.print("\n");
		// De menor a mayor
		arrayListInt.sort(null);
		for (int numeros : arrayListInt) {
			System.out.print(numeros);
		}
		System.out.print("\n");
		// de mayor a menor
		Comparator<Integer> comparador = Collections.reverseOrder();
		Collections.sort(arrayListInt, comparador);
		for (int numeros : arrayListInt) {
			System.out.print(numeros);
		}

	}// main

}
