package tema_5;
import java.util.Scanner;
public class Ej8 {
	private static int esFactorial(int numero) {
		int fact=1;
		for (int i = 2 ; i <= numero;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		// TODO Auto-generated method stub
		int num1=0, num2=0,comb=0;
		do{
		System.out.println("Introduce el primer numero");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		num2 = teclado.nextInt();
		}while(num1<=num2);
		comb=esFactorial(num1)/(esFactorial(num2)*(esFactorial(num1-num2)));
		System.out.println(comb);
			
	}

}
