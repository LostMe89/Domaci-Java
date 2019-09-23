package DanDva;

import java.util.Scanner;

public class Zadatak_3_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Unesite neku vrednost od 1 do 3: ");
		
		int a,b=5;
		a=sc.nextInt();
		
		switch(a) {
		case 1: 
			System.out.println(a+5);
			break;
		case 2: 
			System.out.println(a+6);
			break;
		case 3:
			System.out.println(a+7);
			break;
		//default: System.out.println("Pogresan broj; ");
		}
	}

}
