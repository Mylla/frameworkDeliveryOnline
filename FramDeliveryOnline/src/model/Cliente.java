package model;

public class Cliente extends Pessoa implements ClienteObserver{
	
	protected ClienteStatus status; 
	protected String mensagem;

	public Cliente(String imagem, String nome, String cpf, String dataNascimento, String endereco,
			String cidade, String estado, String cep, String email, String login, String senha,String mensagem) {
		
		super (imagem, nome, cpf, dataNascimento, endereco, cidade, estado, cep, email, login, senha);
		
		this.status = new ClienteComum();
		this.mensagem = mensagem;
	}
	
	public ClienteStatus getStatus() {
		return status;
	}

	public void setStatus(ClienteStatus status) {
		this.status = status;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


	@Override
	public void update(String produto) {
		setMensagem("O "+produto+" está disponível!");
	}
	
}

