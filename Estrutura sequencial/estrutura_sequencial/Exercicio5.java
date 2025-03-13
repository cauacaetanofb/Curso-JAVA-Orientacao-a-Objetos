package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		int codigo1, codigo2, quantidade1, quantidade2;
		double valor1, valor2, total;
		
		System.out.print("Código da peça 1: ");
		codigo1 = sc.nextInt();
		
		System.out.print("Quantidade da peça 1: ");
		quantidade1 = sc.nextInt();

		System.out.print("Valor da peça 1: ");
		valor1 = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Código da peça 2: ");
		codigo2 = sc.nextInt();
		
		System.out.print("Quantidade da peça 2: ");
		quantidade2 = sc.nextInt();

		System.out.print("Valor da peça 2: ");
		valor2 = sc.nextDouble();
		
		total = quantidade1 * valor1 + quantidade2 * valor2;
		
		System.out.println();
		
		System.out.println("Código das peças: " + codigo1 + " , " + codigo2);
		System.out.printf("Valor total a pagar: R$ %.2f", total);
		
		sc.close();
	}

}
