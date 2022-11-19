package repaso_ev1;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner teclado= new Scanner(System.in)) {
			int hora=0;
			System.out.println("Que hora es?");
			hora = teclado.nextInt();
			switch(hora) {
			case 6,7,8,9,10,11,12:
				System.out.println("Buenos dias");
			break;
			case 13,14,15,16,17,18,19,20:
				System.out.println("Buenas tardes");
				break;
			case 21,22,23,0,1,2,3,4,5:
				System.out.println("Buenas noches");
				break;
			}
			
		}

	}

}
