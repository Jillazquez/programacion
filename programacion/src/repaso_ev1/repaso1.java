package repaso_ev1;

public class repaso1 {

public static void main(String[] args) {
	
	double ayuda=0;
	char n1=0,n2=0,n3=0;
	int paso=0;
	ayuda=Math.random()*3;
	paso=(int)ayuda;
	switch(paso) {
	case 0:
		n1='a';
		break;
	case 1:
		n1='b';
		break;
	case 2:
		n1='c';
		break;
	}
	ayuda=Math.random()*3;
	paso=(int)ayuda;
	switch(paso) {
	case 0:
		n2='a';
		break;
	case 1:
		n2='b';
		break;
	case 2:
		n2='c';
		break;
	}
	ayuda=Math.random()*3;
	paso=(int)ayuda;
	switch(paso) {
	case 0:
		n3='a';
		break;
	case 1:
		n3='b';
		break;
	case 2:
		n3='c';
		break;
	}
	System.out.print(n1);
	System.out.print(n2);
	System.out.println(n3);
	if(n1==n2&&n1==n3) 
		System.out.println("Ganas 10");
		else if(n1==n2||n1==n3||n2==n3)
			System.out.println("Ganas 1");
		else System.out.println("Pierdes");
	

	
}
	
}
