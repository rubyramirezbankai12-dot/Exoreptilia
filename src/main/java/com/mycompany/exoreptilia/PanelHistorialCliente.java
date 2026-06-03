package com.mycompany.exoreptilia;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * @author diana
 */
public class PanelHistorialCliente extends javax.swing.JPanel {
    private FormPrincipal fp;
    FuncionesBD FBD = new FuncionesBD();
    String TituloMensaje = "Historial";
    
    public PanelHistorialCliente(FormPrincipal _formPrincipal) {
        initComponents();
        this.fp = _formPrincipal;
        this.LimpiarFormulario(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TxtIdCliente = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        BtnPantallaPrincipal = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbHistorial = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbIdCliente = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        lbTelefono = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbComprasRealizadas = new javax.swing.JLabel();
        lbUltimaCompra = new javax.swing.JLabel();
        lbTotalComprado = new javax.swing.JLabel();
        lbPuntosAcumulados = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Historial del Cliente");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Id del cliente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        TxtIdCliente.setBackground(java.awt.SystemColor.menu);
        TxtIdCliente.setForeground(new java.awt.Color(0, 0, 0));
        TxtIdCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TxtIdCliente.setCaretColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(TxtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, 30));

        BtnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        BtnBuscar.setText("Buscar");
        BtnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBuscar.addActionListener(this::BtnBuscarActionPerformed);
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 150, 40));

        BtnPantallaPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        BtnPantallaPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        BtnPantallaPrincipal.setIcon(new javax.swing.ImageIcon("E:\\_____PROYECTOS\\OTROS\\JAVA\\ExoreptiliaD\\resources\\home24.png")); // NOI18N
        BtnPantallaPrincipal.setText("Volver al inicio");
        BtnPantallaPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnPantallaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPantallaPrincipal.addActionListener(this::BtnPantallaPrincipalActionPerformed);
        jPanel1.add(BtnPantallaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 150, 40));

        BtnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        BtnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLimpiar.addActionListener(this::BtnLimpiarActionPerformed);
        jPanel1.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 150, 40));

        TbHistorial.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TbHistorial);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Información del cliente");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 859, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Id Cliente");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 61, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 91, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tipo");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 123, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Teléfono");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 153, -1, -1));

        lbIdCliente.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbIdCliente.setForeground(new java.awt.Color(0, 0, 0));
        lbIdCliente.setText("-");
        jPanel2.add(lbIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 61, -1, -1));

        lbNombre.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(0, 0, 0));
        lbNombre.setText("-");
        jPanel2.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 91, -1, -1));

        lbTipo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTipo.setForeground(new java.awt.Color(0, 0, 0));
        lbTipo.setText("-");
        jPanel2.add(lbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 123, -1, -1));

        lbTelefono.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lbTelefono.setText("-");
        jPanel2.add(lbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 153, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Compras realizadas");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 61, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Última compra");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 91, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Total comprado");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 123, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Puntos acumulados");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 153, -1, -1));

        lbComprasRealizadas.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbComprasRealizadas.setForeground(new java.awt.Color(0, 0, 0));
        lbComprasRealizadas.setText("-");
        jPanel2.add(lbComprasRealizadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 61, -1, -1));

        lbUltimaCompra.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbUltimaCompra.setForeground(new java.awt.Color(0, 0, 0));
        lbUltimaCompra.setText("-");
        jPanel2.add(lbUltimaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 91, -1, -1));

        lbTotalComprado.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTotalComprado.setForeground(new java.awt.Color(0, 0, 0));
        lbTotalComprado.setText("-");
        jPanel2.add(lbTotalComprado, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 123, -1, -1));

        lbPuntosAcumulados.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbPuntosAcumulados.setForeground(new java.awt.Color(0, 0, 0));
        lbPuntosAcumulados.setText("-");
        jPanel2.add(lbPuntosAcumulados, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 153, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Historial de compras");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
        if (this.TxtIdCliente.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresa un ID válido.", TituloMensaje, 2);
            return;
        }
        
        try {
            this.MostrarHistorialCliente(Integer.parseInt(this.TxtIdCliente.getText()));
            this.MostrarInformacionCliente(Integer.parseInt(this.TxtIdCliente.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El Id Cliente debe ser numérico", TituloMensaje, 2);
            return;
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        // TODO add your handling code here:
        this.LimpiarFormulario(true);
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnPantallaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPantallaPrincipalActionPerformed
        // TODO add your handling code here:
        this.LimpiarFormulario(true);
        fp.MostrarPanelBienvenida();
    }//GEN-LAST:event_BtnPantallaPrincipalActionPerformed


    public void MostrarHistorialCliente (int _idCliente){
        List<String[]> lista = FBD.obtenerHistorialCliente(_idCliente);
        
        /*if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.", TituloMensaje, 1);
            return;
        }*/
        
        String [] columnas = {"Cliente", "Total pedido", "Importe final", "Promoción", "Desc. %", "Fecha"};
        DefaultTableModel modelo = new DefaultTableModel (columnas, 0);
        
        for (String [] promocion : lista ){
            modelo.addRow(promocion);
        }
        
        TbHistorial.setModel (modelo);   
        TbHistorial.getColumnModel().getColumn(0).setPreferredWidth(250);  
        TbHistorial.getColumnModel().getColumn(1).setPreferredWidth(80); 
        TbHistorial.getColumnModel().getColumn(2).setPreferredWidth(80); 
        TbHistorial.getColumnModel().getColumn(3).setPreferredWidth(200);  
        TbHistorial.getColumnModel().getColumn(4).setPreferredWidth(60); 
        TbHistorial.getColumnModel().getColumn(5).setPreferredWidth(80); 
        TbHistorial.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
    }
    
    public void MostrarInformacionCliente(int _idCliente) {
        String[] totalPedido;
        
        if (FBD.obtenerInfoCliente(_idCliente)) {
            this.lbIdCliente.setText(Objetos.objCliente.idCliente + "");
            this.lbNombre.setText(Objetos.objCliente.nombreCliente);
            if (Objetos.objCliente.tipoCliente == 1) {
                this.lbTipo.setText("Confiable");
            } else {
                this.lbTipo.setText("Frecuente");
            }
            this.lbTelefono.setText(Objetos.objCliente.telefono);
            this.lbPuntosAcumulados.setText(Objetos.objCliente.PuntosAcumulados + "");
            
            totalPedido = FBD.obtenerTotalPedidos(_idCliente);
            if (totalPedido[0] != null) {
                this.lbComprasRealizadas.setText(totalPedido[1]);
                this.lbUltimaCompra.setText(totalPedido[2]);
                this.lbTotalComprado.setText("$ " + totalPedido[3]);
            } else {
                this.lbComprasRealizadas.setText("0");
                this.lbUltimaCompra.setText("N/A");
                this.lbTotalComprado.setText("$ 0.00");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.", TituloMensaje, 1);
            this.LimpiarFormulario(false);
            
        }
        
        
        /*if (totalPedido[0] != null) {
            
        } else {
            this.lbComprasRealizadas.setText("0");
            this.lbUltimaCompra.setText("N/A");
            this.lbTotalComprado.setText("$ 0.00");
        }*/
    }
    
    public void LimpiarFormulario(boolean _limpiarIdCliente) {
        this.lbIdCliente.setText("");
        this.lbNombre.setText("");
        this.lbTipo.setText("");
        this.lbTelefono.setText("");
        this.lbComprasRealizadas.setText("-");
        this.lbUltimaCompra.setText("-");
        this.lbTotalComprado.setText("-");
        this.lbPuntosAcumulados.setText("-");
        
        String [] columnas = {"Cliente", "Total pedido", "Importe final", "Promoción", "Desc. %", "Fecha"};
        DefaultTableModel modelo = new DefaultTableModel (columnas, 0);
        TbHistorial.setModel(modelo);
        TbHistorial.getColumnModel().getColumn(0).setPreferredWidth(250);  
        TbHistorial.getColumnModel().getColumn(1).setPreferredWidth(80); 
        TbHistorial.getColumnModel().getColumn(2).setPreferredWidth(80); 
        TbHistorial.getColumnModel().getColumn(3).setPreferredWidth(200);  
        TbHistorial.getColumnModel().getColumn(4).setPreferredWidth(60); 
        TbHistorial.getColumnModel().getColumn(5).setPreferredWidth(80); 
        TbHistorial.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        
        if (_limpiarIdCliente) {
            this.TxtIdCliente.setText("");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnPantallaPrincipal;
    private javax.swing.JTable TbHistorial;
    private javax.swing.JTextField TxtIdCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbComprasRealizadas;
    private javax.swing.JLabel lbIdCliente;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPuntosAcumulados;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbTotalComprado;
    private javax.swing.JLabel lbUltimaCompra;
    // End of variables declaration//GEN-END:variables
}