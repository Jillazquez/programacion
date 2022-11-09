package tema_4;

import java.util.Scanner;

public class ejercicio_8 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			String frase = "",frasemayus="";
			char c,m;
			System.out.println("Di una frase");
			frase = teclado.nextLine();
			for (int i = 0; i < frase.length(); i++) {
				c = frase.charAt(i);
				if (Character.isUpperCase(c)) {
					m=frase.charAt(i);
					m+=3;
					frasemayus+=m;
				}
		
		}
			System.out.println(frasemayus);
		}

	}
}
