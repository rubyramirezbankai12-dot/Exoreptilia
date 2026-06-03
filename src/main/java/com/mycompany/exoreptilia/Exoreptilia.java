package com.mycompany.exoreptilia;

/**
 * @author diana
 */
public class Exoreptilia {
    public static String NombreUsuario;
    public static int IdUsuario;
    public static int IdUsuarioEditar;
    public static int IdCliente;
    public static int IdPromocion;
    public static boolean RegistrarUsuario = true;
    public static boolean Registrar = true;
    public static boolean EditarPromocion = false;
    public static int TipoCliente;    
    public static String UsuarioActual;

    public static void main(String[] args) {
        ControlPantallas pantallas = new ControlPantallas ();
        pantallas.OcultarPantallas();
        pantallas.MostrarLogin();
        
        Objetos.objUsuario = new Usuario();
        Objetos.objCliente = new Cliente();
        Objetos.objPromocion = new Promocion();
        Objetos.objPedido = new Pedido();
    }
}