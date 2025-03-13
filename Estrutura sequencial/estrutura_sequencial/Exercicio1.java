package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, resultado;
		
		System.out.print("Primeiro número: ");
		x = sc.nextInt();
		
		System.out.print("Segundo número: ");
		y = sc.nextInt();
		
		resultado = x + y;
		
		System.out.print("Soma = " + resultado );
		
		
		sc.close();
	}

}
