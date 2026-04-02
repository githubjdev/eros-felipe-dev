package eros.felipe.switchcase;

public class Ex3 {

	public static void main(String[] args) {

		StatusPedido statusPedido = StatusPedido.PAGO;

		String retorno = switch (statusPedido) {
			case ENVIADO -> "Seu pedido já foi enviado";
			case ENTREGUE -> "Seu pedido foi entregue";
			case PAGO -> "Seu pedido foi pago";
		  default -> "Desconhecido";
		};

		System.out.println("Status do pedido: " + retorno);

	}

}
