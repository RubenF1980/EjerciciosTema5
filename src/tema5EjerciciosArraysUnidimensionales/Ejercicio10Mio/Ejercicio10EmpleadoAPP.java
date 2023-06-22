package tema5EjerciciosArraysUnidimensionales.Ejercicio10Mio;
/*
	Crear un programa en Java, un array con 5 empleados. 
	De cada empleado tenemos el nombre, edad y sueldo. 
	Mostrar el array de empleados con toda su información por teclado
*/
public class Ejercicio10EmpleadoAPP {

	public static void main(String[] args) {
		ClassEmpleado arraEmpleado[] = { new ClassEmpleado("Pepe", 18, 1000), new ClassEmpleado("Juan", 25, 1100),
				new ClassEmpleado("Buby", 1800, 42), new ClassEmpleado("Celia", 34, 700),new ClassEmpleado("Juan", 27, 1000) };

		// recorro el array e imprimo con el tostring aunque no se ponga es lo que usa

		for (int i = 0; i < arraEmpleado.length; i++) {
			System.out.println(arraEmpleado[i]);
		}

	}

}