package model;

import java.util.ArrayList;

public class Carrinho {
	
	private ArrayList<ItemProduto> listaProdutos;
	private Cliente cliente;
	private String data;
	private String hora;
	
	public Carrinho(ArrayList<ItemProduto> listaProdutos, Cliente cliente,
			String data, String hora) {
		super();
		this.listaProdutos = listaProdutos;
		this.cliente = cliente;
		this.data = data;
		this.hora = hora;
	}

	public ArrayList<ItemProduto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(ArrayList<ItemProduto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public void addItemProduto(ItemProduto item){
		this.listaProdutos.add(item);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
}
