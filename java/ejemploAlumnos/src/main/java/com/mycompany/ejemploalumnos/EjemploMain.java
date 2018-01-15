
package com.mycompany.ejemploalumnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class EjemploMain {
    
    private Connection conexion = null;
    
    public EjemploMain() throws SQLException{
    
        try{
            conectar ();
            consulta ();
        } finally{
            cerrar();
        }
    }
    
    public void conectar() throws SQLException{
        String jdbc = "jdbc:mysql://localhost:3306/ejemplo";
        conexion = DriverManager.getConnection(jdbc,"root", "boss");
    }
    
    private void consulta() throws SQLException{
        Statement statement = conexion.createStatement();
        ResultSet set = statement.executeQuery("select idAlumno, nombre, apellidos from alumnos");
        while(set.next()){
            int idAlumno = set.getInt("idAlumnos");
            String nombre= set.getNString("nombre");
            String apellidos= set.getNString("apellidos");
            System.out.println("Alumno:" + idAlumno+ "Nombre:" + " " +nombre+"apellidos"+" "+apellidos);
        }
        set.close();
        statement.close();
    }
    
    public void cerrar() throws SQLException{
    
        if(conexion!= null)
            conexion.close();
    }
    
    private static final Logger LOG = LoggerFactory.getLogger(EjemploMain.class);
    
    public static void main(String args[]){
    
        try {
            new EjemploMain();
        } catch (SQLException e){
            LOG.error("Error durante el uso de JDBC", e);
        }
    }
}

