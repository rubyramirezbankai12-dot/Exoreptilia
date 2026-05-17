package com.mycompany.exoreptilia;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author diana
 */
public class FormLogin extends javax.swing.JFrame {
    private ControlPantallas Pantallas;
    FuncionesBD FBD = new FuncionesBD();
    
    public FormLogin(ControlPantallas _Pantallas) {
        this.Pantallas = _Pantallas;
        initComponents();
        getContentPane ().setLayout(null);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        txtLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(100, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setText("Inicia sesión para continuar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 280, -1));

        jLabel2.setText("USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 130, -1));

        jLabel3.setText("CONTRASEÑA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        txtContraseña.setBackground(new java.awt.Color(204, 204, 204));
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyPressed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 130, -1));

        btnIngresar.setBackground(new java.awt.Color(0, 0, 204));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        txtLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\diana\\Documents\\NetBeansProjects\\Exoreptilia\\resources\\Logo2.png")); // NOI18N
        txtLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txtLogo.setMaximumSize(new java.awt.Dimension(300, 395));
        txtLogo.setPreferredSize(new java.awt.Dimension(320, 395));
        jPanel1.add(txtLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 130, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        ValidarUsuario();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            ValidarUsuario();
        }
    }//GEN-LAST:event_txtContraseñaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }
    
    public void ValidarUsuario(){
        String usuario, password;
        
        usuario = txtUsuario.getText().toLowerCase();
        password = txtContraseña.getText().toLowerCase();
        
        if (FBD.validarUsuario(usuario, password)){
            Pantallas.OcultarPantallas();
            Pantallas.MostrarFormPrincipal();
        }else{
            JOptionPane.showMessageDialog(null,"Usuario incorrecto", "Login",0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JLabel txtLogo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
