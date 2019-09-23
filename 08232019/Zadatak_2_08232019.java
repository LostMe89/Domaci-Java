package DanDevet;

import java.util.Scanner;

public class Zadatak_2_08232019 {

	public static void main(String[] args) {
		
		provera();
		
	}

	public static void provera() {
		Scanner citac = new Scanner(System.in);
		System.out.println("Unesite tri cela broja: ");
		int a=citac.nextInt();
		int b=citac.nextInt();
		int c=citac.nextInt();
		for (int i=a; i<=b;i++) {
			if(i%c==0) {
			System.out.print(i + " ");
			
			}
			
		}
	}
}
