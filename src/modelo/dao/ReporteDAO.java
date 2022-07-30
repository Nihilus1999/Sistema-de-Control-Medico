/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import controlador.Coordinador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.conexion.Conexion;
import modelo.vo.ClinicaVO;
import modelo.vo.FechaVO;
import modelo.vo.GeneroVO;
import modelo.vo.MunicipioVO;
import modelo.vo.PacienteVO;
import modelo.vo.ReporteVO;

/**
 *
 * @author victo
 */
public class ReporteDAO {
    private Coordinador miCoordinador;

    Connection connection = null;
    Conexion miConexion = null;
    PreparedStatement preStatement = null;
        
     private String conectar() {
	miConexion = new Conexion();
	String resultado=miConexion.conectar();
	if (resultado.equals("conectado")) {
            connection = miConexion.getConnection();
            preStatement = null;
	}else {
            JOptionPane.showMessageDialog(null, resultado,"Error",JOptionPane.ERROR_MESSAGE);
	}
	return resultado;
    }
     
     public String registrarReporte(ReporteVO miReporte) throws SQLException {
		
		String resultado = "";
		
		if (!conectar().equals("conectado")) {
			return "error";
		}

		String consulta = "INSERT INTO reportes (id_paciente,municipio,clinica,fecha,descripcion,ambulancia)"
				+ "  VALUES (?,?,?,?,?,?)";

		try {
                    
                       
                        String fechaReg=miReporte.getFechaRegistro().getAn()+"-"+miReporte.getFechaRegistro().getMes()+"-"+miReporte.getFechaRegistro().getDia();
                        
			preStatement = connection.prepareStatement(consulta);
                        preStatement.setInt(1,miReporte.getId());
			preStatement.setString(2, miReporte.getMunicipio().name());
			preStatement.setString(3, miReporte.getClinica());
			preStatement.setString(4, fechaReg);
			preStatement.setString(5,miReporte.getDescripcion());
			preStatement.setString(6,miReporte.getPlaca());//fecha nac
			
			preStatement.execute();

			resultado = "ok";
		
		}catch (SQLException e) {
			System.out.println("No se pudo registrar el estudiante, verifique que el documento no exista: " + e.getMessage());
			//e.printStackTrace();
			resultado = "error";
		}
		catch (Exception e) {
			System.out.println("No se pudo registrar el estudiante: " + e.getMessage());
			//e.printStackTrace();
			resultado = "error";
		}
		finally {
			preStatement.close();
			connection.close();
			miConexion.desconectar();
		}
		return resultado;
	}
     
     
     public  ArrayList<ReporteVO> consultarListaReportes(int id) throws SQLException{
         ArrayList<ReporteVO> listaReportes=new ArrayList<ReporteVO>();
		
		if (!conectar().equals("conectado")) {
			return listaReportes;
		}
		
		ResultSet result=null;
		ReporteVO miReporte=null;
		FechaVO fechaReg=null;
		
		String consulta="select p.*"
				+"from reportes p inner join pacientes u"
				+ " on p.id_paciente=u.id and u.id=? ;";
		
		try {
			preStatement=connection.prepareStatement(consulta);
                        preStatement.setInt(1, id);
                        
			result=preStatement.executeQuery();
			
			while(result.next()==true){
				miReporte=new ReporteVO();
                                fechaReg=new FechaVO();
                                miReporte.setId(result.getInt("id_paciente"));
                                miReporte.setIdReporte(result.getInt("id_reporte"));
                                miReporte.setClinica(result.getString("clinica"));
                                miReporte.setMunicipio(MunicipioVO.BARUTA.obtenerMunicipio(result.getString("municipio")));
                                miReporte.setFechaRegistro(miReporte.devolverFecha(result.getString("fecha")));
				miReporte.setDescripcion(result.getString("descripcion"));
                                miReporte.setPlaca(result.getString("ambulancia"));
                                
				listaReportes.add(miReporte);
			}
		} catch (SQLException e) {
			//System.out.println("Error en la consulta de personas: "+e.getMessage());
		}finally {
			result.close();
			preStatement.close();
			connection.close();
			miConexion.desconectar();
		}
		
		return listaReportes;
     }

     
    public ReporteVO buscarReporte(int idPaciente,int idReporte) throws SQLException{
	ReporteVO miReporte=null;
		
	if (!conectar().equals("conectado")) {
		return miReporte;
	}
		
	ResultSet result=null;
			
	String consulta="select p.*"
				+"from reportes p inner join pacientes u"
				+ " on p.id_paciente=u.id and u.id=? and p.id_reporte=? ;";
		
	try {
		preStatement=connection.prepareStatement(consulta);
		preStatement.setInt(1, idPaciente);
                preStatement.setInt(2, idReporte);
			
		result=preStatement.executeQuery();
		if(result.next()){
			miReporte=new ReporteVO();
		
                        miReporte.setId(result.getInt("id_paciente"));
                        miReporte.setIdReporte(result.getInt("id_reporte"));
                        miReporte.setClinica(result.getString("clinica"));
                        miReporte.setMunicipio(MunicipioVO.BARUTA.obtenerMunicipio(result.getString("municipio")));
                        miReporte.setFechaRegistro(miReporte.devolverFecha(result.getString("fecha")));
			miReporte.setDescripcion(result.getString("descripcion"));
                        miReporte.setPlaca(result.getString("ambulancia"));
		}	
	} catch (SQLException e) {
			//System.out.println("Error en la consulta de la persona: "+e.getMessage());
		miReporte=null;
	}finally {
		result.close();
		preStatement.close();
		connection.close();
		miConexion.desconectar();
	}
		return miReporte;
    }  
    
    
    public String eliminarReporte(ReporteVO miReporte) throws SQLException {
	String resultado="";
		
	if (!conectar().equals("conectado")) {
		return "error";
	}
		
	try {
		String sentencia="DELETE FROM reportes WHERE id_reporte= ?";
		preStatement = connection.prepareStatement(sentencia);
		preStatement.setInt(1, miReporte.getIdReporte());
                	
		preStatement.executeUpdate();
		resultado="ok";
			
	} catch (SQLException e) {
           // System.out.println("Ocurri� una excepcion de SQL "
            //		+ "al momento de eliminar "+e);
		resultado="error";
        }finally {
		preStatement.close();
		connection.close();
		miConexion.desconectar();
	}
	
	return resultado;
    }
    
    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador=miCoordinador;
    }
}
