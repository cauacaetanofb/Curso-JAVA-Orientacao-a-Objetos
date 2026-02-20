package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("QUANTOS NÚMEROS VOCê VAI DIGITAR? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] list = new int[n];
		
		
		for(int i=0; i<n; i++) {
			
			System.out.print("DIGITE UM NÚMERO: ");
			list[i] = sc.nextInt();
		}
		System.out.println();
		
		int count = 0;
		
		System.out.println("NÚMEROS PARES:");
		for(int i=0; i<n; i++) {
			if(list[i] % 2 == 0) {
				System.out.print(list[i] + " ");
				count += 1;
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.print("QUANTIDADE DE PARES = " + count);
		
		sc.close();
	}

}
