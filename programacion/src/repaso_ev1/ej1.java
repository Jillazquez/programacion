package repaso_ev1;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner teclado= new Scanner(System.in)) {
			double euros=0;
			System.out.println("Introduce los euros");
			euros=teclado.nextDouble();
			System.out.println(euros*166.386);
			
		}

	}

}
