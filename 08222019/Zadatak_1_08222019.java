package DanDevet;

import java.util.Scanner;

public class Zadatak_1_08222019 {

	public static void main(String[] args) {
		Scanner citac = new Scanner(System.in);
		System.out.println("Unesite tri realna broja: ");
		double a = citac.nextDouble();
		double b = citac.nextDouble();
		double c = citac.nextDouble();
		double pomocna = proizvod(a,b,c);
		System.out.println(pomocna);
		System.out.println();
		ispisiNajmanji(a,b,c);

	}
	public static double proizvod(double x, double y, double z) {
	double p;
	p= x*y*z;
	return p;
		
	}
	public static void ispisiNajmanji(double x, double y, double z) {
		if ( x < y && x < z ) {
	         System.out.println("Prvi broj je najmanji " + x);
		} else if ( y < x && y < z ) {
	         System.out.println("Drugi broj je najmanji " + y);
		}else if ( z < x && z < y ) {
	         System.out.println("Treci broj je najmanji " + z);
		}else {
	    	  System.out.println("Brojevi nemogu da se porede.");
	      }
	}

}
