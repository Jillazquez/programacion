package tema_4;

import java.util.Scanner;

public class ejercicio_13 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			/*
			 * Programa que hace mayusculas la vocal que tu quieras
			 */
			String frase = "",frasefinal="";
			char c = 0, d = 0;
			System.out.println("Di una frase");
			frase = teclado.nextLine();
			System.out.println("Di la vocal que quieres usar");
			c = teclado.next().charAt(0);
			for (int i = 0; i < frase.length(); i++) {
				d = frase.charAt(i);
				if (c == d) {
					d = Character.toUpperCase(d);
					frasefinal += d;
				} else
					frasefinal += d;
			}
			System.out.println(frasefinal);
		}

	}
}
