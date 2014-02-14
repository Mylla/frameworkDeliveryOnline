package model;

public class MensagemTela extends Mensagem {

	public MensagemTela(String mensagem, Cliente cliente) {
		super(mensagem, cliente);
	}

	@Override
	public String enviaMensagem() {
		return this.mensagem;
	}
}
