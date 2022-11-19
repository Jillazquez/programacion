package repaso_ev1;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
		int dia=0,mes=0;
		String signo="";
		boolean horoscopo=false;
		while(!horoscopo) {
			if(horoscopo==false) {
			System.out.println("Que dia naciste");
			dia=teclado.nextInt();
			if(dia>0&&dia<32)
				horoscopo=true;
		}
		}
		horoscopo=false;
		while(!horoscopo) {
			if(horoscopo==false) {
			System.out.println("Que mes naciste");
			mes=teclado.nextInt();
			if(mes>0&&mes<13)
				horoscopo=true;
		}
		}
			switch(mes) {
			case 1:
			if(dia<=20)
				signo="Capricornio";
			else
				signo="Acuario";
				break;
			case 2:
				if(dia<=19)
					signo="Acuario";
				else
					signo="Piscis";
				break;
			case 3:
				if(dia<=20)
					signo="Piscis";
				else
					signo="Aries";
				break;
			case 4:
				if(dia<=20)
					signo="Aries";
				else
					signo="Tauro";
				break;
			case 5:
				if(dia<=20)
					signo="Tauro";
				else
					signo="Geminis";
				break;
			case 6:
				if(dia<=21)
					signo="Geminis";
				else
					signo="Cancer";
				break;
			case 7:
				if(dia<=22)
					signo="Cancer";
				else
					signo="Leo";
				break;
			case 8:
				if(dia<=23)
					signo="Leo";
				else
					signo="Virgo";
				break;
			case 9:
				if(dia<=22)
					signo="Virgo";
				else
					signo="Libra";
				break;
			case 10:
				if(dia<=22)
					signo="Libra";
				else
					signo="Escorpio";
				break;
			case 11:
				if(dia<=22)
					signo="Escorpio";
				else
					signo="Sagitario";
				break;
			case 12:
				if(dia<=21)
					signo="Sagitario";
				else
					signo="Capricornio";
				break;
				
			}
			System.out.println("Tu signo es "+ signo);
		}

	}

}
