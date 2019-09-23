package DanDevet;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		Scanner citac = new Scanner(System.in);
		System.out.println("Unesite broj n za broj elemenata niza: ");
		int n = citac.nextInt();
		int[] niz = new int[n];
		System.out.println("Unesite elemente niza. ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = citac.nextInt();

		}
		System.out.println("Uspesno ste uneli elemente niza.");
		System.out.println("Unesite broj br: ");
		int br = citac.nextInt();
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % br == 0) {
				System.out.println(niz[i]);
			}
		}

	}
    {
		
	}
}
 
