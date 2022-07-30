/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.dao.AmbulanciaDAO;
import modelo.dao.ClinicaDAO;
import modelo.dao.MaterialDAO;
import modelo.dao.PacienteDAO;
import modelo.dao.ReporteDAO;
import modelo.dao.UsuarioDAO;
import modelo.operaciones.Procesos;
import modelo.vo.PacienteVO;
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
//import vista.principal.VentanaGestionReporte;
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
public class Relaciones {
    public void iniciar() {
		
                /////////////////////////////
		/**Se instancian las clases*/
                /////////////////////////////
                
                VentanaLogin ventanaLogin=new VentanaLogin();
                VentanaMenuPrincipal ventanaMenuPrincipal=new VentanaMenuPrincipal();
                VentanaGestionPaciente ventanaGestionPaciente=new VentanaGestionPaciente();
                VentanaGestionRuta ventanaGestionRuta=new VentanaGestionRuta();
                VentanaGestionInventario ventanaGestionInventario=new VentanaGestionInventario();
                VentanaRegistrarEmergencia ventanaRegistrarEmergencia=new VentanaRegistrarEmergencia();
                VentanaAgregarPaciente ventanaAgregarPaciente=new VentanaAgregarPaciente();
                VentanaModificarPaciente ventanaModificarPaciente = new VentanaModificarPaciente();
                VentanaCambiarEstadoPaciente ventanaCambiarEstadoPaciente=new VentanaCambiarEstadoPaciente();
                VentanaGestionReporte ventanaGestionReporte=new VentanaGestionReporte();
                VentanaConsultarReporte ventanaConsultarReporte=new VentanaConsultarReporte();
                VentanaEliminarReporte  ventanaEliminarReporte=new VentanaEliminarReporte(); 
                VentanaGestionClinica   ventanaGestionClinica=new VentanaGestionClinica();
                VentanaAgregarClinica   ventanaAgregarClinica=new VentanaAgregarClinica();
                VentanaEliminarClinica ventanaEliminarClinica=new VentanaEliminarClinica();
                VentanaConsultarHistorial ventanaConsultarHistorial=new VentanaConsultarHistorial();
                TextoConsultarClinica textoConsultarClinica= new TextoConsultarClinica(); 
                TextoConsultarReporte textoConsultarReporte= new TextoConsultarReporte();
                
                Procesos misProcesos=new Procesos();
                UsuarioDAO miUsuarioDAO=new UsuarioDAO();
                PacienteDAO miPacienteDAO=new PacienteDAO();
                AmbulanciaDAO miAmbulanciaDAO=new AmbulanciaDAO();
                MaterialDAO miMaterialDAO=new MaterialDAO();
                ClinicaDAO miClinicaDAO=new ClinicaDAO();
                ReporteDAO miReporteDAO=new ReporteDAO();
                
                Coordinador miCoordinador=new Coordinador();
                
		
		
                //////////////////////////////////////////////
		/**Se establecen las relaciones entre clases*/
                //////////////////////////////////////////////
                
                ventanaLogin.setCoordinador(miCoordinador);
                ventanaMenuPrincipal.setCoordinador(miCoordinador);
                ventanaGestionPaciente.setCoordinador(miCoordinador);
                ventanaGestionInventario.setCoordinador(miCoordinador);
                ventanaGestionRuta.setCoordinador(miCoordinador);
                ventanaRegistrarEmergencia.setCoordinador(miCoordinador);
                ventanaAgregarPaciente.setCoordinador(miCoordinador);
                ventanaModificarPaciente.setCoordinador(miCoordinador);
                ventanaCambiarEstadoPaciente.setCoordinador(miCoordinador);
                ventanaGestionReporte.setCoordinador(miCoordinador);
                ventanaConsultarReporte.setCoordinador(miCoordinador);
                ventanaEliminarReporte.setCoordinador(miCoordinador);
                ventanaGestionClinica.setCoordinador(miCoordinador);
                ventanaAgregarClinica.setCoordinador(miCoordinador);
                ventanaEliminarClinica.setCoordinador(miCoordinador);
                ventanaConsultarHistorial.setCoordinador(miCoordinador);
                textoConsultarClinica.setCoordinador(miCoordinador);
                textoConsultarReporte.setCoordinador(miCoordinador);
                
                misProcesos.setCoordinador(miCoordinador);
                miUsuarioDAO.setCoordinador(miCoordinador);
		miPacienteDAO.setCoordinador(miCoordinador);
                miAmbulanciaDAO.setCoordinador(miCoordinador);
                miMaterialDAO.setCoordinador(miCoordinador);
                miClinicaDAO.setCoordinador(miCoordinador);
                miReporteDAO.setCoordinador(miCoordinador);
		//////////////////////////////////////////////////////
		/**Se establecen relaciones con la clase coordinador*/
                //////////////////////////////////////////////////////
                
                miCoordinador.setVentanaLogin(ventanaLogin);
                miCoordinador.setVentanaMenuPrincipal(ventanaMenuPrincipal);
                miCoordinador.setVentanaGestionPaciente(ventanaGestionPaciente);
                miCoordinador.setVentanaGestionInventario(ventanaGestionInventario);
                miCoordinador.setVentanaGestionRuta(ventanaGestionRuta);
                miCoordinador.setVentanaGestionReporte(ventanaGestionReporte);
                miCoordinador.setVentanaRegistrarEmergencia(ventanaRegistrarEmergencia);
                miCoordinador.setVentanaAgregarPaciente(ventanaAgregarPaciente);
                miCoordinador.setVentanaModificarPaciente(ventanaModificarPaciente);
                miCoordinador.setVentanaCambiarEstadoPaciente(ventanaCambiarEstadoPaciente);
                miCoordinador.setVentanaConsultarReporte(ventanaConsultarReporte);
                miCoordinador.setVentanaEliminarReporte(ventanaEliminarReporte);
                miCoordinador.setVentanaGestionClinica(ventanaGestionClinica);
                miCoordinador.setVentanaAgregarClinica(ventanaAgregarClinica);
                miCoordinador.setVentanaEliminarClinica(ventanaEliminarClinica);
                miCoordinador.setVentanaConsultarHistorial(ventanaConsultarHistorial);
                miCoordinador.setTextoConsultarClinica(textoConsultarClinica);
                miCoordinador.setTextoConsultarReporte(textoConsultarReporte);
                
                miCoordinador.setProcesos(misProcesos);
                miCoordinador.setPacienteDAO(miPacienteDAO);
		miCoordinador.setUsuarioDAO(miUsuarioDAO);
                miCoordinador.setMaterialDAO(miMaterialDAO);
                miCoordinador.setAmbulanciaDAO(miAmbulanciaDAO);
                miCoordinador.setClinicaDAO(miClinicaDAO);
                miCoordinador.setReporteDAO(miReporteDAO);
               
                miCoordinador.mostrarVentanaLogin();
	}
}
