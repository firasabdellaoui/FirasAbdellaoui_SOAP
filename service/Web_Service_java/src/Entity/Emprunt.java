package Entity;

public class Emprunt {

	private String id;
	private String id_etudiant;
	private String id_livre;
	private String date;
	
	
	
	
	
	
	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}




	public Emprunt(String id, String id_etudiant, String id_livre, String dt) {

		this.id = id;
		this.id_etudiant = id_etudiant;
		this.id_livre = id_livre;
		this.date = dt;
	}
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId_etudiant() {
		return id_etudiant;
	}
	public void setId_etudiant(String id_etudiant) {
		this.id_etudiant = id_etudiant;
	}
	public String getId_livre() {
		return id_livre;
	}
	public void setId_livre(String id_livre) {
		this.id_livre = id_livre;
	}
}
