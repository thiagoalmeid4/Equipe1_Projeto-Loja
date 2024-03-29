package br.com.loja.dao;

import java.util.List;

import br.com.loja.entity.Cliente;

public class ClienteDao {

	private List<Cliente>listadeclientes;

	public ClienteDao(List<Cliente> listadeclientes) {
		this.listadeclientes = listadeclientes;
	}

	public void addCliente(Cliente cliente) {
		cliente.setId(listadeclientes.size());
		listadeclientes.add(cliente);
	}
	 public List<Cliente> listarclientes() {
		 return listadeclientes;
	 }
	public Cliente getNomeCliente(String nome) {
		for (int i =0 ; i< listadeclientes.size();i++) {
			Cliente cliente = listadeclientes.get(i);
			if(nome.equalsIgnoreCase(listadeclientes.get(i).getNome())) {
				return cliente;
			}
		}
		return null;
	}
	public Cliente getCliente(int id) {
		return listadeclientes.get(id);
	}
	public void depositar(int id, double valor) {
		Cliente cliente = getCliente(id);
		if(cliente!=null) {
			cliente.setSaldo(cliente.getSaldo()+valor);
		}
	}
	
	public Cliente getCpfCliente(String cpf) {
		for (int i = 0 ;i<listadeclientes.size();i++) {
			Cliente cliente = listadeclientes.get(i);
			if(cpf.equalsIgnoreCase(listadeclientes.get(i).getCpf())){
				return cliente;
			}
		}
		return null;
	}

}
