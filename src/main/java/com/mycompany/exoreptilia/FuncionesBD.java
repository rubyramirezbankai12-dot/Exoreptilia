package com.mycompany.exoreptilia;

//import java.awt.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diana
 */
public class FuncionesBD {
    public boolean validarUsuario(String usuario, String password){
        boolean valido = false;
        
        try{
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPS_USUARIO(?, ?)}";
            CallableStatement cs = cn.prepareCall(query);
            
            cs.setString(1, usuario);
            cs.setString(2, password);
            
            ResultSet rs = cs.executeQuery();
            valido = rs.next();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return valido;
    }
    
    public List<String[]> obtenerClientes(int idTipoCliente){
        List<String[]>clientes = new ArrayList<>();
        
        try{
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPS_Clientes(?)}";
            CallableStatement cs = cn.prepareCall(query);
            
            cs.setInt(1, idTipoCliente);
            
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                String[] cliente = new String[5];
                cliente[0] = rs.getString("nombreCliente");
                cliente[1] = rs.getString("telefono");
                cliente[2] = rs.getString("Direccion");
                cliente[3] = rs.getString("CorreoElectronico");
                cliente[4] = rs.getString("PuntosAcumulados");
                clientes.add(cliente);
                
            }
            
            rs.close();
            cs.close();
            cn.close();
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return clientes;
    }
}
