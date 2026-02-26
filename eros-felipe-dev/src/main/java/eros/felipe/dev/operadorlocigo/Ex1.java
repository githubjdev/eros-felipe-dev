package eros.felipe.dev.operadorlocigo;

public class Ex1 {

	public static void main(String[] args) {

		if (userAtivo() | acessoLiberado()) { /* Cofere as duas condiçoes */
			System.out.println("Acesso liberado");
		}

		if (userAtivo() || acessoLiberado()) { /* Caso uma seja true ele já entre e ignora o restante */
			System.out.println("Acesso liberado 2 ");
		}

	}

	public static boolean userAtivo() {
		System.out.println("Executou userAtivo");
		return true;
	}

	public static boolean acessoLiberado() {
		System.out.println("Executou acessoLiberado");
		return false;
	}

}
