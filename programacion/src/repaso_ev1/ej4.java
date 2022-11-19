package repaso_ev1;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner teclado= new Scanner(System.in)) {
			int horas=0,dia=0;
			System.out.println("Cuantas horas trabajas al dia");
			horas=teclado.nextInt();
			System.out.println("Cuantos dias a la semana");
			dia= teclado.nextInt();
			System.out.println("Tu salario semanal es "+horas*dia*12);
			
		}

	}

}
