package com.mycompany.exoreptilia;

//import java.awt.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * @author diana
 */
public class FuncionesBD {
    public boolean validarUsuario(String _usuario, String _password){
        boolean valido = false;
        
        try{
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPS_USUARIO(?, ?)}";
            CallableStatement cs = cn.prepareCall(query);
            
            cs.setString(1, _usuario);
            cs.setString(2, _password);
            
            ResultSet rs = cs.executeQuery();
            if (rs.next()){
                Objetos.objUsuario = new Usuario(rs.getInt("idUsuario"), rs.getString("Usuario"),rs.getString("Nombre"),rs.getString("Contraseña"),rs.getString("Rol"), rs.getString("Estado"));
                System.out.println("Objetos.objUsuario Inicializado. Nombre: " + Objetos.objUsuario.Nombre);
                Exoreptilia.IdUsuario = rs.getInt("idUsuario");
                Exoreptilia.UsuarioActual = rs.getString("Rol");
                valido = true;
                System.out.println ("ID Usuario " + Objetos.objUsuario.IdUsuario);
                Exoreptilia.NombreUsuario = Objetos.objUsuario.Nombre;
            }            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return valido;
    }
    
    public List<String[]> ObtenerUsuarios(){
        List<String[]>usuarios = new ArrayList<>();
        
        try{
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPS_USUARIOS()}";
            CallableStatement cs = cn.prepareCall(query); 
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                String[] usuario = new String[6];
                usuario[0] = rs.getInt("idUsuario") + "";
                usuario[1] = rs.getString("Usuario");
                usuario[2] = rs.getString("Nombre");
                usuario[3] = rs.getString("Contraseña");
                usuario[4] = rs.getString("Rol");
                usuario[5] = rs.getString("Estado");
                usuarios.add(usuario);                
            }
            
