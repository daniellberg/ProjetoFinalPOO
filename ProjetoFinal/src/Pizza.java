
public class Pizza extends Alimento {

	private String sabor;
	private String tamanho;
	private boolean bordaRecheada;
	
	public Pizza(double valor, boolean vegetariano, String sabor, String tamanho, boolean bordaRecheada) {
		super(valor, vegetariano);
		this.sabor = sabor;
		this.tamanho = tamanho;
		this.bordaRecheada = bordaRecheada;
	}

	@Override
    public String toString() {
        return "Pizza " + getSabor() + " " + getTamanho() + ", valor: R$ " + getValor() + ", veg: " + isVegetariano() + ", borda: " + isBordaRecheada();
    }
	
	@Override
	public double calculaValorVenda() {
		if(vegetariano || bordaRecheada && sabor != "Calabresa") {
			return 1.4 * valor;
		} else if(vegetariano && bordaRecheada) {
			return 2*valor;
		} else if (sabor == "Camarão"){
			return 1.6*valor;
		} else {
			return valor;
		}
	}
	
	
	@Override
	public double calculaTempoEntrega() {
		double tempoMinutos = 45;
		if(tamanho == "Família" || sabor == "Camarão") {
			tempoMinutos = tempoMinutos * 1.2;
		} else if(bordaRecheada || vegetariano) {
			tempoMinutos =  tempoMinutos * 1.5;
		} return tempoMinutos;
	}
	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isBordaRecheada() {
		return bordaRecheada;
	}

	public void setBordaRecheada(boolean bordaRecheada) {
		this.bordaRecheada = bordaRecheada;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
