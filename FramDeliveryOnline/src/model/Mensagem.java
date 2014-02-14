package model;

public abstract class Mensagem {
	protected String mensagem;
	protected Cliente cliente;

	public Mensagem(String mensagem, Cliente cliente) {
		super();
		this.mensagem = mensagem;
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public abstract String enviaMensagem();
}
