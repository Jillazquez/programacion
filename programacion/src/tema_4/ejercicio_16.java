package tema_4;

import java.util.Scanner;

public class ejercicio_16 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int espacio1, espacio2;
			String nombrecompleto1 = "", nombrecompleto2 = "", nombre = "", apellido = "", nombre2 = "", apellido2 = "";
			char c, d;
			System.out.println("Di el primer nombre");
			nombrecompleto1 = teclado.nextLine();
			System.out.println("Di el segundo nombre");
			nombrecompleto2 = teclado.nextLine();

			espacio1 = nombrecompleto1.indexOf(" ");
			espacio2 = nombrecompleto2.indexOf(" ");

			for (int i = 0; i < espacio1; i++) {
				c = nombrecompleto1.charAt(i);
				nombre += c;
			}
			for (int i = espacio1 + 1; i < nombrecompleto1.length(); i++) {
				d = nombrecompleto1.charAt(i);
				apellido += d;
			}
			for (int i = 0; i < espacio2; i++) {
				d = nombrecompleto2.charAt(i);
				nombre2 += d;
			}
			for (int i = espacio2 + 1; i < nombrecompleto2.length(); i++) {
				c = nombrecompleto2.charAt(i);
				apellido2 += c;
			}

			System.out.println(nombre + " " + apellido2);
			System.out.println(nombre2 + " " + apellido);

		}

	}
}