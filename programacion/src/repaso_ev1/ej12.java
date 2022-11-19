package repaso_ev1;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner teclado= new Scanner(System.in)) {
			int j1=0,j2=0;
			System.out.println("Jugador uno que saca 1 piedra 2 papel 3 tijera");
			j1 = teclado.nextInt();
			System.out.println("Jugador dos que saca 1 piedra 2 papel 3 tijera");
			j2 = teclado.nextInt();
			
			switch (j1){
			case 1:
				if(j2==1)
					System.out.println("Empate");
				if(j2==2)
					System.out.println("Gana jugador 2");
				if(j2==3)
					System.out.println("Gana jugador 1");
				if(j2>3)
					System.out.println("Error");
				break;
			case 2:
				if(j2==1)
					System.out.println("Gana jugador 1");
				if(j2==2)
					System.out.println("Empate");
				if(j2==3)
					System.out.println("Gana jugador 2");
				if(j2>3)
				System.out.println("Error");
				break;
			case 3:
				if(j2==1)
					System.out.println("Gana jugador 2");
				if(j2==2)
					System.out.println("Gana jugador 1");
				if(j2==3)
					System.out.println("Empate");
				if(j2>3)
					System.out.println("Error");
				break;
				
					
			}
		}

	}

}
