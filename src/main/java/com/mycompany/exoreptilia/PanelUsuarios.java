package com.mycompany.exoreptilia;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * @author diana
 */
public class PanelUsuarios extends javax.swing.JPanel {
    private FormPrincipal fp;
    FuncionesBD FBD = new FuncionesBD();
    String TituloMensaje = "Usuarios";

    public PanelUsuarios(FormPrincipal _formPrincipal) {
        initComponents();
        this.fp = _formPrincipal;
        
        this.MostrarListaUsuarios();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Panell = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        CbRol = new javax.swing.JComboBox<>();
        CbEstado = new javax.swing.JComboBox<>();
        TxtPassword = new javax.swing.JPasswordField();
        TxtPassword2 = new javax.swing.JPasswordField();
        BtnRegistrar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnPantallaPrincipal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbUsuarios = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Usuarios");

        Panell.setBackground(new java.awt.Color(255, 255, 255));
        Panell.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Usuario");
        Panell.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("Nombre");
        Panell.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 57, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("Rol");
        Panell.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 98, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Estado");
        Panell.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 16, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("Contraseña");
        Panell.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 57, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("Contraseña");
        Panell.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 98, -1, -1));

        TxtUsuario.setBackground(java.awt.SystemColor.menu);
        TxtUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Panell.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 13, 120, 30));

        TxtNombre.setBackground(java.awt.SystemColor.menu);
        TxtNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Panell.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 54, 300, 30));

        CbRol.setBackground(java.awt.SystemColor.menu);
        CbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cajero" }));
        CbRol.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Panell.add(CbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 95, 120, 30));

        CbEstado.setBackground(java.awt.SystemColor.menu);
        CbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        CbEstado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Panell.add(CbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 13, 120, 30));

        TxtPassword.setBackground(java.awt.SystemColor.menu);
        TxtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Panell.add(TxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 54, 120, 30));

        TxtPassword2.setBackground(java.awt.SystemColor.menu);
        TxtPassword2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Panell.add(TxtPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 95, 120, 30));

        BtnRegistrar.setBackground(new java.awt.Color(153, 153, 153));
        BtnRegistrar.setText("Registrar");
        BtnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });
        Panell.add(BtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 150, 40));

        BtnLimpiar.setBackground(new java.awt.Color(153, 153, 153));
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        Panell.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 150, 40));

        BtnPantallaPrincipal.setBackground(new java.awt.Color(153, 153, 153));
        BtnPantallaPrincipal.setIcon(new javax.swing.ImageIcon("C:\\Users\\diana\\Documents\\NetBeansProjects\\Exoreptilia\\resources\\home24.png")); // NOI18N
        BtnPantallaPrincipal.setText("Volver al inicio");
        BtnPantallaPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnPantallaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPantallaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPantallaPrincipalActionPerformed(evt);
            }
        });
        Panell.add(BtnPantallaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 150, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Usuarios registrados");
        Panell.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 144, 816, -1));

        TbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TbUsuariosMousePressed(evt);
            }
        });
        TbUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TbUsuariosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TbUsuarios);

        Panell.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 176, 850, 414));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(Panell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        // TODO add your handling code here:
        if (this.ValidarCampos()) {
            if (Exoreptilia.RegistrarUsuario) { // Insertar
                /*JOptionPane.showMessageDialog(null,
                    "Registrar usuario \n" +
                    "IdUsuario: -1\n" +
                    "Usuario: " + this.TxtUsuario.getText() + "\n" +
                    "Nombre: " + this.TxtNombre.getText() + "\n" +
                    "Contraseña: " + new String(this.TxtPassword.getPassword()) + "\n" +
                    "Rol: " + this.CbRol.getSelectedItem().toString() +  "\n" +
                    "Estado: " + this.CbEstado.getSelectedItem().toString(),
                    TituloMensaje, 1
                );*/
                Objetos.objUsuario = new Usuario(-1, this.TxtUsuario.getText(), this.TxtNombre.getText(), new String(this.TxtPassword.getPassword()), this.CbRol.getSelectedItem().toString(), this.CbEstado.getSelectedItem().toString());

                if (FBD.InsertarUsuario()) {
                    JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.", TituloMensaje, 1);
                    this.MostrarListaUsuarios();
                    this.LimpiarForm();        
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrió un error.", TituloMensaje, 0);
                }
            } else { // Actualizar
                /*JOptionPane.showMessageDialog(null,
                    "Registrar usuario \n" +
                    "IdUsuario: " + Exoreptilia.IdUsuarioEditar + "\n" +
                    "Usuario: " + this.TxtUsuario.getText() + "\n" +
                    "Nombre: " + this.TxtNombre.getText() + "\n" +
                    "Contraseña: " + new String(this.TxtPassword.getPassword()) + "\n" +
                    "Rol: " + this.CbRol.getSelectedItem().toString() + "\n" +
                    "Estado: " + this.CbEstado.getSelectedItem().toString(),
                    TituloMensaje, 1
                );*/
                JOptionPane.showMessageDialog(null, "Actualizar usuario " + Exoreptilia.IdUsuarioEditar, TituloMensaje, 1);
                Objetos.objUsuario = new Usuario(Exoreptilia.IdUsuarioEditar, this.TxtUsuario.getText(), this.TxtNombre.getText(), new String(this.TxtPassword.getPassword()), this.CbRol.getSelectedItem().toString(), this.CbEstado.getSelectedItem().toString());
                
                if (FBD.ActualizarUsuario()) {                    
                    JOptionPane.showMessageDialog(null, "Usuario actualiado correctamente.", TituloMensaje, 1);
                    this.MostrarListaUsuarios();
                    this.LimpiarForm();
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrió un error.", TituloMensaje, 0);
                }
            }
        }        
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void TbUsuariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TbUsuariosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TbUsuariosKeyPressed

    private void TbUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbUsuariosMousePressed
        // TODO add your handling code here:
        this.MostrarUsuarioSeleccionado();
    }//GEN-LAST:event_TbUsuariosMousePressed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        // TODO add your handling code here:
        this.LimpiarForm();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnPantallaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPantallaPrincipalActionPerformed
        // TODO add your handling code here:
        this.LimpiarForm();
        fp.MostrarPanelBienvenida();
    }//GEN-LAST:event_BtnPantallaPrincipalActionPerformed

    
    public void MostrarListaUsuarios(){
        List<String[]> lista = FBD.ObtenerUsuarios();
        
        String[] columnas = {"Id Usuario", "Usuario", "Nombre", "Contraseña", "Rol", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        
        for (String[] cliente : lista) {
            modelo.addRow(cliente);
        }
        
        TbUsuarios.setModel(modelo);
        TbUsuarios.getColumnModel().getColumn(0).setPreferredWidth(100);
        TbUsuarios.getColumnModel().getColumn(1).setPreferredWidth(150);
        TbUsuarios.getColumnModel().getColumn(2).setPreferredWidth(310);
        TbUsuarios.getColumnModel().getColumn(3).setMinWidth(0);
        TbUsuarios.getColumnModel().getColumn(3).setMaxWidth(0);
        TbUsuarios.getColumnModel().getColumn(3).setWidth(0);
        TbUsuarios.getColumnModel().getColumn(3).setResizable(false);
        TbUsuarios.getColumnModel().getColumn(4).setPreferredWidth(150);
        TbUsuarios.getColumnModel().getColumn(5).setPreferredWidth(100); 
        TbUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
    }
    
    public void MostrarUsuarioSeleccionado(){        
        if (TbUsuarios.getSelectedRow() != -1){
            int fila = TbUsuarios.getSelectedRow();
            this.TxtUsuario.setText(TbUsuarios.getValueAt(fila, 1).toString());
            this.TxtNombre.setText(TbUsuarios.getValueAt(fila, 2).toString());
            this.CbRol.setSelectedItem(TbUsuarios.getValueAt(fila, 4).toString());
            this.CbEstado.setSelectedItem(TbUsuarios.getValueAt(fila, 5).toString());
            
            Exoreptilia.IdUsuarioEditar = Integer.parseInt(TbUsuarios.getValueAt(fila, 0).toString());
            Exoreptilia.RegistrarUsuario = false;
            this.BtnRegistrar.setText("Guardar cambios");
        }
    }
    
    public boolean ValidarCampos() {
        if (this.TxtUsuario.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes indicar el usuario.", TituloMensaje, 2);
            return false;
        }
        
        if (this.TxtNombre.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes indicar el nombre del usuario.", TituloMensaje, 2);
            return false;
        }
        
        if (new String(this.TxtPassword.getPassword()).trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Escribe la contraseña.", TituloMensaje, 2);
            return false;
        }
        
        if (new String(this.TxtPassword2.getPassword()).trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Repite la contraseña.", TituloMensaje, 2);
            return false;
        }
        
        if (!new String(this.TxtPassword.getPassword()).trim().equals(new String(this.TxtPassword2.getPassword()).trim())) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.", TituloMensaje, 2);
            return false;
        }
        
        return true;
    }
    
    public void LimpiarForm() {
        this.TxtUsuario.setText("");
        this.TxtNombre.setText("");
        this.CbEstado.setSelectedIndex(0);
        this.CbRol.setSelectedIndex(0);
        this.TxtPassword.setText("");
        this.TxtPassword2.setText("");
        Exoreptilia.RegistrarUsuario = true;
        this.BtnRegistrar.setText("Registrar");
        this.TbUsuarios.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnPantallaPrincipal;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JComboBox<String> CbEstado;
    private javax.swing.JComboBox<String> CbRol;
    private javax.swing.JPanel Panell;
    private javax.swing.JTable TbUsuarios;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JPasswordField TxtPassword;
    private javax.swing.JPasswordField TxtPassword2;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
