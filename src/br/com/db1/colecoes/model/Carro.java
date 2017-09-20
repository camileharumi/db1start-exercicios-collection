package br.com.db1.colecoes.model;

public class Carro implements Comparable<Carro> {
	
	private Integer ano;
	private String placa;
	private String marca;
	private String modelo;
	
	public Carro(Integer ano, String modelo, String marca, String placa) {
		this.ano = ano;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
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

	@Override
	public int compareTo(Carro outroCarro) {
		if(this.getAno() < outroCarro.getAno()) {
			return -1;
		}
		if(this.getAno() > outroCarro.getAno()) {
			return 1;
		}
		return 0;
	}
	
}
