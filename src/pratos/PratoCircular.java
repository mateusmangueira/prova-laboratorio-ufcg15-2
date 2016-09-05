package pratos;

import exceptions.ValorInvalidoException;

public class PratoCircular extends PratoPersonalizado implements Comparable<PratoPersonalizado> {

	private int raio;

	public PratoCircular(double precoBasePrato, String personalizacaoPrato, int raio) throws Exception {
		super(precoBasePrato, personalizacaoPrato);
		if (raio < 0) {
			throw new ValorInvalidoException("Dimensao nao pode ser negativa.");
		}
		this.raio = raio;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	public double calculaAreaTotal(double raio) {
		return 3.14 * (raio * raio);
	}

	public double calculaPrecoTotal() {
		return this.getPrecoBase() + (0.01 * this.calculaAreaTotal(this.getRaio()));
	}

	public String toString() {
		String retorno = super.toString();
		retorno = retorno + " Formato circular.";
		return retorno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + raio;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int compareTo(PratoPersonalizado outroPrato) {
		return super.compareTo(outroPrato);
	}
}
