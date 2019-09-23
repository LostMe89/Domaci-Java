package Domaci08292019;

public class Student extends Covek  {
private int brIndexa;
private double prosek;
private int godStudija;
public Student(String ime, String prezime, int godRodjenja, int brIndexa, double prosek, int godStudija) {
	super(ime, prezime, godRodjenja);
	this.brIndexa = brIndexa;
	this.prosek = prosek;
	this.godStudija = godStudija;
}
public int getBrIndexa() {
	return brIndexa;
}
public double getProsek() {
	return prosek;
}
public int getGodStudija() {
	return godStudija;
}
//public String ispisi() {
	//return ime + "_" + prezime + "[" + godRodjenja + "]" + " je student " + godStudija + " godine studija sa prosekom " + prosek; 
}


