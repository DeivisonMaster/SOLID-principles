package encapsulation;

import java.util.Collections;
import java.util.List;

public class Fatura {
	List<Pagamento> pagamentos;
	private double valor;
	private boolean pago;

	public boolean isPago() {
		return pago;
	}
	public List<Pagamento> getPagamentos() {
		return Collections.unmodifiableList(pagamentos);
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public void adicionaPagamentos(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		
		if(valorTotalDosPagamentos() > this.valor) {
			this.pago = true;
		}
	}
	private double valorTotalDosPagamentos() {
		double total = 0;
		
		for(Pagamento pag : pagamentos) {
			total += pag.getValor();
		}
		return total;
	}
	
}
