package com.mycompany.exoreptilia;

/*
 * @author diana
 */
public class PanelPromocion extends javax.swing.JPanel {
    private FormPrincipal fp;
    private PanelRegistraPromocion prp;
    
    public PanelPromocion() {
        initComponents();
    }
    
    public PanelPromocion(FormPrincipal fp) {
        this.fp = fp;
        this.prp = new PanelRegistraPromocion(fp);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnRegistrarPromocion = new javax.swing.JButton();
        BtnAplicarPromocion = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        BtnRegistrarPromocion.setText("Registrar Promoción");
        BtnRegistrarPromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarPromocionActionPerformed(evt);
            }
        });

        BtnAplicarPromocion.setText("Aplicar Promoción");
        BtnAplicarPromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAplicarPromocionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnRegistrarPromocion, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(BtnAplicarPromocion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(408, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(BtnRegistrarPromocion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnAplicarPromocion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(393, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarPromocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarPromocionActionPerformed
        // TODO add your handling code here:
        fp.MostrarPanelRegistraPromocion();
        
    }//GEN-LAST:event_BtnRegistrarPromocionActionPerformed

    private void BtnAplicarPromocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAplicarPromocionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAplicarPromocionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAplicarPromocion;
    private javax.swing.JButton BtnRegistrarPromocion;
    // End of variables declaration//GEN-END:variables
}
