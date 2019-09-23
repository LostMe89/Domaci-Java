package Domaci08282019;

public class Polaznik {
	private static int UID = 0;
	private String ime;
	private String prezime;
	private int id;
	
	
	
	public Polaznik(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		id=++UID;
	}
	public int getId() {
		return id;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	
	public String ispisi() {
		return ime+ "_"+prezime+ "{"+  id + "}";
	}

}
