package model;

public class Cliente extends Pessoa implements ClienteObserver{
	
	protected ClienteStatus status; 

	public Cliente(String imagem, String nome, String cpf, String dataNascimento, String endereco,
			String cidade, String estado, String cep, String email, String login, String senha,String mensagem) {
		
		super (imagem, nome, cpf, dataNascimento, endereco, cidade, estado, cep, email, login, senha);
		
		this.status = new ClienteComum();
	}
	
	public ClienteStatus getStatus() {
		return status;
	}

	public void setStatus(ClienteStatus status) {
		this.status = status;
	}
	
	public void mudarStatusMaster() {
		this.setStatus(new ClienteMaster());
	}
	
	@Override
	public void update(Mensagem mensagem,String produto) {
		new MensagemTela("O "+produto+" está disponível!",this);
	}
	
}

