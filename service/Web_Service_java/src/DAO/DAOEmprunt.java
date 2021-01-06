package DAO;

import Entity.Emprunt;
import Factory.connection;
import Interface.IDAOEmprunt;

//import javax.jws.WebMethod;
//import javax.jws.WebService;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.ws.WebServiceRef;

@WebService(serviceName = "DAOEmprunt",endpointInterface = "Interface.IDAOEmprunt")
public class DAOEmprunt implements IDAOEmprunt
{

	@Override
	public Object chercher(Object id) {
		return null;
	}

	//@WebMethod(operationName = "insert Emprunt")
	@Override
	public boolean insererEmprunt(String code, String id_etudiant, String id_livre, String dt) {
		boolean verInsert = false;
		Emprunt emp = new Emprunt(code, id_etudiant ,id_livre, dt);

		Connection cn = new connection().getConnection();
		
		String UpdateSQL = "insert into emprunt values ('"+emp.getId()+"','"
															+emp.getId_etudiant()+"','"
															 +emp.getId_livre()+"','"
																	 +emp.getDate()
															  +"')";
				
		System.out.println(UpdateSQL);	
		try {
			Statement s = cn.createStatement();
			verInsert = s.execute(UpdateSQL);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return verInsert;
	}
	
	
	


}
