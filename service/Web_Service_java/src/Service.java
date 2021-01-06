

import DAO.DAOEmprunt;
import DAO.DAOEtudiant;
import DAO.DAOLivre;
import Factory.connection;
import javax.xml.ws.*;
import javax.xml.ws.WebServiceException;
import javax.xml.*;
import javax.jws.WebService;

@WebService
public class Service {
    public static void main(String[] args)
    {
        String url ="http://localhost:8082/";
       try {




          Endpoint.publish(url+"Emp", new DAOEmprunt());
            Endpoint.publish(url+"Etud", new DAOEtudiant());
            Endpoint.publish(url+"Liv", new DAOLivre());
        }
       catch (WebServiceException e)
        {
            System.out.println(e);
        }


      System.out.println(url);
   
       
        }}


    
