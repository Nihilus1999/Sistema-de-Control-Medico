/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.Otros.TextPrompt;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.dao.AmbulanciaDAO;
import modelo.dao.ClinicaDAO;
import modelo.dao.MaterialDAO;
import modelo.dao.PacienteDAO;
import modelo.dao.ReporteDAO;
import modelo.dao.UsuarioDAO;
import modelo.operaciones.Procesos;
import modelo.vo.AmbulanciaVO;
import modelo.vo.ClinicaVO;
import modelo.vo.MaterialVO;
import modelo.vo.PacienteVO;
import modelo.vo.ReporteVO;
import modelo.vo.UsuarioVO;
import vista.clinicas.VentanaAgregarClinica;
import vista.clinicas.VentanaEliminarClinica;
import vista.paciente.TextoConsultarClinica;
import vista.paciente.VentanaAgregarPaciente;
import vista.paciente.VentanaCambiarEstadoPaciente;
import vista.paciente.VentanaConsultarHistorial;
import vista.paciente.VentanaModificarPaciente;
import vista.principal.VentanaGestionClinica;
import vista.principal.VentanaGestionInventario;
import vista.principal.VentanaGestionPaciente;
import vista.principal.VentanaGestionReporte;
import vista.principal.VentanaGestionRuta;
import vista.principal.VentanaLogin;
import vista.principal.VentanaMenuPrincipal;
import vista.reporte.TextoConsultarReporte;
import vista.reporte.VentanaConsultarReporte;
import vista.reporte.VentanaEliminarReporte;
import vista.reporte.VentanaRegistrarEmergencia;

/**
 *
 * @author victo
 */
public class Coordinador {

    private VentanaLogin ventanaLogin;
    private VentanaMenuPrincipal ventanaMenuPrincipal;
    private VentanaGestionPaciente ventanaGestionPaciente;
    private VentanaGestionInventario ventanaGestionInventario;
    private VentanaGestionRuta ventanaGestionRuta;
    private VentanaRegistrarEmergencia ventanaRegistrarEmergencia;
    private VentanaGestionReporte    ventanaGestionReporte;
    private UsuarioDAO miUsuarioDAO;
    private VentanaAgregarPaciente ventanaAgregarPaciente;
    private PacienteDAO miPacienteDAO;
    private Procesos misProcesos;
    private VentanaModificarPaciente ventanaModificarPaciente;
    private VentanaCambiarEstadoPaciente ventanaCambiarEstadoPaciente;
    private MaterialDAO miMaterialDAO;
    private AmbulanciaDAO miAmbulanciaDAO;
    private VentanaConsultarReporte ventanaConsultarReporte;
    private VentanaEliminarReporte ventanaEliminarReporte;
    private ClinicaDAO miClinicaDAO;
    private ReporteDAO miReporteDAO;
    private VentanaGestionClinica ventanaGestionClinica;
    private VentanaAgregarClinica ventanaAgregarClinica;
    private VentanaEliminarClinica ventanaEliminarClinica;
    private VentanaConsultarHistorial ventanaConsultarHistorial;
    private TextoConsultarClinica textoConsultarClinica;
    private TextoConsultarReporte textoConsultarReporte;
    
    

    //INSTANCIAS
    
    void setVentanaLogin(VentanaLogin ventanaLogin) {
        this.ventanaLogin=ventanaLogin;
    }

    void setVentanaMenuPrincipal(VentanaMenuPrincipal ventanaMenuPrincipal) {
       this.ventanaMenuPrincipal=ventanaMenuPrincipal;
    }
    
    void setVentanaGestionPaciente(VentanaGestionPaciente ventanaGestionPaciente) {
        this.ventanaGestionPaciente=ventanaGestionPaciente;
    }
    
    void setVentanaGestionInventario(VentanaGestionInventario ventanaGestionInventario) {
        this.ventanaGestionInventario=ventanaGestionInventario;
    }
    
    void setVentanaGestionRuta(VentanaGestionRuta ventanaGestionRuta) {
        this.ventanaGestionRuta=ventanaGestionRuta;
    }
    
