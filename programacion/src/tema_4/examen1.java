package tema_4;
import java.util.Scanner;
public class examen1 {

	/*
	 * Solicita un entero positivo e imprime lineas con asteriscos
	 * @author Juan Manuel
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// TODO Auto-generated method stub
		String espacio="";
		int altura=0, alto=0;
		do {
		System.out.println("Como de alto quieres la piramide");
		altura = teclado.nextInt();
		}while(altura<1);
		
		alto=altura;
		for(int i =0;i<=altura;i++) {
			System.out.print(espacio);
			for(int j = alto;j>0;j--) {
				System.out.print("*");
			}
			alto=alto-1;
			System.out.println();
			espacio+=" ";
		}
		
	}

}
