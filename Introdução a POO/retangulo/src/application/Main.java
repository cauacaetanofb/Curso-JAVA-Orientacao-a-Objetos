package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo r = new Retangulo();
		
		System.out.println("Entre com a altura e largura do retângulo");
		r.altura = sc.nextDouble();
		r.largura = sc.nextDouble();
		
		double area = r.area();
		double perimetro = r.perimetro();
		double diagonal = r.diagonal();
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Perimetro = %.2f%n", perimetro);
		System.out.printf("Diagonal = %.2f%n", diagonal);
		
		sc.close();
	}

}
