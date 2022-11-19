package repaso_ev1;

import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner teclado= new Scanner(System.in)) {
		String piramide="*";
			for (int i =0;i<=10;i++) {
			System.out.print(piramide);
			piramide="*"+piramide+"*";
		}
		
		}

	}

}
