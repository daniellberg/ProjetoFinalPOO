
public class Refri extends Bebida {

	private String marca; //coca, guaraná, pepsi...
	private boolean zero; //coca zero, guaraná zero...
	
	public Refri(String tipoBebida, double quantidade, double valor, String marca, boolean zero) {
		super(tipoBebida, quantidade, valor);
		this.marca = marca;
		this.zero = zero;
	}

	@Override
    public String toString() {
        return "Refrigerante " + getTipoBebida() + " de " + getQuantidade() + "ml, custando R$ " + getValor() + " da marca "+ getMarca() + ". Refrigerante zero?" + isZero(); 
    }
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isZero() {
		return zero;
	}

	public void setZero(boolean zero) {
		this.zero = zero;
	}
	
}
