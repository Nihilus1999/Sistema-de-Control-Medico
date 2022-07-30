/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.paciente;

import controlador.Coordinador;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import modelo.vo.EstadoVO;
import modelo.vo.FechaVO;
import modelo.vo.GeneroVO;
import modelo.vo.MunicipioVO;
import modelo.vo.PacienteVO;
import modelo.vo.TipoSangreVO;

/**
 *
 * @author victo
 */
public class VentanaAgregarPaciente extends javax.swing.JFrame{

    private Coordinador miCoordinador;

    /**
     * Creates new form VentanaAgregarPaciente
     */
    public VentanaAgregarPaciente() {
        initComponents();
        btnGuardar.setEnabled(false);
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador=miCoordinador;
    }
    
    public boolean validarFechaNacimiento(){
        int diaFN, mesFN, yearFN;
        
        diaFN = Integer.parseInt(txtFNdia.getText());
        mesFN = Integer.parseInt(txtFNmes.getText());
        yearFN = Integer.parseInt(txtFNan.getText());
        
        
        if(yearFN > 1930 && yearFN <= 2022){
            if(mesFN == 1){
               if((diaFN > 0 && diaFN < 32)){
                   return true;
               } else{
                   return false;
               }
            }
            else if(mesFN == 2){
                if(diaFN > 0 && diaFN < 30){
                   return true;
               } else{
                   return false;
               }
            }
            else if(mesFN == 3){
               if((diaFN > 0 && diaFN < 32)){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFN == 4){
               if(diaFN > 0 && diaFN < 31){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFN == 5){
               if(diaFN > 0 && diaFN < 32){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFN == 6){
               if(diaFN > 0 && diaFN < 31){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFN == 7){
               if(diaFN > 0 && diaFN < 32){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFN == 8){
               if(diaFN > 0 && diaFN < 32){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFN == 9){
               if(diaFN > 0 && diaFN < 31){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFN == 10){
               if(diaFN > 0 && diaFN < 32){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFN == 11){
               if(diaFN > 0 && diaFN < 31){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFN == 12){
               if(diaFN > 0 && diaFN < 32){
                   return true;
               } else{
                   return false;
               } 
            }
            else{
              return false;  
            }
            
        } 
        else{
           return false;
        }
        
    }
    
    public boolean validarFechaRegistro(){
        int diaFR, mesFR, yearFR;
        
        
        diaFR = Integer.parseInt(txtFRdia.getText());
        mesFR = Integer.parseInt(txtFRmes.getText());
        yearFR = Integer.parseInt(txtFRan.getText());
        
        if(yearFR > 1930 && yearFR <= 2022){
            if(mesFR == 1){
               if((diaFR > 0 && diaFR < 32)){
                   return true;
               } else{
                   return false;
               }
            }
            else if(mesFR == 2){
                if(diaFR> 0 && diaFR < 30){
                   return true;
               } else{
                   return false;
               }
            }
            else if(mesFR == 3){
               if((diaFR > 0 && diaFR < 32)){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFR == 4){
               if(diaFR > 0 && diaFR < 31){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFR == 5){
               if(diaFR > 0 && diaFR < 32){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFR == 6){
               if(diaFR> 0 && diaFR < 31){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFR == 7){
               if(diaFR > 0 && diaFR < 32){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFR == 8){
               if(diaFR > 0 && diaFR < 32){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFR == 9){
               if(diaFR> 0 && diaFR < 31){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFR == 10){
               if(diaFR > 0 && diaFR < 32){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFR == 11){
               if(diaFR > 0 && diaFR < 31){
                   return true;
               } else{
                   return false;
               } 
            }
            else if(mesFR == 12){
               if(diaFR > 0 && diaFR< 32){
                   return true;
               } else{
                   return false;
               } 
            }
            else{
              return false;  
            }
            
        } 
        else{
           return false;
        }
        
    }
    
    public boolean validarCorreo(String correo) {
        Pattern patron = Pattern.compile("([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+");
        Matcher comparador = patron.matcher(correo);
        return comparador.find();
    }
    
    public void habilitarBoton(){
        if(!txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() && 
               !txtCedula.getText().isEmpty() && !txtTelefono.getText().isEmpty() && 
               !txtCorreo.getText().isEmpty() && !txtFNdia.getText().isEmpty() &&
               !txtFNmes.getText().isEmpty() && !txtFNan.getText().isEmpty() &&
               !txtFRdia.getText().isEmpty() && !txtFRmes.getText().isEmpty() &&
               !txtFRan.getText().isEmpty()){
                
                btnGuardar.setEnabled(true);
            
        }else{
          btnGuardar.setEnabled(false);
        }
    }
    
    public void limpiar(){
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtFNdia.setText("");
        txtFNmes.setText("");
        txtFNan.setText("");
        txtFRdia.setText("");
        txtFRmes.setText("");
        txtFRan.setText("");
        cbTipoSangre.setSelectedIndex(-1);
        cbGenero.setSelectedIndex(-1);
        cbMunicipio.setSelectedIndex(-1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        cbGenero = new javax.swing.JComboBox<>();
        txtFNdia = new javax.swing.JTextField();
        txtFNmes = new javax.swing.JTextField();
        txtFNan = new javax.swing.JTextField();
        lblFechaNac = new javax.swing.JLabel();
        cbTipoSangre = new javax.swing.JComboBox<>();
        txtTelefono = new javax.swing.JTextField();
        lblCedula1 = new javax.swing.JLabel();
        lblFechaNac1 = new javax.swing.JLabel();
        lblFechaNac2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        cbMunicipio = new javax.swing.JComboBox<>();
        txtCorreo = new javax.swing.JTextField();
        lblFechaNac3 = new javax.swing.JLabel();
        lblFechaNac4 = new javax.swing.JLabel();
        txtFRdia = new javax.swing.JTextField();
        txtFRan = new javax.swing.JTextField();
        txtFRmes = new javax.swing.JTextField();
        lblFechaNac5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fondoAgregarPaciente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setText("Nombres");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        lblApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblApellido.setText("Apellidos");

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        lblGenero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblGenero.setText("Genero");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new GeneroVO[] { GeneroVO.MASCULINO, GeneroVO.FEMENINO }));

        txtFNdia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFNdiaKeyTyped(evt);
            }
        });

        txtFNmes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFNmesKeyTyped(evt);
            }
        });

        txtFNan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFNanKeyTyped(evt);
            }
        });

        lblFechaNac.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFechaNac.setText("Fecha Nacimineto");

        cbTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "A-", "B", "B-", "O", "O-", "AB", "AB-" }));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        lblCedula1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCedula1.setText("Cédula");

        lblFechaNac1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFechaNac1.setText("Teléfono");

        lblFechaNac2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFechaNac2.setText("Tipo de Sangre");

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        lblNombre1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre1.setText("Identificador");

        cbMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new MunicipioVO[] { MunicipioVO.BARUTA, MunicipioVO.CHACAO, MunicipioVO.HATILLO, MunicipioVO.LIBERTADOR, MunicipioVO.SUCRE }));
        cbMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMunicipioActionPerformed(evt);
            }
        });

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        lblFechaNac3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFechaNac3.setText("Municipio");

