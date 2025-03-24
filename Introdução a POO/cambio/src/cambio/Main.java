package cambio;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o preço do dólar? ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantos dolares serão comprados? ");
		double quantidade = sc.nextDouble();
		
		System.out.printf("Valor a pagar: %.2f", Conversor.converter(preco, quantidade));

		sc.close();
	}

}
