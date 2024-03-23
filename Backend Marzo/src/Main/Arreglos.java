package Main;

import java.util.Scanner;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		int num[]= new int[10];
		int suma=0;
		
		for(int i=0;i<10;i++) {
			
			num[i]=lector.nextInt();
			
		}	
		for(int i=0;i<10;i++) {
			System.out.print(num[i]+"|");
			if(num[i]<5) {
				System.out.println("Número pequeño");
			}else {
				System.out.println("Número normal");
			}
			
			suma=suma+num[i];
		}
		System.out.println();
		
		System.out.println("La suma de los números es "+suma);

	}

}
