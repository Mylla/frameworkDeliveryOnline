package model;

public class Administrador extends Pessoa{
	protected Loja loja;

	public Administrador(String imagem, String nome, String cpf, String dataNascimento, String endereco,
			String cidade, String estado, String cep, String email, String login, String senha, String codigo) {
		// TODO Auto-generated constructor stub
		super (imagem, nome, cpf, dataNascimento, endereco, cidade, estado, cep, email, login, senha);
		
		this.loja.setCodigo(codigo);  
		
	}

}
