package tema_5;

import java.util.Scanner;

public class Ej7_2 {
	private static double radioc(float radio) {
		double calculo = 0;
		calculo = 2 * Math.PI * radio;

		return calculo;
	}

	private static double areac(float radio) {
		double calculo = 0;
		calculo = Math.PI * Math.pow(radio, 2);
		return calculo;
	}

	private static double volumene(float radio) {
		double calculo = 0;
			calculo = (1.3333333333) * Math.PI * Math.pow(radio, 3);
		return calculo;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int operacion = 0;
		float radio = 0;
		double calculo = 0;
		System.out.println("Intoduce el radio");
		radio = teclado.nextFloat();
		do {
			System.out.println("Que calculo quieres hacer 1,2,3");
			operacion = teclado.nextInt();
		} while (operacion < 0 || operacion > 3);
		switch(operacion) {
		case 1:
			calculo=radioc(radio);
			break;
		case 2:
			calculo=areac(radio);
			break;
		case 3:
			calculo=volumene(radio);
			break;
		}
		System.out.println(calculo);
	}

}
