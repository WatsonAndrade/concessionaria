
public class Cliente extends Pessoa {
	private double saldo;
	private boolean nomeLimpo;
	private String profissao;
	
	public Cliente(String cpf, String nome, int idade, String localizacao, String estadoCivil, double saldo,
			boolean nomeLimpo, String profissao) {
		super(cpf, nome, idade, localizacao, estadoCivil);
		this.saldo = saldo;
		this.nomeLimpo = nomeLimpo;
		this.profissao = profissao;
	}

	public void pagar(double valor) {
		this.setSaldo(this.getSaldo() - valor);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isNomeLimpo() {
		return nomeLimpo;
	}

	public void setNomeLimpo(boolean nomeLimpo) {
		this.nomeLimpo = nomeLimpo;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	
	
	
}
