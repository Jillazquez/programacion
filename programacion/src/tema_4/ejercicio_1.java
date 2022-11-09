package tema_4;

import java.util.Scanner;

public class ejercicio_1 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			String frase = "",frasefinal="";
			char c;
			System.out.println("Di una frase");
			frase = teclado.nextLine();
			for (int i = 0; i < frase.length(); i++) {
				c = frase.charAt(i);
				frasefinal+=c;
				System.out.println(frasefinal);
			}
		}

	}
}