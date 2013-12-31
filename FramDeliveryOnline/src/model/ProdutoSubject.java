package model;

public interface ProdutoSubject { //p cd produto deve implementar essa interface
	
	/*ArrayList<ClienteObserver> observers;
	Produto produto;
	
	public ProdutoSubject(){
		observers = new ArrayList<ClienteObserver>();
	}*/
	
	public void adiciona(ClienteObserver observer);
	
	public void remove(int indice);
	
	//public void setState(Produto produto);
	
	public void notificarObservers();
	
	//public Produto getState();
}
