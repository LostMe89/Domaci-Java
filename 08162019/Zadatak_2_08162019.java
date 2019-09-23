package DanSest;

import java.util.Scanner;

public class Zadatak_2_08162019 {

	private static Scanner citac;

	public static void main(String[] args) {
		citac = new Scanner(System.in);
		int pr = 1;
		System.out.println("Unesite broj k: ");
		int k = citac.nextInt();
		System.out.println("Unesite broj n: ");
		int n = citac.nextInt();
		
		
		while(k<=n) {
			pr *= k;
			k++;
		
		}
		System.out.println("Proizvod od " + k + " do " + n +  " je " + pr );
	}
	

}
