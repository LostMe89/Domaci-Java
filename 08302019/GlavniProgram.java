package Domaci08302019;

public class GlavniProgram {

	public static void main(String[] args) {
		Parcela s1 = new Suma(250, 4, 30, 1);
		Parcela n1 = new Njiva(120, 500);
		Parcela s2 = new Suma(120, 3, 24, 2);
		Parcela n2 = new Njiva(100, 429);
		Parcela s3 = new Suma(123, 6, 40, 1);
		Parcela n3 = new Njiva(98, 345);

		Parcela niz[] = { s1, s2, s3, n1, n2, n3 };

		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i] + " trogodisnji prinos je: " + niz[i].dajPrinos(3));
		}
	}

}
