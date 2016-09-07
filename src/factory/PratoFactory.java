package factory;

import pratos.PratoCircular;
import pratos.PratoPersonalizado;
import pratos.PratoRetangular;
import pratos.PratoTriangular;

public class PratoFactory {

	public PratoFactory() {
	}

	public PratoPersonalizado criaPratoCircular(double preco, String personalizacao, int raio) {
		try {
			PratoPersonalizado pratoCircular = new PratoCircular(preco, personalizacao, raio);
			return pratoCircular;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public PratoPersonalizado criaPratoRetangular(double preco, String personalizacao, double base, double altura) {
		try {
			PratoPersonalizado pratoRetangular = new PratoRetangular(preco, personalizacao, base, altura);
			return pratoRetangular;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public PratoPersonalizado criaPratoTriangular(double preco, String personalizacao, double base, double altura) {
		try {
			PratoPersonalizado pratoTriangular = new PratoTriangular(preco, personalizacao, base, altura);
			return pratoTriangular;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
