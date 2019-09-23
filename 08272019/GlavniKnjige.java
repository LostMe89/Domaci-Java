package Domaci08272019;

public class GlavniKnjige {

	public static void main(String[] args) {
		Knjige k1 = new Knjige ("Gospodar Prstenova", "J.R. Tolkin", 250);
		k1.setGodinaIzdanja(1973);
		System.out.println(k1.getNazivKnjige()+ " " + k1.getAutor() + " " + k1.getBrStrana()+ " " + k1.getGodinaIzdanja());
		Knjige k2 = new Knjige("Budjenje", "Stephan King", 230);
		k2.setGodinaIzdanja(1984);
		System.out.println(k2.getNazivKnjige() + " " + k2.getAutor() + " " + k2.getBrStrana() + " " + k2.getGodinaIzdanja());
		Knjige k3 = new Knjige ("Kroz Pustinju", "Karlo Maj", 420);
		k3.setGodinaIzdanja(1995);
		System.out.println(k3.getNazivKnjige()+ " " + k3.getAutor() + " " + k3.getBrStrana() + " " + k3.getGodinaIzdanja());
	}

}
