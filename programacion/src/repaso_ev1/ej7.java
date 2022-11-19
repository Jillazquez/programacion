package repaso_ev1;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner teclado= new Scanner(System.in)) {
			int horas=0,salario=0;
			System.out.println("Cuantas horas trabajas a la semana");
			horas=teclado.nextInt();
			for (int i =1;i<=horas;i++) {
				if(i<=40)
					salario+=12;
				else
					salario+=16;
			}
			System.out.println("El sueldo semanal que le corresponde es "+salario);
		}

	}

}
