package com.mycompany.exoreptilia;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * @author diana
 */
public class PanelConsultaClientes extends javax.swing.JPanel {
    private FormPrincipal fp;
    FuncionesBD FBD = new FuncionesBD();
    String TituloMensaje = "Clientes";
    
    public PanelConsultaClientes(FormPrincipal _formPrincipal) {
        initComponents();
        this.fp = _formPrincipal;
        
        this.MostrarListaClientes();
        this.lbTipoCliente.setVisible(false);
        this.lbPuntos.setVisible(false);
        this.CBTipocliente.setVisible(false);
        this.TxtPuntos.setVisible(false);
        this.BtnCancelar.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbTipoCliente = new javax.swing.JLabel();
        lbPuntos = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        CBTipocliente = new javax.swing.JComboBox<>();
        TxtPuntos = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnPantallaPrincipal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbClientes = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registra o Actualiza Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Teléfono");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Dirección");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Correo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        lbTipoCliente.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTipoCliente.setForeground(new java.awt.Color(0, 0, 0));
        lbTipoCliente.setText("Tipo Cliente");
        jPanel1.add(lbTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        lbPuntos.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbPuntos.setForeground(new java.awt.Color(0, 0, 0));
        lbPuntos.setText("Puntos");
        jPanel1.add(lbPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        TxtNombre.setBackground(java.awt.SystemColor.menu);
        TxtNombre.setForeground(new java.awt.Color(0, 0, 0));
        TxtNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TxtNombre.setCaretColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 230, 30));

