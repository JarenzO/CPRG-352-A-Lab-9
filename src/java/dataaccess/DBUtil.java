package dataaccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alex Tompkins - 821984
 * @author Jarenz Oria
 */
public class DBUtil {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab9AltPU"); 

    public static EntityManagerFactory getEmFactory() { 
            return emf; 
    } 
}