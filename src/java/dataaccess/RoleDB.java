package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import models.Role;
/**
 *
 * @author Alex Tompkins - 821984
 * @author Jarenz Oria 
 */
public class RoleDB {
    
    public List<Role> getAll() { 
        
        EntityManager em = DBUtil.getEmFactory().createEntityManager(); 
        
        try { 
            
            List<Role> allRoles = em.createNamedQuery("Role.findAll", Role.class).getResultList(); 
            return allRoles; 
        } finally { 
            
            em.close(); 
        }
    } 
}
