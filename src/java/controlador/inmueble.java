package controlador;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class inmueble extends Conexion{
    private String direccion;
    private int ubicacion;
    private int contrato;
    private String descripcion;
    private long precio;
    private ResultSet resultado;
    
    public inmueble(){
        Conectar();
    }

    public inmueble(String direccion, int ubicacion, int contrato, String descripcion, long precio) {
        this.direccion = direccion;
        this.ubicacion = ubicacion;
        this.contrato = contrato;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public ResultSet getResultado() {
        return resultado;
    }

    public void setResultado(ResultSet resultado) {
        this.resultado = resultado;
    }

    

    
    boolean existe(int ubicacion , String direccion) {
        try {
            inmueble per = null;
            resultado = estam.executeQuery("SELECT * FROM usuario WHERE ubicacion = "+ubicacion+" && direccion ='"+direccion+"';");
            while (resultado.next()) {
                per = new inmueble(resultado.getString(1), resultado.getInt(2), resultado.getInt(3), resultado.getString(4), resultado.getLong(5));
            }
            if (per == null) {
                return false;
            } else {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(inmueble.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean registrar(String direccion, int ubicacion, int contrato, String descripcion, long precio) {
        try {
            pre=conexion.prepareStatement("INSERT INTO inmueble (direccion, ubicacion, contrato, descripcion, precio)  VALUES(?,?,?,?,?)"); 
            pre.setString(1, direccion);
            pre.setInt(2, ubicacion);
            pre.setInt(3, contrato);
            pre.setString(4, descripcion);
            pre.setLong(5, precio);
            pre.executeUpdate();
            pre.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(inmueble.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public ResultSet listarInmuebles(){
        try {
            resultado = estam.executeQuery("SELECT * FROM inmueble");
            System.out.printf("se consulto");
            return resultado;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            return null;
        }
    }
    public ResultSet listarInmueblesB(int ubicacion){
        try {
            resultado = estam.executeQuery("SELECT * FROM inmueble WHERE ubicacion ='"+ubicacion+"';");
            System.out.printf("se consulto");
            return resultado;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            return null;
        }
    }
    
    public boolean modificar(String direccion, int ubicacion, int contrato, String descripcion, long precio) {
        try {
            pre = conexion.prepareStatement("UPDATE usuario SET direccion=?, ubicacion=?, contrato=?, descripcion=?, precio=? WHERE direccion=? && ubicacion=?");
            pre.setString(1, direccion);
            pre.setInt(2, ubicacion);
            pre.setInt(3, contrato);
            pre.setString(4, descripcion);
            pre.setLong(5, precio);
            pre.executeUpdate();
            pre.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(inmueble.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    inmueble buscar(int ubicacion , String direccion) {
        try {
            inmueble per = null;
            resultado = estam.executeQuery("SELECT * FROM inmueble WHERE direccion = "+direccion+" && ubicacion ='"+ubicacion+"';");
            while (resultado.next()) {
                per = new inmueble(resultado.getString(1), resultado.getInt(2), resultado.getInt(3), resultado.getString(4), resultado.getLong(5));
            }
            if (per != null) {
                return per;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(inmueble.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    // FALTA MODIFICAR
        public boolean eliminar(int ubicacion , String direccion) {
        try {
            pre=conexion.prepareStatement("DELETE FROM usuario WHERE ubicacion=? && direccion=?");
            pre.setInt(1, ubicacion);
            pre.setString(2, direccion);
            pre.executeUpdate();
            pre.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(inmueble.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
