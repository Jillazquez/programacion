package tema_4;

import java.util.Scanner;

public class ejercicio_5 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			String frase="",frasepar = "",fraseimpar="";
			System.out.println("Di una frase");
			frase = teclado.nextLine();
			for(int i=0;i<frase.length();i++) {
				if(i%2==0)
					fraseimpar+=frase.charAt(i);
				else
					frasepar+=frase.charAt(i);	
			}
			System.out.println("frase par "+frasepar);
			System.out.println("frase impar "+fraseimpar);
		}

	}
}