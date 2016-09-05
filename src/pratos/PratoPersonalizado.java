package pratos;

import exceptions.StringInvalidaException;
import exceptions.ValorInvalidoException;

public abstract class PratoPersonalizado implements Comparable<PratoPersonalizado> {

	private double precoBase;
	private String personalizacao;

	public PratoPersonalizado(double precoBasePrato, String personalizacaoPrato) throws Exception {
		if (precoBasePrato < 0) {
			throw new ValorInvalidoException("Preco base nao pode ser negativo.");
		}
		if (personalizacaoPrato.equals(null) || personalizacaoPrato.trim().isEmpty()) {
			throw new StringInvalidaException("Personalizacao nao pode ser vazia ou nula");
		}
		if (personalizacaoPrato.equalsIgnoreCase("estampa") || personalizacaoPrato.equalsIgnoreCase("foto")
				|| personalizacaoPrato.equalsIgnoreCase("pintura")) {
			this.personalizacao = personalizacaoPrato;
		} else {
			throw new Exception("Nao criamos pratos com " + personalizacaoPrato + ". Por favor, escolha outra opcao.");
		}

		this.precoBase = precoBasePrato;
		this.personalizacao = personalizacaoPrato;
	}

	public double getPrecoBase() {
		return this.precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}

	public String getPersonalizacao() {
		return this.personalizacao;
	}

	public void setPersonalizacao(String personalizacao) {
		this.personalizacao = personalizacao;
	}

	public abstract double calculaPrecoTotal();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((personalizacao == null) ? 0 : personalizacao.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precoBase);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object outroObjeto) {
		if (outroObjeto instanceof PratoPersonalizado) {
			PratoPersonalizado outroPrato = (PratoPersonalizado) outroObjeto;
			if (this.getPersonalizacao().equalsIgnoreCase(outroPrato.getPersonalizacao())) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		return "Prato com " + this.getPersonalizacao() + " que custa R$ " + this.getPrecoBase() + ".";

	}

	public int compareTo(PratoPersonalizado outroPrato) {
		if(this.calculaPrecoTotal() > outroPrato.calculaPrecoTotal()) {
			return 1;
		} else if ( this.calculaPrecoTotal() == outroPrato.calculaPrecoTotal()) {
			return 0;
		} else {
			return -1;
		}
	}

}
