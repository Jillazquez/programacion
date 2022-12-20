package tema_5;
import java.util.Scanner;
public class Ej4 {
	private static boolean esPrimo(int numero) {
		int cont = 0;
		boolean primo = false;
		cont=0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				cont++;
			}
		}
		if (cont > 2) {
			primo = false;
		} else {
			primo = true;
		}
		return primo;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		// TODO Auto-generated method stub
		int numero= 0;
		boolean primo=false;
		do {
		System.out.println("Introduce un numero");
		numero=teclado.nextInt();
		}while(numero<1);
		for(int i =2;i<=numero;i++) {
			primo=false;
			primo = esPrimo(i);
			if(primo==true) {
				System.out.println(i);
			}
		}
	}

}
