package tema_4;

import java.util.Scanner;

public class ejercicio_11 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			String frase = "",frasemayus="";
			int num=0;
			char mayus,normal;
			System.out.println("Di una frase");
			frase = teclado.nextLine();
			System.out.println("Dime un caracter");			
			mayus= teclado.next().charAt(0);
			for(int i = 0;i<frase.length();i++)
				if(frase.charAt(i)==mayus)
					
					frasemayus+=mayus;
					
		}

	}
}
