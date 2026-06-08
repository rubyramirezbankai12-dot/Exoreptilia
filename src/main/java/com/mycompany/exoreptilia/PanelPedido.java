package com.mycompany.exoreptilia;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * @author diana
 */
public class PanelPedido extends javax.swing.JPanel {
    private FormPrincipal fp;
    FuncionesBD FBD = new FuncionesBD();
    int PuntosAcumulados = 0, PuntosPedido = 0;
    String TituloMensaje = "Pedido";
    boolean FormularioValido = false;
    
    public PanelPedido(FormPrincipal _formPrincipal) {
        initComponents();
        this.fp = _formPrincipal;
        
        String [] columnas = {"Id Promoción", "Nombre Promoción", "Desc. %"};
        DefaultTableModel modelo = new DefaultTableModel (columnas, 0);
        this.TbPromociones.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtIdCliente = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LbNombreCliente = new javax.swing.JLabel();
        TxtTotalPedido = new javax.swing.JTextField();
        TxtIdPromocion = new javax.swing.JTextField();
        BtnCalcular = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        TxtImporteFinal = new javax.swing.JTextField();
        BtnRegistrarPedido = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        LbPuntos = new javax.swing.JLabel();
        BtnPantallaPrincipal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbPromociones = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar pedido");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos del pedido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 367, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("Id Cliente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 47, -1, -1));

        TxtIdCliente.setBackground(java.awt.SystemColor.menu);
        TxtIdCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(TxtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 90, 30));

        BtnBuscar.setBackground(new java.awt.Color(153, 153, 153));
        BtnBuscar.setText("Buscar");
        BtnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 150, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Id Promoción");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("Total del pedido");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        LbNombreCliente.setBackground(new java.awt.Color(204, 204, 255));
        LbNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        LbNombreCliente.setText("-");
        jPanel1.add(LbNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 220, -1));

        TxtTotalPedido.setBackground(java.awt.SystemColor.menu);
        TxtTotalPedido.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(TxtTotalPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 220, 30));

        TxtIdPromocion.setBackground(java.awt.SystemColor.menu);
        TxtIdPromocion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(TxtIdPromocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 220, 30));

        BtnCalcular.setBackground(new java.awt.Color(153, 153, 153));
        BtnCalcular.setText("Calcular");
        BtnCalcular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 150, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setText("Importe final");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 367, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 360, 14));

        TxtImporteFinal.setEditable(false);
        TxtImporteFinal.setBackground(java.awt.SystemColor.menu);
        TxtImporteFinal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TxtImporteFinal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(TxtImporteFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 220, 30));

        BtnRegistrarPedido.setBackground(new java.awt.Color(153, 153, 153));
        BtnRegistrarPedido.setText("Registrar Pedido");
        BtnRegistrarPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnRegistrarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegistrarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 150, 40));

        BtnLimpiar.setBackground(new java.awt.Color(153, 153, 153));
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 150, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("Puntos acumulados");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        LbPuntos.setBackground(new java.awt.Color(204, 204, 255));
        LbPuntos.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        LbPuntos.setText("-");
        jPanel1.add(LbPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 220, 20));

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
        jPanel1.add(BtnPantallaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 149, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Promociones disponibles para este cliente");

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
        jScrollPane1.setViewportView(TbPromociones);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
        try {
            if (!this.TxtIdCliente.getText().trim().equals("")) {
                if (this.BuscarCliente()) {
                    this.ObtenerPromocionesCliente();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingresa el Id del cliente.", TituloMensaje, 2);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El Id Cliente debe ser numérico", TituloMensaje, 2);
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
        // TODO add your handling code here:
        if (this.TxtIdCliente.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Primero indica el ID del cliente.", TituloMensaje, 2);
            FormularioValido = false;
            return;
        }
        
        if (this.LbNombreCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Primero busca el ID del cliente.", TituloMensaje, 2);
            FormularioValido = false;
            return;
        }
        
        if (this.TxtTotalPedido.getText().trim().equals("") || this.TxtIdPromocion.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Se debe proporcionar el total del pedido y el id de la promoción elegida.", TituloMensaje, 2);
            FormularioValido = false;
            return;
        }
        
        double descuento = FBD.ObtenerDescuentoPromocion(Integer.parseInt(this.TxtIdPromocion.getText()), Integer.parseInt(this.LbPuntos.getText()));
        
        if (descuento == -1) {
            JOptionPane.showMessageDialog(null, "La promoción solicitada no es válida para el cliente actual o no se encuentra activa.", TituloMensaje, 2);
            this.TxtIdPromocion.setText("");
            this.TxtImporteFinal.setText("");
            FormularioValido = false;
            return;
        }
        
        this.TxtImporteFinal.setText(this.CalcularImporteFinal(descuento) + "");
        FormularioValido = true;
    }//GEN-LAST:event_BtnCalcularActionPerformed

    private void BtnRegistrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarPedidoActionPerformed
        // TODO add your handling code here:
        if (FormularioValido) {
            if (FBD.InsertarPedido()) {
                if (FBD.ActualizarPuntosCliente(Objetos.objPedido.idCliente, PuntosPedido)) {
                    JOptionPane.showMessageDialog(null, "Pedido registrado correctamente.", TituloMensaje, 1);
                    this.LimpiarFormulario();
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrió un error al registrar los puntos.", TituloMensaje, 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrió un error.", TituloMensaje, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Primero ingresa los datos del pedido y calcula el monto final.", TituloMensaje, 2);
        }
    }//GEN-LAST:event_BtnRegistrarPedidoActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        // TODO add your handling code here:
        this.LimpiarFormulario();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnPantallaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPantallaPrincipalActionPerformed
        // TODO add your handling code here:
        this.LimpiarFormulario();
        fp.MostrarPanelBienvenida();
    }//GEN-LAST:event_BtnPantallaPrincipalActionPerformed

    public double CalcularImporteFinal(double _descuento) {
        double importePedido = Double.parseDouble(this.TxtTotalPedido.getText());
        double importeFinal = importePedido - ((importePedido * _descuento) / 100);
        
        LocalDate fechaHoy = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaString = fechaHoy.format(formato);
        LocalDate fecha = LocalDate.parse(fechaString);
        PuntosPedido = PuntosAcumulados + (int)(importeFinal / 10);
        
        Objetos.objPedido = new Pedido(
            Objetos.objCliente.idCliente,
            Integer.parseInt(this.TxtIdPromocion.getText()),
            importePedido,
            importeFinal,
            fecha
        );
        
        return importeFinal;        
    }
    
    public boolean BuscarCliente() {
        if (FBD.obtenerInfoCliente(Integer.parseInt(this.TxtIdCliente.getText()))) {
            this.LbNombreCliente.setText(Objetos.objCliente.nombreCliente);
            this.LbPuntos.setText(Objetos.objCliente.PuntosAcumulados + "");
            PuntosAcumulados = Objetos.objCliente.PuntosAcumulados;
            
            this.TxtTotalPedido.setText("");
            this.TxtIdPromocion.setText("");
            this.TxtImporteFinal.setText("");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.", TituloMensaje, 2);
            this.LimpiarFormulario();
            return false;
        }
    }
    
    public void ObtenerPromocionesCliente() {
        List<String[]> lista = FBD.ObtenerPromocionesCliente(Objetos.objCliente.PuntosAcumulados);
        
        String [] columnas = {"Id Promoción", "Nombre Promoción", "Desc. %"};
        DefaultTableModel modelo = new DefaultTableModel (columnas, 0);
        
        for (String [] promocion : lista ){
            modelo.addRow(promocion);
        }        
        
        TbPromociones.setModel (modelo);   
        TbPromociones.getColumnModel().getColumn(0).setPreferredWidth(90);  
        TbPromociones.getColumnModel().getColumn(1).setPreferredWidth(280); 
        TbPromociones.getColumnModel().getColumn(2).setPreferredWidth(60); 
        TbPromociones.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
    }
    
    public void LimpiarFormulario() {
        this.TxtIdCliente.setText("");
        this.LbNombreCliente.setText("");
        this.LbPuntos.setText("");
        this.TxtTotalPedido.setText("");
        this.TxtIdPromocion.setText("");
        this.TxtImporteFinal.setText("");        
        DefaultTableModel modelo = (DefaultTableModel) TbPromociones.getModel();
        modelo.setRowCount(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnPantallaPrincipal;
    private javax.swing.JButton BtnRegistrarPedido;
    private javax.swing.JLabel LbNombreCliente;
    private javax.swing.JLabel LbPuntos;
    private javax.swing.JTable TbPromociones;
    private javax.swing.JTextField TxtIdCliente;
    private javax.swing.JTextField TxtIdPromocion;
    private javax.swing.JTextField TxtImporteFinal;
    private javax.swing.JTextField TxtTotalPedido;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}