package DanSest;

import java.util.Scanner;

public class Zadatak_2_08152019 {

	public static void main(String[] args) {
		Scanner citac = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n = citac.nextInt();
		int a=0;
		int b=1;
		int suma=0;
		for(int i = 1; i <=n; ++i) {
			System.out.print(a + " ");
			suma = a+b;
			a=b;
			b=suma;
			
		}
		
	}

}
