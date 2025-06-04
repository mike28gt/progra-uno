/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.postgresql.ds.PGSimpleDataSource;

/**
 *
 * @author miguelcatalan
 */
public class Conexion {
    
    //private String url = "jdbc:postgresql://ep-old-mud-a4yflsl9-pooler.us-east-1.aws.neon.tech/universidad";
    //private Properties properties = new Properties();
    private static PGSimpleDataSource dataSource;
    //private static Connection conn = null;
    
    static {
        dataSource = new PGSimpleDataSource();
        dataSource.setServerNames(new String [] {"ep-old-mud-a4yflsl9-pooler.us-east-1.aws.neon.tech"});
        dataSource.setDatabaseName("universidad");
        dataSource.setUser("neondb_owner");
        dataSource.setPassword("npg_9GulREUd5PxB");
               
    }
    
    /*
    private Conexion() {
        //properties.setProperty("user", "neondb_owner");
        //properties.setProperty("password", "");
        
        try {
            //conn = DriverManager.getConnection(url, properties);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    
    public static Connection getConexion() throws SQLException {
        return dataSource.getConnection();
        /*
        if (conn == null) {
            Conexion conexion = new Conexion();
            return conexion.conn;
        } else {
            return conn;
        }
        */
    }
}
