package tema_4;

import java.math.BigInteger;
import java.util.Scanner;

public class examen4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		String iban="",numerocuenta="",codigo="";
		boolean valido = true;
		do {
			System.out.println("Introduce el iban");
			iban=teclado.nextLine();
			valido=iban.length()==24;
			if(valido) {
				valido = Character.isLetter(iban.charAt(0))&&Character.isLetter(iban.charAt(1));
				int cont=2;
				while(valido&&cont<24) {
					valido=Character(iban.charAt(cont)).isDigit
				}
			}
		} 	 		
	}

}
	