package DanDevet;

import java.util.Scanner;

public class Zadatak_3_08212019 {

	public static void main(String[] args) {
		Scanner citac = new Scanner(System.in);
		System.out.println("Unesite n broj elemenata niza");
		int n = citac.nextInt();

		System.out.print("Unesite elemente niza: ");
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = citac.nextInt();
		}
		int rastuci = 1;
		for (int i = 0; i < niz.length - 1; i++) {
			if (rastuci == 1) {
				if (niz[i] > niz[i + 1])
					rastuci = 0;
			}

		}
		if (rastuci == 1) {
			System.out.println("Niz je rastuci.");
		} else {
			System.out.println("Niz nije rastuci");
		}

	}

}