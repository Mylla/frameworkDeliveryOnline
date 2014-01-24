package model;

public class Motoboy extends FormaEntrega{

	private String placa;
	
	public Motoboy(String codigo, String nome, String descricao,
			String tipoProduto, String placa) {
		super(codigo, nome, descricao, tipoProduto);
		this.setPlaca(placa);
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	

}
