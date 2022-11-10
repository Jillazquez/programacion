package tema_4;

import java.util.Scanner;

public class ejercicio_2 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int mayus = 0, minus = 0;
			String frase = "";
			char c;
			System.out.println("Di una frase");
			frase = teclado.nextLine();
			for (int i = 0; i < frase.length(); i++) {
				c = frase.charAt(i);
				if (Character.isUpperCase(c)) {
					mayus++;
				} else if (Character.isLowerCase(c)) {
					minus++;
				}
			}
			System.out.println("Mayusculas " + mayus);
			System.out.println("Minusculas " + minus);
		}

	}
}