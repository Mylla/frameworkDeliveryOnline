package model;

import java.util.List;


/*Classe que simula um banco de dados*/

public class ConfInicial {
	
	//TODO adicionar as classes que faltam
	
	private List<Administrador> administradores;
	private List<Carrinho> carrinhos;
	private List<Cliente> clientes;
	private List<Compra> compras;
	private List<Produto> produtos;
	private List<FormaEntrega> formasEntrega;
	private List<FormaPagamento> formasPagamento;
	private List<ItemProduto> itensProduto;
	
	public ConfInicial()
	{
		this.administradores.add(new Administrador("adm.jpg","adm","adm","adm","adm","adm","adm","adm","adm","admin","admin","adm"));
		
		for(int i=0; i<10; i++)
		{
			this.clientes.add(new Cliente("imagem"+i, "cliente"+i, "123456789"+i, "24/12/1970", "Rua"+i, "Salvador", "Bahia", "40400000", "cliente"+i+"@gmail.com", "cliente"+i, "cliente"+i ));
			FactoryDoces fabricaDoces = new FactoryDoces();
			Produto doce = fabricaDoces.create("codigo"+i, "imagem"+i, "doce"+i, "tipo"+i, "descrição"+i, 100, 10, 0.8*i, 0, 0.3*i);
			this.produtos.add(doce);		
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
