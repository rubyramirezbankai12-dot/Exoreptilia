package com.mycompany.exoreptilia;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * @author diana
 */
public class PanelRegistraPromocion extends javax.swing.JPanel {
    private FormPrincipal fp;
    FuncionesBD FBD = new FuncionesBD();
    String TituloMensaje = "Promociones";
    
    public PanelRegistraPromocion(FormPrincipal _formPrincipal) {
        initComponents();
        
        this.BtnCancelar.setVisible(false);
        this.MostrarPromociones();
        this.fp = _formPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtNombrePromocion = new javax.swing.JTextField();
        TxtDescuento = new javax.swing.JTextField();
        TxtPuntos = new javax.swing.JTextField();
        CBEstado = new javax.swing.JComboBox<>();
        BtnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbPromociones = new javax.swing.JTable();
        BtnCancelar = new javax.swing.JButton();
        BtnPantallaPrincipal = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Promoción");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 827, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Nombre");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("Descuento (%)");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("Puntos Necesarios");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Estado");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        TxtNombrePromocion.setBackground(java.awt.SystemColor.menu);
        TxtNombrePromocion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(TxtNombrePromocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 250, 30));

        TxtDescuento.setBackground(java.awt.SystemColor.menu);
        TxtDescuento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(TxtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 150, 30));

        TxtPuntos.setBackground(java.awt.SystemColor.menu);
        TxtPuntos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(TxtPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 76, 30));

        CBEstado.setBackground(java.awt.SystemColor.menu);
        CBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        CBEstado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(CBEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 161, 30));

        BtnGuardar.setBackground(new java.awt.Color(153, 153, 153));
        BtnGuardar.setText("Registrar");
        BtnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 150, 40));

        TbPromociones.setModel(new javax.swing.table.DefaultTableModel(
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
        TbPromociones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TbPromocionesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TbPromociones);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 198, 840, 420));

        BtnCancelar.setBackground(new java.awt.Color(153, 153, 153));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 150, 40));

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
        add(BtnPantallaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 150, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        double descuento = Double.parseDouble(this.TxtDescuento.getText());
        if (!this.ValidarCampos()) {
            return;
        }
        
        if (descuento > 100) {
            JOptionPane.showMessageDialog(null, "El descuento no puede ser mayor a 100%.", TituloMensaje, 1);
            return;
        }
        
        Objetos.objPromocion = new Promocion(
                Exoreptilia.IdPromocion,
                this.TxtNombrePromocion.getText(),
                Double.parseDouble(this.TxtDescuento.getText()),
                Integer.parseInt(this.TxtPuntos.getText()),
                this.CBEstado.getSelectedItem().toString()
        );
        try {
            if (Exoreptilia.EditarPromocion) {
                if (FBD.actualizarPromocion()) {                
                    JOptionPane.showMessageDialog(null, "Promoción actualizada.", TituloMensaje, 1);
                }
            } else {
                if (FBD.InsertarPromocion()) {
                    JOptionPane.showMessageDialog(null, "Promoción registrada.", TituloMensaje, 1);
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.toString());
        }
        
        this.MostrarPromociones();
        this.LimpiarFormulario();
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void TbPromocionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbPromocionesMousePressed
        // TODO add your handling code here:
        this.MostrarPromocionSeleccionada();
    }//GEN-LAST:event_TbPromocionesMousePressed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        this.LimpiarFormulario();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnPantallaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPantallaPrincipalActionPerformed
        // TODO add your handling code here:
        this.LimpiarFormulario();
        fp.MostrarPanelBienvenida();
    }//GEN-LAST:event_BtnPantallaPrincipalActionPerformed

    public void MostrarPromociones (){
        List<String[]> lista = FBD.obtenerPromociones();
        
        String [] columnas = {"Id", "Promoción", "Descuento %", "Puntos necesarios", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel (columnas, 0);
        
        for (String [] promocion : lista ){
            modelo.addRow(promocion);
        }
        
        TbPromociones.setModel (modelo);   
        TbPromociones.getColumnModel().getColumn(0).setPreferredWidth(100);  
        TbPromociones.getColumnModel().getColumn(1).setPreferredWidth(400); 
        TbPromociones.getColumnModel().getColumn(2).setPreferredWidth(100); 
        TbPromociones.getColumnModel().getColumn(3).setPreferredWidth(100); 
        TbPromociones.getColumnModel().getColumn(4).setPreferredWidth(100);   
        TbPromociones.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
    }
    
    public void MostrarPromocionSeleccionada(){        
        if (TbPromociones.getSelectedRow() != -1){
            int fila = TbPromociones.getSelectedRow();
            // Se muestran los datos del cliente seleccionado
            Exoreptilia.IdPromocion = Integer.parseInt(TbPromociones.getValueAt(fila, 0).toString());
            this.TxtNombrePromocion.setText(TbPromociones.getValueAt(fila, 1).toString());
            this.TxtDescuento.setText(TbPromociones.getValueAt(fila, 2).toString());
            this.TxtPuntos.setText(TbPromociones.getValueAt(fila, 3).toString());
            this.CBEstado.setSelectedItem(TbPromociones.getValueAt(fila, 4).toString());
            
            Exoreptilia.EditarPromocion = true;
            this.BtnCancelar.setVisible(true);
            this.BtnGuardar.setText("Guardar cambios");
        }
    }
    
    public void LimpiarFormulario() {
        this.TxtNombrePromocion.setText("");
        this.TxtDescuento.setText("");
        this.TxtPuntos.setText("");
        this.CBEstado.setSelectedIndex(0);
        Exoreptilia.EditarPromocion = false;
        this.BtnCancelar.setVisible(false);
        this.BtnGuardar.setText("Registrar");
        this.TbPromociones.clearSelection();

    }
    
    public boolean ValidarCampos() {
        if (this.TxtNombrePromocion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Escribe el nombre de la promoción.", TituloMensaje, 2);
            return false;
        }
        
        if (this.TxtDescuento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Indica el descuento de la promoción.", TituloMensaje, 2);
            return false;
        }
        
        if (this.TxtPuntos.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Indica los puntos necesarios para la promoción.", TituloMensaje, 2);
            return false;
        }
        
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnPantallaPrincipal;
    private javax.swing.JComboBox<String> CBEstado;
    private javax.swing.JTable TbPromociones;
    private javax.swing.JTextField TxtDescuento;
    private javax.swing.JTextField TxtNombrePromocion;
    private javax.swing.JTextField TxtPuntos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}