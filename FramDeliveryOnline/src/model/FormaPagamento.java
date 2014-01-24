package model;

import java.util.Date;

public abstract class FormaPagamento {
	
	private String codigo;
	private String nome;
	private String imagem;
	private String tipo; //debito ou credito
	private double juros;
	private Date vencimento;
	
	public FormaPagamento(String codigo, String nome, String imagem,
			String tipo, double juros, Date vencimento) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.imagem = imagem;
		this.tipo = tipo;
		this.juros = juros;
		this.vencimento = vencimento;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
}
