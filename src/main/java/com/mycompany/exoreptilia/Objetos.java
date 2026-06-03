package com.mycompany.exoreptilia;

import java.time.LocalDate;

/**
 * @author diana
 */

class Usuario{
    int IdUsuario;
    String Usuario;
    String Nombre;
    String Contraseña;
    String Rol;
    String Estado;
    
    public Usuario() {}
    
    public Usuario(
        int _idUsuario,
        String _Usuario,
        String _Nombre,
        String _Contraseña,
        String _Rol,
        String _Estado
    ) {
        this.IdUsuario = _idUsuario;
        this.Usuario = _Usuario;
        this.Nombre = _Nombre;
        this.Contraseña = _Contraseña;
        this.Rol = _Rol;
        this.Estado = _Estado;
    }
    
    public String getNombre() {
        return this.Nombre;
    }
}

class Cliente {
    int idCliente;
    int tipoCliente;
    String nombreCliente;
    String telefono;
    String Direccion;
    String CorreoElectronico;
    int PuntosAcumulados;
    
    public Cliente(){}
    
    public Cliente(
       int _idCliente,
       int _tipoCliente,
       String _nombreCliente,
       String _telefono,
       String _Direccion,
       String _CorreoElectronico,
       int _PuntosAcumulados
    ){
        this.idCliente = _idCliente;
        this.tipoCliente = _tipoCliente;
        this.nombreCliente = _nombreCliente;
        this.telefono = _telefono;
        this.Direccion = _Direccion;
        this.CorreoElectronico = _CorreoElectronico;
        this.PuntosAcumulados = _PuntosAcumulados;
    } 
}

class Pedido {
    int idCliente;
    int idPromocion;
    double totalPedido;
    double importeFinal;
    LocalDate fecha;
    
    public Pedido() {};
    
    public Pedido(
        int _idCliente,
        int _idPromocion,
        double _totalPedido,
        double _importeFinal,
        LocalDate _fecha
    ){
        this.idCliente = _idCliente;
        this.idPromocion = _idPromocion;
        this.totalPedido = _totalPedido;
        this.importeFinal = _importeFinal;
        this.fecha = _fecha;
    }
}

class Promocion {
    int idPromocion;
    String NombrePromocion;
    double Descuento;
    int Puntos;
    String Estado;
    
    public Promocion(){};
    
    public Promocion(
        int _idPromocion,
        String _NombrePromocion,
        double _Descuento,
        int _PuntosNecesarios,
        String _Estado
    ){
        this.idPromocion = _idPromocion;
        this.NombrePromocion = _NombrePromocion;
        this.Descuento = _Descuento;
        this.Puntos = _PuntosNecesarios;
        this.Estado = _Estado;
    } 
}

public class Objetos {
    public static Usuario objUsuario;
    public static Cliente objCliente;
    public static Promocion objPromocion;
    public static Pedido objPedido;
}