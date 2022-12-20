package tema_5;
import java.util.Scanner;
public class Ej6 {
	private static int minimoc(int num1, int num2) {
		int minimo=1,menor=num1;
		if(num1>num2)
			menor=num2;
		for(int i =1;i<=menor;i++) {
			if(num1%i==0) {
				minimo=minimo*i;
				num1=num1/i;
			}
			if(num2%i==0) {
				minimo=minimo*i;
				num2=num2/i;
			}
		}
		return minimo;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int num1=0,num2=0,mcm=0;
		System.out.println("Introduce num1");
		num1 = teclado.nextInt();
		System.out.println("Introduce num2");
		num2 = teclado.nextInt();
		mcm=minimoc(num1,num2);
		System.out.println(mcm);
		

	}

}
