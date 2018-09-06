package ocp.dip;

public class CalculadoraDePrecos {
	private TabelaDePreco tabela;
	private ServicoDeEntrega servico;

	public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega servico) {
		this.tabela = tabela;
		this.servico = servico;
	}

	public double calcula(Compra produto) {
		double desconto = tabela.descontoPara(produto.getValor());
		double frete	= servico.para(produto.getCidade());
		
		return produto.getValor() * (1 - desconto) + frete;
	}
}
