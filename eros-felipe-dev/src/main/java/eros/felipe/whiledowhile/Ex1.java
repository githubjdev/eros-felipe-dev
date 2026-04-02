package eros.felipe.whiledowhile;

public class Ex1 {

	public static void main(String[] args) {

		int contado = 1;

		
		/*O while sempre testa a condição primeiro e depois se for true executa o código*/
		/*O do-while ele primeiro executa o código e depois verifica a condição*/
		while (contado <= 5) {
			System.out.println("Contado: " + contado);

			contado++;
		}

	}

}
