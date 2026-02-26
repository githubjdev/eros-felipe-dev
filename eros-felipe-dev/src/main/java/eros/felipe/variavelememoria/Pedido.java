package eros.felipe.variavelememoria;

import java.util.Date;

/*Essa classe eça iria virar uma tabela no banco de dados*/
public class Pedido {

	/* Id que será a chave primaria da tabela */
	private Long id;

	private Date dataPedido;

	/* Tipos por Referência ou Associação/ligação */
	private PessoaCliente cliente = new PessoaCliente();

	private double valor;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public PessoaCliente getCliente() {
		return cliente;
	}

	public void setCliente(PessoaCliente cliente) {
		this.cliente = cliente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
