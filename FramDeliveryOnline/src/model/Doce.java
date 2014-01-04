package model;

import java.util.ArrayList;

public class Doce extends Produto{

	public Doce(String codigo, String imagem, String nome, String tipo,
			String descricao, int qtdEstoque, int qtdVendida, double preco,
			double desconto, double peso) {
		super(codigo, imagem, nome, tipo, descricao, qtdEstoque, qtdVendida, preco,
				desconto, peso);
		// TODO Auto-generated constructor stub
	}
	
	public Doce(ArrayList<ClienteObserver> observers, String codigo,
			String imagem, String nome, String tipo, String descricao,
			int qtdEstoque, int qtdVendida, double preco, double desconto,
			double peso) {
		super(observers, codigo, imagem, nome, tipo, descricao, qtdEstoque, qtdVendida,
				preco, desconto, peso);
		// TODO Auto-generated constructor stub
	}

	

}
