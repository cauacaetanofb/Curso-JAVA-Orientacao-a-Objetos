package application;

import java.util.Locale;
import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("QUANTAS PESSOAS SERÃO DIGITADAS? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Pessoa[] list = new Pessoa[n];
		List<String> listNameOverAge = new ArrayList<>();
		
		String name;
		int age;
		double height;
		
		double sumHeight = 0;
		int overAge = 0;
		
		for(int i=0; i<n; i++) {
			
			System.out.println("DADOS DA " + (i+1) + "a PESSOA :");
			System.out.print("NOME: ");
			name = sc.nextLine();
			
			System.out.print("IDADE: ");
			age = sc.nextInt();
			if(age<16) {
				overAge += 1;
				listNameOverAge.add(name);
			}
			
			System.out.print("ALTURA: ");
			height = sc.nextDouble();
			sc.nextLine();
			sumHeight += height;			
			
			Pessoa pessoa = new Pessoa(name, age, height);

			list[i] = pessoa;
			
			
		}
		
		double avgHeight = sumHeight / n;
		double percentOverAge = (overAge * 100) / n;
		
		System.out.printf("ALTURA MÉDIA : %.2f\n", avgHeight);
		System.out.printf("PESSOAS COM MENOS DE 16 ANOS: %.1f%%\n", percentOverAge);
		
		for(String nameOverAge : listNameOverAge) {
			System.out.println(nameOverAge);
		}
		
		sc.close();
	}

}
