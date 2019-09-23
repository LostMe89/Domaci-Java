package DanDevet;

import java.util.Scanner;

public class Zadatak_1_08232019 {

	public static void main(String[] args) {
		
		inverzanBroj();
		
	}
	public static void inverzanBroj() {
		Scanner citac = new Scanner(System.in);
		System.out.println("Unesite ceo broj n: ");
		int n;
		int obr=0;
		n = citac.nextInt();
		while (n != 0) {
			int c = n % 10;
			obr = obr * 10 + c;
			n /= 10;
			
		}
			System.out.println(obr);

	}
}