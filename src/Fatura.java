import java.util.Date;

public class Fatura {
	
	private Date data;
	private double valor_total;
	private String nome;
	
	public Fatura(Date data, double valor_total, String nome) {
		this.setData(data);
		this.setValorTotal(valor_total);
		this.setNome(nome);
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorTotal() {
		return valor_total;
	}

	public void setValorTotal(double valor_total) {
		this.valor_total = valor_total;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
