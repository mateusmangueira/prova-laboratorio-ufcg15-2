package pratos;

import exceptions.ValorInvalidoException;

public class PratoRetangular extends PratoPersonalizado implements Comparable<PratoPersonalizado> {

	private double base;
	private double altura;

	public PratoRetangular(double precoBasePrato, String personalizacaoPrato, double base, double altura)
			throws Exception {
		super(precoBasePrato, personalizacaoPrato);
		if (base < 0) {
			throw new ValorInvalidoException("Dimensao nao pode ser negativa.");
		}
		if (altura < 0) {
			throw new ValorInvalidoException("Dimensao nao pode ser negativa.");
		}
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calculaAreaTotal(double base, double altura) {
		return this.getBase() * this.getAltura();
	}

	public double calculaPrecoTotal() {
		return this.getPrecoBase() + (0.01 * this.calculaAreaTotal(this.getBase(), this.getAltura()));
	}

	@Override
	public String toString() {
		String retorno = super.toString();
		retorno = retorno + " Formato retangular.";
		return retorno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(base);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
