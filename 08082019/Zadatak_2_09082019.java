package DanDva;

import java.util.Scanner;

public class Zadatak_2_09082019 {

	public static void main(String[] args) {
		Scanner citac = new Scanner(System.in);
		System.out.println("Unesite ime objekta: ");
		String s = citac.nextLine();
		
		switch(s) {
		case "Pravougaonik":
			System.out.print("Unesite stranicu a: ");
			double a = citac.nextDouble();
			System.out.print("Unesite stranicu b: ");
			double b = citac.nextDouble();
			if(a>0 && b>0 && a!=b) {
			System.out.println("Povrsina pravougaonika je: " + a*b);
			}else {
				System.out.println("Unesite ispravne podatke.");
			}break;
		case "Krug":
			System.out.print("Unesite polupracnik r: ");
			double r = citac.nextDouble();
			if(r>0) {
			System.out.println("Povrsina kruga je: " + r*r*3.14);}
			else {
				System.out.println("Unesite ispravne podatke.");
			}break;
		case "Kvadrat":
			System.out.print("Unesite stranicu a: ");
			double c = citac.nextDouble();
			if(c>0) {
			System.out.println("Povrsina kvadrata je: "+ c*c);}
			else {
				System.out.println("Unesite ispravne podatke.");
			}break;
			default: System.out.println("Ne postoji uneti objekat");
		}

	}

}
