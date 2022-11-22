package tema_4;

import java.util.Scanner;

public class ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			String frase = "";
			char c = 0,d=0,e=0;
			boolean corto = false;
			int distintas=0,repite=0;
			while (!corto) {
				System.out.println("Dame una frase");
				frase = teclado.nextLine();
				frase = frase.toUpperCase();
				System.out.println(frase);
				if (frase.length() <= 60)
					corto = true;
			}
			for (int i = 0; i < frase.length(); i++) {
				repite=0;
				distintas=0;
				c = frase.charAt(i);
				for(int j=0;j<frase.length();j++) {
					d=frase.charAt(j);
					if(c==d)
						repite++;
				}for(int k=i;k<frase.length();k++) {
				e=frase.charAt(k);	
				
				if(c==e)
					distintas++;
				}
				if(distintas==1)
				System.out.println("La letra "+c+" se repite "+repite);
			}
		}
	}

}