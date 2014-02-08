package model;

public interface ProdutoSubject { 
	
	public void adiciona(ClienteObserver observer);
	
	public void remove(ClienteObserver observer);
	
	public void remove(int indice);
	
	public void notificarObservers();
	
}
