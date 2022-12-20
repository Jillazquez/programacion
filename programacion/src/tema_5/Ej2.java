package tema_5;

import java.util.Scanner;

public class Ej2 {
	
	private static int Div(int numero) {
		int cont =0;
		for(int i = 1;i<=numero;i++) {
			if(numero%i==0)
				cont++;
		}
		return cont;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int num1=0,num2=0,div1=0,div2=0;
		do {
		System.out.println("Introduce el primer numero");
		num1 = teclado.nextInt();
		}while(num1<1);
		do {
		System.out.println("Introduce el segundo numero");
		num2 = teclado.nextInt();
		}while(num2<1);
		div1 = Div(num1);
		div2 = Div(num2);
		
		if(div1>div2)
			System.out.println("El primer numero tiene mas divisores");
		else
			System.out.println("El segundo numero tiene mas divisores");
	}

}
