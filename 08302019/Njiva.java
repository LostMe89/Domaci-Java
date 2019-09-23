package Domaci08302019;

public class Njiva extends Parcela {
	private double prinos;

	public Njiva(double povrsina, double prinos) {
		super(povrsina);
		this.prinos = prinos;
	}

	@Override
	double dajPrinos(int brGodina) {
		return brGodina * prinos * getPovrsina();
	}

	public double getPrinos() {
		return prinos;
	}

	public void setPrinos(double prinos) {
		this.prinos = prinos;
	}

	@Override
	public char getVrstaParcele() {
		return 'N';
	}

	@Override
	public String toString() {
		return super.toString() + ": (" + getPrinos() + ")";

	}
}
