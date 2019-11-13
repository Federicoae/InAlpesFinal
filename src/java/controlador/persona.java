package controlador;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class persona extends Conexion{
    private long documento;
    private String tipoDocumento;
    private String nombre;
    private String apellido;
    private String correo;
    private long celular;
    private String contra;
    private ResultSet resultado;
    
    public persona(){
        Conectar();
    }

    public persona(long documento, String tipoDocumento, String nombre, String apellido, String correo, long celular, String contra) {
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.celular = celular;
        this.contra = contra;
        
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public ResultSet getResultado() {
        return resultado;
    }

    public void setResultado(ResultSet resultado) {
        this.resultado = resultado;
    }

    
    boolean existe(Long documento, String tipo) {
        try {
            persona per = null;
            resultado = estam.executeQuery("SELECT * FROM usuario WHERE documento = "+documento+" && tdocumento ='"+tipo+"';");
            while (resultado.next()) {
                per = new persona(resultado.getLong(1), resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getString(5), resultado.getLong(6), resultado.getString(7));
            }
            if (per == null) {
                return false;
            } else {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(persona.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean registrar(int documento, String tipoDocumento, String nombre, String apellido, String correo, int celular, String fechaNacimiento) {
        try {
            pre=conexion.prepareStatement("INSERT INTO usuario (documento, tdocumento, nombre, apellido, correo, celular, contraseña)  VALUES(?,?,?,?,?,?,?)"); 
            pre.setInt(1, documento);
            pre.setString(2, tipoDocumento);
            pre.setString(3, nombre);
            pre.setString(4, apellido);
            pre.setString(5, correo);
            pre.setInt(6, celular);
            pre.setString(7, fechaNacimiento);
            pre.executeUpdate();
            pre.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(persona.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public ResultSet listarPersonas(){
        try {
            resultado = estam.executeQuery("SELECT * FROM usuario");
            System.out.printf("se consulto");
            return resultado;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            return null;
        }
    }
    
    public boolean modificar(long documento, String tipo, String nombre, String apellido, String correo, long celular, String contra) {
        try {
            pre = conexion.prepareStatement("UPDATE usuario SET nombre=?, apellido=?, correo=?, celular=?, contraseña=? WHERE documento=? && tdocumento=?");
            pre.setString(1, nombre);
            pre.setString(2, apellido);
            pre.setString(3, correo);
            pre.setLong(4, celular);
            pre.setString(5, contra);
            pre.setLong(6, documento);
            pre.setString(7, tipo);
            pre.executeUpdate();
            pre.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(persona.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    persona buscar(long cedula, String tipo) {
        try {
            persona per = null;
            resultado = estam.executeQuery("SELECT * FROM usuario WHERE documento = "+cedula+" && tdocumento ='"+tipo+"';");
            while (resultado.next()) {
                per = new persona(resultado.getLong(1), resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getString(5), resultado.getLong(6), resultado.getString(7));
            }
            if (per != null) {
                return per;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(persona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    // FALTA MODIFICAR
        public boolean eliminar(Long cedula1,String tipo) {
        try {
            pre=conexion.prepareStatement("DELETE FROM usuario WHERE documento=? && tdocumento=?");
            pre.setLong(1, cedula1);
            pre.setString(2, tipo);
            pre.executeUpdate();
            pre.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(persona.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }



    

}
