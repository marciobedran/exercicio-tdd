import java.util.Date;

public class Boleto {
	
	private int codigo;
	private Date data;
	private double valor;
	
	public Boleto(int codigo, Date data, double valor) {
		this.setCodigo(codigo);
		this.setData(data);
		this.setValor(valor);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
