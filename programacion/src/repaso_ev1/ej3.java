package repaso_ev1;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner teclado= new Scanner(System.in)) {
			int lado=0,base=0;
			System.out.println("Cuanto mide el lado");
			lado = teclado.nextInt();
			System.out.println("Cuanto mide la base");
			base= teclado.nextInt();
			System.out.println("El area mide "+lado*base);
			
		}

	}

}