        lblFechaNac4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFechaNac4.setText("Correo");

        txtFRdia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFRdiaKeyTyped(evt);
            }
        });

        txtFRan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFRanKeyTyped(evt);
            }
        });

        txtFRmes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFRmesKeyTyped(evt);
            }
        });

        lblFechaNac5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFechaNac5.setText("Fecha Registro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaNac2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblFechaNac3)
                                        .addComponent(lblFechaNac1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblFechaNac4))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaNac))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblApellido))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaNac5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblNombre1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtFRdia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFRmes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFRan, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMunicipio, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbTipoSangre, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCedula)
                            .addComponent(cbGenero, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFNdia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFNmes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFNan, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGenero))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFNdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFNmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFNan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaNac))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaNac2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaNac1))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaNac3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaNac4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFRdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFRmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFRan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaNac5))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 350, 470));

        btnGuardar.setText("GUARDAR PACIENTE");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 650, 160, -1));

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 650, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("AGREGAR DATOS DEL PACIENTE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        fondoAgregarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAgregarPaciente.png"))); // NOI18N
        getContentPane().add(fondoAgregarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{

            PacienteVO nuevoPaciente=new PacienteVO();
            FechaVO fechaNac=new FechaVO();
            fechaNac.setDia(Integer.parseInt(txtFNdia.getText()));
            fechaNac.setMes(Integer.parseInt(txtFNmes.getText()));
            fechaNac.setAn(Integer.parseInt(txtFNan.getText()));

            FechaVO fechaReg=new FechaVO();
            fechaReg.setDia(Integer.parseInt(txtFRdia.getText()));
            fechaReg.setMes(Integer.parseInt(txtFRmes.getText()));
            fechaReg.setAn(Integer.parseInt(txtFRan.getText()));

            TipoSangreVO tipoSangre;
            tipoSangre=nuevoPaciente.obtenerTipo((String) cbTipoSangre.getSelectedItem());

            nuevoPaciente.setNombre(txtNombre.getText());
            nuevoPaciente.setApellido(txtApellido.getText());
            nuevoPaciente.setCedula(txtCedula.getText());
            nuevoPaciente.setGenero((GeneroVO) cbGenero.getSelectedItem());
            nuevoPaciente.setFechaNacimiento(fechaNac);
            nuevoPaciente.setTipoSangre(tipoSangre);
            nuevoPaciente.setNumeroTelefono(txtTelefono.getText());
            nuevoPaciente.setMunicipio((MunicipioVO) cbMunicipio.getSelectedItem());
            nuevoPaciente.setFechaRegistro(fechaReg);
            nuevoPaciente.setId(Integer.parseInt(txtId.getText()));
            nuevoPaciente.setEstado(EstadoVO.ACTIVO);
            nuevoPaciente.setCorreo(txtCorreo.getText());
            PacienteVO aux=miCoordinador.buscarPaciente3(txtCedula.getText());
            if(aux==null){
                String resp=miCoordinador.RegistrarPaciente(nuevoPaciente);
                if ((resp.equals("ok") && (validarFechaNacimiento()==true) && (validarFechaRegistro()==true) && (validarCorreo(txtCorreo.getText())==true))){
               
                    JOptionPane.showMessageDialog(null, "PACIENTE AGREGADO EXISOTAMENTE");
                    miCoordinador.mostrarVentanaGestionPaciente();
                    //limpiarTXT();
                
                }else if((validarFechaNacimiento() == false) || (validarFechaRegistro() == false)){
                
                    JOptionPane.showMessageDialog(null, "FECHA INVALIDA","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                
                }else if(validarCorreo(txtCorreo.getText())==false){
                
                    JOptionPane.showMessageDialog(null, "CORREO INVALIDO","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                
                }
                else{
                
                    JOptionPane.showMessageDialog(null, "NO SE PUDO REGISTRAR","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "ESA CEDULA YA EXISTE","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS","ERROR",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        miCoordinador.mostrarVentanaGestionPaciente();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if ((evt.getKeyChar() < 65 || evt.getKeyChar() > 90) && (evt.getKeyChar() < 97 || evt.getKeyChar() > 165)){
            evt.consume();
        }
        habilitarBoton();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57){
            evt.consume();
        }
        habilitarBoton();
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
       if ((evt.getKeyChar() < 65 || evt.getKeyChar() > 90) && (evt.getKeyChar() < 97 || evt.getKeyChar() > 165)){
            evt.consume();
        }
       habilitarBoton();
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57){
            evt.consume();
        }
        habilitarBoton();
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtFNdiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFNdiaKeyTyped
        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57){
            evt.consume();
        }
        habilitarBoton();
    }//GEN-LAST:event_txtFNdiaKeyTyped

    private void txtFNmesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFNmesKeyTyped
        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57){
            evt.consume();
        }
        habilitarBoton();
    }//GEN-LAST:event_txtFNmesKeyTyped

    private void txtFNanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFNanKeyTyped
        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57){
            evt.consume();
        }
        habilitarBoton();
    }//GEN-LAST:event_txtFNanKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57){
            evt.consume();
        }
        habilitarBoton();
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        
        habilitarBoton();
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtFRdiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFRdiaKeyTyped
        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57){
            evt.consume();
        }
        habilitarBoton();
    }//GEN-LAST:event_txtFRdiaKeyTyped

    private void txtFRmesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFRmesKeyTyped
        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57){
            evt.consume();
        }
        habilitarBoton();
    }//GEN-LAST:event_txtFRmesKeyTyped

    private void txtFRanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFRanKeyTyped
        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57){
            evt.consume();
        }
        habilitarBoton();
    }//GEN-LAST:event_txtFRanKeyTyped

    private void cbMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMunicipioActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<GeneroVO> cbGenero;
    private javax.swing.JComboBox<MunicipioVO> cbMunicipio;
    private javax.swing.JComboBox<String> cbTipoSangre;
    private javax.swing.JLabel fondoAgregarPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula1;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblFechaNac1;
    private javax.swing.JLabel lblFechaNac2;
    private javax.swing.JLabel lblFechaNac3;
    private javax.swing.JLabel lblFechaNac4;
    private javax.swing.JLabel lblFechaNac5;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtFNan;
    private javax.swing.JTextField txtFNdia;
    private javax.swing.JTextField txtFNmes;
    private javax.swing.JTextField txtFRan;
    private javax.swing.JTextField txtFRdia;
    private javax.swing.JTextField txtFRmes;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    
}
