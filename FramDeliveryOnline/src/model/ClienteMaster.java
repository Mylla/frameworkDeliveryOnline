package model;

public class ClienteMaster implements ClienteStatus {

	@Override
	public double calculaDesconto(double totalCompra, double desconto) {
		
		return (totalCompra*desconto*0.3);
	}


}
