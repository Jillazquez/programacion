package tema_4;

import java.util.Scanner;

public class ejercicio_17 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			String frase = "",frasefinal="";
			char pr,sg;
			System.out.println("Di una palabra");
			frase = teclado.nextLine();
			pr=frase.charAt(0);
			sg=frase.charAt(frase.length()-1);
			frasefinal+=sg;
			for(int i = 1;i<frase.length()-1;i++) {
				sg=frase.charAt(i);
				frasefinal+=sg;
			}
			frasefinal+=pr;
			System.out.println(frasefinal);
		}

	}
}