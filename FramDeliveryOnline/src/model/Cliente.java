package model;

public class Cliente extends Pessoa{
	protected ClienteStatus status; 	

	public Cliente(String imagem, String nome, String cpf, String dataNascimento, String endereco,
			String cidade, String estado, String cep, String email, String login, String senha) {
		// TODO Auto-generated constructor stub
		super (imagem, nome, cpf, dataNascimento, endereco, cidade, estado, cep, email, login, senha);
		
		this.status = new UpStatus();
	
	}
	
	public void isComum(){
		status = status.isComum();
	}
	
	public void isMaster(){
		status = status.isMaster();
	}
	
	/*public void setStatus(UpStatus status){
		this.status = status;
	}*/
	
	
}