    void setVentanaGestionReporte(VentanaGestionReporte ventanaGestionReporte) {
        this.ventanaGestionReporte=ventanaGestionReporte;
    }
    
    void setVentanaRegistrarEmergencia(VentanaRegistrarEmergencia ventanaRegistrarEmergencia) {
        this.ventanaRegistrarEmergencia=ventanaRegistrarEmergencia;
    }
    
    void setVentanaAgregarPaciente(VentanaAgregarPaciente ventanaAgregarPaciente) {
        this.ventanaAgregarPaciente=ventanaAgregarPaciente;
    }
    
    void setVentanaModificarPaciente(VentanaModificarPaciente ventanaModificarPaciente) {
        this.ventanaModificarPaciente=ventanaModificarPaciente;
    }
    
    void setVentanaCambiarEstadoPaciente(VentanaCambiarEstadoPaciente ventanaCambiarEstadoPaciente) {
        this.ventanaCambiarEstadoPaciente=ventanaCambiarEstadoPaciente;
    }
    
    void setVentanaConsultarReporte(VentanaConsultarReporte ventanaConsultarReporte){
        this.ventanaConsultarReporte=ventanaConsultarReporte;
    }
    
    void setVentanaEliminarReporte(VentanaEliminarReporte ventanaEliminarReporte) {
        this.ventanaEliminarReporte=ventanaEliminarReporte;
    }
    
    void setVentanaGestionClinica(VentanaGestionClinica ventanaGestionClinica){
        this.ventanaGestionClinica=ventanaGestionClinica;
    }
    
    void setVentanaAgregarClinica(VentanaAgregarClinica ventanaAgregarClinica) {
        this.ventanaAgregarClinica=ventanaAgregarClinica;
    }

    void setVentanaEliminarClinica(VentanaEliminarClinica ventanaEliminarClinica) {
        this.ventanaEliminarClinica=ventanaEliminarClinica;
    }
    
    void setVentanaConsultarHistorial(VentanaConsultarHistorial ventanaConsultarHistorial) {
        this.ventanaConsultarHistorial=ventanaConsultarHistorial;
    }
    
    void setProcesos(Procesos misProcesos) {
        this.misProcesos=misProcesos;
    }
    
    void setUsuarioDAO(UsuarioDAO miUsuarioDAO) {
        this.miUsuarioDAO=miUsuarioDAO;
    }
    
    void setPacienteDAO(PacienteDAO miPacienteDAO) {
        this.miPacienteDAO=miPacienteDAO;
    }
    
    void setMaterialDAO(MaterialDAO miMaterialDAO) {
        this.miMaterialDAO=miMaterialDAO;
    }

    void setAmbulanciaDAO(AmbulanciaDAO miAmbulanciaDAO) {
        this.miAmbulanciaDAO=miAmbulanciaDAO;
    }
    
    void setClinicaDAO(ClinicaDAO miClinicaDAO){
        this.miClinicaDAO=miClinicaDAO;
    }
    
    void setReporteDAO(ReporteDAO miReporteDAO){
        this.miReporteDAO=miReporteDAO;
    }
    
    void setTextoConsultarClinica(TextoConsultarClinica textoConsultarClinica) {
        this.textoConsultarClinica=textoConsultarClinica;
    }
    
