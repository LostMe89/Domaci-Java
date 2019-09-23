package Domaci08282019;

public class GlavniProgram {

	public static void main(String[] args) {
		Polaznik p1 = new Polaznik("Milos", "Tomic");
		Laptop l1 = new Laptop("Asus",p1) ;
		l1.setPolaznik(p1);	
		System.out.println(p1.ispisi());
		System.out.println(l1.ispisi());
		l1.resetPolaznik();
		System.out.println(l1.ispisi());
	}

}
