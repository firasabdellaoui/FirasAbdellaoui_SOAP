package DAO;

import Entity.Livre;
import Factory.connection;
import Interface.IDAOLivre;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
//import javax.jws.WebMethod;
//import javax.jws.WebService;

//@WebService(serviceName = "DAO_Livre",endpointInterface = "Interface.IDAOLivre")
public class DAOLivre implements IDAOLivre
{

    @Override
    public Object chercher(Object id) {
        return null;
    }

    //@WebMethod(operationName = "insert livre")
    @Override
    public boolean insererLivre(String code, String titre, String auteur) {
        boolean verInsert = false;
        Livre livre = new Livre(code, titre, auteur);

        Connection cn = new connection().getConnection();

        String insertSQL = "insert into livre values ('"+livre.getId()+"','"
                +livre.getTitre()+"','"
                +livre.getAuteur()
                +"')";

        System.out.println(insertSQL);
        try {
            Statement s = cn.createStatement();
            verInsert = s.execute(insertSQL);

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return verInsert;
    }




}

