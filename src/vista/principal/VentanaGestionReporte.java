/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.principal;

import controlador.Coordinador;
import modelo.vo.MunicipioVO;

/**
 *
 * @author victo
 */
public class VentanaGestionReporte extends javax.swing.JFrame {

    private Coordinador miCoordinador;

    /**
     * Creates new form VentanaGestionReporte
     */
    public VentanaGestionReporte() {
        initComponents();
    }
    
    public void setCoordinador(Coordinador miCoordinador) {
           this.miCoordinador=miCoordinador;
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnRegistrarReporte = new javax.swing.JButton();
        btnConsultarReporte = new javax.swing.JButton();
        btnEliminarReporte = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTIÓN DE REPORTAR EMERGENCIA");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("MENU - GESTION REPORTE");

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnRegistrarReporte.setText("REGISTRAR REPORTE");
        btnRegistrarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarReporteActionPerformed(evt);
            }
        });

        btnConsultarReporte.setText("CONSULTAR REPORTE");
        btnConsultarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarReporteActionPerformed(evt);
            }
        });

        btnEliminarReporte.setText("ELIMINAR REPORTE");
        btnEliminarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrarReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConsultarReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(60, 60, 60)
                .addComponent(btnRegistrarReporte)
                .addGap(18, 18, 18)
                .addComponent(btnConsultarReporte)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 440, 330));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoReporteEmergencia.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.miCoordinador.mostrarVentanaMenuPrincipal();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarReporteActionPerformed
        this.miCoordinador.mostrarVentanaEliminarReporte();
    }//GEN-LAST:event_btnEliminarReporteActionPerformed

    private void btnConsultarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarReporteActionPerformed
        this.miCoordinador.mostrarVentanaConsultarReporte();
    }//GEN-LAST:event_btnConsultarReporteActionPerformed

    private void btnRegistrarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarReporteActionPerformed
        this.miCoordinador.mostrarVentanaRegistrarEmergencia();
    }//GEN-LAST:event_btnRegistrarReporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarReporte;
    private javax.swing.JButton btnEliminarReporte;
    private javax.swing.JButton btnRegistrarReporte;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


}
