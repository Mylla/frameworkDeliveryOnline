package controller;

import java.util.ArrayList;
import java.util.List;
import model.BaseDados;
import model.Doce;
import model.Produto;

public class ProdutoBusiness {
	
	private List<Produto> busca = new ArrayList<Produto>();
	private BaseDados bd =  BaseDados.getInstancia();	
	private List<Produto> produtos = bd.getProdutos();

	public ProdutoBusiness() {
		super();
	}
	
	public boolean cadastra(String codigo,String nomeLoja,String imagem,String nome,String tipo,
			String descricao,String recheio, int qtdEstoque,double preco,double desconto,double peso) {

		boolean cadastro = false;
		Produto p = null;
		
		switch(tipo)
		{
			case "Doce":
				p = new Doce(null, codigo, imagem, nome, tipo, descricao, qtdEstoque, 0, preco, desconto, peso, nomeLoja, "");
			break;
		}
		
		if(p!= null)
		{
			produtos.add(p);
			cadastro = true;
		}
		
		return cadastro;
	}
	
	public boolean consulta(String codigo,String nomeLoja,String nome,String tipo,double preco) {

		boolean consulta = false;
		
		for (int i = 0; i < produtos.size(); i++) {
			
			Produto p = produtos.get(i);			
			
			if((p.getCodigo().equals(codigo)) || (p.getLoja().equals(nomeLoja)) ||
			   (p.getNome().equals(nome)) || (p.getTipo().equals(tipo)) || (p.getPreco() <= preco)){
				
				busca.add(p);
				consulta = true;
			}
		}
		
		return consulta;
	}
	
	public Produto getProduto(String codigo) {
		
		Produto p= null;
		
		for (int i = 0; i < produtos.size(); i++) {
			
		    p = produtos.get(i);
			
			if(p.getCodigo().equals(codigo)){
				break;
			}
		}
		
		return p;
	}

	public List<Produto> getBusca() {
		return busca;
	}
}
