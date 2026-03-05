package eros.felipe.dev.operadorlocigo;

public class Ex2 {
	public static void main(String[] args) {

		boolean emancipado = true;

		if (temIdade() && temDocumento() || (emancipado && temDocumento())) { /* Entrada no evento ou sistema */
			System.out.println("Pode entrar");
		} else {
			System.out.println("Entrada probida");
		}

	}
	
	
	public static boolean temIdade() {
		System.out.println("executou temIdade");
		return false;
	}
	
	public static boolean temDocumento() {
		System.out.println("executou temDocumento");
		return true;
	}


}
