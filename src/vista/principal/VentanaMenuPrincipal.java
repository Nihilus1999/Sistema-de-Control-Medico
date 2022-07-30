/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.principal;

import controlador.Coordinador;

/**
 *
 * @author victo
 */
public class VentanaMenuPrincipal extends javax.swing.JFrame {

    private Coordinador miCoordinador;

    /**
     * Creates new form VentanaMenuPrincipal
     */
    public VentanaMenuPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGestionPaciente = new javax.swing.JButton();
        bntGestionInventario = new javax.swing.JButton();
        bntGestionClinicas = new javax.swing.JButton();
        bntGestionReporte = new javax.swing.JButton();
        bntCerrarSesion = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CONTROL MEDICO - MENU PRINCIPAL");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGestionPaciente.setText("GESTIÓN DE PACIENTE");
        btnGestionPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnGestionPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 270, -1));

        bntGestionInventario.setText("GESTIÓN DE INVENTARIO");
        bntGestionInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGestionInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(bntGestionInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 270, -1));

        bntGestionClinicas.setText("GESTIÓN DE CLINICAS");
        bntGestionClinicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGestionClinicasActionPerformed(evt);
            }
        });
        getContentPane().add(bntGestionClinicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 270, -1));

        bntGestionReporte.setText("GESTIÓN DE REPORTE");
        bntGestionReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGestionReporteActionPerformed(evt);
            }
        });
        getContentPane().add(bntGestionReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 270, -1));

        bntCerrarSesion.setText("CERRAR SESIÓN");
        bntCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(bntCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 140, -1));

        titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titulo.setText("MENU PRINCIPAL");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMenu.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionPacienteActionPerformed
        this.miCoordinador.mostrarVentanaGestionPaciente();
    }//GEN-LAST:event_btnGestionPacienteActionPerformed

    private void bntGestionInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGestionInventarioActionPerformed
        this.miCoordinador.mostrarVentanaGestionInventario();
    }//GEN-LAST:event_bntGestionInventarioActionPerformed

    private void bntGestionClinicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGestionClinicasActionPerformed
        this.miCoordinador.mostrarVentanaGestionClinica();
    }//GEN-LAST:event_bntGestionClinicasActionPerformed

    private void bntGestionReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGestionReporteActionPerformed
        this.miCoordinador.mostrarVentanaGestionReporte();
    }//GEN-LAST:event_bntGestionReporteActionPerformed

    private void bntCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCerrarSesionActionPerformed
        this.miCoordinador.mostrarVentanaLogin();
    }//GEN-LAST:event_bntCerrarSesionActionPerformed
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bntCerrarSesion;
    private javax.swing.JButton bntGestionClinicas;
    private javax.swing.JButton bntGestionInventario;
    private javax.swing.JButton bntGestionReporte;
    private javax.swing.JButton btnGestionPaciente;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador=miCoordinador;
    }
}
