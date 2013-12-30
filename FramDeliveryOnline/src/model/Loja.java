package model;

import java.util.ArrayList;

public abstract class Loja {
	private String codigo;
	private String logotipo;  
	private String nome;
	private String tipo;
	private String endereco;
	private String bairro;
	private String cep;
	private String estado;
	private String cidade;
	private String telefone;
	private String cnpj;
	private String responsavel;
	private String email;
	private ArrayList <String> areasEntrega = new ArrayList <String> ();
	private String site;

	public Loja(String codigo, String logotipo,String nome,String tipo,String endereco,String bairro,
			String cep,String estado,String cidade,String telefone,String cnpj,String responsavel,String email,
			ArrayList <String> areasEntrega,String site) {
		// TODO Auto-generated constructor stub
		super();
		this.codigo = codigo;
		this.logotipo = logotipo;
		this.nome = nome;
		this.tipo = tipo;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.responsavel = responsavel;
		this.email = email;
		this.areasEntrega = areasEntrega;
		this.site = site;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getLogotipo() {
		return logotipo;
	}

	public void setLogotipo(String logotipo) {
		this.logotipo = logotipo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAreasEntrega(ArrayList<String> areasEntrega) {
		this.areasEntrega = areasEntrega;
	}

	public ArrayList<String> getAreasEntrega() {
		return areasEntrega;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}
	
	

}