    void setTextoConsultarReporte(TextoConsultarReporte textoConsultarReporte) {
        this.textoConsultarReporte=textoConsultarReporte;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //MOSTRAR VENTANAS//
    public void mostrarVentanaLogin() {
        //this.ventabaLogin.limpiar();
        this.ventanaLogin.setLocationRelativeTo(null);
        this.ventanaLogin.setResizable(false);
        TextPrompt usuario = new TextPrompt("Usuario",ventanaLogin.txtUsuario);
        TextPrompt clave = new TextPrompt("Clave",ventanaLogin.txtClave);
        this.ventanaLogin.setVisible(true);
        this.ventanaMenuPrincipal.setVisible(false);
    }
    
    public void mostrarVentanaMenuPrincipal() {
        this.ventanaMenuPrincipal.setLocationRelativeTo(null);
        this.ventanaMenuPrincipal.setVisible(true);
        this.ventanaLogin.setVisible(false);
        this.ventanaGestionPaciente.setVisible(false);
        this.ventanaGestionInventario.setVisible(false);
        this.ventanaGestionRuta.setVisible(false);
        this.ventanaRegistrarEmergencia.setVisible(false);
        this.ventanaGestionReporte.setVisible(false);
        this.ventanaGestionClinica.setVisible(false);
        /*ArrayList<PacienteVO> aux=getListaPacientes();
        for(PacienteVO p:aux){
            System.out.println(p.getNombre()+"-"+p.getApellido()+"-"+p.getCedula()+"-"+p.getId()+"-"+p.getGenero()+"-"+p.getMunicipio()+"-"+p.getFechaNacimiento());
        }*/
    }
    
    public void mostrarVentanaGestionPaciente(){
        this.ventanaGestionPaciente.setLocationRelativeTo(null);
        this.ventanaGestionPaciente.setResizable(false);
        this.ventanaGestionPaciente.setVisible(true);
        this.ventanaMenuPrincipal.setVisible(false);
        this.ventanaAgregarPaciente.setVisible(false);
        this.ventanaModificarPaciente.setVisible(false);
        this.ventanaAgregarPaciente.setVisible(false);
        this.ventanaCambiarEstadoPaciente.setVisible(false);
        this.ventanaConsultarHistorial.setVisible(false);
    }
    
    public void mostrarVentanaGestionInventario(){
        //LIMPIAR
        this.ventanaGestionInventario.cargarTabla();
        this.ventanaGestionInventario.setLocationRelativeTo(null);
        this.ventanaGestionInventario.setResizable(false);
        this.ventanaGestionInventario.setVisible(true);
        this.ventanaMenuPrincipal.setVisible(false);
    }
    
    public void mostrarVentanaGestionRuta(){
        this.ventanaGestionRuta.setLocationRelativeTo(null);
        this.ventanaGestionRuta.setResizable(false);
        this.ventanaGestionRuta.setVisible(true);
        this.ventanaMenuPrincipal.setVisible(false);
    }
    
    public void mostrarVentanaGestionReporte(){
        this.ventanaGestionReporte.setResizable(false);
        this.ventanaGestionReporte.setVisible(true);
        this.ventanaGestionReporte.setLocationRelativeTo(null);
        this.ventanaMenuPrincipal.setVisible(false);
        this.ventanaConsultarReporte.setVisible(false);
        this.ventanaEliminarReporte.setVisible(false);
        this.ventanaRegistrarEmergencia.setVisible(false);
    }
    
    public void mostrarVentanaRegistrarEmergencia(){
       // this.ventanaGestionReporte.limpiar();
        this.ventanaRegistrarEmergencia.setResizable(false);
        this.ventanaRegistrarEmergencia.setVisible(true);
        this.ventanaRegistrarEmergencia.setLocationRelativeTo(null);
        this.ventanaGestionReporte.setVisible(false);
    }
    
    public void mostrarVentanaEliminarReporte(){
        this.ventanaEliminarReporte.setResizable(false);
        this.ventanaEliminarReporte.setVisible(true);
        this.ventanaEliminarReporte.setLocationRelativeTo(null);
        this.ventanaGestionReporte.setVisible(false);
    }
    
    public void mostrarVentanaConsultarReporte(){
        this.ventanaConsultarReporte.setResizable(false);
        this.ventanaConsultarReporte.setVisible(true);
        this.ventanaConsultarReporte.setLocationRelativeTo(null);
        this.ventanaGestionReporte.setVisible(false);
    }
    
    public void mostrarVentanaAgregarPaciente() {
        //LIMPIAR
        this.ventanaAgregarPaciente.limpiar();
         this.ventanaAgregarPaciente.setResizable(false);
        this.ventanaAgregarPaciente.setLocationRelativeTo(null);
        this.ventanaGestionPaciente.setVisible(false);
        this.ventanaAgregarPaciente.setVisible(true);
        //PacienteVO aux=buscarPaciente("28308698");
        //System.out.print(aux.getNombre()+"-"+aux.getApellido()+"-"+aux.getMunicipio().name());
    }
    
    public void mostrarVentanaModificarPaciente(){
        //LIMPIAR LOS DOS TXT DE LOS FILTROS
        ventanaModificarPaciente.limpiar();
        ventanaModificarPaciente.llenarTabla();
        
        this.ventanaModificarPaciente.setResizable(false);
        this.ventanaModificarPaciente.setLocationRelativeTo(null);
        this.ventanaModificarPaciente.setVisible(true);
        this.ventanaGestionPaciente.setVisible(false);
    }
    
    public void mostrarVentanaCambiarEstadoPaciente(){
        //lIMPIAR FILTRO
        this.ventanaCambiarEstadoPaciente.limpiar();
        this.ventanaCambiarEstadoPaciente.llenarTabla();
        this.ventanaCambiarEstadoPaciente.setResizable(false);
        this.ventanaCambiarEstadoPaciente.setLocationRelativeTo(null);
        this.ventanaGestionPaciente.setVisible(false);
        this.ventanaCambiarEstadoPaciente.setVisible(true);
    }
    
    public void mostrarVentanaGestionClinica(){
        this.ventanaGestionClinica.setResizable(false);
        this.ventanaGestionClinica.setLocationRelativeTo(null);
        this.ventanaMenuPrincipal.setVisible(false);
        this.ventanaAgregarClinica.setVisible(false);
        this.ventanaEliminarClinica.setVisible(false);
        this.ventanaGestionClinica.setVisible(true);
    }
    
    public void mostrarVentanaAgregarClinica(){
        this.ventanaAgregarClinica.setResizable(false);
        this.ventanaAgregarClinica.setLocationRelativeTo(null);
        this.ventanaGestionClinica.setVisible(false);
        this.ventanaAgregarClinica.setVisible(true);
    }
    
    public void mostrarVentanaEliminarClinica(){
        this.ventanaEliminarClinica.setResizable(false);
        this.ventanaEliminarClinica.setLocationRelativeTo(null);
        this.ventanaGestionClinica.setVisible(false);
        this.ventanaEliminarClinica.setVisible(true);
    }
    
    public void mostrarVentanaConsultarHistorial(){
        this.ventanaConsultarHistorial.setResizable(false);
        this.ventanaConsultarHistorial.setLocationRelativeTo(null);
        this.ventanaGestionPaciente.setVisible(false);
        this.ventanaConsultarHistorial.setVisible(true);
    }
    
    public void mostrarTextoConsultarClinica(String desc){
        this.textoConsultarClinica.setResizable(false);
        this.textoConsultarClinica.setLocationRelativeTo(null);
        this.textoConsultarClinica.actualizarDescripcion(desc);
        this.textoConsultarClinica.setVisible(true);
    }
    
    public void mostarTextoConsultarReporte(ReporteVO rep){
        this.textoConsultarReporte.setResizable(false);
        this.textoConsultarReporte.setLocationRelativeTo(null);
        this.textoConsultarReporte.actualizar(rep);
        this.textoConsultarReporte.setVisible(true);
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////

    public UsuarioVO verificarUsuario(String user, String password){

        try {
            return miUsuarioDAO.consultarUsuario(user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
  
    }

    public String RegistrarPaciente(PacienteVO nuevoPaciente) {
        try {
            return miPacienteDAO.registrarPaciente(nuevoPaciente);
        } catch (SQLException ex) {
            return "error";
        }
    }
    
    public ArrayList<PacienteVO> getListaPacientes(){
	try {
		return miPacienteDAO.consultarListaPacientes();
	} catch (SQLException e) {
		return new ArrayList<PacienteVO>();
	}
    }
    
    public ArrayList<PacienteVO> getListaPacientes2(){
	try {
		return miPacienteDAO.consultarListaPacientes2();
	} catch (SQLException e) {
		return new ArrayList<PacienteVO>();
	}
    }
    
    public PacienteVO buscarPaciente(int id) {
		try {
			return miPacienteDAO.buscarPaciente(id);
		} catch (SQLException e) {
			return null;
		}
    }

     public PacienteVO buscarPaciente2(int id) {
		try {
			return miPacienteDAO.buscarPaciente2(id);
		} catch (SQLException e) {
			return null;
		}
    }
    

    public PacienteVO buscarPaciente(String cedula) {
		try {
			return miPacienteDAO.buscarPaciente(cedula);
		} catch (SQLException e) {
			return null;
		}
    }

    
    public String modificarPaciente(PacienteVO miPaciente) {
		try {
			return miPacienteDAO.modificarPaciente(miPaciente);
		} catch (SQLException e) {
			return "error";
		}
    }

    public String modificarPaciente2(PacienteVO miPaciente) {
		try {
			return miPacienteDAO.modificarPaciente2(miPaciente);
		} catch (SQLException e) {
			return "error";
		}
    }

    public ArrayList<MaterialVO> getListaMateriales(String placa){
	try {
		return miMaterialDAO.consultarListaMateriales(placa);
	} catch (SQLException e) {
		return new ArrayList<MaterialVO>();
	}
    }
    
    public String modificarMaterial(MaterialVO miMaterial) {
		try {
			return miMaterialDAO.modificarMaterial(miMaterial);
		} catch (SQLException e) {
			return "error";
		}
    }
    
    public MaterialVO buscarMaterial(int id,String placa) {
		try {
			return miMaterialDAO.buscarMaterial(id, placa);
		} catch (SQLException e) {
			return null;
		}
    }
    
    public PacienteVO buscarPaciente3(String cedula){
       try {
			return miPacienteDAO.buscarPaciente3(cedula);
		} catch (SQLException e) {
			return null;
		}
    }

    public ArrayList<String> devolverClinicas(String municpio){
        
        try {
            return miClinicaDAO.clinicasMunicipio(municpio);
        } catch (SQLException ex) {
            return new ArrayList<String>();
        }
    }
    
       public AmbulanciaVO buscarAmbulancia(String placa){
       try {
			return miAmbulanciaDAO.buscarAmbulancia(placa);
		} catch (SQLException e) {
			return null;
		}
    }

       public String RegistrarReporte(ReporteVO nuevoReporte) {
        try {
            return miReporteDAO.registrarReporte(nuevoReporte);
        } catch (SQLException ex) {
            return "error";
        }
    }
       
    public ClinicaVO buscarClinica(String nombre, String municipio){
       try {
			return miClinicaDAO.buscarClinica(nombre,municipio);
		} catch (SQLException e) {
			return null;
		}
    }
    
    public String RegistrarClinica(ClinicaVO nuevaClinica) {
        try {
            return miClinicaDAO.registrarClinica(nuevaClinica);
        } catch (SQLException ex) {
            return "error";
        }
    }

    public String EliminarClinica(ClinicaVO clinica) {
        try {
            return miClinicaDAO.eliminarClinica(clinica);
        } catch (SQLException ex) {
            return "error";
        }
    }

    public ArrayList<ReporteVO> getListaReportes(int id){
	try {
		return miReporteDAO.consultarListaReportes(id);
	} catch (SQLException e) {
		return new ArrayList<ReporteVO>();
	}
    }
    
    public ReporteVO buscarReporte(int idP, int idR){
       try {
			return miReporteDAO.buscarReporte(idP, idR);
		} catch (SQLException e) {
			return null;
		}
    }

    public String eliminarReporte(ReporteVO reporte) {
        try {
            return miReporteDAO.eliminarReporte(reporte);
        } catch (SQLException ex) {
            return "error";
        }
    }

   

    

    
    
    

    
    
}
