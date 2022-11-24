package repaso_ev1;

import java.util.Scanner;

public class ej22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			int numero = 0, comodin = 0;
			;
			String octal = "", num = "";
			boolean hecho = false;
			System.out.println("Que numero pasas a octal");
			numero = teclado.nextInt();
			System.out.println(octal);
			comodin = numero;
			//Bucle que consigue el numero octal de un numero decimal
			while (!hecho) {
				num = "";
				num += comodin % 8;
				octal += num;
				comodin = comodin / 8;
				if (comodin == 1) {
					num="";
					num += comodin;
					octal += num;
					hecho = true;
				}
			}
			num="";
			//Programa que gira una frase 
			for (int i = octal.length() - 1; i >= 0; i--) {
	            num += octal.charAt(i);
			}
			System.out.println(num);
		}

	}

}
