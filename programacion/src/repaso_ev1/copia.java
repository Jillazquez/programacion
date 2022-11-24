package repaso_ev1;

import java.util.Scanner;

public class copia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int numero, exp, digito;
	        double binario;
	        do{ 
	            System.out.print("Introduce un numero entero >= 0: ");                                                
	            numero = sc.nextInt();
	        }while(numero < 0);

	        exp=0;
	        binario=0;
	        while(numero!=0){
	                digito = numero % 8;           
	                binario = binario + digito * Math.pow(10, exp);                                                   
	                exp++;
	                numero = numero/8;
	        }
	        System.out.println(binario);
		}

	}

}
