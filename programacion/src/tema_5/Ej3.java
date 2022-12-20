package tema_5;

import java.util.Scanner;

	
public class Ej3 {
	
	private static int esFactorial(int numero) {
		int fact=1;
		for (int i = 2 ; i <= numero;i++) {
			fact=fact*i;
		}
		return fact;
	}


	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int numero = 0,factorial=0;
		do {
		System.out.println("Introduce el numero");
		numero = teclado.nextInt();
		}while(numero<1);
		
		factorial=esFactorial(numero);
		System.out.println(factorial);
		
		
		

	}

}
