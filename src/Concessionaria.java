public class Concessionaria {
	private String nome;
	private String cnpj;
	private double capital;
	private String localizacao;
	
	private Veiculo[] veiculos;
	private Funcionario[] funcionarios;
	private Funcionario gerente;
	
	public Concessionaria(String nome, String cnpj, double capital, String localizacao, Veiculo[] veiculos,
			Funcionario[] funcionarios, Funcionario gerente) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.capital = capital;
		this.localizacao = localizacao;
		this.veiculos = veiculos;
		this.funcionarios = funcionarios;
		this.gerente = gerente;
	}

	public void venderVeiculo(Cliente cliente, Veiculo veiculo, Funcionario funcionario) {
		Nfe nfe = new Nfe(cliente.getCpf(), cliente.getNome(), funcionario.getMatricula(), veiculo.getValor(), veiculo.getChassi(), veiculo.getModelo(), veiculo.getMarca(), this.cnpj);
		
	}
	
	public void removeVeiculo(String chassi) {
		for (int i = 0; i < veiculos.length; i++) {
			if(chassi.equals(veiculos[i].getChassi())) {
				veiculos[i] = null;
			}
			
		}
	}
	
	public void recebeValorPosVenda(double valor) {
		this.capital = this.capital + valor;
	}
	
	public String promoveFuncionario(String matricula) {
		for (int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i].getMatricula().equals(matricula)) {
				if((funcionarios[i].getCargo().equals("Supervisor") && this.gerente == null) || (funcionarios[i].getCargo().equals("Vendedor"))) {
					return funcionarios[i].promover();
				}
			}
		}
		return (matricula + "Promovido");		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Veiculo[] getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Veiculo[] veiculos) {
		this.veiculos = veiculos;
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Funcionario getGerente() {
		return gerente;
	}

	public void setGerente(Funcionario gerente) {
		this.gerente = gerente;
	}

	@Override
	public String toString() {
		return "Concessionaria Nome=" + nome 
				+ ", cnpj=" + cnpj 
				+ ", capital=" + capital 
				+ ", localizacao=" + localizacao 
				+ ", veiculos=" + veiculos 
				+ ", funcionarios=" + funcionarios 
				+ ", gerente=" + gerente;
	}

	
	
}
	

