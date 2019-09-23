package DanDva;

import java.util.Scanner;

public class Zadatak_2_08082019 {

	public static void main(String[] args) {
		Scanner citac = new Scanner(System.in);
		System.out.print("Unesite stranicu a: ");
		int a = citac.nextInt();
		System.out.print("Unesite stranicu b: ");
		int b = citac.nextInt();
		
		System.out.println("Obim pravougaonika je: " + (2*a+2*b));
		System.out.println("Povrsina pravouganika je: " + a*b);

	}

}
