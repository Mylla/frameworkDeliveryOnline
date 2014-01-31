package controller;

import java.util.Date;
import java.util.List;

import model.Cartao;
import model.FormaPagamento;
import model.BaseDados;

public class FormaPagamentoBusiness {
	
	public FormaPagamentoBusiness() {
		super();
	}
	
	public boolean Cadastra(String codigo, String nome, String imagem,
			String tipo, double juros, Date vencimento, int parcelasSemJuros, String campoExtra) {

		BaseDados bd = new BaseDados();
		bd.configura();
		boolean cadastro = false;
		List<FormaPagamento> fps = bd.getFormasPagamento();
		
		FormaPagamento fp = new Cartao(codigo,nome,imagem,tipo,juros,vencimento, parcelasSemJuros, campoExtra);
		
		if(fp != null){
			fps.add(fp);
			cadastro = true;
		}
		
		return cadastro;
	}

}
