package br.com.loja.entity;

import java.util.List;

public class Pedido {
	private List<Produto> produtos;
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	private Cliente cliente;
	private Integer id;
	private Double frete;
	private Double valorTotal;
	private String dataDoPedido;
	private boolean status;

	
	public Pedido() {}
	
	public Pedido(Cliente cliente, String dataDoPedido, List<Produto> lista) {
		super();
		this.cliente = cliente;
		
		this.produtos = lista;
		this.dataDoPedido = dataDoPedido;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getFrete() {
		return frete;
	}
	public void setFrete(Double frete) {
		this.frete = frete;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getDataDoPedido() {
		return dataDoPedido;
	}
	public void setDataDoPedido(String dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
