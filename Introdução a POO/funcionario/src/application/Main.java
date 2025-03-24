package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario f = new Funcionario();
		
		System.out.print("Nome: ");
		f.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		f.salario = sc.nextDouble();
		System.out.print("Taxa: ");
		f.taxa = sc.nextDouble();
		System.out.println();
		
		System.out.println("Funcionário: " + f);
		System.out.println();
		
		System.out.print("Porcentagem do aumento de salário: ");
		double aumento = sc.nextDouble();
		f.salarialTotal(aumento);
		System.out.println();

		System.out.println("Atualização: " + f);
		
		sc.close();
	}

}
