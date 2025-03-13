package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valorPorHora, salario;
		
		System.out.print("Número do funcionário: ");
		numero = sc.nextInt();
		
		System.out.print("Horas trabalhadas: ");
		horas = sc.nextInt();
		
		System.out.print("Valor recebido por hora (R$): ");
		valorPorHora = sc.nextDouble();
		
		System.out.println();
		
		salario = horas * valorPorHora;
		
		System.out.println("Número: " + numero);
		System.out.printf("Sálario: R$ %.2f", salario);
		
		sc.close();
	}

}
