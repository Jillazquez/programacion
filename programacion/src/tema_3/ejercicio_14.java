package tema_3;

import java.util.Scanner;

public class ejercicio_14 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			double num = 0;
			int	res = 0,cont=0;
			num=Math.random()*50+1;
			num=(int)num;
			for(int i= 0;i<7;i++) {
				System.out.println("adivina el numero entre el 1 y el 50");
				res=teclado.nextInt();
				if(res<num) {
					System.out.println("Te quedas corto");
				cont++;
				}
				if(res>num) {
					System.out.println("Te pasas");
				cont++;
				}
				if(res==num)
					break;
			}
			if(cont==7)
				System.out.println("Has perdido el numero era "+num);
			else
				System.out.println("HAS GANADO");
			

		}

	}
}