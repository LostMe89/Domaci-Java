package Domaci_09122019;

public class digitron {

	private static double broj = 0;

	public digitron add(double a) {
		broj += a;
		return this;
	}

	public digitron sub(double a) {
		broj -= a;
		return this;
	}

	public digitron mul(double a) {
		broj *= a;
		return this;
	}

	public digitron div(double a) {
		if (a != 0) {
			broj /= a;

		} else {
			System.out.println("Nemoze da se deli sa 0!");
			return this;
		}
		return this;

	}

	public double value() {
		return broj;
	}

}
