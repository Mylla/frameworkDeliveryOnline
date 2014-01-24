package model;

import java.util.ArrayList;
import java.util.List;

import model.Administrador;
import model.Carrinho;
import model.Cliente;
import model.Compra;
import model.FormaEntrega;
import model.FormaPagamento;
import model.ItemProduto;
import model.Produto;

/*Classe que simula um banco de dados*/

public class ConfInicial {

	// TODO adicionar as classes que faltam

	private List<Administrador> administradores = new ArrayList<Administrador>();
	private List<Carrinho> carrinhos = new ArrayList<Carrinho>();
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Compra> compras = new ArrayList<Compra>();
	private List<Produto> produtos = new ArrayList<Produto>();
	private List<FormaEntrega> formasEntrega = new ArrayList<FormaEntrega>();
	private List<FormaPagamento> formasPagamento = new ArrayList<FormaPagamento>();
	private List<ItemProduto> itensProduto = new ArrayList<ItemProduto>();
	
	public void configura() {
		this.administradores.add(new Administrador("adm.jpg", "adm", "adm",
				"adm", "adm", "adm", "adm", "adm", "adm", "admin", "admin",
				"adm"));

		for (int i = 0; i < 10; i++) {
			this.clientes.add(new Cliente("imagem" + i, "cliente" + i,
					"123456789" + i, "24/12/1970", "Rua" + i, "Salvador",
					"Bahia", "40400000", "cliente" + i + "@gmail.com",
					"cliente" + i, "cliente" + i));
	
		}
	

	}

	public List<Administrador> getAdministradores() {
		return administradores;
	}

	public void setAdministradores(List<Administrador> administradores) {
		this.administradores = administradores;
	}

	public List<Carrinho> getCarrinhos() {
		return carrinhos;
	}

	public void setCarrinhos(List<Carrinho> carrinhos) {
		this.carrinhos = carrinhos;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<FormaEntrega> getFormasEntrega() {
		return formasEntrega;
	}

	public void setFormasEntrega(List<FormaEntrega> formasEntrega) {
		this.formasEntrega = formasEntrega;
	}

	public List<FormaPagamento> getFormasPagamento() {
		return formasPagamento;
	}

	public void setFormasPagamento(List<FormaPagamento> formasPagamento) {
		this.formasPagamento = formasPagamento;
	}

	public List<ItemProduto> getItensProduto() {
		return itensProduto;
	}

	public void setItensProduto(List<ItemProduto> itensProduto) {
		this.itensProduto = itensProduto;
	}

}
