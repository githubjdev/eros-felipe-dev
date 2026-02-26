package eros.felipe.variavelememoria;

import java.util.Scanner;

public class CalculadoraMain {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o numero 1: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Digite o numero 2: ");
		double num2 = scanner.nextDouble();
		
		
		Calculadora calculadora = new Calculadora();
		System.out.println("Soma: " + calculadora.somar(num1, num2));
		System.out.println("Subtracao: " + calculadora.subtracao(num1, num2));
		System.out.println("Multiplicacao: " + calculadora.multiplicacao(num1, num2));
		System.out.println("Divisão: " + calculadora.divisao(num1, num2));
		
		scanner.close();
		
	}

}
