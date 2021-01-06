package Entity;

public class Livre
{

	private String id;
	private String titre;
	private String auteur;
	
	
	
	
	public Livre(String id, String titre, String auteur) {
		
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auther) {
		this.auteur = auther;
	}
}
