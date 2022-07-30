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
public class VentanaGestionPaciente extends javax.swing.JFrame {

    private Coordinador miCoordinador;

    /**
     * Creates new form VentanaGestionPaciente
     */
    public VentanaGestionPaciente() {
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
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        btnModificarEstado = new javax.swing.JButton();
        btnAgregarHistorial = new javax.swing.JButton();
        btnConsultarHistorial = new javax.swing.JButton();
        fondoPaciente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTIÓN DE PACIENTE");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        btnAgregar.setText("AGREGAR PACIENTE NUEVO");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR PACIENTE AFILIADO");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        titulo.setBackground(new java.awt.Color(0, 0, 0));
        titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo.setText(" MENU - GESTION DE DATOS");
        titulo.setFocusTraversalPolicyProvider(true);

        titulo2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo2.setText("DEL PACIENTE");

        btnModificarEstado.setText("MODIFICAR ESTADO DEL PACIENTE");
        btnModificarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEstadoActionPerformed(evt);
            }
        });

        btnAgregarHistorial.setText("AGREGAR HISTORIAL DEL PACIENTE");

        btnConsultarHistorial.setText("CONSULTAR HISTORIAL DEL PACIENTE");
        btnConsultarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(titulo2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificarEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregarHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConsultarHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo2)
                .addGap(45, 45, 45)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnModificarEstado)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarHistorial)
                .addGap(18, 18, 18)
                .addComponent(btnConsultarHistorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 330, 400));

        fondoPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPaciente.jpg"))); // NOI18N
        getContentPane().add(fondoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.miCoordinador.mostrarVentanaMenuPrincipal();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        miCoordinador.mostrarVentanaAgregarPaciente();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       this.miCoordinador.mostrarVentanaModificarPaciente();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnModificarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEstadoActionPerformed
        this.miCoordinador.mostrarVentanaCambiarEstadoPaciente();
    }//GEN-LAST:event_btnModificarEstadoActionPerformed

    private void btnConsultarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarHistorialActionPerformed
        this.miCoordinador.mostrarVentanaConsultarHistorial();
    }//GEN-LAST:event_btnConsultarHistorialActionPerformed

    

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarHistorial;
    private javax.swing.JButton btnConsultarHistorial;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarEstado;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel fondoPaciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
