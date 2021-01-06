package DAO;

import Entity.Etudiant;
import Factory.connection;
import Interface.IDAOEtudiant;


import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.List;
//import javax.jws.WebMethod;
//import javax.jws.WebService;





//@WebService(serviceName = "IDAOEtudiant",endpointInterface = "Interface.IDAOEtudiant",portName="test")
public class DAOEtudiant implements IDAOEtudiant {


	@Override
	public Object chercher(Object id) {
		return null;
	}

	//@WebMethod(operationName = "insert etudiant")
	@Override
	public boolean insererEtudiant(String code, String nom, String prenom) {
		boolean verInsert = false;
		Etudiant et = new Etudiant(Integer.parseInt(code), nom, prenom);

		Connection cn = new connection().getConnection();
		
		String UpdateSQL = "insert into Etudiant values ('"+et.getId()+"','"
															+et.getNom()+"','"
															 +et.getPrenom()
															  +"')";
				
		System.out.println(UpdateSQL);	
		try {
			Statement s = cn.createStatement();
			verInsert = s.execute(UpdateSQL);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return true;
	}
	
	
	

}
