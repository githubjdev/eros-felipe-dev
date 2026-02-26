package eros.felipe.variavelememoria;

import java.util.Calendar;

public class MainPedido {

	public static void main(String[] args) {
        
		PessoaCliente cliente = new PessoaCliente();
		cliente.setId(1L);
		cliente.setNome("Alex Fernando");
		cliente.setTelefone("54656566");
		cliente.setEndereco("Maringá - PR");
		
		/*Salve com JPA*/
		
		Pedido pedido = new Pedido();
		pedido.setId(10L);
		pedido.setCliente(cliente);
		pedido.setDataPedido(Calendar.getInstance().getTime());/*Data e hora atual da criação do pedido*/
		pedido.setValor(500.00);
		
		/*Salve com JPA*/
		
		
		
	}

}
