package tema_4;

import java.util.Scanner;

public class examen4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		String iban="",numerocuenta="",codigo="";
		boolean hecho = false;
		while(!hecho) {
		System.out.println("Dime tu IBAN");
		iban= teclado.nextLine();
		if(iban.length()==24)
			hecho=true;
		biginteger hola = 999999999999;
		} 	 		
	}

}
