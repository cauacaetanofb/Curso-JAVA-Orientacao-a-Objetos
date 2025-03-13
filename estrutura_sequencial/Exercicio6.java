package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		double pi = 3.14159;
		
		System.out.print("A: ");
		a = sc.nextDouble();
		
		System.out.print("B: ");
		b = sc.nextDouble();
		
		System.out.print("C: ");
		c = sc.nextDouble();
		
		areaTriangulo = (a * c) / 2;
		areaCirculo = pi * Math.pow(c, 2);
		areaTrapezio = (a + b) * c / 2;
		areaQuadrado = b * b;
		areaRetangulo = a * b;
		
		System.out.println();
		
		System.out.printf("Area do Triângulo: %.3f\n" , areaTriangulo);
		System.out.printf("Area do Círculo: %.3f\n" , areaCirculo);
		System.out.printf("Area do Trapézio: %.3f\n" , areaTrapezio);
		System.out.printf("Area do Quadrado: %.3f\n" , areaQuadrado);
		System.out.printf("Area do Retângulo: %.3f\n" , areaRetangulo);
		
		sc.close();
	}

}
