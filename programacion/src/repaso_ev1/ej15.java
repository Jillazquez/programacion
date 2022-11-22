package repaso_ev1;

import java.util.Scanner;

public class ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner teclado= new Scanner(System.in)) {
			String numero="";
			char digito=0;
			int cont=0;
			boolean termina=false;
			System.out.println("Que numero");
			numero = teclado.nextLine();
			System.out.println("Que digito");
			digito = teclado.next().charAt(0);
			while(!termina) {
				if(digito==numero.charAt(cont))
					System.out.print(cont+", ");
				cont++;
				if(cont==numero.length()-1)
					termina=true;
			}
		}

	}

}
