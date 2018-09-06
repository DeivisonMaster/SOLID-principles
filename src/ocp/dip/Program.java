package ocp.dip;

public class Program {
	public static void main(String[] args) {
		TabelaDePreco tabela1 = new TabelaDePrecoPadrao();
		TabelaDePreco tabela2 = new TabelaDePrecoDiferenciada();
		ServicoDeEntrega correios = new Frete();
		
		CalculadoraDePrecos calculadora = new CalculadoraDePrecos(tabela2, correios);
		Compra produto = new Compra();
		
		produto.setCidade("Cuiaba");
		produto.setValor(250.0);
		calculadora.calcula(produto);
	}
}
