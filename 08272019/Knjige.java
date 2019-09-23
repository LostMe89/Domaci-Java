package Domaci08272019;

public class Knjige {
	private String nazivKnjige;
	private String autor;
	private int brStrana;
	private int godinaIzdanja;
	
	
	
	public Knjige(String nazivKnjige, String autor, int brStrana) {
		
		this.nazivKnjige = nazivKnjige;
		this.autor = autor;
		this.brStrana = brStrana;
	}

	public String getNazivKnjige() {
		return nazivKnjige;
	}
	
	public String getAutor() {
		return autor;
	}
	public int getBrStrana() {
		return brStrana;
	}
	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}
	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja=godinaIzdanja;
	}

}
