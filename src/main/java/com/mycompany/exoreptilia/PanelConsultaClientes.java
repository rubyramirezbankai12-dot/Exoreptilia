package com.mycompany.exoreptilia;

//import java.awt.List;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/*
 * @author diana
 */
public class PanelConsultaClientes extends javax.swing.JPanel {
    FuncionesBD FBD = new FuncionesBD();
    
    public PanelConsultaClientes() {
        initComponents();
        
        this.MostrarListaClientes();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbClientes = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setText("Registra o Actualiza Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 180, 20));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel3.setText("Teléfono");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel4.setText("Dirección");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel5.setText("Correo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jLabel6.setText("Tipo Cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel7.setText("Puntos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 200, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 250, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 200, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 250, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frecuente", "Confiable", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 190, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 80, -1));

        BtnGuardar.setText("Guardar");
        jPanel1.add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 130, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 230));

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

    public void MostrarListaClientes(){
        List<String[]> lista = FBD.obtenerClientes(1);
        
        String[] columnas = {"Nombre", "Teléfono", "Dirección", "Correo", "Puntos"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        
        for (String[] cliente : lista) {
            modelo.addRow(cliente);
        }
        
        TbClientes.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JTable TbClientes;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
