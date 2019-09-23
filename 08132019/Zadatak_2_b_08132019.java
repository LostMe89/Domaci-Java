package danCetiri;

import java.util.Scanner;

public class Zadatak_2_b_08132019 {

	public static void main(String[] args) {
		Scanner citac = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n= citac.nextInt();
		int brojac = 1;
		int sum = 0;
		
		while(brojac<n) {
			sum += brojac;
			brojac+=1;		
		}
		System.out.println("Suma brojeva je: " + sum);
	}


	}


