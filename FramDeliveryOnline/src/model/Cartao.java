package model;

import java.util.Date;

public class Cartao extends FormaPagamento{

	private String codigoDeSeguranca;
	private int numParcelasSemJuros;
	
	public Cartao(String codigo, String nome, String imagem, String tipo,
			double juros, Date vencimento,int parcelasSemJuros, String codigoDeSeguranca) {
		super(codigo, nome, imagem, tipo, juros, vencimento);
		this.setNumParcelasSemJuros(parcelasSemJuros);
		this.setCodigoDeSeguranca(codigoDeSeguranca);
		
	}

	public String getCodigoDeSeguranca() {
		return codigoDeSeguranca;
	}

	public void setCodigoDeSeguranca(String codigoDeSeguranca) {
		this.codigoDeSeguranca = codigoDeSeguranca;
	}

	public int getNumParcelasSemJuros() {
		return numParcelasSemJuros;
	}

	public void setNumParcelasSemJuros(int numParcelasSemJuros) {
		this.numParcelasSemJuros = numParcelasSemJuros;
	}

}
