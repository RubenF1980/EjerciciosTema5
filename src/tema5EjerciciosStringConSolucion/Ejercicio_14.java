package tema5EjerciciosStringConSolucion;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import javax.swing.text.GapContent;
//
//import org.w3c.dom.css.CSSFontFaceRule;

public class Ejercicio_14 {

	public static void main(String[] args) {
////		Escribir un programa que lea un string que consiste en un número 
////		seguido de un espacio y luego una letra. Validar con un pattern. (No se va a pedir en el examen)
////		Si la letra que sigue al número es una f, el programa deberá manejar el 
//		número introducido como una temperatura en grados Fahrenheit, 
//		convertirla en grados Celsius e imprimir un mensaje adecuado de salida.
////		Si la letra que sigue al número es una c, el programa deberá tratar 
//		al número como una temperatura en grados Celsius, convertirla a 
//		grados Fahrenheit, e imprimir un mensaje adecuado de salida.
////		Si no cumple con el formato, el programa deberá imprimir un mensaje 
//		que diga que los datos son incorrectos y terminar.
		// far a cel
		// ºC =ºf-32/1.8000
		// cel a far
		// ºF = (ºC · 1,8) + 32
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un valor para dar el contrario en temperatura");
		String temperatura = teclado.nextLine();
		// Validación con pattern:
		// [0-9]* 0 o más dígitos de 0 a 9
		// \\. Caracter punto. Hay que poner \\ para escapar
		// [0-9]+ 1 o más dígitos de 0 a 9
		// caracter espacio
		// [C|F] Dígito C o F
		Pattern patron = Pattern.compile("[0-9]*\\.?[0-9]+ [C|F|c|f]");
		Matcher palabra = patron.matcher(temperatura);
		if (!palabra.matches()) {
			System.out.println("Formato incorrecto");
		} else {
			// Extraer la temperatura
			double temp = Double.parseDouble(temperatura.substring(0, temperatura.indexOf(" ")));
			System.out.println(temp);
			//Extraer su unidad: C o F
			String unidad = temperatura.substring(temperatura.indexOf(" ") + 1);
			System.out.println(unidad);
			//convertir 
			if (unidad.equalsIgnoreCase("f")) {
				double tempfcel = (temp - 32) / 1.8000;
				System.out.println("Temperatura a celsius =" + tempfcel);

			} else if (unidad.equalsIgnoreCase("c")) {
				double tempfar = (temp * 1.8) + 32;
				System.out.println("Temperatura a farenheit =" + tempfar);
			}
			{

			}

		}

	}
}
