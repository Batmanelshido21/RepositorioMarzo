package Main;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner (System.in);
		
		boolean bandera=true;
		int opcion=0;
		
		while(bandera==true) {
			System.out.println("1: tabla de multiplicar 2: Factorial de x número 3: Serie fibonacci" );
			opcion = lector.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println("Introduce el número a evaluar");
					int num = lector.nextInt();
					int acum=0;
					
					for(int i=10;i>=1;i--) {
					
						System.out.println(num+"x"+i+"="+(i*num));
					}
					break;
					
					case 2: 
						
						break;
				
			}
			System.out.println("Desea seguir realizando operaciones true=si false=no");
			bandera = lector.nextBoolean();
			
		}

	}

}
