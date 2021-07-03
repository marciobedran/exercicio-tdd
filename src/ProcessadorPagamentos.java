import java.util.ArrayList;

public class ProcessadorPagamentos {
	
	public void processaPagamentos(Fatura fatura, ArrayList<Boleto> boletos) {
		if (boletos.size() > 0) {
			double valor_total_boletos = 0.0;
			double valor_total_fatura = fatura.getValorTotal();
			for (Boleto boleto : boletos) {
				valor_total_boletos += boleto.getValor();
			}
			if (valor_total_boletos >= valor_total_fatura) {
				fatura.setStatus("PAGA");
			}
			else {
				fatura.setStatus("PARCIALMENTE_PAGA");
			}
		}
		
	}
	
}
