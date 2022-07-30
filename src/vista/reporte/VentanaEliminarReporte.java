/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.reporte;

import controlador.Coordinador;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.dao.PacienteDAO;
import modelo.vo.PacienteVO;
import modelo.vo.ReporteVO;
import static vista.paciente.VentanaConsultarHistorial.objectToInt;


/**
 *
 * @author jose-
 */
public class VentanaEliminarReporte extends javax.swing.JFrame {

    private Coordinador miCoordinador;
    private DefaultTableModel modelo;
    /**
     * Creates new form VentanaEliminarReporte
     */
    public VentanaEliminarReporte() {
        initComponents();
        cargarTabla();
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
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReportes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(430, 390));

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("MENU - ELIMINAR REPORTES ");

        btnEliminar.setText("ELIMINAR REPORTE");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("INTRODUZCA ID DEL AFILIADO");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        tablaReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "20/10/2020"},
                {"2", "05/05/2021"},
                {"3", "13/08/2021"},
                {"4", "10/04/2022"},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Numero del reporte", "Fecha de Creacion"
            }
        ));
        jScrollPane1.setViewportView(tablaReportes);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("REPORTES DEL AFILIADO");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblNombre.setText("'");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(139, 139, 139))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(61, 61, 61)
                        .addComponent(btnEliminar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addGap(15, 15, 15))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 430, 390));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/fondoEmergencia.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.miCoordinador.mostrarVentanaGestionReporte();
        limpiar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        PacienteVO pacienteMod=new PacienteVO();
        PacienteDAO Pacientedao = new PacienteDAO();
       pacienteMod=miCoordinador.buscarPaciente(Integer.parseInt(txtID.getText()));
       if(pacienteMod!=null){  
            llenarTabla(Integer.parseInt(txtID.getText()));
       }else{
           JOptionPane.showMessageDialog(null, "ESTE PACIENTE NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
       }
       
         try {
            pacienteMod = Pacientedao.LabeltxtPaciente(Integer.parseInt(txtID.getText()));
            lblNombre.setText(pacienteMod.getNombre() + " " + pacienteMod.getApellido());
        } catch (SQLException ex) {
            Logger.getLogger(VentanaConsultarReporte.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila, columna;
        try{
        fila=tablaReportes.getSelectedRow();
        columna=tablaReportes.getSelectedColumn();
        //System.out.print(fila+"-"+columna);
        if((fila>=0) || (columna>=0))     
            modificarColumnaMayor(columna,fila);
        else
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA EMERGENCIA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null, "ID INVALIDO CARAJO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDKeyTyped

    public void modificarColumnaMayor(int columna, int fila){
       
        ReporteVO reporte=new ReporteVO();
        reporte=miCoordinador.buscarReporte(Integer.parseInt(txtID.getText()), objectToInt(modelo.getValueAt(fila, 0)));
        
        String resp=miCoordinador.eliminarReporte(reporte);
        //miCoordinador.mostrarTextoConsultarClinica(reporte.getDescripcion());
        if(resp.equals("ok")){
            cargarTabla();
            JOptionPane.showMessageDialog(null, "REPORTE ELIMINADO EXISOTAMENTE");  
	}else{
            System.out.println(resp);
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
	}
					

    }
    
    public void llenarTabla(int id){
        ArrayList<ReporteVO> listaReportes=miCoordinador.getListaReportes(id);
        modelo.setRowCount(0);
        int contador=0;
        if(listaReportes.size()>0){
            for(ReporteVO r:listaReportes){
                modelo.insertRow(contador, new Object[]{});
        
                modelo.setValueAt(r.getIdReporte(), contador, 0);
                modelo.setValueAt(r.getFechaRegistro().getDia()+"-"+r.getFechaRegistro().getMes()+"-"+r.getFechaRegistro().getAn(), contador, 1);
                modelo.setValueAt(r.getMunicipio().name(), contador, 2);
                modelo.setValueAt(r.getClinica(), contador, 3);

            }
        }else{
            JOptionPane.showMessageDialog(null, "ESTE PACIENTE NO TIENE EMERGENCIAS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
    public void cargarTabla(){
        String datos[][]={};
        String columna[]={"ID Reporte","Fecha","Municipio","Clinica"};
        modelo=new DefaultTableModel(datos,columna){
            public boolean isCellEditable(int rowIndex, int columnIndex){return false;}
        };
        tablaReportes.setModel(modelo);
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
        txtID.setText("");
        lblNombre.setText("");
        vaciarTabla();
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tablaReportes;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
