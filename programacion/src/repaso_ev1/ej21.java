package repaso_ev1;

import java.util.Scanner;

public class ej21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			int numero = 0, comodin = 0;
			;
			String binario = "", num = "";
			boolean hecho = false;
			System.out.println("Que numero pasas a binario");
			numero = teclado.nextInt();
			System.out.println(binario);
			comodin = numero;
			//Bucle que consigue el numero binario de un numero decimal
			while (!hecho) {
				num = "";
				num += comodin % 2;
				binario += num;
				comodin = comodin / 2;
				if (comodin == 1) {
					num="";
					num += comodin;
					binario += num;
					hecho = true;
				}
			}
			num="";
			//Programa que gira una frase 
			for (int i = binario.length() - 1; i >= 0; i--) {
	            num += binario.charAt(i);
			}
			System.out.println(num);
		}

	}

}
