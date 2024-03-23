package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		//== !=
		//<=, >=, <, > 
		String name;
		
		System.out.println("Introduce el primer número");
		int num = lector.nextInt();
		System.out.println("Introduce el segundo número");
		int num2 = lector.nextInt();
		System.out.println("Introduce el tercer número");
		int num3 = lector.nextInt();
		System.out.println("Introduce tu nombre");
		name = lector.nextLine();
		name = lector.nextLine();
		System.out.println("tu nombre es "+name);
		
		
		if((num==num2)&&(num2==num3)) {
			System.out.println("Los 3 números son iguales");
		}
		else if((num==num2)||(num2==num3)||(num3==num)) {
			System.out.println("Algún número de los tres es igual");
		}else {
			System.out.println("Ninguno de los números se repite");
		}

		System.out.println("Hola mundo el número es "+(num+9));
		
		
	}

}
