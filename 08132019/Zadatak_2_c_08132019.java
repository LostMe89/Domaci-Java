package danCetiri;

import java.util.Scanner;

public class Zadatak_2_c_08132019 {

	public static void main(String[] args) {
		Scanner citac = new Scanner(System.in);
		System.out.print("Unesite broj k: ");
		int k = citac.nextInt();
		System.out.print("Unesite broj n: ");
		int n = citac.nextInt();
		int sum = 0;
		
		while(k<n) {
			sum += k;
			k+=1;		
		}
		System.out.println("Zbir brojeva je: " + sum);
	}
	
}


