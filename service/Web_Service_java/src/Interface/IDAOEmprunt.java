package Interface;

import java.util.List;
import Entity.Emprunt;

//@WebService(name = "IDAOEmpreint")
public interface IDAOEmprunt<T> {
	
	public T chercher(Object id);

  public boolean insererEmprunt(String code, String id_etudiant, String id_livre, String dt);

}
