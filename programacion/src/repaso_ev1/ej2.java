package repaso_ev1;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner teclado= new Scanner(System.in)) {
			int num1=0,num2=0,resul=0;
			System.out.println("Numero 1");
			num1=teclado.nextInt();
			System.out.println("Numero 2");
			num2=teclado.nextInt();
			resul=num1+num2;
			System.out.println("La suma da "+resul);
			resul=num1-num2;
			System.out.println("La resta da "+resul);
			resul=num1*num2;
			System.out.println("La multiplicacion da "+resul);
			resul=num1/num2;
			System.out.println("La division da "+resul);
			
		}

	}

}
