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
import modelo.vo.AmbulanciaVO;
import modelo.vo.EstadoVO;
import modelo.vo.PacienteVO;


/**
 *
 * @author victo
 */
public class AmbulanciaDAO {
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
     
     public AmbulanciaVO buscarAmbulancia(String placa) throws SQLException{
	AmbulanciaVO miAmbulancia=null;
		
	if (!conectar().equals("conectado")) {
		return miAmbulancia;
	}
		
	ResultSet result=null;
			
	String consulta="SELECT placa"
		+ " FROM ambulancias where placa= ? ";
		
	try {
		preStatement=connection.prepareStatement(consulta);
		preStatement.setString(1, placa);
			
		result=preStatement.executeQuery();
		if(result.next()){
			miAmbulancia=new AmbulanciaVO();
		
                        miAmbulancia.setPlaca(result.getString("placa"));	
		}	
	} catch (SQLException e) {
			//System.out.println("Error en la consulta de la persona: "+e.getMessage());
		miAmbulancia=null;
	}finally {
		result.close();
		preStatement.close();
		connection.close();
		miConexion.desconectar();
	}
		return miAmbulancia;
    } 

     
     
    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador=miCoordinador;
    }
}
