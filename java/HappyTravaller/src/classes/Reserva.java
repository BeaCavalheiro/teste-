package classes;

public class Reserva {
	private Integer cod;
	private Integer entrada, saida;
	private Float total;
	private Transporte transporte;
	private Hospedagem hospedagem;
	private Destino destino;
	
	public Reserva() {
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getEntrada() {
		return entrada;
	}

	public void setEntrada(Integer entrada) {
		this.entrada = entrada;
	}

	public Integer getSaida() {
		return saida;
	}

	public void setSaida(Integer saida) {
		this.saida = saida;
	}

	public Float getTotal() {
		return calcTotal();
	}

	public void setTotal(Float total) {
		this.total = total;
	}

	public Transporte getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}

	public Hospedagem getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	private float calcTotal() {
		this.total = ((this.saida - this.entrada) * hospedagem.getValor() )+ destino.getValor()+transporte.getValor();
		return this.total;
}
}
