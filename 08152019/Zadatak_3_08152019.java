package DanSest;

import java.util.Scanner;

public class Zadatak_3_08152019 {

	public static void main(String[] args) {
		Scanner citac = new Scanner(System.in);
		System.out.println("Unesite a i b: ");
		int a = citac.nextInt();
		int b = citac.nextInt();
		for (int i = 1; i <= b; i++) {
			System.out.println();
			for(int c = 1; c<=a; c++) {
				System.out.print("*          ");	
			}
			System.out.println();
		}

	}

}
