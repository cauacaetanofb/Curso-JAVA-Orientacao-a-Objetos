package entities;

public class Funcionario {
	
	public String nome;
	public double salario;
	public double taxa;
	
	public double salarioLiquido() {
		return salario - taxa;
	}
	
	public void salarialTotal(double aumento) {
		salario += (salario * aumento) / 100;
	}
	
	public String toString() {
		return nome + ", R$ " + String.format("%.2f", salarioLiquido());
	}
}
