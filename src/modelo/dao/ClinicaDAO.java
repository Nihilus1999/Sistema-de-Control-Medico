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
import modelo.vo.MaterialVO;
import modelo.vo.MunicipioVO;
import modelo.vo.PacienteVO;
import modelo.vo.ReporteVO;

/**
 *
 * @author victo
 */
public class ClinicaDAO {
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
     
    public  ArrayList<String> clinicasMunicipio(String municipio) throws SQLException{
        ArrayList<String> listaClinicas=new ArrayList<String>();
        if (!conectar().equals("conectado")) {
		return listaClinicas;
	}
        
        ResultSet result=null;
        String consulta="select p.*"
			+"from clinicas p inner join municipios u"
			+ " on p.municipio=u.nombre and u.nombre=?";
        
        try {
		preStatement =connection.prepareStatement(consulta);
		preStatement.setString(1, municipio);
		result=preStatement.executeQuery();
			
		while(result.next()==true){
			String aux=new String();
                        aux=result.getString("nombre");
                        listaClinicas.add(aux);
		}
	} catch (SQLException e) {
			//System.out.println("Error en la consulta de personas: "+e.getMessage());
	}finally {
		result.close();
		preStatement.close();
		connection.close();			
                miConexion.desconectar();
	}
        return listaClinicas;
    }

    
    public ClinicaVO buscarClinica(String nombre, String municipio) throws SQLException{
	ClinicaVO miClinica=null;
		
	if (!conectar().equals("conectado")) {
		return miClinica;
	}
		
	ResultSet result=null;
			
	String consulta="select p.*"
			+"from clinicas p inner join municipios u"
			+ " on p.municipio=u.nombre and u.nombre=? and p.nombre=?";
		
	try {
		preStatement=connection.prepareStatement(consulta);
		preStatement.setString(1, municipio);
                preStatement.setString(2, nombre);
			
		result=preStatement.executeQuery();
		if(result.next()){
			miClinica=new ClinicaVO();
		
                        miClinica.setNombre(result.getString("nombre"));
                        miClinica.setMunicipio(MunicipioVO.BARUTA.obtenerMunicipio(result.getString("municipio")));
		}	
	} catch (SQLException e) {
			//System.out.println("Error en la consulta de la persona: "+e.getMessage());
		miClinica=null;
	}finally {
		result.close();
		preStatement.close();
		connection.close();
		miConexion.desconectar();
	}
		return miClinica;
    } 
    
     public String registrarClinica(ClinicaVO miClinica) throws SQLException {
		
		String resultado = "";
		
		if (!conectar().equals("conectado")) {
			return "error";
		}

		String consulta = "INSERT INTO clinicas (nombre,municipio)"
				+ "  VALUES (?,?)";

		try {                      
			preStatement = connection.prepareStatement(consulta);
                        
                        preStatement.setString(1, miClinica.getNombre());
			preStatement.setString(2, miClinica.getMunicipio().name());
	
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
     
     public String eliminarClinica(ClinicaVO miClinica) throws SQLException {
		String resultado="";
		
		if (!conectar().equals("conectado")) {
			return "error";
		}
		
		try {
			String sentencia="DELETE FROM clinicas WHERE nombre= ? and municipio= ?";
			preStatement = connection.prepareStatement(sentencia);
			preStatement.setString(1, miClinica.getNombre());
                        preStatement.setString(2, miClinica.getMunicipio().name());
			
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
