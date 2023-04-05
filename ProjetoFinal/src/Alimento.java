
public abstract class Alimento {

	
	protected double valor;
	protected boolean vegetariano; 
	
	public Alimento(double valor, boolean vegetariano) {
		this.valor = valor;
		this.vegetariano = vegetariano;
	}

	public abstract double calculaValorVenda();
	public abstract double calculaTempoEntrega();
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isVegetariano() {
		return vegetariano;
	}

	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}
	
	
}
