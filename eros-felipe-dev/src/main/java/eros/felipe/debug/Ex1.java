package eros.felipe.debug;

public class Ex1 {
	
	
	//F6 - Pula de linha em linha
	//F5 - Entra no método
	//F7 - Pula o método
	//F8 - Continua para o fim ou próximo break point
	// CRTL + SHIFT + I - Ver resultado da expressão selecionada

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int resultado = dividir(a, b);
		System.out.println(resultado);

	}

	public static int dividir(int x, int y) {
		return x / y;
	}

}
