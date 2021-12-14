
public class Pessoa {
	private String cpf;
	private String nome;
	private int idade;
	private String localizacao;
	private String estadoCivil;
	
	public Pessoa(String cpf, String nome, int idade, String localizacao, String estadoCivil) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.localizacao = localizacao;
		this.estadoCivil = estadoCivil;
	}

	public void fazerAniversario() {
		this.idade++;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}	
	
	
}
