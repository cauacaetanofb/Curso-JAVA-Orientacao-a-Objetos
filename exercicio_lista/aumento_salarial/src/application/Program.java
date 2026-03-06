package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func;
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Quanto funcionários serão registrados? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		for(int i=0; i<=n; i++) {
			
			System.out.println("Funcionário #" + (i + 1));
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			func = new Funcionario(id, name, salario);
			
			list.add(func);
			
			System.out.println();
		}
		
		System.out.print("ID do Funcionário que receberá aumento: ");
		
		int idBuscado = sc.nextInt();
		sc.nextLine();
		
		func = list.stream().filter(x -> x.getId().equals(idBuscado)).findFirst().orElse(null);
		
		if (func != null) {
			System.out.print("Porcentagem de aumento salarial: ");
			double porcentagem = sc.nextDouble();
			func.aumentarSalario(porcentagem);
		}
		else {
			System.out.println("ID não encontrado!");
		}
		
		System.out.println();
		
		System.out.println("Lista de funcionarios:");
		
		for (Funcionario f : list) {
			System.out.println(f.toString());
		}
		
		sc.close();
	}

}




