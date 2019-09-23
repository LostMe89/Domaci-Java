package Domaci08292019;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Covek {
	private String titula;
	private String predmet;
	private List<String> predmeti =new ArrayList<>();
	
	
	public Profesor(String ime, String prezime, int godRodjenja, String titula, String predmet) {
		super(ime, prezime, godRodjenja);
		this.titula = titula;
		predmeti.add(predmet);
	}
	
	public List<String> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(List<String> predmeti) {
		this.predmeti = predmeti;
	}

	public String getTitula() {
		return titula;
	}

	public void dodavanjePredmeta() {
		predmeti.add(predmet);
	}
	public void ukloniPredmet() {
		predmeti.remove(predmet);
	}
	
	public String ispisiListu() {
		String s = "";
		for(String predmet : predmeti) {
			s += predmeti + " ";
		}
		return s;
	}
	
}
