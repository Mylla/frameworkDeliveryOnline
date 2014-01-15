package model;

public class Compra {
	
		
	private Carrinho carrinho;
	private FormaPagamento formaPagamento;
	private FormaEntrega formaEntrega;
	private StatusCompra status;
	
	
	public Compra(StatusCompra status, Carrinho carrinho,
			FormaPagamento formaPagamento, FormaEntrega formaEntrega) {
		super();
		this.carrinho = carrinho;
		this.formaPagamento = formaPagamento;
		this.formaEntrega = formaEntrega;
	}
	
	public enum StatusCompra {

		impedida,  andamento , finalizada;
	}
	
	public StatusCompra getStatus() {
		return status;
	}
	
	public StatusCompra setStatus(StatusCompra status) {
		this.status = status;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public FormaEntrega getFormaEntrega() {
		return formaEntrega;
	}

	public void setFormaEntrega(FormaEntrega formaEntrega) {
		this.formaEntrega = formaEntrega;
	}
	
}
