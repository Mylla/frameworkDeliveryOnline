package model;

public class AcompanhaEntrega {
	private String codCompra;
	private String previsaoEntrega;
	private StatusEntrega status;

	
	public AcompanhaEntrega(String codCompra, String previsaoEntrega,
			StatusEntrega status) {
		super();
		this.codCompra = codCompra;
		this.previsaoEntrega = previsaoEntrega;
		this.status = status;
	}


	public enum StatusEntrega {
		analise, postado, abortada, concluida, saiuEntrega;

	}
	
	public String getCodCompra() {
		return codCompra;
	}


	public void setCodCompra(String codCompra) {
		this.codCompra = codCompra;
	}


	public String getPrevisaoEntrega() {
		return previsaoEntrega;
	}


	public void setPrevisaoEntrega(String previsaoEntrega) {
		this.previsaoEntrega = previsaoEntrega;
	}


	public StatusEntrega getStatus() {
		return status;
	}


	public void setStatus(StatusEntrega status) {
		this.status = status;
	}


}
