package model;

public class CompraFinalizada implements CompraStatus{

	@Override
	public CompraStatus isImpedida() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompraStatus isAndamento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompraStatus isFinalizada() {
		// TODO Auto-generated method stub
		return this;
	}

}
