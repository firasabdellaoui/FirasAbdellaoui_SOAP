package Interface;

//import javax.jws.WebService;

//@WebService(name = "IDAOLivre")
public interface  IDAOLivre <T> {
	
	public T chercher(Object id);
//	public ArrayList<T> findAll();
//	
	//public boolean modifierLivre(Livre e);
	//public boolean supprimerLivre(Livre e);
   public boolean insererLivre(String code, String titre, String auther);

}
