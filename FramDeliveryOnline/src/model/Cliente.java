package model;

public class Cliente extends Pessoa implements ClienteObserver{
	
	protected ClienteStatus status; 	

	public Cliente(String imagem, String nome, String cpf, String dataNascimento, String endereco,
			String cidade, String estado, String cep, String email, String login, String senha) {
		
		super (imagem, nome, cpf, dataNascimento, endereco, cidade, estado, cep, email, login, senha);
		
		this.status = new ClienteComum();
	}
	
	public void isComum(){
		status = status.isComum();
	}
	
	public void isMaster(){
		status = status.isMaster();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
}

