package model;

public class ClienteComum implements ClienteStatus {

	@Override
	public ClienteStatus isComum(){
		return this;
	}

	@Override
	public ClienteStatus isMaster() {
		// TODO Auto-generated method stub
		return null;
	}
}
