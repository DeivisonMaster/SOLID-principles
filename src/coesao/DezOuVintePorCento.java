package coesao;

public class DezOuVintePorCento implements RegraDeCalculo{
	
	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalario() > 3000.0) {
			return funcionario.getSalario() * 0.08;
		}else {
			return funcionario.getSalario() * 0.09;
		}
	}
}
