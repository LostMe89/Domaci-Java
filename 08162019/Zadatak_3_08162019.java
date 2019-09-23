package DanSest;

import java.util.Scanner;

public class Zadatak_3_08162019 {

	public static void main(String[] args) {
		//Izračunati proizvod brojeva od 1 do n koji su djeljivi sa a.
		Scanner citac = new Scanner(System.in);
		System.out.println("Unesite broj n; ");
		int n = citac.nextInt();
		System.out.println("Unesite broj a; ");
		int a = citac.nextInt();
		int pr = 1;
		
		for (int i = 1; i <= n; i++) {
			if(i%a==0)
			pr *= i;
		}
		System.out.println("Proizvod brojeva deljivih sa a je: " + pr);
	}

}
