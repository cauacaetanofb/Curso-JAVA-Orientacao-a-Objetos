package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Estudante[] quartos = new Estudante[10];
		
		System.out.print("Quantos estudantes serão cadastrados? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Estudante estudante;
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Morador #" + i + " :");
				
			System.out.print("Nome: ");
			String name = sc.nextLine();
				
				
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			estudante = new Estudante(name, email);
				
			System.out.print("Quarto: ");
			int numeroQuarto = sc.nextInt();
			sc.nextLine();
			
			if (numeroQuarto >= 0 && numeroQuarto < quartos.length) {
				quartos[numeroQuarto] = estudante;
			}
			else {
				System.out.println("ERRO: NÚMERO DO QUARTO INVÁLIDO!");
			}
			
			System.out.println();
		}
		
		System.out.println("Quartos ocupados:");
		
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println(quartos[i].toString(i));
			}
		}
		sc.close();
	}

}
