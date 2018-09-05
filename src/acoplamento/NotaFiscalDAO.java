package acoplamento;

public class NotaFiscalDAO implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("salva no banco");
	}

}
