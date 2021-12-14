
public class Nfe {
	private String cpfCliente;
	private String nomeCliente;
	private String matriculaFunc;
	private double valorVeiculo;
	private String chassi;
	private String modelo;
	private String marca;
	private String cnpj;
	
	public String imprimir() {
		return "Nota fiscal: \n"
				+ "CPF Cliente = " + cpfCliente 
				+ "\n Nome do Cliente = " + nomeCliente 
				+ "\n Matricula Funcionario = " + matriculaFunc
				+ "\n Valor do Veiculo = " + valorVeiculo 
				+ "\n Chassi = " + chassi
				+ "\n Modelo = " + modelo 
				+ "\n Marca = " + marca
				+ "\n cnpj = " + cnpj;
	}

	public Nfe(String cpfCliente, String nomeCliente, String matriculaFunc, double valorVeiculo, String chassi,
			String modelo, String marca, String cnpj) {
		this.cpfCliente = cpfCliente;
		this.nomeCliente = nomeCliente;
		this.matriculaFunc = matriculaFunc;
		this.valorVeiculo = valorVeiculo;
		this.chassi = chassi;
		this.modelo = modelo;
		this.marca = marca;
		this.cnpj = cnpj;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getMatriculaFunc() {
		return matriculaFunc;
	}

	public void setMatriculaFunc(String matriculaFunc) {
		this.matriculaFunc = matriculaFunc;
	}

	public double getValorVeiculo() {
		return valorVeiculo;
	}

	public void setValorVeiculo(double valorVeiculo) {
		this.valorVeiculo = valorVeiculo;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}	
