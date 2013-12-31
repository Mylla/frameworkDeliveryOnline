package model;

public class Compra {
	
	protected CompraStatus status;
	
	private Carrinho carrinho;
	private FormaPagamento formaPagamento;
	private FormaEntrega formaEntrega;
	
	public Compra(CompraStatus status, Carrinho carrinho,
			FormaPagamento formaPagamento, FormaEntrega formaEntrega) {
		super();
		this.status = new CompraImpedida();
		this.carrinho = carrinho;
		this.formaPagamento = formaPagamento;
		this.formaEntrega = formaEntrega;
	}
	
	public void isImpedida(){
		status = status.isImpedida();
	}
	
	public void isAndamento(){
		status = status.isAndamento();
	}
	
	public void isFinalizada(){
		status = status.isFinalizada();
	}

	public CompraStatus getStatus() {
		return status;
	}

	/*public void setStatus(CompraStatus status) {
		this.status = status;
	}*/

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
