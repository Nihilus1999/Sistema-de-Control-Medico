/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

/**
 *
 * @author victo
 */

import controlador.Coordinador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.conexion.Conexion;
import modelo.vo.UsuarioVO;

public class UsuarioDAO {
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

public UsuarioVO consultarUsuario(String user, String password) throws SQLException {
    UsuarioVO miUsuario=null;
		
    if (!conectar().equals("conectado")) {
        return miUsuario;
    }
		
    ResultSet result=null;
	
    String consulta="SELECT user,password,cargo"
    + " FROM usuarios where user= ?  AND password= ?";
		
    try {
        preStatement=connection.prepareStatement(consulta);
	preStatement.setString(1, user);
        preStatement.setString(2, password);
        
				
	result=preStatement.executeQuery();
				
	if(result.next()){
            miUsuario=new UsuarioVO();
            miUsuario.setUser(result.getString("user"));
            miUsuario.setPassword(result.getString("password"));
            miUsuario.setCargo(result.getString("cargo"));
	}		
			   
    } catch (SQLException e) {
        System.out.println("Error en la consulta de la persona: "+e.getMessage());
    }finally {
	result.close();
	preStatement.close();
	connection.close();
    miConexion.desconectar();
    }
    return miUsuario;
}

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador=miCoordinador;
    }
}
