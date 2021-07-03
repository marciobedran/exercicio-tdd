import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProcessadorPagamentosTest {

	@Test
	@DisplayName("Teste com valor do somatorio dos boletos igual ao valor da fatura")
	void TestaFaturaPagaParaValoresIguais() {

		ProcessadorPagamentos processador = new ProcessadorPagamentos();
		Fatura fatura = new Fatura(new Date(), 1500.00, "Marcio Bedran");
		Boleto boleto1 = new Boleto(1, new Date(), 500.00);
		Boleto boleto2 = new Boleto(2, new Date(), 400.00);
		Boleto boleto3 = new Boleto(3, new Date(), 600.00);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(boleto1);
		boletos.add(boleto2);
		boletos.add(boleto3);
		processador.processaPagamentos(fatura, boletos);
		Assertions.assertEquals(fatura.getStatus(), "PAGA");
	}
	
	@Test
	@DisplayName("Teste com valor do somatorio dos boletos igual ao valor da fatura")
	void TestaFaturaPagaParaValoresMaiores() {

		ProcessadorPagamentos processador = new ProcessadorPagamentos();
		Fatura fatura = new Fatura(new Date(), 1500.00, "Marcio Bedran");
		Boleto boleto1 = new Boleto(1, new Date(), 1000.00);
		Boleto boleto2 = new Boleto(2, new Date(), 500.00);
		Boleto boleto3 = new Boleto(3, new Date(), 250.00);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(boleto1);
		boletos.add(boleto2);
		boletos.add(boleto3);
		processador.processaPagamentos(fatura, boletos);
		Assertions.assertEquals(fatura.getStatus(), "PAGA");
	}

}
