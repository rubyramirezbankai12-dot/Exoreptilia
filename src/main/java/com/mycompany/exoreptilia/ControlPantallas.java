package com.mycompany.exoreptilia;

/**
 * @author diana
 */
public class ControlPantallas {
    // aqui se agregan todas las ventanas del proyecto
    private FormLogin fLogin;
    private FormPrincipal fPrincipal;
    
    public ControlPantallas (){
        // aqui se inicializan todas las ventanas
        fLogin = new FormLogin(this);
        fPrincipal = new FormPrincipal(this);
    }
    
    public void OcultarPantallas(){
        fLogin.setVisible(false);
        fPrincipal.setVisible(false);
    }
    
    public void MostrarLogin() {
        fLogin.setVisible(true);
    }
    
    public void MostrarFormPrincipal(){
        fPrincipal.setVisible(true);
    }
}

