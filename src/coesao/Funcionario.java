package coesao;

public class Funcionario {
	private Cargo cargo;
	private double Salario;
	
	
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	
	public double calculaSalario() {
		return this.cargo.getRegra().calcula(this);
	}
}
