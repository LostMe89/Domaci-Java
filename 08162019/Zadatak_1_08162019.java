package DanSest;

import java.util.Scanner;

public class Zadatak_1_08162019 {

	public static void main(String[] args) {
		//Učitati stranice trougla i izračunati obim (Koristiti IF naredbu).
		Scanner citac = new Scanner(System.in);
		System.out.println("Unesite stranice a, b i c: ");
		int a = citac.nextInt();
		int b = citac.nextInt();
		int c = citac.nextInt();
		int o;
		if(a>0 && b>0 && c>0) {
		o=a+b+c;	
		System.out.println("Obim trougla je: " + o);
			
		}else {
			System.out.println("Pogresno uneta stranica");
		}

	}

}
