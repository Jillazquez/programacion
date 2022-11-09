package tema_4;

import java.util.Scanner;

public class ejercicio_9 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			String frase = "",frasemayus="";
			int num=0;
			char c,m;
			System.out.println("Di una frase");
			frase = teclado.nextLine();
			System.out.println("Cuanto la desplazas");
			num = teclado.nextInt();
			for (int i = 0; i < frase.length(); i++) {
				c = frase.charAt(i);
				if (Character.isUpperCase(c)) {
					m=frase.charAt(i);
					m+=num;
					frasemayus+=m;
				}
		
		}
			System.out.println(frasemayus);
		}

	}
}