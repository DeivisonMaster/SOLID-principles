package cohesion;

public class QuinzeOuVinteCincoPorCento implements RegraDeCalculo{
	
	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalario() > 2000.0) {
			return funcionario.getSalario() * 0.75;
		}else {
			return funcionario.getSalario() * 0.85;
		}
	}
}
