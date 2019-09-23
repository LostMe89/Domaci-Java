package Domaci08302019;

public class Suma extends Parcela {
	private double povrsinaPodDrvecem;
	private double prinosPoStablu;
	private int periodSazrevanja;

	public Suma(double ukupnaPovrsina, double povrsinaPodDrvecem, double prinosPoStablu, int periodSazrevanja) {
		super(ukupnaPovrsina);
		this.periodSazrevanja = periodSazrevanja;
		this.povrsinaPodDrvecem = povrsinaPodDrvecem;
		this.prinosPoStablu = prinosPoStablu;
	}

	@Override
	public double dajPrinos(int brojGodina) {
		return getPovrsina() / povrsinaPodDrvecem * prinosPoStablu * (brojGodina / periodSazrevanja);
	}

	@Override
	public String toString() {
		return super.toString() + ": (" + povrsinaPodDrvecem + prinosPoStablu + periodSazrevanja + ")";
	}

	@Override
	public char getVrstaParcele() {
		return 'S';
	}
}
