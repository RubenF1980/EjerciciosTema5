package tema5Ejemplos;

public class PasoArrays1B {
	public static void imprimirArray(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

	public static int[] rellenarArrayDesde() {
		int numeros[] = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
		}
		return numeros;
	}

	public static void main(String[] args) {
		int num[] = rellenarArrayDesde();
		imprimirArray(num);
	}
}