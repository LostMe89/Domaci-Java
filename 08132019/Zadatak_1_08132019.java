package danCetiri;

public class Zadatak_1_08132019 {

	public static void main(String[] args) {
		int a=2, b=3, i=4;
		
	a= ++b + --i;// a dobija vrednost od 4 + 3 = 7, b posle ima vrednost 4 i posle ima vrednost 3;
	b= ++a + --i; // b dobija vrednost od 8 + 2 = 10, a posle ima vrednost 8 i posle ima vrednost 2;
	i= b-- + --a; // i dobija vrednost od 10 + 7 = 17, b posle ima vrednost 9 a posle ima vrednost 7;
	b= a-- + i--;// b dobija vrednost od 7 + 17 = 24, a posle ima vrednost 6 i posle ima vrednost 16;
	a= --b + ++i; // a dobija vrednost od 23 + 17 = 40 b posle ima vrednost 23 i  posle ima vrednost 17;
	i= b++ + a++; // i dobija vrednost od 23 + 40 = 63 b posle ima vrednost 24 a posle ima vrednost 41;
	b= i++ - a--; // b dobija vrednost od 63 - 41 = 22 i posle ima vrednost 64 a posle ima vrednost 40;
	a= ++i - b++; // a dobija vrednost od 65 - 22 = 43 i posle ima vrednost 65 b posle ima vrednost 23;
	}

}
