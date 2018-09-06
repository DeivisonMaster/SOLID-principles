package low.coupling;

public class EnviadorDeEmail implements AcaoAposGerarNota{

	public void executa(NotaFiscal nf) {
		System.out.println("envia email");
	}

}
