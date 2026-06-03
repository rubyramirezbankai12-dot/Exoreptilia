package com.mycompany.exoreptilia;

/**
 * @author diana
 */
public class PanelClientes extends javax.swing.JPanel {
    private FormPrincipal fp;
    private PanelConsultaClientes pcc;
    
    public PanelClientes() {
        initComponents();
    }
    
    public PanelClientes(FormPrincipal fp){
        this.fp = fp;
        this.pcc = new PanelConsultaClientes(fp);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnFrecuente = new javax.swing.JButton();
        BtnConfiable = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnFrecuente.setBackground(new java.awt.Color(208, 149, 217));
        BtnFrecuente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnFrecuente.setForeground(new java.awt.Color(0, 0, 0));
        BtnFrecuente.setText("CLIENTES CONFIABLES");
        BtnFrecuente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BtnFrecuente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFrecuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFrecuenteActionPerformed(evt);
            }
        });
        add(BtnFrecuente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 230, 110));

        BtnConfiable.setBackground(new java.awt.Color(208, 149, 217));
        BtnConfiable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnConfiable.setForeground(new java.awt.Color(0, 0, 0));
        BtnConfiable.setText("CLIENTES FRECUENTES");
        BtnConfiable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BtnConfiable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnConfiable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfiableActionPerformed(evt);
            }
        });
        add(BtnConfiable, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 230, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFrecuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFrecuenteActionPerformed
        //frecuentes
        Exoreptilia.Registrar = true;
        Exoreptilia.TipoCliente = 1;
        fp.MostrarPanelConsultaClientes();
        pcc.MostrarComponentes();
    }//GEN-LAST:event_BtnFrecuenteActionPerformed

    private void BtnConfiableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfiableActionPerformed
        // Confiables
        Exoreptilia.Registrar = true;
        Exoreptilia.TipoCliente = 2;
        fp.MostrarPanelConsultaClientes();
        pcc.MostrarComponentes();
    }//GEN-LAST:event_BtnConfiableActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConfiable;
    private javax.swing.JButton BtnFrecuente;
    // End of variables declaration//GEN-END:variables
}
