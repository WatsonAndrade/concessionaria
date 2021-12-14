
public class Funcionario extends Pessoa{
	private String cargo; 
	private double salario;
	private String matricula;
	private String dataDeAdmissao;
	
	public Funcionario(String cpf, String nome, int idade, String localizacao, String estadoCivil) {
		super(cpf, nome, idade, localizacao, estadoCivil);
	}
	
	public Funcionario(String cpf, String nome, int idade, String localizacao, String estadoCivil, String cargo,
			double salario, String matricula, String dataDeAdmissao) {
		super(cpf, nome, idade, localizacao, estadoCivil);
		this.cargo = cargo;
		this.salario = salario;
		this.matricula = matricula;
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public String promover() {
		String retorna = "Não é possivel promover";
		if(cargo.equals("Vendedor")) {
			cargo = "Supervisor";
			retorna = "O Funcionario " + this.getNome() + " foi promovido!";
		} else if (cargo.equals("Supervisor")) {
			cargo = "Gerente";
			retorna = "O Funcionario " + this.getNome() + " foi promovido!";
		} else if (cargo.equals("Gerente") ) {
			retorna = "Ele ja é um Gerente";
		}
		return retorna;

		

		
	}
	
	public void aumentarSalario() {
		this.setSalario(this.getSalario() + 1000);
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(String dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", salario=" + salario + ", matricula=" + matricula + ", dataDeAdmissao="
				+ dataDeAdmissao + "]";
	}
	
	
	
}
