/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.conexion;

/**
 *
 * @author victo
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import com.mysql.cj.jdbc.exceptions.CommunicationsException;
public class Conexion {
    private String nombreBd="bd_proyecto";
    private String usuario="root";
    private String password="";
    private String url="jdbc:mysql://localhost:3306/"+nombreBd+"?useUnicode=true&use"
			+ "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&"
			+ "serverTimezone=UTC";
    
    Connection conn=null;
	
    public String conectar() {
        String respuesta="";
        try {
            //obtener el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtener la conexion
            conn=DriverManager.getConnection(url,usuario,password);
            if (conn!=null) {
             respuesta="conectado";
            }else{
             respuesta="NO SE PUDO CONECTAR "+nombreBd;
            }
        }
        catch (ClassNotFoundException e) {
           respuesta="ocurre una ClassNotFoundException : "+e.getMessage();
        }
        catch (SQLSyntaxErrorException e) {
            respuesta="ocurre una SQLSyntaxErrorException: "+e.getMessage()+"\n";
            respuesta+="Verifique que se esté usando la base de datos y tablas correctas...";
        }
        catch (CommunicationsException e) {
            respuesta="ocurre una CommunicationsException: "+e.getMessage()+"\n";
            respuesta+="Verifique que la base de datos fué iniciada...";
        }
        catch (SQLException e) {
            respuesta="ocurre una SQLException: "+e.getMessage()+"\n";
            respuesta+="Este es un problema general de SQL, verifique con el administrador";
        }
		
        return respuesta;
    }
    
    
    public Connection getConnection(){
	return conn;
    }
    
    public void desconectar(){
	conn=null;
    }
}
