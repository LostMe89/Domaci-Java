package DanDva;

import java.util.Scanner;

public class Zadatak_1_09082019 {

	public static void main(String[] args) {
		Scanner citac = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int a = citac.nextInt();
		
		if (a%2 == 0) {
			System.out.println("Broj je paran!");
		}else {
			System.out.println("Broj je neparan!");
		}

	}

}
