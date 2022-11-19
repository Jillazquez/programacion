package repaso_ev1;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner teclado= new Scanner(System.in)) {
			int altura=0;
			float g=9.81F, tiempo=0;
			System.out.println("Desde que altura cae?");
			altura=teclado.nextInt();
			tiempo=(2*altura)/g;
			tiempo=(int)Math.sqrt(tiempo);
			System.out.println(tiempo);
		}

	}

}
