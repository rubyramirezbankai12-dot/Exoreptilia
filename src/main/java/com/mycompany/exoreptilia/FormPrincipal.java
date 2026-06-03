package com.mycompany.exoreptilia;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @author diana
 */
public class FormPrincipal extends javax.swing.JFrame {
    private ControlPantallas Pantallas;
    String TituloMensaje = "Exoreptilia";
    
    private static final Color ColorBotonNormal = new Color(208, 149, 217);
    private static final Color ColorBotonEncima = new Color(255, 255, 255);
    
    public FormPrincipal(ControlPantallas _Pantallas) {
        this.Pantallas = _Pantallas;
        initComponents();
        getContentPane ().setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        
        this.MostrarPanelBienvenida();
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowOpened(java.awt.event.WindowEvent e) {
                System.out.println("Ventana abierta");
                BtnUsuario.setText("USUARIO " + Objetos.objUsuario.getNombre());
            }
        });
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
        BtnUsuarios = new javax.swing.JButton();
        PanelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelUsuario.setBackground(new java.awt.Color(106, 60, 135));
        PanelUsuario.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(208, 149, 217));
        jLabel1.setText("MENÚ");

        BtnUsuario.setBackground(new java.awt.Color(106, 60, 135));
        BtnUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        BtnUsuario.setForeground(new java.awt.Color(208, 149, 217));
        BtnUsuario.setText("USUARIO");
        BtnUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout PanelUsuarioLayout = new javax.swing.GroupLayout(PanelUsuario);
        PanelUsuario.setLayout(PanelUsuarioLayout);
        PanelUsuarioLayout.setHorizontalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 714, Short.MAX_VALUE)
                .addComponent(BtnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelUsuarioLayout.setVerticalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BtnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(PanelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 60));

        PanelMenu.setBackground(new java.awt.Color(208, 149, 217));
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnHistorial.setBackground(new java.awt.Color(208, 149, 217));
        BtnHistorial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnHistorial.setForeground(new java.awt.Color(0, 0, 0));
        BtnHistorial.setIcon(new javax.swing.ImageIcon("E:\\_____PROYECTOS\\OTROS\\JAVA\\ExoreptiliaD\\src\\main\\java\\com\\mycompany\\exoreptilia\\historial64.png")); // NOI18N
        BtnHistorial.setText("HISTORIAL        ");
        BtnHistorial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BtnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnHistorial.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnHistorialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnHistorialMouseExited(evt);
            }
        });
        BtnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHistorialActionPerformed(evt);
            }
        });
        PanelMenu.add(BtnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 80));

        BtnClientes.setBackground(new java.awt.Color(208, 149, 217));
        BtnClientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnClientes.setForeground(new java.awt.Color(0, 0, 0));
        BtnClientes.setIcon(new javax.swing.ImageIcon("E:\\_____PROYECTOS\\OTROS\\JAVA\\ExoreptiliaD\\src\\main\\java\\com\\mycompany\\exoreptilia\\client64.png")); // NOI18N
        BtnClientes.setText("CLIENTES           ");
        BtnClientes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BtnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnClientesMouseExited(evt);
            }
        });
        BtnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClientesActionPerformed(evt);
            }
        });
        PanelMenu.add(BtnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 80));

        BtnPromociones.setBackground(new java.awt.Color(208, 149, 217));
        BtnPromociones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnPromociones.setForeground(new java.awt.Color(0, 0, 0));
        BtnPromociones.setIcon(new javax.swing.ImageIcon("E:\\_____PROYECTOS\\OTROS\\JAVA\\ExoreptiliaD\\src\\main\\java\\com\\mycompany\\exoreptilia\\oferta64.png")); // NOI18N
        BtnPromociones.setText("PROMOCIONES");
        BtnPromociones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BtnPromociones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPromociones.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnPromociones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnPromocionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnPromocionesMouseExited(evt);
            }
        });
        BtnPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPromocionesActionPerformed(evt);
            }
        });
        PanelMenu.add(BtnPromociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 220, 80));

        BtnPedidos.setBackground(new java.awt.Color(208, 149, 217));
        BtnPedidos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnPedidos.setForeground(new java.awt.Color(0, 0, 0));
        BtnPedidos.setIcon(new javax.swing.ImageIcon("E:\\_____PROYECTOS\\OTROS\\JAVA\\ExoreptiliaD\\src\\main\\java\\com\\mycompany\\exoreptilia\\compras64.png")); // NOI18N
        BtnPedidos.setText("PEDIDOS            ");
        BtnPedidos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BtnPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPedidos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnPedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnPedidosMouseExited(evt);
            }
        });
        BtnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPedidosActionPerformed(evt);
            }
        });
        PanelMenu.add(BtnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, 80));

        BtnUsuarios.setBackground(new java.awt.Color(208, 149, 217));
        BtnUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        BtnUsuarios.setIcon(new javax.swing.ImageIcon("E:\\_____PROYECTOS\\OTROS\\JAVA\\ExoreptiliaD\\src\\main\\java\\com\\mycompany\\exoreptilia\\admin64.png")); // NOI18N
        BtnUsuarios.setText("USUARIOS");
        BtnUsuarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BtnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnUsuariosMouseExited(evt);
            }
        });
        BtnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuariosActionPerformed(evt);
            }
        });
        PanelMenu.add(BtnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 220, 80));

        getContentPane().add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 220, 640));

        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 880, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClientesActionPerformed
        // TODO add your handling code here:
        this.MostrarPanelClientes();
        Exoreptilia.Registrar = true;
    }//GEN-LAST:event_BtnClientesActionPerformed

    private void BtnPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPromocionesActionPerformed
        // TODO add your handling code here:
        //this.MostrarPanelPromociones();
        this.MostrarPanelRegistraPromocion();
    }//GEN-LAST:event_BtnPromocionesActionPerformed

    private void BtnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPedidosActionPerformed
        // TODO add your handling code here:
        this.MostrarPanelRegistrarPedido();
    }//GEN-LAST:event_BtnPedidosActionPerformed

    private void BtnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHistorialActionPerformed
        // TODO add your handling code here:
        this.MostrarPanelHistorialCliente();
    }//GEN-LAST:event_BtnHistorialActionPerformed

    private void BtnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuariosActionPerformed
        // TODO add your handling code here:
        if (Exoreptilia.UsuarioActual.equals("Administrador")) {
            this.MostrarPanelUsuarios();
        } else {
            JOptionPane.showMessageDialog(null, "Solo un Administrador puede acceder a este apartado.", TituloMensaje, 0);
        }
    }//GEN-LAST:event_BtnUsuariosActionPerformed

    private void BtnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClientesMouseEntered
        // TODO add your handling code here:
        this.BtnClientes.setBackground(ColorBotonEncima);
    }//GEN-LAST:event_BtnClientesMouseEntered

    private void BtnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClientesMouseExited
        // TODO add your handling code here:
        this.BtnClientes.setBackground(ColorBotonNormal);
    }//GEN-LAST:event_BtnClientesMouseExited

    private void BtnPromocionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPromocionesMouseEntered
        // TODO add your handling code here:
        this.BtnPromociones.setBackground(ColorBotonEncima);
    }//GEN-LAST:event_BtnPromocionesMouseEntered

    private void BtnPromocionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPromocionesMouseExited
        // TODO add your handling code here:
        this.BtnPromociones.setBackground(ColorBotonNormal);
    }//GEN-LAST:event_BtnPromocionesMouseExited

    private void BtnPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPedidosMouseEntered
        // TODO add your handling code here:
        this.BtnPedidos.setBackground(ColorBotonEncima);
    }//GEN-LAST:event_BtnPedidosMouseEntered

    private void BtnPedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPedidosMouseExited
        // TODO add your handling code here:
        this.BtnPedidos.setBackground(ColorBotonNormal);
    }//GEN-LAST:event_BtnPedidosMouseExited

    private void BtnHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHistorialMouseEntered
        // TODO add your handling code here:
        this.BtnHistorial.setBackground(ColorBotonEncima);
    }//GEN-LAST:event_BtnHistorialMouseEntered

    private void BtnHistorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHistorialMouseExited
        // TODO add your handling code here:
        this.BtnHistorial.setBackground(ColorBotonNormal);
    }//GEN-LAST:event_BtnHistorialMouseExited

    private void BtnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUsuariosMouseEntered
        // TODO add your handling code here:
        this.BtnUsuarios.setBackground(ColorBotonEncima);
    }//GEN-LAST:event_BtnUsuariosMouseEntered

    private void BtnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUsuariosMouseExited
        // TODO add your handling code here:
        this.BtnUsuarios.setBackground(ColorBotonNormal);
    }//GEN-LAST:event_BtnUsuariosMouseExited

    /**
     * @param args the command line arguments
     */
    
    public void MostrarPanelClientes() {
        PanelClientes panelclientes = new PanelClientes(this);
        panelclientes.setSize(880,640);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panelclientes,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,880,640));
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }
    
    public void MostrarPanelBienvenida() {
        PanelBienvenida panelBienvenida = new PanelBienvenida();
        panelBienvenida.setSize(880,640);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panelBienvenida,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,880,640));
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();        
    }
    
    public void MostrarPanelConsultaClientes() {
        PanelConsultaClientes panelConsultaClientes = new PanelConsultaClientes(this);
        panelConsultaClientes.setSize(800,640);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panelConsultaClientes,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,880,640));
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();        
    }
    
    public void MostrarPanelPromociones() {
        PanelPromocion panelPromocion = new PanelPromocion(this);
        panelPromocion.setSize (880, 640);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panelPromocion,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,880,640));
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint(); 
    }
    
    public void MostrarPanelRegistraPromocion() {
        PanelRegistraPromocion panelRegistraPromocion = new PanelRegistraPromocion(this);
        panelRegistraPromocion.setSize (880, 640);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panelRegistraPromocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,880,640));
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint(); 
    }
    
    public void MostrarPanelRegistrarPedido() {
        PanelPedido panelPedido = new PanelPedido(this);
        panelPedido.setSize(880, 640);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panelPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,880,640));
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }
    
    public void MostrarPanelHistorialCliente() {
        PanelHistorialCliente panelHistorialCliente = new PanelHistorialCliente(this);
        panelHistorialCliente.setSize(880, 640);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panelHistorialCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,880,640));
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint(); 
    }
    
    public void MostrarPanelUsuarios() {
        PanelUsuarios panelUsuarios = new PanelUsuarios(this);
        panelUsuarios.setSize(880, 640);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panelUsuarios,  new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,880,640));
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
    private javax.swing.JButton BtnUsuarios;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelUsuario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}