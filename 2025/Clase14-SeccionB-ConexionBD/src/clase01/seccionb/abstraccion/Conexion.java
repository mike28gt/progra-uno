/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

//import java.util.Properties;
import java.sql.*;
import org.postgresql.ds.PGSimpleDataSource;


/**
 *
 * @author miguelcatalan
 */
public class Conexion {
    /*
    private String url = "jdbc:postgresql://ep-old-mud-a4yflsl9-pooler.us-east-1.aws.neon.tech/universidad";
    private Properties properties = new Properties();
    private static Connection conn = null;
    */
    
    private static PGSimpleDataSource ds = new PGSimpleDataSource();
    
    static {
        ds.setServerNames(new String[] {"ep-old-mud-a4yflsl9-pooler.us-east-1.aws.neon.tech"});
        ds.setDatabaseName("universidad");
        ds.setUser("neondb_owner");
        ds.setPassword("npg_9GulREUd5PxB");
    }
    
    public static Connection getConexion() throws SQLException {
        return ds.getConnection();
    }
}
