package eros.felipe.variavelememoria;

public class Calculadora {
	
	public double num1;
	public double num2;
	
	
	public Calculadora() {
	}
	
	public Calculadora(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double somar(double num1, double num2) {
		return num1 + num2;
	}
	
	public double somar() {
		return num1 + num2;
	}

	public double subtracao(double num1, double num2) {
		return num1 - num2;
	}
	
	public double subtracao() {
		return num1 - num2;
	}

	public double multiplicacao(double num1, double num2) {
		return num1 * num2;
	}
	
	public double multiplicacao() {
		return num1 * num2;
	}

	public double divisao(double num1, double num2) {
		return num1 / num2;
	}
	
	public double divisao() {
		return num1 / num2;
	}

}
