package repaso_ev1;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			double nota1 = 0, notafinal = 0, nota2 = 0;
			System.out.println("Introduce la nota del primero examen:");
			nota1 = teclado.nextDouble();
			System.out.println("Que nota quieres sacar en la segunda evaluacion?");
			notafinal = teclado.nextDouble();
			nota2=(notafinal-(nota1*0.3))/0.7;
			System.out.println("Para tener un "+ notafinal+ " en la segunda evaluacion necesitas sacar un "+nota2+" en el segundo examen");
		}

	}

}
