package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Estudante e = new Estudante();
		
		System.out.print("Nome: ");
		e.nome = sc.nextLine();
		System.out.println("Notas: ");
		e.nota1 = sc.nextDouble();
		e.nota2 = sc.nextDouble();
		e.nota3 = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f%n", e.notaFinal());
		
		if (e.notaFinal() >= 60) {
			System.out.println("Aprovado!");
		}
		else {
			System.out.println("Reprovado!");
			System.out.printf("Faltam %.2f pontos para a média", e.diferenca());
		}

		sc.close();
	}
}