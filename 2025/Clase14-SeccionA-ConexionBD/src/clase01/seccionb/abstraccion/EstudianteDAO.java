/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miguelcatalan
 */
public class EstudianteDAO {
    
    public void create(Estudiante e) {
        String sql = """
                     INSERT INTO estudiante(nombre, apellidos, identificacion, edad, sexo, facultad, cantidadcursosasignados)
                                    VALUES (?, ?, ?, ?, ?, ?, ?)
                     """;
                
        try (Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellidos());
            ps.setString(3, e.getIdentificacion());
            ps.setInt(4, e.getEdad());
            ps.setString(5, String.valueOf(e.getSexo()));
            ps.setString(6, e.getFacultad());
            ps.setNull(7, java.sql.Types.INTEGER);
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(EstudianteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                                 
    }
    
    public Estudiante read(String identificacion) { 
        
        String sql = """
                     SELECT nombre, apellidos, identificacion, edad, sexo, facultad, cantidadcursosasignados
                     FROM estudiante
                     WHERE identificacion = ?
                     """;
        
        try (Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, identificacion);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Estudiante e = new Estudiante();
                    
                    e.setNombre(rs.getString("nombre"));
                    e.setApellidos(rs.getString("apellidos"));
                    e.setIdentificacion(rs.getString("identificacion"));
                    e.setSexo(rs.getString("sexo").charAt(0));
                    e.setEdad(rs.getInt("edad"));
                    e.setFacultad(rs.getString("facultad"));
                    
                    return e;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(EstudianteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null; 
    }
    
    public void update(Estudiante e) {}
    
    public void delete(Estudiante e) {}
}
