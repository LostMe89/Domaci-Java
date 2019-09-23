package Domaci08292019;

public class GlavniProgram {

	public static void main(String[] args) {
		Student s1 = new Student ("Milos", "Tomic", 1989, 001, 9.45, 3 );
		Profesor p1 = new Profesor ("Petar", "Petrovic - NJEGOS", 1978, "Dekan", "Istorija");
		Student s2 = new Student ("Ana", "Bogdanovic", 1989,002,9.23,4);
		Profesor p2=new Profesor ("BUTROS BUTROS","Gali",1976,"Profesor","Argentisnko Pravo");
		Student s3 = new Student ("Ivica","Dacic", 1967,003,10.0,4);
		Profesor p3 = new Profesor ("Perica", "Ognjenovic",1982, "Profesor","Teorija sporta");
		System.out.println(s1.getIme()+ "_" + s1.getPrezime()+ "[" + s1.getGodRodjenja()+ "]" + " je student " + s1.getGodStudija() + " godine  sa prosekom "+ s1.getProsek());
		System.out.println(s2.getIme()+ "_" + s2.getPrezime()+ "[" + s2.getGodRodjenja()+ "]" + " je student " + s2.getGodStudija() + " godine  sa prosekom "+ s2.getProsek());
		System.out.println(s3.getIme()+ "_" + s3.getPrezime()+ "[" + s3.getGodRodjenja()+ "]" + " je student " + s3.getGodStudija() + " godine  sa prosekom "+ s3.getProsek());
		System.out.println(p1.getIme()+ "_" + p1.getPrezime()+ "["+ p1.getGodRodjenja()+"] je " + p1.getTitula() + " koji drzi nastavu na: " + p1.ispisiListu());
		System.out.println(p2.getIme()+ "_" + p2.getPrezime()+ "["+ p2.getGodRodjenja()+"] je " + p2.getTitula() + " koji drzi nastavu na: " + p2.ispisiListu());
		System.out.println(p3.getIme()+ "_" + p3.getPrezime()+ "["+ p3.getGodRodjenja()+"] je " + p3.getTitula() + " koji drzi nastavu na: " + p3.ispisiListu());
	}

}
