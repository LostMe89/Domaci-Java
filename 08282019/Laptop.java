package Domaci08282019;

public class Laptop {
	private String marka;
	private Polaznik polaznik;
	
	public Laptop(String marka, Polaznik polaznik) {
		super();
		this.marka = marka;
		this.polaznik = polaznik;
	}
	public String getMarka() {
		return marka;
	}
	public Polaznik getPolaznik() {
		return polaznik;
	}
	public void setPolaznik(Polaznik polaznik) {
		if(this.polaznik!=null)
		this.polaznik= polaznik;
	}
	public void resetPolaznik() {
		polaznik = null;
	}
	public String ispisi() {
		String s;
		if(polaznik==null) {
			s="NEMA POLAZNIKA";
		}else {
			s=polaznik.ispisi();
		}
		return marka+"{"+ s +"}";
	}
	}

