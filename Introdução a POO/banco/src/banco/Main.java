package banco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cadastro de conta");
		
		System.out.println();
		
		System.out.print("Número da conta: ");
		int numero = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Nome do titular: ");
		String nome = sc.nextLine();
		
		System.out.print("Deseja fazer um deposito inicial? (s/n): ");
		char resposta = sc.next().charAt(0);
		
		Conta conta;
		
		if (resposta == 's') {
			System.out.print("Valor do depósito: R$ ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		} else {
			conta = new Conta(numero, nome);
		}
	
		System.out.println();
		
		System.out.println("Dados da conta:");
		System.out.println(conta.toString());
		
		System.out.println();
		
		System.out.print("Valor do deposito: R$ ");
		double deposito = sc.nextDouble();
		conta.depositar(deposito);
		
		System.out.println("Dados da conta atualizado:");
		System.out.println(conta.toString());
		
		System.out.println();
		
		System.out.print("Valor do saque: R$ ");
		double saque = sc.nextDouble();
		conta.sacar(saque);
		
		System.out.println("Dados da conta atualizado:");
		System.out.println(conta.toString());
		
		sc.close();
	}

}
