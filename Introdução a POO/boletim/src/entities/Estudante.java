package entities;

public class Estudante {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double diferenca() {
		return 60 - notaFinal();
	}
}
