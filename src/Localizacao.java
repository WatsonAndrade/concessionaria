
public class Localizacao {
	private String rua;
	private String bairro;
	private String cidade;
	private int cep;
	private String complemento;
	private int numero;
	private String uf;
	
	public Localizacao(String rua, String bairro, String cidade, int cep, String complemento, int numero, String uf) {
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.complemento = complemento;
		this.numero = numero;
		this.uf = uf;
	}

	public String isInternacional() {
		String[] listaEstados = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
			for (String estadoAtual : listaEstados) {
				if(uf.equals(estadoAtual)) {
					return "É um estado Nacional";
					}
				}
			return "Não é um estado Nacional";
		}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	

}
	

