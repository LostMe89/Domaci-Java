package DanDevet;

import java.util.Scanner;

public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		Scanner citac = new Scanner(System.in);
		System.out.println("Unesite n broj za duzinu niza: ");
		int n = citac.nextInt();
		System.out.print("Unesie elemente niza: ");
		int[] niz=new int[n];
		for(int i=0; i<niz.length; i++) {
			niz[i]=citac.nextInt();
	
		}
				System.out.println("Uspesno ste uneli elemente niza sledi ispis u obrnutom redosledu.");

				for(int i = n-1;i>=0; i--) {
					System.out.print(niz[i] + " ");
				}
		
	}

}
