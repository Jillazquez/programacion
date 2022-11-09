package tema_4;

import java.util.Scanner;

public class ejercicio_6 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int vocales = 0, consonantes = 0,numero=0;
			String frase = "";
			char c;
			System.out.println("Di una frase");
			frase = teclado.nextLine();
			frase.toLowerCase();
			for (int i = 0; i < frase.length(); i++) {
				c = frase.toLowerCase().charAt(i);
				if (Character.isAlphabetic(c)) {
					if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
						vocales++;
					else
						consonantes++;
				} else if (Character.isDigit(c)) {
					numero++;
				}

				}
			System.out.println(vocales);
			System.out.println(consonantes);
			System.out.println(numero);
			}
		}

	}