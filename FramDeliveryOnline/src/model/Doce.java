package model;

import java.util.ArrayList;

public class Doce extends Produto{
	private String recheio;
	
	public Doce(ArrayList<ClienteObserver> observers, String codigo,
			String imagem, String nome, String tipo, String descricao,
			int qtdEstoque, int qtdVendida, double preco, double desconto,
			double peso, String loja, String recheio) {
		super(observers, codigo, imagem, nome, tipo, descricao, qtdEstoque,
				qtdVendida, preco, desconto, peso, loja);
		this.recheio = recheio;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

}
