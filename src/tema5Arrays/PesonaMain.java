package tema5Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PesonaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Pepe", 28));
		personas.add(new Persona("Juan", 32));
		personas.add(new Persona("Paco", 40));
		personas.add(new Persona("Susi", 24));
		personas.add(new Persona("Lola", 20));
		personas.add(new Persona("Jose", 28));
		personas.add(new Persona("Dani", 24));
		personas.add(new Persona("Sara", 36));

		System.out.println(personas);
		Collections.sort(personas, new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				// TODO Auto-generated method stub
				return new Integer(o1.getEdad()).compareTo(new Integer(o2.getEdad()));
			}
		});
		
		System.out.println("------ORDENADOS POR EDAD--------");
		System.out.println(personas);
	}

}
