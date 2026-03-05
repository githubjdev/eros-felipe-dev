package eros.felipe.dev.operadorlocigo;

public class ex5 {

	public static void main(String[] args) {

		double saldo = 1000;
		double valorCompra = 800;
		boolean cartaoAtivo = true;

		if (saldo >= valorCompra && cartaoAtivo) {
			System.out.println("Compra aprovada");
		} else {
			System.out.println("Compra negada");
		}
		

	}

}
