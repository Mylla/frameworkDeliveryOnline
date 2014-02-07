package model;

import java.util.ArrayList;

public class Doce extends Produto implements ProdutoSubject{
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

	@Override
	public void adiciona(ClienteObserver observer) {
		this.getObservers().add(observer);
		
	}

	@Override
	public void remove(ClienteObserver observer) {
		this.getObservers().remove(observer);
		
	}

	@Override
	public void notificarObservers() {
		
		if(this.getQtdEstoque()>0)
		{
			for (ClienteObserver observer : this.getObservers()) {
				
			}
		}
		
	}

}
