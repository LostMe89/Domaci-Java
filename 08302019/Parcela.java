package Domaci08302019;

public abstract class Parcela {
	private static int UID = 0;
	private double povrsina;
	private int id;

	protected Parcela(double povrsina) {
		this.povrsina = povrsina;
		id = ++UID;
	}

	@Override
	public String toString() {
		return getVrstaParcele() + "-" + id + "[" + this.povrsina + "]";
	}

	abstract double dajPrinos(int brojGodina);

	public double getPovrsina() {
		return povrsina;
	}

	abstract char getVrstaParcele();

	public int getId() {
		return id;
	}

}
