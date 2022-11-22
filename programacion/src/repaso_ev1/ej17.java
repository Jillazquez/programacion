package repaso_ev1;

import java.util.Scanner;

public class ej17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner teclado= new Scanner(System.in)) {
			int num1=0,meter=0,separar=0,mul10=1,sepizq=0,sepder=0;
			System.out.println("Primer numero");
			num1 = teclado.nextInt();
			System.out.println("Que numero quieres meter");
			meter= teclado.nextInt();
			System.out.println("Donde quieres que se separe");
			separar = teclado.nextInt();
			
			for(int i =0;i<separar;i++) {
				mul10=mul10*10;
			}
			System.out.println(mul10);
			sepizq=num1/mul10;
			sepizq=sepizq*10;
			sepizq=sepizq*mul10;
			sepder=num1%mul10;
			meter=meter*mul10;
			meter=meter+sepder;
			meter=sepizq+meter;
			System.out.println(meter);
			
			
		}

	}

}
