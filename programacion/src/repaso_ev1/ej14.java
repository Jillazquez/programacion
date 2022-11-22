package repaso_ev1;

import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			int altura = 0, direccion = 0, filas = 0, espacio = 0;
			boolean hecho = false;
			char c = 0;
			System.out.println("Como de alto es la piramide");
			altura = teclado.nextInt();
			System.out.println("Que caracter quieres");
			c = teclado.next().charAt(0);
			String piramide = "";
			piramide += c;
			System.out.println("A donde quieres que apunte la piramide 1 arriba 2 derecha 3 abajo 4 izquierda");
			direccion = teclado.nextInt();
			switch (direccion) {
			case 1:
				while (!hecho) {
					for (int i = espacio; i <= altura - 2; i++) {
						System.out.print(" ");
					}
					System.out.println(piramide);
					piramide += c;
					piramide += c;
					filas++;
					espacio++;
					if (filas >= altura)
						hecho = true;
				}
				break;

			case 2:
				while (!hecho) {
					System.out.println(piramide);
					piramide += c;
					filas++;
					if (filas > altura / 2 + 2)
						piramide = piramide.substring(0, piramide.length() - 2);
					if (filas > altura + 4)
						hecho = true;
				}
				break;
			case 3:
				while (!hecho) {
					for (int i = 0; i <espacio; i++) {
						System.out.print(" ");
					}
					for(int i = 0;i<altura*2-1;i++) {
					System.out.print(c);
					}
					System.out.println();
					altura--;
					espacio++;
					if(altura==0)
						hecho=true;
				}
				break;
			case 4:
				espacio=altura;
				while (!hecho) {
					if(filas<altura) {
					for (int i = 1; i <espacio; i++) {
						System.out.print(" ");
					}
					for(int i = 0;i<=filas;i++) {
					System.out.print(c);
					}
					System.out.println();
					espacio--;
					filas++;
					}else {
						espacio++;
						for(int i=0;i<=espacio-1;i++) {
							System.out.print(" ");
						}
						for (int i=espacio;i<=altura-1;i++) {
							System.out.print(c);
						}
						System.out.println();
						if(espacio>=altura)
							hecho=true;
					}
				}
				break;
			}

		}

	}

}
