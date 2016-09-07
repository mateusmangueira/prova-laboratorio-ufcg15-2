package estoque;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import factory.PratoFactory;
import pratos.PratoPersonalizado;

public class EstoqueDePratos {

	List<PratoPersonalizado> estoque;
	PratoFactory fabricaPratos;

	public EstoqueDePratos() {
		this.estoque = new ArrayList<PratoPersonalizado>();
		this.fabricaPratos = new PratoFactory();
	}

	public List<PratoPersonalizado> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<PratoPersonalizado> estoque) {
		this.estoque = estoque;
	}

	public PratoFactory getFabricaPratos() {
		return fabricaPratos;
	}

	public void setFabricaPratos(PratoFactory fabricaPratos) {
		this.fabricaPratos = fabricaPratos;
	}

	public PratoPersonalizado criaPratoCircular(double preco, String personalizacao, int raio) {
		PratoPersonalizado pratoCircular = this.getFabricaPratos().criaPratoCircular(preco, personalizacao, raio);
		return pratoCircular;
	}

	public PratoPersonalizado criaPratoRetangular(double preco, String personalizacao, double base, double altura) {
		PratoPersonalizado pratoRetangular = this.getFabricaPratos().criaPratoRetangular(preco, personalizacao, base,
				altura);
		return pratoRetangular;
	}

	public PratoPersonalizado criaPratoTriangular(double preco, String personalizacao, double base, double altura) {
		PratoPersonalizado pratoRetangular = this.getFabricaPratos().criaPratoTriangular(preco, personalizacao, base,
				altura);
		return pratoRetangular;
	}

	public boolean adicionaPrato(PratoPersonalizado pratoPersonalizado) {
		this.getEstoque().add(pratoPersonalizado);
		return true;
	}

	public boolean removePrato(PratoPersonalizado pratoPersonalizado) {
		if (this.getEstoque().contains(pratoPersonalizado)) {
			this.getEstoque().remove(pratoPersonalizado);
			return true;
		}
		return false;
	}

	public PratoPersonalizado buscaPrato(String personalizacao) {
		for (PratoPersonalizado prato : this.getEstoque()) {
			if (prato.getPersonalizacao().equalsIgnoreCase(personalizacao)) {
				return prato;
			}
		}
		return null;
	}

	public boolean consultaPrato(String personalizacao) {
		for (PratoPersonalizado prato : this.getEstoque()) {
			if (prato.getPersonalizacao().equalsIgnoreCase(personalizacao)) {
				return true;
			}
		}
		return false;
	}

	public double totalDinheiroEstoque() {
		double total = 0.0;
		for (PratoPersonalizado prato : this.getEstoque()) {
			total += prato.calculaPrecoTotal();
		}
		return total;
	}

	public int quantidadePratos() {
		return this.getEstoque().size();
	}

	public List<PratoPersonalizado> getPratosOrdenadosPorPreco() {
		Collections.sort(this.getEstoque());
		return this.getEstoque();
	}

	public String toString() {
		String retorno = "=== Estoque de Pratos Personalizados ===\n";
		for (PratoPersonalizado prato : this.getEstoque()) {
			retorno = retorno + "\n" + prato;
		}
		return retorno;
	}
}
