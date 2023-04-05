
public abstract class Bebida {

	private String tipoBebida; //quente ou gelada
	private double quantidade; //200ml...
	private double valor;
	
	public Bebida(String tipoBebida, double quantidade, double valor) {
		super();
		this.tipoBebida = tipoBebida;
		this.quantidade = quantidade;
		this.valor = valor;
	}
		
	public String getTipoBebida() {
		return tipoBebida;
	}
	public void setTipoBebida(String tipoBebida) {
		this.tipoBebida = tipoBebida;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
