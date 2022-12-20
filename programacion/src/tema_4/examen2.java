package tema_4;
import java.util.Scanner;
public class examen2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		// TODO Auto-generated method stub
		int base=0,numero,ayuda=0;
		String numgirado="",num="";
		boolean hecho=false;
		System.out.println("A que base quieres cambiar");
		base = teclado.nextInt();
		System.out.println("Que numero quieres cambiar");
		numero=teclado.nextInt();
		ayuda=numero;
		while(!hecho) {
			ayuda=numero%base;
			numero=numero/base;
			if(ayuda<10)
				numgirado+=ayuda;
			if(ayuda>9) {
			switch(ayuda) {
			case 10:
				numgirado+="A";
				break;
			case 11:
				numgirado+="B";
				break;
			case 12:
				numgirado+="C";
				break;
			case 13:
				numgirado+="D";
				break;
			case 14:
				numgirado+="E";
				break;
			case 15:
				numgirado+="F";
				break;				
			}
			}
			if(numero<2) {
				hecho=true;
				numgirado+=numero;
			}
		}
		ayuda=numgirado.length();
		for(int i =ayuda-1;i>=0;i--) {
			num+=numgirado.charAt(i);
		}
		System.out.println(numero);
	}

}
