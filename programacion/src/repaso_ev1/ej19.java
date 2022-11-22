package repaso_ev1;

import java.util.Scanner;

public class ej19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner teclado= new Scanner(System.in)) {
			double num=0,paso=0;
			int toca;
			String nota="",melodia="";
			boolean hecho=false;
			num=Math.random()*7+1;
			num=(int)num;
			num=num*4;
			System.out.println(num);
			for(int i =1;i<=num;i++) {
			paso=Math.random()*7+1;
			toca=(int)paso;
			switch(toca) {
			case 1:
				nota="DO";
				break;
			case 2:
				nota="RE";
				break;
			case 3:
				nota="MI";
				break;
			case 4:
				nota="FA";
				break;
			case 5:
				nota="SOL";
				break;
			case 6:
				nota="LA";
				break;
			case 7:
				nota="SI";
				break;
			
			}
			if(i%4==0&&i>0) {
				melodia+=nota;
				melodia+="|";
			}else {
				melodia+=nota;
				melodia+=",";
			}
			
			
		}
			melodia+="|";
			System.out.println(melodia);
		}
	}

}
