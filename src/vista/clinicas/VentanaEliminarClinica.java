/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.clinicas;

import controlador.Coordinador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.vo.ClinicaVO;
import modelo.vo.EstadoVO;
import modelo.vo.MaterialVO;
import modelo.vo.MunicipioVO;
import modelo.vo.PacienteVO;
import static vista.paciente.VentanaCambiarEstadoPaciente.objectToInt;

/**
 *
 * @author jose-
 */
public class VentanaEliminarClinica extends javax.swing.JFrame {

    private Coordinador miCoordinador;
    private DefaultTableModel modelo;
    /**
     * Creates new form VentanaEliminarClinica
     */
    public VentanaEliminarClinica() {
        initComponents();
        cargarTabla();
        limpiar();
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
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClinicas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        cbMunicipio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        tablaClinicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CLINICA SANATRIX", "CHACAO"},
                {"CLINICA METROPOLITANA", "BARUTA"},
                {"CLINICA EL AVILA", "CHACAO"},
                {"CLINICA NUEVA CARACAS", "LIBERTADOR"},
                {"CLINICA MENDEZ GIMON", "LIBERTADOR"},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Clinica Afiliada", "Lugar de Ubicacion"
            }
        ));
        jScrollPane1.setViewportView(tablaClinicas);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("MENU - ELIMINAR CLINICA AFILIADA");

        btnEliminar.setText("ELIMINAR CLINICA AFILIADA");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        cbMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new MunicipioVO[] { MunicipioVO.BARUTA, MunicipioVO.CHACAO, MunicipioVO.HATILLO, MunicipioVO.LIBERTADOR, MunicipioVO.SUCRE }));
        cbMunicipio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMunicipioActionPerformed(evt);
            }
        });
        cbMunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbMunicipioKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegresar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(btnEliminar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2)))
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 420, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/FondoClinicas.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.miCoordinador.mostrarVentanaGestionClinica();
        limpiar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila, columna;
        fila=tablaClinicas.getSelectedRow();
        columna=tablaClinicas.getSelectedColumn();
        System.out.print(fila+"-"+columna);
        if((fila>=0) || (columna>=0))     
            modificarColumnaMayor(columna,fila);
        else
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA CLINICA EN LA TABLA", "ERROR", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void modificarColumnaMayor(int columna, int fila){
       
        ClinicaVO clinicaEli=new ClinicaVO();
        clinicaEli=miCoordinador.buscarClinica(modelo.getValueAt(fila,0).toString(), modelo.getValueAt(fila,1).toString());
        String resp=miCoordinador.EliminarClinica(clinicaEli);
	String item = cbMunicipio.getSelectedItem().toString();
        ArrayList<String> aux=miCoordinador.devolverClinicas(item);				
	if(resp.equals("ok")){
            llenarTabla(item,aux);
            JOptionPane.showMessageDialog(null, "CLINICA ELIMINADA EXISOTAMENTE");  
	}else{
            System.out.println(resp);
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
	}
    }
    
    
    private void cbMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMunicipioActionPerformed
        try{
            String item = cbMunicipio.getSelectedItem().toString();
            ArrayList<String> aux=miCoordinador.devolverClinicas(item);
            if(aux.size()<1){
                JOptionPane.showMessageDialog(null, "ESTE MUNICIPIO NO POSEE CLINICAS AFILIADAS", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else{
               llenarTabla(item,aux);
            } 
        }catch(NullPointerException e){
               
        }
    }//GEN-LAST:event_cbMunicipioActionPerformed

    private void cbMunicipioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbMunicipioKeyReleased
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_cbMunicipioKeyReleased

    public void llenarTabla(String item,ArrayList<String> aux){
        btnEliminar.setEnabled(true);
               modelo.setRowCount(0);
                int contador=0;
                for(String c:aux){
                    modelo.insertRow(contador, new Object[]{});
                    modelo.setValueAt(c, contador, 0);
                    modelo.setValueAt(item, contador, 1); 
                } 
    }

    public void cargarTabla(){
        String datos[][]={};
        String columna[]={"Clinica Afiliada","Municipio"};
        modelo=new DefaultTableModel(datos,columna){
            public boolean isCellEditable(int rowIndex, int columnIndex){return false;}
        };
        tablaClinicas.setModel(modelo);
    }
    
    public void vaciarTabla(){
        ArrayList<PacienteVO> listaPacientes=miCoordinador.getListaPacientes();
        modelo.setRowCount(0);
        int contador=modelo.getRowCount();
        for(int i = contador; i >0; i--){
            modelo.removeRow(i);
        }
    }
    
    public void limpiar(){
        try{
            vaciarTabla();
            btnEliminar.setEnabled(false);
            cbMunicipio.setSelectedIndex(-1);
            
        }catch(NullPointerException e){
            cbMunicipio.setSelectedIndex(-1);
        }
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<MunicipioVO> cbMunicipio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClinicas;
    // End of variables declaration//GEN-END:variables
}
