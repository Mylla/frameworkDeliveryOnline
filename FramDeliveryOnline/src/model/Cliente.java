package model;

public class Cliente extends Pessoa{
	private UpStatus status;  // FALTA CORRIGIR ALTERACAO DE STATUS
	//private boolean isMaster = false;
	
	
	

	public Cliente(String imagem, String nome, String cpf, String dataNascimento, String endereco,
			String cidade, String estado, String cep, String email, String login, String senha,
			String status) {
		// TODO Auto-generated constructor stub
		super (imagem, nome, cpf, dataNascimento, endereco, cidade, estado, cep, email, login, senha);
		
		this.status = new isComum();
	
	}
	
	public void isComum(){
		status.isComum(this);
	}
	
	public void isMaster(){
		status.isMaster(this);
	}
	
	public void setStatus(UpStatus status){
		this.status = status;
	}
	
	
}

