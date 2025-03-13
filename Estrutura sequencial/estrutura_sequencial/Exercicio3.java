package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.print("A: ");
		a = sc.nextInt();
		
		System.out.print("B: ");
		b = sc.nextInt();
		
		System.out.print("C: ");
		c = sc.nextInt();
		
		System.out.print("D: ");
		d = sc.nextInt();
		
		diferenca = a * b - c * d;
		
		System.out.print("Diferença = " + diferenca);
		
		sc.close();
	}

}
