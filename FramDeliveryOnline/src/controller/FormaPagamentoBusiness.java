package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Cartao;
import model.FormaPagamento;
import model.BaseDados;

public class FormaPagamentoBusiness {
	
	private List<FormaPagamento> busca = new ArrayList<FormaPagamento>();
	private BaseDados bd = BaseDados.getInstancia();
	private List<FormaPagamento> formasPagamento = bd.getFormasPagamento();
	
	
	public FormaPagamentoBusiness() {
		super();
	}
	
	public boolean Cadastra(String codigo, String nome, String imagem,
			String tipo, double juros, Date vencimento, int parcelasSemJuros, String campoExtra) {

		boolean cadastro = false;
		
		FormaPagamento fp = new Cartao(codigo,nome,imagem,tipo,juros,vencimento, parcelasSemJuros, campoExtra);
		
		if(fp != null){
			formasPagamento.add(fp);
			cadastro = true;
		}
		
		return cadastro;
	}
	
	public boolean consulta(String codigo,String nome) {

		boolean consulta = false;
		
		for (int i = 0; i < formasPagamento.size(); i++) {
			
			FormaPagamento fp = formasPagamento.get(i);
			
			if((fp.getCodigo().equals(codigo)) ||(fp.getNome().equals(nome))){
				
				busca.add(fp);
				consulta = true;
			}
		}
		
		return consulta;
	}
	
	public List<FormaPagamento> getBusca() {
		return busca;
	}

}
