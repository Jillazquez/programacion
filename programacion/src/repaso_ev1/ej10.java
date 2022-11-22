package repaso_ev1;

import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			int hora = 0, minuto = 0,segundos=0;
			boolean pasa = false;
			System.out.println("Que hora es (horas)");
			hora = teclado.nextInt();
			System.out.println("Y que minuto es (minuto)");
			minuto = teclado.nextInt();
			while (!pasa) { //Bucle que valida que los minutos no pasan de 60 y si es asi le suma una hora por cada 60 minutos
				if (minuto > 60) {
					minuto = minuto - 60;
					hora++;
				}
				if (hora >= 24)//Bucle que valida que las horas no pasan de 23 y si es asi le resta 24
					hora = hora - 24;
				if (hora < 24 && minuto < 60)
					pasa = true;
			}
			segundos=(23-hora)*3600+(60-minuto)*60;
			System.out.println("Quedan para media noche "+segundos+" Segundos");

		}

	}

}
