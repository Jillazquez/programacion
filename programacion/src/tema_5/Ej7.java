package tema_5;

import java.util.Scanner;

public class Ej7 {
	private static double area(float radio, int operacion) {
		double calculo = 0;
		switch (operacion) {
		case 1:
			calculo = 2*Math.PI*radio;
			break;
		case 2:
			calculo = Math.PI*Math.pow(radio, 2);
			break;
		case 3:
			calculo = (4/3)*Math.PI*Math.pow(radio, 3);
			break;
		}
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
		calculo = area(radio,operacion);
		System.out.println(calculo);
	}

}
