package practica;

public class ej2 {

	//Programa que muestra los 50 primeros numeros de la sucesion de fibonacci
	
	static void fibo(){
		long primero=0,segundo=1;
		for (int i =0; i<=25;i++) {
			System.out.println(primero);
			System.out.println(segundo);
			primero+=segundo;
			segundo+=primero;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
