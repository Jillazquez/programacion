package repaso_ev1;

import java.util.Scanner;

public class ej20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			String a = "", b = "", c = "";
			double ayuda=0;
			int num1 = 0, num2 = 0, num3 = 0;
			ayuda=Math.random()*5+1;
			num1=(int)ayuda;
			switch (num1) {
			case 1:
				a = "♥";
				break;
			case 2:
				a = "◆";
				break;
			case 3:
				a = "🔔";
				break;
			case 4:
				a = "🍋";
				break;
			case 5:
				a = "Ω";
				break;
			}
			ayuda=Math.random()*5+1;
			num2=(int)ayuda;
			switch (num2) {
			case 1:
				b = "♥";
				break;
			case 2:
				b = "◆";
				break;
			case 3:
				b = "🔔";
				break;
			case 4:
				b = "🍋";
				break;
			case 5:
				b = "Ω";
				break;
			}
			ayuda=Math.random()*5+1;
			num3=(int)ayuda;
			switch (num3) {
			case 1:
				c = "♥";
				break;
			case 2:
				c = "◆";
				break;
			case 3:
				c = "🔔";
				break;
			case 4:
				c = "🍋";
				break;
			case 5:
				c = "Ω";
				break;
			}
			System.out.println(a+b+c);
			if(a==b&&a==c) {
				System.out.println("Has ganado 10 monedas");
			}else if(a==b||b==c||a==c) {
				System.out.println("Has recuperado tu moneda");
			}else System.out.println("Has perdido");


		}
	}

}
