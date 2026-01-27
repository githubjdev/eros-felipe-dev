package eros.felipe.dev.calculadora;

public class CalculadoraMain {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();

		int soma = calculadora.somar(20, 10);
		System.out.println("Soma: " + soma);

		double divisao = calculadora.divisao(20.0, 11.0);
		System.out.println("Divisao: " + divisao);

		int multiplicao = calculadora.multiplicao(20, 10);
		System.out.println("Multiplicao: " + multiplicao);

		int subtracao = calculadora.subtracao(20, 10);
		System.out.println("Subtracao: " + subtracao);

	}

}
