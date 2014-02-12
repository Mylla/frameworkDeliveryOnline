package model;

public class ClienteComum implements ClienteStatus {

	@Override
	public double calculaDesconto(double totalCompra, double desconto) {
		
		return (totalCompra*desconto*0.1);
	}
}
