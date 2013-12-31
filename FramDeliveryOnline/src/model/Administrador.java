package model;

public class Administrador extends Pessoa{

	protected String delivery;

	public Administrador(String imagem, String nome, String cpf,
			String dataNascimento, String endereco, String cidade,
			String estado, String cep, String email, String login,
			String senha, String delivery) {
		super(imagem, nome, cpf, dataNascimento, endereco, cidade, estado, cep,
				email, login, senha);
		this.delivery = delivery;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
}
