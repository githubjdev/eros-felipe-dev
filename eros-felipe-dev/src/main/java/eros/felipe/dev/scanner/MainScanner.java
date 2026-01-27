package eros.felipe.dev.scanner;

import java.util.Scanner;

public class MainScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");

		String nome = sc.nextLine();
		System.out.println("Nome: " + nome);

		/* Sempre fechar para liberar recursos ou par ao objeto não ficar preso */
		sc.close();

	}

}