            rs.close();
            cs.close();
            cn.close();
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }      
        
        return usuarios;
    } 
    
    public boolean InsertarUsuario() {
        try{
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPI_Usuario(?,?,?,?,?)}";
            CallableStatement cs = cn.prepareCall(query);
            cs.setString(1, Objetos.objUsuario.Usuario);
            cs.setString(2, Objetos.objUsuario.Nombre);
            cs.setString(3, Objetos.objUsuario.Contraseña);
            cs.setString(4, Objetos.objUsuario.Rol);
            cs.setString(5, Objetos.objUsuario.Estado);   
            
            int filas = cs.executeUpdate();
            if (filas > 0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            System.out.println ("Error "+ e.toString());        
            return false;
        }
    }
    
    public boolean ActualizarUsuario(){
        try{
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPU_USUARIO(?,?,?,?,?,?)}";
            CallableStatement cs = cn.prepareCall(query);
            //cs.setInt(1,Objetos.objCliente.tipoCliente);
            cs.setInt(1, Exoreptilia.IdUsuarioEditar);
            cs.setString(2, Objetos.objUsuario.Usuario);
            cs.setString(3,Objetos.objUsuario.Nombre);
            cs.setString(4,Objetos.objUsuario.Contraseña);
            cs.setString(5,Objetos.objUsuario.Rol);
            cs.setString(6,Objetos.objUsuario.Estado);
            
            int filas = cs.executeUpdate();
            if (filas > 0){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            System.out.println("Error " + e.toString());
            return false;
        }
    }
    
    public boolean obtenerInfoCliente(int _idCliente) {
        boolean valido = false;
        
        try {
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPS_CLIENTEINFO(?)}";
            CallableStatement cs = cn.prepareCall(query);
            cs.setInt(1, _idCliente);
            
            ResultSet rs = cs.executeQuery();
            if (rs.next()) {
                Objetos.objCliente = new Cliente(rs.getInt("idCliente"), rs.getInt("idTipoCliente"), rs.getString("nombreCliente"), rs.getString("telefono"), "", rs.getString("CorreoElectronico"), rs.getInt("PuntosAcumulados"));
                valido = true;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return valido;
    }
    
    public String[] obtenerTotalPedidos(int _idCliente) {
        String[] resultado = new String[4];
        
        try {
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPS_CLIENTETOTALPEDIDOS(?)}";
            CallableStatement cs = cn.prepareCall(query);
            cs.setInt(1, _idCliente);
            
            ResultSet rs = cs.executeQuery();
            if (rs.next()) {
                resultado[0] = rs.getInt("idCliente") + "";
                resultado[1] = rs.getInt("TotalPedidos") + "";
                resultado[2] = rs.getDate("UltimaCompra") + "";
                resultado[3] = rs.getDouble("SumaTotalPedidos") + "";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return resultado;
    }
    
    public List<String[]> ObtenerPromocionesCliente(int _puntosNecesarios) {
        List<String[]>promociones = new ArrayList<>();
        
        try {
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPS_PromocionCliente(?)}";
            CallableStatement cs = cn.prepareCall(query);            
            cs.setInt(1, _puntosNecesarios);            
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                String[] promocion = new String[3];
                promocion[0] = rs.getInt("idPromocion") + "";
                promocion[1] = rs.getString("NombrePromocion");
                promocion[2] = rs.getDouble("Descuento") + "";
                promociones.add(promocion);
            }
            
            rs.close();
            cs.close();
            cn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return promociones;
    }
    
    public double ObtenerDescuentoPromocion(int _idPromocion, int _puntosCliente) {
        double descuento = 0.0;
        
        try {
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPS_ObtenerDescuentoPromocion(?,?)}";
            CallableStatement cs = cn.prepareCall(query);
            cs.setInt(1, _idPromocion);
            cs.setInt(2, _puntosCliente);
            
            ResultSet rs = cs.executeQuery();
            if (rs.next()) {
                descuento = rs.getDouble("Descuento");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return descuento;
    }
    
    public List<String[]> obtenerClientes(int _idTipoCliente){
        List<String[]>clientes = new ArrayList<>();
        
        try{
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPS_Clientes(?)}";
            CallableStatement cs = cn.prepareCall(query);            
            cs.setInt(1, _idTipoCliente);            
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                String[] cliente = new String[8];
                cliente[0] = rs.getInt("idCliente") + "";
                cliente[1] = rs.getInt("idTipoCliente") + "";
                cliente[2] = rs.getString("tipo");
                cliente[3] = rs.getString("nombreCliente");
                cliente[4] = rs.getString("telefono");
                cliente[5] = rs.getString("Direccion");
                cliente[6] = rs.getString("CorreoElectronico");
                cliente[7] = rs.getString("PuntosAcumulados");
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
    
    public List<String[]> obtenerPromociones (){
        List<String[]>promociones = new ArrayList<>();
        
        try{
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPS_PROMOCION()}";
            CallableStatement cs = cn.prepareCall(query); 
            ResultSet rs = cs.executeQuery();
            
            while (rs.next()){
                String [] promocion = new String [5];
                promocion [0] = rs.getInt("idPromocion") + "";
                promocion [1] = rs.getString("NombrePromocion");
                promocion [2] = (int)(rs.getDouble("Descuento")) + "";
                promocion [3] = rs.getInt("PuntosNecesarios") + "";
                promocion [4] = rs.getString("Estado");
                promociones.add(promocion);
            }
            
            rs.close();
            cs.close ();
            cn.close();
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }        
        return promociones;
    }
    
    public List<String[]> obtenerHistorialCliente (int _idCliente){
        List<String[]>historial = new ArrayList<>();
        
        try{
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPS_HISTORIALCLIENTE(?)}";
            CallableStatement cs = cn.prepareCall(query);           
            cs.setInt(1, _idCliente);            
            ResultSet rs = cs.executeQuery();
            
            while (rs.next()){
                String [] pedido = new String [6];
                pedido [0] = rs.getString("nombreCliente") + "";
                pedido [1] = rs.getDouble("TotalPedido") + "";
                pedido [2] = rs.getDouble("importeFinal") + "";
                pedido [3] = rs.getString("NombrePromocion") + "";
                pedido [4] = rs.getDouble("Descuento") + "";
                pedido [5] = rs.getDate("Fecha") + "";
                historial.add(pedido);
            }
            
            rs.close();
            cs.close ();
            cn.close();
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }        
        return historial;
    }
    
    public boolean InsertarCliente() {
        try{
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPI_RegistrarCliente(?,?,?,?,?,?,?)}";
            CallableStatement cs = cn.prepareCall(query);
            cs.setInt(1, Objetos.objCliente.tipoCliente);
            cs.setInt(2, Exoreptilia.IdUsuario);
            cs.setString(3, Objetos.objCliente.nombreCliente);
            cs.setString(4, Objetos.objCliente.telefono);
            cs.setString(5, Objetos.objCliente.Direccion);
            cs.setString(6, Objetos.objCliente.CorreoElectronico);
            cs.setInt(7, Objetos.objCliente.PuntosAcumulados);    
            
            int filas = cs.executeUpdate();
            if (filas>0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            System.out.println ("Error "+ e.toString());        
            return false;
        }
    }
    
    public boolean ActualizarCliente(){
        try{
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPU_Cliente(?,?,?,?,?,?)}";
            CallableStatement cs = cn.prepareCall(query);
            //cs.setInt(1,Objetos.objCliente.tipoCliente);
            cs.setInt(1, Exoreptilia.IdCliente);
            cs.setInt(2, Objetos.objCliente.tipoCliente);
            cs.setString(3,Objetos.objCliente.nombreCliente);
            cs.setString(4,Objetos.objCliente.telefono);
            cs.setString(5,Objetos.objCliente.Direccion);
            cs.setString(6,Objetos.objCliente.CorreoElectronico);
            
            int filas = cs.executeUpdate();
            if (filas > 0){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            System.out.println("Error " + e.toString());
            return false;
        }
    }
    
    public boolean InsertarPromocion(){
        try {
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPI_Promocion(?,?,?,?)}";
            CallableStatement cs = cn.prepareCall(query);
            cs.setString(1, Objetos.objPromocion.NombrePromocion);
            cs.setDouble(2, Objetos.objPromocion.Descuento);
            cs.setInt(3, Objetos.objPromocion.Puntos);
            cs.setString(4, Objetos.objPromocion.Estado);
            
            int filas = cs.executeUpdate();
            if (filas > 0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e){
            System.out.println ("Error "+ e.toString());        
            return false;
        }
    }
    
    public boolean ActualizarPuntosCliente(int _idCliente, int _puntos) {
        try {        
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPU_PUNTOS(?,?)}";
            CallableStatement cs = cn.prepareCall(query);
            cs.setInt(1, _idCliente);
            cs.setInt(2, _puntos);
            
            int filas = cs.executeUpdate();
            
            if (filas > 0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error " + e.toString());
            return false;
        }
    }
    
    public boolean actualizarPromocion() {
        try {
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPU_PROMOCION(?,?,?,?,?)}";
            CallableStatement cs = cn.prepareCall(query);
            cs.setInt(1, Exoreptilia.IdPromocion);
            cs.setString(2, Objetos.objPromocion.NombrePromocion);
            cs.setDouble(3, Objetos.objPromocion.Descuento);
            cs.setInt(4, Objetos.objPromocion.Puntos);
            cs.setString(5, Objetos.objPromocion.Estado);
            
            int filas = cs.executeUpdate();
            
            if (filas > 0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error " + e.toString());
            return false;
        }
    }
    
    public boolean InsertarPedido() {
        try {        
            Connection cn = ConexionBD.conectar();
            String query = "{CALL SPI_PEDIDO(?,?,?,?,?)}";
            CallableStatement cs = cn.prepareCall(query);
            cs.setInt(1, Objetos.objPedido.idCliente);
            cs.setInt(2, Objetos.objPedido.idPromocion);
            cs.setDouble(3, Objetos.objPedido.totalPedido);
            cs.setDouble(4, Objetos.objPedido.importeFinal);
            cs.setDate(5, java.sql.Date.valueOf(Objetos.objPedido.fecha));
            
            int filas = cs.executeUpdate();
            if (filas > 0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            System.out.println ("Error "+ e.toString()); 
            return false;
        }   
    }
}