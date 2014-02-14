package controller;

import java.util.ArrayList;
import java.util.List;
import model.BaseDados;
import model.Doce;
import model.MensagemTela;
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
	
	public boolean editar(String codigo,String nomeLoja,String imagem,String nome,String tipo,
			String descricao,String recheio, int qtdEstoque,double preco,double desconto,double peso) {

		boolean edicao = false;
		Produto p = null;
		
		switch(tipo)
		{
			case "Doce":
				p = this.getProduto(codigo);
				p.setDesconto(desconto);
				p.setDescricao(descricao);
				p.setImagem(imagem);
				p.setLoja(nomeLoja);
				p.setNome(nome);
				p.setPeso(peso);
				p.setPreco(preco);
				p.setQtdEstoque(qtdEstoque);
				p.setTipo(tipo);
				((Doce)p).notificarObservers(new MensagemTela("", null));
				edicao = true;
			break;
		}
		
		return edicao;
	}
	
	public boolean consulta(String codigo,String nomeLoja,String nome,String tipo,double preco,String[] filtro) {

		boolean consulta = false,ok = false;
		Produto p = null;
		
		for (int i = 0; i < produtos.size(); i++) {
			
		    p = produtos.get(i);			
			for (int j = 0; j < filtro.length; j++) {
				switch (filtro[j]) {
				case "codigo":
					if(p.getCodigo().equals(codigo))
					{
						consulta = true;
					}else{
						consulta = false;
					}
					break;
				case "produto":
					if(p.getNome().equals(nome))
					{
						consulta = true;
					}else{
						consulta = false;
					}
					break;
				case "preco":
					if(p.getPreco() <= preco)
					{
						consulta = true;
					}else{
						consulta = false;
					}
					break;
				case "tipo":
					if(p.getTipo().equals(tipo))
					{
						consulta = true;
					}else{
						consulta = false;
					}
					break;
				case "loja":
					if(p.getLoja().equals(nomeLoja))
					{
						consulta = true;
					}else{
						consulta = false;
					}
					break;
				}
			}
			
			if(consulta){
				busca.add(p);
				ok = true;
			}
		}
		
		return ok;
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
