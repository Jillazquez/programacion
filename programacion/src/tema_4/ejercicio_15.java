package tema_4;

import java.util.Scanner;

public class ejercicio_15 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			/*
			 * Programa que dice si la frase introducida es palindromo
			 */
			String frase = "";
			int num = 0, largo = 0;
			char c = 0;
			System.out.println("Di una frase");
			frase = teclado.nextLine();
			largo = frase.length();
			for (int i = 0; i < largo / 2; i++) {
				c = frase.charAt(i);
				if (c == frase.charAt(largo - 1 - i))
					num++;
			}
			if (num == (frase.length() / 2))
				System.out.println("Si es palindromo");
			else
				System.out.println("No es palindromo");
		}

	}
}
