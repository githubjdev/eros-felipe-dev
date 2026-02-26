package eros.felipe.variavelememoria;

import java.util.Scanner;

public class CalculadoraMain2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o numero 1: ");
		double num1 = scanner.nextDouble();

		System.out.println("Digite o numero 2: ");
		double num2 = scanner.nextDouble();

		
		Calculadora calculadora = new Calculadora(num1, num2);
		System.out.println("Soma: " + calculadora.somar());
		System.out.println("Subtração: " + calculadora.subtracao());
		System.out.println("Multiplicacao: " + calculadora.multiplicacao());
		System.out.println("Divisao: " + calculadora.divisao());
		
		/*Na questão de memoria? do Java e o no PC*/
		System.out.println("Soma 2 :" + new Calculadora(num1, num2).somar());
		
		scanner.close();
	}

}
