package DanSest;

import java.util.Scanner;

public class Zadatak_1_08152019 {

	private static Scanner citac;

	public static void main(String[] args) {
		Scanner citac = new Scanner(System.in);
		int s;
		do {
			System.out.println("Ukucajte broj za zeljeni pretmet: ");
			System.out.println("1 - Kocka");
			System.out.println("2 - Kvadar");
			System.out.println("3 - Valjak");
			System.out.println("4 - Lopta");
			System.out.println("0 - Izlaz");
			s = citac.nextInt();
			double a, b, c;
			switch (s) {
			case  1 :
				System.out.println("Unesite stranicu a: ");
				a = citac.nextDouble();
				if (a > 0) {
					System.out.println("Povrsina kocke je: " + 6 * a * a);
				} else {
					System.out.println("Error");
				}
				break;
			case 2:
				System.out.println("Unesite stranice a, b i c: ");
				a = citac.nextDouble();
				b = citac.nextDouble();
				c = citac.nextDouble();
				if (a > 0 && b > 0 && c > 0) {
					System.out.println("Povrsina kvadrata je: " + 2 * (a * b + b * c + a * c));
				} else {
					System.out.println("Error");
				}
				break;
			case 3:
				System.out.println("Unesite poluprecnik r i visinu H: ");
				a = citac.nextDouble();
				b = citac.nextDouble();
				if (a > 0 && b > 0) {
					System.out.println("Povrsina valjka je: " + 2 * a * 3.14 * b);
				} else {
					System.out.println("Error");
				}
				break;
			case 4:
				System.out.println("Unesite poluprecnik lopte r: ");
				a = citac.nextDouble();
				if (a > 0) {
					System.out.println("Povrsina lopte je: " + 4 * a * a * 3.14);
				} else {
					System.out.println("Error");
				}
				break;
			case 0:
				System.out.println("Izlaz iz menija");
				break;
				
			default:
				System.out.println("Los unos!");
				System.out.println();
				break;
			}
		} while (s!=0);

	}

}
