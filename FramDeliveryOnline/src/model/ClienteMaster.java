package model;

public class ClienteMaster implements ClienteStatus{

	@Override
	public ClienteStatus isComum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteStatus isMaster() {
		// TODO Auto-generated method stub
		return this;
	}

}
