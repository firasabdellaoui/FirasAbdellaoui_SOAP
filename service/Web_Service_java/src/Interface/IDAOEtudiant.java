package Interface;

//import javax.jws.WebService;
import java.util.List;
import Entity.Etudiant;
//@WebService(name = "IDAOEtudiant")
public interface IDAOEtudiant<T> {
	
	public T chercher(Object id);
//	public ArrayList<T> findAll();
//	public boolean modifierEtudiant(Object o);
//	public boolean modifierEtudiant(Object o);
  public boolean insererEtudiant(String code, String nom, String prenom);

}
