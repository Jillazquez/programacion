package tema_4;

import java.util.Scanner;

public class ejercicio_18 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int det = 0;
			String frase = "",frasefinal="";
			char c;
			System.out.println("Di una frase");
			frase = teclado.nextLine();
			for (int i = 0;i<frase.length();i++) {
				c=frase.charAt(i);
				det=0;
				if (c=='s' && frase.charAt(i+1)=='i') {
					frasefinal+="no";
					det++;
				}
				if(frase.charAt(i)=='i'&&frase.charAt(i-1)!='s') {
					frasefinal+=c;
				}if(frase.charAt(i)!='i'&&det==0)
				frasefinal+=c;
			}
			System.out.println(frasefinal);
		}

	}
}