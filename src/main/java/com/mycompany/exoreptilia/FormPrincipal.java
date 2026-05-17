package com.mycompany.exoreptilia;

/**
 * @author diana
 */
public class FormPrincipal extends javax.swing.JFrame {
    private ControlPantallas Pantallas;
    //PanelClientes panelclientes = new PanelClientes();
    
    public FormPrincipal(ControlPantallas _Pantallas) {
        this.Pantallas = _Pantallas;
        initComponents();
        getContentPane ().setLayout(null);
        setLocationRelativeTo(null);
        
        this.MostrarPanelBienvenida();  
    }

    FormPrincipal() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnUsuario = new javax.swing.JButton();
        PanelMenu = new javax.swing.JPanel();
        BtnHistorial = new javax.swing.JButton();
        BtnClientes = new javax.swing.JButton();
        BtnPromociones = new javax.swing.JButton();
        BtnPedidos = new javax.swing.JButton();
        PanelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelUsuario.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("MENÚ");

        BtnUsuario.setBackground(new java.awt.Color(204, 204, 204));
        BtnUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        BtnUsuario.setText("USUARIO");
        BtnUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout PanelUsuarioLayout = new javax.swing.GroupLayout(PanelUsuario);
        PanelUsuario.setLayout(PanelUsuarioLayout);
        PanelUsuarioLayout.setHorizontalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 762, Short.MAX_VALUE)
                .addComponent(BtnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        PanelUsuarioLayout.setVerticalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BtnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(PanelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 60));

        PanelMenu.setBackground(new java.awt.Color(153, 153, 153));
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnHistorial.setText("HISTORIAL");
        BtnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHistorialActionPerformed(evt);
            }
        });
        PanelMenu.add(BtnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, 80));

        BtnClientes.setText("CLIENTES");
        BtnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClientesActionPerformed(evt);
            }
        });
        PanelMenu.add(BtnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 80));

        BtnPromociones.setText("PROMOCIONES");
        BtnPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPromocionesActionPerformed(evt);
            }
        });
        PanelMenu.add(BtnPromociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, 80));

        BtnPedidos.setText("PEDIDOS");
        BtnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPedidosActionPerformed(evt);
            }
        });
        PanelMenu.add(BtnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, 80));

        getContentPane().add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 220, 640));

        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 880, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClientesActionPerformed
        // TODO add your handling code here:
        this.MostrarPanelClientes();
    }//GEN-LAST:event_BtnClientesActionPerformed

    private void BtnPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPromocionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPromocionesActionPerformed

    private void BtnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPedidosActionPerformed

    private void BtnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHistorialActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void MostrarPanelClientes(){
        PanelClientes panelclientes = new PanelClientes(this);
        panelclientes.setSize(880,640);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panelclientes,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,880,640));
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }
    
    public void MostrarPanelBienvenida(){
        PanelBienvenida panelBienvenida = new PanelBienvenida();
        panelBienvenida.setSize(800,640);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panelBienvenida,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,880,640));
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();        
    }
    
    public void MostrarPanelConsultaClientes(){
        PanelConsultaClientes panelConsultaClientes = new PanelConsultaClientes();
        panelConsultaClientes.setSize(800,640);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panelConsultaClientes,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,880,640));
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();        
    }
    
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClientes;
    private javax.swing.JButton BtnHistorial;
    private javax.swing.JButton BtnPedidos;
    private javax.swing.JButton BtnPromociones;
    private javax.swing.JButton BtnUsuario;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelUsuario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
