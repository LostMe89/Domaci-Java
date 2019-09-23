package danCetiri;

import java.util.Scanner;

public class Zadatak_2_08122019 {

	private static Scanner citac;

	public static void main(String[] args) {
		citac = new Scanner(System.in);
		System.out.println("Unesite broj n");
		int n = citac.nextInt();
		int brojac=1;
		int suma1=0;
		int suma2=1;

		while(brojac<=n) {
			if(n%2==0) {
				suma1 = suma1 + n;	
			n--;
			} else {
				suma2= suma2 * n;
				n--;	
			}	
		} 
		System.out.println("Suma parnih brojeva je: " + suma1);
		System.out.println("Proizvod neparnih brojeva je: " + suma2);
			
	}
			
}


