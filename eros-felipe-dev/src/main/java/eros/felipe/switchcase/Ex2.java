package eros.felipe.switchcase;

public class Ex2 {

	public static void main(String[] args) {

		String status = "CANCELADO";

		String descricao = switch (status) {
		
		case "PENDENTE" -> "Aguardando pagamento";
		case "PAGO" -> "Pago";
		case "CANCELADO" -> {
			logCancelamento();
			yield "Cancelado";
		}
		  default -> throw new IllegalArgumentException("Valor não encontrado: " + status);
		};
		
		System.out.println(descricao);

	}

	private static void logCancelamento() {
		System.out.println("Log de cancelamento foi executado");
		
	}

}
