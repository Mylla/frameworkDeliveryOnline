package model;

public class ItemProduto {
	private Produto item;
	private int quantidade;
	private double precoTotal;
	
	public ItemProduto(Produto item, int quantidade, double precoTotal) {
		super();
		this.item = item;
		this.quantidade = quantidade;
		this.precoTotal = precoTotal;
	}

	public Produto getItem() {
		return item;
	}

	public void setItem(Produto item) {
		this.item = item;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
}
