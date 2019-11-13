package controlador;


import java.sql.*;

public class Conexion {
    protected Connection conexion;
    protected Statement estam=null;
    protected PreparedStatement pre=null;
    public Connection Conectar(){
        conexion=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/inalpes","root","root");
            estam=conexion.createStatement();
            System.out.printf("Conectado");
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
            System.out.printf("Error de conexion");
            return null;
        }
        return conexion;
    }

    public void Desconectar() {
        try {
            estam.close();
            conexion.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
            System.out.printf("Error Mientras se Cerraba la Conexion a la Base de Datos");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
