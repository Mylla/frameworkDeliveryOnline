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

public class BaseDados {

	private static BaseDados instancia;
	private List<Administrador> administradores = new ArrayList<Administrador>();
	private List<Carrinho> carrinhos = new ArrayList<Carrinho>();
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Compra> compras = new ArrayList<Compra>();
	private List<Produto> produtos = new ArrayList<Produto>();
	private List<FormaEntrega> formasEntrega = new ArrayList<FormaEntrega>();
	private List<FormaPagamento> formasPagamento = new ArrayList<FormaPagamento>();
	private List<ItemProduto> itensProduto = new ArrayList<ItemProduto>();
	private List<Loja> lojas = new ArrayList<Loja>();
	private List<Mensagem> mensagens = new ArrayList<Mensagem>();

	private BaseDados()
	{
		this.configura();
	}
	
	public static BaseDados getInstancia(){
		if(instancia == null){
			instancia = new BaseDados();
		}

		return instancia;
	}

	public void configura() {

		if(this.administradores.size() == 0 && this.clientes.size() == 0 && this.produtos.size() == 0){
			this.administradores.add(new Administrador("adm.jpg", "adm", "adm",
					"adm", "adm", "adm", "adm", "adm", "adm", "admin", "admin",
					"adm"));

			for (int i = 0; i < 10; i++) {
				this.clientes.add(new Cliente("imagem" + i, "cliente" + i,
						"123456789" + i, "24/12/1970", "Rua" + i, "Salvador",
						"Bahia", "40400000", "cliente" + i + "@gmail.com",
						"cliente" + i, "cliente" + i,""));

			}

			this.produtos.add(new Doce(null,"P1","images/car.jpg","produto1","Doce","produto1",10,0,1.50,0.10,100,"Loja1","chocolate"));
			this.produtos.add(new Doce(null,"P2","images/car.jpg","produto2","Doce","produto2",10,0,1.50,0.10,100,"Loja1","morango"));
			this.formasEntrega.add(new Motoboy("01","Motoboy","Descrição do Motoboy","Doce","MOT0235"));
			this.formasPagamento.add(new Cartao("001", "Cartão", "Crédito", null, 0, null, 0, null));
			this.mensagens.add(new MensagemTela("O produto1 está disponível", this.clientes.get(0)));
			ItemProduto item = new ItemProduto(this.produtos.get(0), 1, this.produtos.get(0).getPreco());
			ArrayList<ItemProduto> listaProdutos = new ArrayList<ItemProduto>();
			listaProdutos.add(item);
			this.carrinhos.add(new Carrinho(listaProdutos, this.clientes.get(0), "12/02/2014", "11:23"));
			this.carrinhos.add(new Carrinho(listaProdutos, this.clientes.get(0), "13/02/2014", "12:23"));
			this.carrinhos.add(new Carrinho(listaProdutos, this.clientes.get(0), "14/02/2014", "13:23"));
			this.carrinhos.add(new Carrinho(listaProdutos, this.clientes.get(0), "15/02/2014", "14:23"));
			this.carrinhos.add(new Carrinho(listaProdutos, this.clientes.get(0), "16/02/2014", "15:23"));
			this.carrinhos.add(new Carrinho(listaProdutos, this.clientes.get(0), "17/02/2014", "16:23"));
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

	public List<Loja> getLojas() {
		return lojas;
	}

	public void setLojas(List<Loja> lojas) {
		this.lojas = lojas;
	}
	

	public List<Mensagem> getMensagens() {
		return mensagens;
	}

	public void setMensagens(List<Mensagem> mensagens) {
		this.mensagens = mensagens;
	}


}