        TxtTelefono.setBackground(java.awt.SystemColor.menu);
        TxtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        TxtTelefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TxtTelefono.setCaretColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 250, 30));

        TxtDireccion.setBackground(java.awt.SystemColor.menu);
        TxtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        TxtDireccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TxtDireccion.setCaretColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 230, 30));

        TxtCorreo.setBackground(java.awt.SystemColor.menu);
        TxtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        TxtCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TxtCorreo.setCaretColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 250, 30));

        CBTipocliente.setBackground(java.awt.SystemColor.menu);
        CBTipocliente.setForeground(new java.awt.Color(0, 0, 0));
        CBTipocliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Confiable", "Frecuente", " " }));
        CBTipocliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(CBTipocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 230, 30));

        TxtPuntos.setBackground(java.awt.SystemColor.menu);
        TxtPuntos.setForeground(new java.awt.Color(0, 0, 0));
        TxtPuntos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TxtPuntos.setCaretColor(new java.awt.Color(0, 0, 0));
        TxtPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPuntosActionPerformed(evt);
            }
        });
        jPanel1.add(TxtPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 80, 30));

        BtnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        BtnGuardar.setText("Registrar");
        BtnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 150, 40));

        BtnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 150, 40));

        BtnPantallaPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        BtnPantallaPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        BtnPantallaPrincipal.setIcon(new javax.swing.ImageIcon("E:\\_____PROYECTOS\\OTROS\\JAVA\\ExoreptiliaD\\resources\\home24.png")); // NOI18N
        BtnPantallaPrincipal.setText("Volver al inicio");
        BtnPantallaPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnPantallaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPantallaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPantallaPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(BtnPantallaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 150, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 230));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TbClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        TbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TbClientesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TbClientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 860, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        if (this.ValidarCampos()) {
            if (Exoreptilia.Registrar) {
                Objetos.objCliente = new Cliente (0, Exoreptilia.TipoCliente, this.TxtNombre.getText(), this.TxtTelefono.getText(), this.TxtDireccion.getText(), this.TxtCorreo.getText(), 0);
                try {
                    if (FBD.InsertarCliente()){
                        JOptionPane.showMessageDialog(null, "Usuario registrado.", TituloMensaje, 1);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al registrar usuario.", TituloMensaje, 0);
                }
            } else {  
                try {
                    Objetos.objCliente = new Cliente (0, this.CBTipocliente.getSelectedIndex() + 1, this.TxtNombre.getText(), this.TxtTelefono.getText(), this.TxtDireccion.getText(), this.TxtCorreo.getText(), Objetos.objCliente.PuntosAcumulados);
                    if (FBD.ActualizarCliente()){
                        JOptionPane.showMessageDialog(null, "Usuario Actualizado.", TituloMensaje, 1);
                    }
                } catch (Exception e) {
                }
            }
        
            this.MostrarListaClientes();
            this.LimpiarFormulario();
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void TbClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbClientesMousePressed
        // TODO add your handling code here:
        this.MostrarUsuarioSeleccionado();
    }//GEN-LAST:event_TbClientesMousePressed

    private void TxtPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPuntosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPuntosActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        this.LimpiarFormulario();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnPantallaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPantallaPrincipalActionPerformed
        // TODO add your handling code here:
        this.LimpiarFormulario();
        fp.MostrarPanelBienvenida();
    }//GEN-LAST:event_BtnPantallaPrincipalActionPerformed

    public void MostrarUsuarioSeleccionado(){
        if (TbClientes.getSelectedRow() != -1){
            int fila = TbClientes.getSelectedRow();
            // Se muestran los datos del cliente seleccionado
            Exoreptilia.IdCliente = Integer.parseInt(TbClientes.getValueAt(fila, 0).toString());
            Exoreptilia.TipoCliente = Integer.parseInt(TbClientes.getValueAt(fila, 1).toString());
            this.CBTipocliente.setSelectedIndex(Exoreptilia.TipoCliente - 1);
            this.TxtNombre.setText(TbClientes.getValueAt(fila, 3).toString());
            this.TxtTelefono.setText(TbClientes.getValueAt(fila, 4).toString());
            this.TxtDireccion.setText(TbClientes.getValueAt(fila, 5).toString());
            this.TxtCorreo.setText(TbClientes.getValueAt(fila, 6).toString());
            this.TxtPuntos.setText(TbClientes.getValueAt(fila, 7).toString());    
            
            Exoreptilia.Registrar = false;
            this.BtnGuardar.setText("Guardar cambios");
            this.lbTipoCliente.setVisible(true);
            this.lbPuntos.setVisible(true);
            this.CBTipocliente.setVisible(true);
            this.TxtPuntos.setVisible(true);
            this.BtnCancelar.setVisible(true);
        }
    }
    
    public void MostrarListaClientes(){
        List<String[]> lista = FBD.obtenerClientes(Exoreptilia.TipoCliente);
        
        String[] columnas = {"idCliente", "idTipoCliente", "Tipo", "Nombre", "Teléfono", "Dirección", "Correo", "Puntos"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        
        for (String[] cliente : lista) {
            modelo.addRow(cliente);
        }
        
        TbClientes.setModel(modelo);
        TbClientes.getColumnModel().getColumn(0).setPreferredWidth(70);
        /*TbClientes.getColumnModel().getColumn(0).setMinWidth(0);
        TbClientes.getColumnModel().getColumn(0).setMaxWidth(0);
        TbClientes.getColumnModel().getColumn(0).setWidth(0);
        TbClientes.getColumnModel().getColumn(0).setResizable(false);*/
        TbClientes.getColumnModel().getColumn(1).setMinWidth(0);
        TbClientes.getColumnModel().getColumn(1).setMaxWidth(0);
        TbClientes.getColumnModel().getColumn(1).setWidth(0);
        TbClientes.getColumnModel().getColumn(1).setResizable(false);
        TbClientes.getColumnModel().getColumn(2).setMinWidth(0);
        TbClientes.getColumnModel().getColumn(2).setMaxWidth(0);
        TbClientes.getColumnModel().getColumn(2).setWidth(0);
        TbClientes.getColumnModel().getColumn(2).setResizable(false);
        //TbClientes.getColumnModel().getColumn(2).setPreferredWidth(70);
        TbClientes.getColumnModel().getColumn(3).setPreferredWidth(210);
        TbClientes.getColumnModel().getColumn(4).setPreferredWidth(90);
        TbClientes.getColumnModel().getColumn(5).setPreferredWidth(210);
        TbClientes.getColumnModel().getColumn(6).setPreferredWidth(150);  
        TbClientes.getColumnModel().getColumn(7).setPreferredWidth(80);   
        TbClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        
        if (Exoreptilia.TipoCliente == 1) {
            this.CBTipocliente.setSelectedIndex(0);
        } else {
            this.CBTipocliente.setSelectedIndex(1);
        }
    }
    
    public boolean ValidarCampos(){
        if (this.TxtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Escribe el nombre del cliente.", TituloMensaje, 2);
            return false;
        }
        
        if (this.TxtTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Escribe el teléfono del cliente", TituloMensaje, 2);
            return false;
        }
        
        if (this.TxtDireccion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Escribe la dirección del cliente", TituloMensaje, 2);
            return false;
        }
        
        if (this.TxtCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Escribe el correo del cliente", TituloMensaje, 2);
            return false;
        }
        
        return true;
    }
    
    public void LimpiarFormulario() {
        this.TxtNombre.setText("");
        this.TxtDireccion.setText("");
        this.TxtTelefono.setText("");
        this.TxtCorreo.setText("");
        this.TxtPuntos.setText("");
        this.BtnGuardar.setText("Registrar");
        this.TbClientes.clearSelection();
        this.lbTipoCliente.setVisible(false);
        this.lbPuntos.setVisible(false);
        this.CBTipocliente.setVisible(false);
        this.TxtPuntos.setVisible(false);
        this.BtnCancelar.setVisible(false);
        Exoreptilia.Registrar = true;
             
        if (Exoreptilia.TipoCliente == 1) {
            this.CBTipocliente.setSelectedIndex(0);
        } else {
            this.CBTipocliente.setSelectedIndex(1);
        }
    }
    
    public void MostrarComponentes(){
        System.out.println("Tipo cliente: " + Exoreptilia.TipoCliente);
        if (Exoreptilia.TipoCliente ==1){
            this.CBTipocliente.setSelectedIndex(0);
            //System.out.println("Frecuente");
        } else {
            this.CBTipocliente.setSelectedIndex(1);
            //System.out.println("Confiable");
        }
        this.CBTipocliente.revalidate();
        this.CBTipocliente.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnPantallaPrincipal;
    private javax.swing.JComboBox<String> CBTipocliente;
    private javax.swing.JTable TbClientes;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtPuntos;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPuntos;
    private javax.swing.JLabel lbTipoCliente;
    // End of variables declaration//GEN-END:variables
}