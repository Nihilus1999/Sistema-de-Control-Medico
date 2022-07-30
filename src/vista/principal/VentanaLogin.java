/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.principal;

import controlador.Coordinador;
import javax.swing.JOptionPane;
import modelo.vo.UsuarioVO;

/**
 *
 * @author victo
 */
public class VentanaLogin extends javax.swing.JFrame{

    private Coordinador miCoordinador;

   
    public VentanaLogin() {
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initComponents();
    }

    public void setCoordinador(Coordinador miCoordinador) {
           this.miCoordinador=miCoordinador;
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        btnInicio = new javax.swing.JButton();
        iconoUsuario = new javax.swing.JLabel();
        logoPassword = new javax.swing.JLabel();
        logoLogin = new javax.swing.JLabel();
        fondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA MEDICO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 250, -1));
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 250, -1));

        btnInicio.setText("INICIAR SESIÓN");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        iconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoUsuario.png"))); // NOI18N
        getContentPane().add(iconoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        logoPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPassword.png"))); // NOI18N
        getContentPane().add(logoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        logoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoLogin.png"))); // NOI18N
        getContentPane().add(logoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        fondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoLogin.jpeg"))); // NOI18N
        getContentPane().add(fondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        
        //miCoordinador.mostrarVentanaMenuPrincipal();
        UsuarioVO aux=miCoordinador.verificarUsuario(txtUsuario.getText(),txtClave.getText());
        if(aux!=null){
        
            if(aux.getCargo().equals("Administrador")){
                miCoordinador.mostrarVentanaMenuPrincipal();
            }else{
                if(aux.getCargo().equals("Medico")){
            //////////////////////////
                }else{
                JOptionPane.showMessageDialog(null,"DATOS INCORRECTOS");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Datos Incorrectos!",
               "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnInicioActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel fondoLogin;
    private javax.swing.JLabel iconoUsuario;
    private javax.swing.JLabel logoLogin;
    private javax.swing.JLabel logoPassword;
    public javax.swing.JTextField txtClave;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

   
}
