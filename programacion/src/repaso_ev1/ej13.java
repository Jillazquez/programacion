package repaso_ev1;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner teclado= new Scanner(System.in)) {
			int numero=0;
			boolean cumple=false;
			for(int i =320;i>=160;i=i-20) {
				System.out.println(i);
			}
			numero=320;
			while(!cumple) {
				System.out.println(numero);
				numero-=20;
				if(numero==160) {
					System.out.println(numero);
					cumple=true;
				}
			}
			cumple=false;
			numero=320;
			do {
				System.out.println(numero);
				numero-=20;
				if(numero==160) {
					System.out.println(numero);
					cumple=true;
				}
			}while(!cumple);
				
			
		}

	}

}
