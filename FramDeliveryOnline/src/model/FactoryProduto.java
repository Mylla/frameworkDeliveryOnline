package model;

public interface FactoryProduto {

	public abstract Produto create(String codigo, String imagem, String nome, String tipo,
			String descricao, int qtdEstoque, int qtdVendida, double preco,
			double desconto, double peso);
	
}
