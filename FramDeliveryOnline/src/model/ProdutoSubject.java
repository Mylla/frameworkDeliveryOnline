package model;

public interface ProdutoSubject { //p cd produto deve implementar essa interface
	
	/*ArrayList<ClienteObserver> observers;
	Produto produto;
	
	public ProdutoSubject(){
		observers = new ArrayList<ClienteObserver>();
	}*/
	
	public void adiciona(ClienteObserver observer);
	
	public void remove(ClienteObserver observer);
	
	public void notificarObservers();
	
}
