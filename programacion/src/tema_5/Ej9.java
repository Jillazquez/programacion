package tema_5;

import java.util.Scanner;

public class Ej9 {
	private static double raices(int a, int b, int c, int num) {
		//Programa que calcula las dos raices de una ecuacion de segundo grado
		double raiza = 0;
		if (Math.pow(b, 2) - 4 * a * c > 0) {
			if (num == 1) {
				raiza = ((b * -1) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			} else {
				raiza = ((b * -1) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			}
		}
		return raiza;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int a = 0, b = 0, c = 0;
		double raiz1 = 0, raiz2 = 0;
		System.out.println("En la ecuacion X2+X+C");
		System.out.println("Introduce el valor de X2");
		a = teclado.nextInt();
		System.out.println("Introduce el valor de X");
		b = teclado.nextInt();
		System.out.println("Introduce el valor de C");
		c = teclado.nextInt();
		raiz1 = raices(a, b, c, 1);// Con un 1 al final calculamos con +
		raiz2 = raices(a, b, c, 0);// Con un 0 al final calculamos con -
		System.out.println(raiz1);
		System.out.println(raiz2);
	}

}
