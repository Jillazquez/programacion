package tema_5;

import java.util.Scanner;

public class Ej1 {
	private static boolean esPrimo(int numero) {
		int cont = 0;
		boolean primo = false;
		for (int i = 1; i <= numero / 2; i++) {
			if (numero % i == 0) {
				cont++;
			}
		}
		if (cont > 2) {
			primo = false;
		} else {
			primo = true;
		}
		return primo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int numero = 0;
		boolean primo = false;
		do {
			System.out.println("Introduce el numero: ");
			numero = teclado.nextInt();
		} while (numero < 2);

		primo = esPrimo(numero);
		System.out.println(primo);
	}

}
