/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudexample;

import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miguelcatalan
 */
public class EstudianteDB {
    
    Connection conn;
    
    public EstudianteDB() {
        conn = ConexionBD.getConnection();
    }
    
    public void agregar(Estudiante e) {
        
    PreparedStatement st = null;
    
        try {
            String sql = """
                         INSERT INTO estudiante_sa (no_carne, nombre, apellido, edad, sexo) 
                                            VALUES (?, ?, ?, ?, ?)
                         """;
            st = conn.prepareStatement(sql);
            st.setString(1, e.getCarne());
            st.setString(2, e.getNombres());
            st.setString(3, e.getApellidos());
            st.setInt(4, e.getEdad());
            st.setString(5, String.valueOf(e.getSexo()));
            
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(EstudianteDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(EstudianteDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void actualizar(Estudiante e) {
            PreparedStatement st = null;
    
        try {
            String sql = """
                         UPDATE estudiante_sa SET nombre = ?, apellido = ?, edad = ?, sexo = ? 
                                            WHERE no_carne = ?
                         """;
            st = conn.prepareStatement(sql);
            st.setString(1, e.getNombres());
            st.setString(2, e.getApellidos());
            st.setInt(3, e.getEdad());
            st.setString(4, String.valueOf(e.getSexo()));
            st.setString(5, e.getCarne());
            
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(EstudianteDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(EstudianteDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void eliminar(String numeroCarne) {
            PreparedStatement st = null;
    
        try {
            String sql = """
                         DELETE FROM estudiante_sa 
                         WHERE no_carne = ?
                         """;
            st = conn.prepareStatement(sql);
            st.setString(1, numeroCarne);
            
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(EstudianteDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(EstudianteDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public Estudiante obtener(String numeroCarne) {
        
        PreparedStatement st = null;
        ResultSet rs = null;
        Estudiante e = new Estudiante();
        
        try {
            String sql = """
                         SELECT * 
                         FROM estudiante_sa 
                         WHERE no_carne = ?
                         """;
            st = conn.prepareStatement(sql);
            st.setString(1, numeroCarne);
            rs = st.executeQuery();
            
            while (rs.next()) {
                e.setCarne(rs.getString(1));
                e.setNombres(rs.getString(2));
                e.setApellidos(rs.getString(3));
                e.setEdad(rs.getInt(4));
                e.setSexo(rs.getString(5).charAt(0));
                
                return e;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EstudianteDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                
                if (st != null) {
                    st.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(EstudianteDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }
    
    public ArrayList<Estudiante> obtenerTodos() {
        
        Statement st = null;
        ResultSet rs = null;
        ArrayList<Estudiante> a = new ArrayList();
        
        try {
            String sql = """
                         SELECT * 
                         FROM estudiante_sa 
                         """;
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                
                Estudiante e = new Estudiante();
                
                e.setCarne(rs.getString(1));
                e.setNombres(rs.getString(2));
                e.setApellidos(rs.getString(3));
                e.setEdad(rs.getInt(4));
                String sexo = rs.getString(5);
                if (sexo != null) {
                    e.setSexo(rs.getString(5).charAt(0));
                }
                
                a.add(e);
            }
            
            return a;
        } catch (SQLException ex) {
            Logger.getLogger(EstudianteDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                
                if (st != null) {
                    st.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(EstudianteDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }
}
