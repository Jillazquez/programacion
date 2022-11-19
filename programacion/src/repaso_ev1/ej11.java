package repaso_ev1;

import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			int personas = 0;
			double precio = 0;
			char dia = 0, tarjeta = 0;
			System.out.println("Cuantas entradas quieres?");
			personas = teclado.nextInt();
			System.out.println("Que dia es hoy dilo con su inicial L,M,X,J,V,S,D");
			dia = teclado.next().charAt(0);
			dia = Character.toUpperCase(dia);
			System.out.println("Tienes la tarjeta de descuento? S/N");
			tarjeta = teclado.next().charAt(0);
			tarjeta = Character.toUpperCase(tarjeta);
			switch (dia) {
			case 'L':
				precio = personas * 8;
				break;
			case 'M':
				precio = personas * 8;
				break;
			case 'X':
				precio = personas * 5;
				break;
			case 'J':
				precio = (personas / 2) * 11;
				precio = precio + ((personas % 2) * 8);
				break;
			case 'V':
				precio = personas * 8;
				break;
			case 'S':
				precio = personas * 8;
				break;
			case 'D':
				precio = personas * 8;
				break;
			}
			if (tarjeta == 'S') {
				precio =  (precio * 0.9);
				
				
		}
			System.out.println("El precio es "+precio);
		}

	}

}
