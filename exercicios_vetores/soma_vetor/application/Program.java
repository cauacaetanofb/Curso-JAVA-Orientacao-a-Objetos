package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		double sum = 0;
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		System.out.println();
		
		System.out.print("VALORES:");
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf(" %.2f", vect[i]);
		}
		System.out.println();
		
		System.out.printf("SOMA: %.2f", sum);
		System.out.println();
		
		double avg = sum / vect.length;
		
		System.out.printf("MÉDIA: %.2f", avg);
		
		sc.close();
	}

}
