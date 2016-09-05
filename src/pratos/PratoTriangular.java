package pratos;

import exceptions.ValorInvalidoException;

public class PratoTriangular extends PratoPersonalizado implements Comparable<PratoPersonalizado> {

	private double base;
	private double altura;

	public PratoTriangular(double precoBasePrato, String personalizacaoPrato, double base, double altura)
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
		return (this.getBase() * this.getAltura()) / 2.0;
	}

	public double calculaPrecoTotal() {
		return this.getPrecoBase() + (0.01 * this.calculaAreaTotal(this.getBase(), this.getAltura()));
	}

	@Override
	public String toString() {
		String retorno = super.toString();
		retorno = retorno + " Formato triangular.";
		return retorno;
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
