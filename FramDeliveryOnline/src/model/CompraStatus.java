package model;

public interface CompraStatus {

	public abstract CompraStatus isImpedida();
	
	public abstract CompraStatus isAndamento();
	
	public abstract CompraStatus isFinalizada();
}
