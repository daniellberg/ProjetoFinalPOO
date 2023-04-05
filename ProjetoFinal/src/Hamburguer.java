
public class Hamburguer extends Alimento {

	private int qtdeCarnes;
	private String tipoPao;
	private boolean addBacon;
	
	public Hamburguer(double valor, boolean vegetariano, int qtdeCarnes, String tipoPao, boolean addBacon) {
		super(valor, vegetariano);
		this.qtdeCarnes = qtdeCarnes;
		this.tipoPao = tipoPao;
		this.addBacon = addBacon;
	}

	@Override
    public String toString() {
        return "Hamburguer de " +getQtdeCarnes() + " carnes, veg:" + isVegetariano() + ", custando R$ " + getValor() + " Bacon? "+ isAddBacon();
    }
	
	
	@Override
	public double calculaValorVenda() {
		if(qtdeCarnes == 1 && !vegetariano) {
			return valor;
		} else if (qtdeCarnes <=3 || vegetariano) {
			return 1.5*valor;
		} else if (tipoPao == "Brioche") {
			return 1.1*valor;
		} else if(addBacon) {
			return valor*1.2;
		}
		return valor;
	}
	
	@Override
	public double calculaTempoEntrega() {
		double tempoMinutos = 45;
		if(qtdeCarnes <= 2 || addBacon) {
			tempoMinutos = tempoMinutos * 1.2;
		} else if(tipoPao == "Caseiro") {
			tempoMinutos =  tempoMinutos * 3;
		} return tempoMinutos;
	}
	
	public int getQtdeCarnes() {
		return qtdeCarnes;
	}

	public void setQtdeCarnes(int qtdeCarnes) {
		this.qtdeCarnes = qtdeCarnes;
	}

	public String getTipoPao() {
		return tipoPao;
	}

	public void setTipoPao(String tipoPao) {
		this.tipoPao = tipoPao;
	}

	public boolean isAddBacon() {
		return addBacon;
	}

	public void setAddBacon(boolean addBacon) {
		this.addBacon = addBacon;
	}

}
