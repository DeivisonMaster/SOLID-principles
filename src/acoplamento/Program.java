package acoplamento;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		AcaoAposGerarNota dao = new NotaFiscalDAO();
		AcaoAposGerarNota sendEmail = new EnviadorDeEmail();
		
		List<AcaoAposGerarNota> acoes = new ArrayList<>();
		acoes.add(dao);
		acoes.add(sendEmail);
		
		GeradorNotaFiscal gerador = new GeradorNotaFiscal(acoes);
	}
}
