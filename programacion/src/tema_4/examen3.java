package tema_4;

import java.util.Scanner;

public class examen3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		// TODO Auto-generated method stub
		String nombrep="",devuelve="";
		float preciou=0,total=0,paga=0;
		int cantidad=0,billete=0;
		System.out.println("Que va a comprar?");
		nombrep = teclado.nextLine();
		System.out.println("Cuanto vale cada unidad");
		preciou=teclado.nextFloat();
		System.out.println("Cuantos va a comprar");
		cantidad = teclado.nextInt();
		total=cantidad*preciou;
		System.out.println("Va a comprar "+nombrep+" a "+preciou+" la unidad un total de "+total);
		System.out.println("Cuanto pagas?");
		paga=teclado.nextFloat();
		paga=paga-total;
		if((paga/500)>1) {
			billete=(int)paga/500;
			devuelve+="De 500 ";
			devuelve+=billete;
			paga=paga%500;
			total=total-(billete*500);
		}
		if((paga/200)>=1) {
			billete=(int)paga/200;
			devuelve+="De 200 ";
			devuelve+=billete;
			paga=paga%200;
			total=total-(billete*200);
		}
		if((paga/100)>=1) {
			billete=(int)paga/100;
			devuelve+="De 100 ";
			devuelve+=billete;
			paga=paga%100;
			total=total-(billete*100);
		}
		if((paga/50)>=1) {
			billete=(int)paga/50;
			devuelve+="De 50 ";
			devuelve+=billete;
			paga=paga%50;
			total=total-(billete*50);
		}
		if((paga/20)>=1) {
			billete=(int)paga/20;
			devuelve+="De 20 ";
			devuelve+=billete;
			paga=paga%20;
			total=total-(billete*20);
		}
		if((paga/10)>=1) {
			billete=(int)paga/10;
			devuelve+="De 10 ";
			devuelve+=billete;
			paga=paga%10;
			total=total-(billete*10);
		}
		if((paga/5)>=1) {
			billete=(int)paga/5;
			devuelve+="De 5 ";
			devuelve+=billete;
			paga=paga%5;
			total=total-(billete*5);
		}
		if((paga/2)>=1) {
			billete=(int)paga/2;
			devuelve+="De 2 ";
			devuelve+=billete;
			paga=paga%2;
			total=total-(billete*2);
		}
		if((paga/1)>=1) {
			billete=(int)paga/1;
			devuelve+="De 1 ";
			devuelve+=billete;
		}
		System.out.println(paga);
		if(paga<1&&paga>0) {
			devuelve+=" "+paga;
			devuelve+=" centimos";
		}
		System.out.println(devuelve);
	}

}
