package tema_3;

import java.util.Scanner;

public class ejercicio_13 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			double num1 = 0, num2 = 0;
			int op = 0, acierto = 0, fallo = 0, resul;
			char c = 0;
			for (int i = 0; i < 10; i++) {
				System.out.println("Di que tipo de operacion 1 suma 2 resta 3 multiplica");
				op = teclado.nextInt();
				switch (op) {
				case 1:
					c = '+';
					break;
				case 2:
					c = '-';
					break;
				case 3:
					c = '*';
					break;
				}
				for (int j = 0; j < 2; j++) {
					num1 = Math.random() * 20 + 1;
					num1 = (int) num1;
					num2 = Math.random() * 20 + 1;
					num2 = (int) num2;
					System.out.println("Cuanto es " + num1 + " " + c + " " + num2);
					resul = teclado.nextInt();
					switch (op) {
					case 1:
						if (num1 + num2 == resul)
							acierto++;
						else
							fallo++;
						break;
					case 2:
						if (num1 - num2 == resul)
							acierto++;
						else
							fallo++;
						break;
					case 3:
						if (num1 * num2 == resul)
							acierto++;
						else
							fallo++;
						break;
					}
				}

			}
			System.out.println("Has tenido " + acierto + " aciertos");
			System.out.println("Has tenido " + fallo + " fallos");

		}

	}
}