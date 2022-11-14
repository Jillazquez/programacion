package tema_4;

import java.util.Scanner;

public class ejercicio_18_2 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			String frase = "";
			System.out.println("Di una frase");
			frase = teclado.nextLine();

			System.out.println(frase.replace("si", "no"));
		}

	}
}