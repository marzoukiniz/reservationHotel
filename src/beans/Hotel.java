package beans;

public class Hotel {
	
	private String nom;
	private int NbrChambres;
	private String ville;
	private int grade;
	
	
	public Hotel() {
		super();
	}
	
	
	
	public Hotel(String nom, int nbrChambres, String ville, int grade) {
		super();
		this.nom = nom;
		NbrChambres = nbrChambres;
		this.ville = ville;
		this.grade = grade;
	}



	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbrChambres() {
		return NbrChambres;
	}
	public void setNbrChambres(int nbrChambres) {
		NbrChambres = nbrChambres;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

}
