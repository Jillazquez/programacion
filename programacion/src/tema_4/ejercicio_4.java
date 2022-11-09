package tema_4;

import java.util.Scanner;

public class ejercicio_4 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int n = 0;
			String frase = "";
			System.out.println("Di una frase");
			frase = teclado.nextLine();
			System.out.println("Si quieres el texto en mayus 1 si lo quieres en minus 2");
			n=teclado.nextInt();
			if(n==1)
				System.out.println(frase.toUpperCase());
			else if(n==2)
				System.out.println(frase.toLowerCase());			
		}

	}
}