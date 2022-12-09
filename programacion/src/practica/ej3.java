package practica;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=0;
		for(int i = 1; i <= 1000000; i++) {
			cont=0;
			for(int j = i; j>=1;j--) {
				if(i%j==0)
					cont++;
				}
			if(cont==2) {
				System.out.println(i);
			}
		}
	}

}
