
public class Veiculo {
	private String marca;
	private String modelo;
	private double valor;
	private int ano;
	private String cor;
	private String chassi;
	private String placa;
	
	public Veiculo(String marca, String modelo, double valor, int ano, String cor, String chassi, String placa) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
		this.ano = ano;
		this.cor = cor;
		this.chassi = chassi;
		this.placa = placa;
	}

	public void emplacar() {
		if(this.placa.equals("S")) {
			this.setPlaca("Emplacado");
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Informações Veiculo: \n Marca = " + marca + "\n Modelo = " + modelo + "\n Valor = " + valor + "\n Ano = " + ano + "\n Cor = " + cor
				+ "\n Chassi = " + chassi + "\n Placa = " + placa + "!";
	}
	
	
}
