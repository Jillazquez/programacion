package repaso_ev1;

import java.util.Scanner;

public class ej18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			int numero = 0, cont = 0, ayuda = 0;
			boolean hecho = false,uno=false,dos=false,tres=false,cuatro=false,cinco=false,seis=false,siete=false,ocho=false,nueve=false,cero=false;
			System.out.println("Que numero");
			numero = teclado.nextInt();
			ayuda = numero;
			while (!hecho) {
				ayuda = ayuda / 10;
				cont++;
				if (ayuda == 0)
					hecho = true;

			}
			ayuda=numero;
			for (int i = 0; i < cont; i++) {
				
				switch(ayuda%10) {
				case 0:
					cero=true;
					break;
				case 1:
					uno=true;
					break;
				case 2:
					dos=true;
					break;
				case 3:
					tres=true;
					break;
				case 4:
					cuatro=true;
					break;
				case 5:
					cinco=true;
					break;
				case 6:
					seis=true;
					break;
				case 7:
					siete=true;
					break;
				case 8:
					ocho=true;
					break;
				case 9:
					nueve=true;
					break;
					
				}	
				ayuda=ayuda/10;
			}			
			if(uno==true)
				System.out.println(1);
			if(dos==true)
				System.out.println(2);
			if(tres==true)
				System.out.println(3);
			if(cuatro==true)
				System.out.println(4);
			if(cinco==true)
				System.out.println(5);
			if(seis==true)
				System.out.println(6);
			if(siete==true)
				System.out.println(7);
			if(ocho==true)
				System.out.println(8);
			if(nueve==true)
				System.out.println(9);
			if(cero==true)
				System.out.println(0);
			
			
	
		}

	}

}
