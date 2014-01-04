package model;

public class FactoryDoces implements FactoryProduto {

	@Override
	public Produto create(String codigo, String imagem, String nome,
			String tipo, String descricao, int qtdEstoque, int qtdVendida,
			double preco, double desconto, double peso) {
		// TODO Auto-generated method stub
		return new Doce(codigo, imagem, nome,
				 tipo, descricao, qtdEstoque, qtdVendida,
				 preco, desconto, peso);
	}

}
