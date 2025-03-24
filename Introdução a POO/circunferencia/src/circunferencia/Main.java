package circunferencia;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Raio: ");
		double raio = sc.nextInt();
		
		System.out.printf("Circunferência: %.2f%n", Calculator.circunferencia(raio));
		
		System.out.printf("Volume: %.2f%n", Calculator.volume(raio));
		
		System.out.printf("Pi: %.2f%n", Calculator.PI);
		
		
		sc.close();
	}

}
