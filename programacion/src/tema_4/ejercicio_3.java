package tema_4;

import java.util.Scanner;

public class ejercicio_3 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			String frase = "",palabra="";
			int n=0;
			System.out.println("Di una frase");
			frase = teclado.nextLine();
			System.out.println("Di una palabra");
			palabra = teclado.nextLine();
			n=frase.indexOf(palabra);
			if(n<0)
				n++;
			
			System.out.println("La posicion es "+n);
			
		}

	}
}