package DanDevet;

import java.util.Scanner;

public class Zadatak_3_08232019 {

	public static void main(String[] args) {
		Scanner citac = new Scanner(System.in);
		System.out.println("Unesite n broj za broj elemenata niza: ");
		int n = citac.nextInt();
		System.out.println("Unesite elemente niza: ");
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = citac.nextInt();

		}

		int b = parni(niz);
		System.out.println(b);
		int c = neparni(niz);
		System.out.println(c);
	}

	public static int neparni(int niz[]) {
		int b = 1;

		for (int i = 1; i < niz.length; i++) {
			if(i%2 !=0)
				b*=niz[i];

		}
		return b;
	}

	public static int parni(int niz[]) {

		int c = 0;
		for (int i = 0; i < niz.length; i++) {
			if(niz[i] % 2 != 0)
				c+=niz[i];

		}
		return c;
	}
}
