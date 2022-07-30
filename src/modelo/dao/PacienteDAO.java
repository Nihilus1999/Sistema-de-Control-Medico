/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import com.mysql.cj.protocol.Resultset;
import controlador.Coordinador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.conexion.Conexion;
import modelo.vo.EstadoVO;
import modelo.vo.FechaVO;
import modelo.vo.GeneroVO;
import modelo.vo.MunicipioVO;
import modelo.vo.PacienteVO;
/**
 *
 * @author victo
 */
public class PacienteDAO {

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
     
     public String registrarPaciente(PacienteVO miPaciente) throws SQLException {
		
		String resultado = "";
		
		if (!conectar().equals("conectado")) {
			return "error";
		}

		String consulta = "INSERT INTO pacientes (id,nombre,apellido,cedula,genero,fecha_nac,tipo_sangre ,numero_telefono,municipio,fecha_reg,estado,correo)"
				+ "  VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
                    
                        String fechaNac=miPaciente.getFechaNacimiento().getAn()+"-"+miPaciente.getFechaNacimiento().getMes()+"-"+miPaciente.getFechaNacimiento().getDia();
                        String fechaReg=miPaciente.getFechaRegistro().getAn()+"-"+miPaciente.getFechaRegistro().getMes()+"-"+miPaciente.getFechaRegistro().getDia();
                        
			preStatement = connection.prepareStatement(consulta);
                        preStatement.setInt(1,miPaciente.getId());
			preStatement.setString(2, miPaciente.getNombre());
			preStatement.setString(3, miPaciente.getApellido());
			preStatement.setString(4, miPaciente.getCedula());
			preStatement.setString(5,miPaciente.getGenero().name());
			preStatement.setString(6,fechaNac);//fecha nac
			preStatement.setString(7,miPaciente.obtenerTipoCadena(miPaciente.getTipoSangre()));
                        preStatement.setString(8,miPaciente.getNumeroTelefono());
                        preStatement.setString(9,miPaciente.getMunicipio().name());
                        preStatement.setString(10,fechaReg); //fecha reg
                        preStatement.setString(11, miPaciente.getEstado().name());
                        preStatement.setString(12, miPaciente.getCorreo());
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
    
    
     public ArrayList<PacienteVO> consultarListaPacientes() throws SQLException {
		ArrayList<PacienteVO> listaPersonas=new ArrayList<PacienteVO>();
		
		if (!conectar().equals("conectado")) {
			return listaPersonas;
		}
		
		ResultSet result=null;
		PacienteVO miPaciente=null;
		FechaVO fechaNac=null,fechaReg=null;
		
		String consulta="SELECT id,nombre,apellido,cedula,genero,fecha_nac,tipo_sangre,numero_telefono,municipio,fecha_reg,correo"
				+ " FROM pacientes ";
		
		try {
			preStatement=connection.prepareStatement(consulta);
			result=preStatement.executeQuery();
			
			while(result.next()==true){
				miPaciente=new PacienteVO();
				fechaNac=new FechaVO();
                                fechaReg=new FechaVO();
				miPaciente.setId(result.getInt("id"));
				miPaciente.setNombre(result.getString("nombre"));
				miPaciente.setApellido(result.getString("apellido"));
				miPaciente.setCedula(result.getString("cedula"));
                                miPaciente.setGenero(GeneroVO.MASCULINO.valor(result.getString("genero")));
                                miPaciente.setFechaNacimiento(miPaciente.devolverFecha(result.getString("fecha_nac")));
                                miPaciente.setTipoSangre(miPaciente.obtenerTipo(result.getString("tipo_sangre")));
				miPaciente.setNumeroTelefono(result.getString("numero_telefono"));
                                miPaciente.setMunicipio(MunicipioVO.SUCRE.obtenerMunicipio(result.getString("municipio")));
                                miPaciente.setFechaRegistro(miPaciente.devolverFecha(result.getString("fecha_reg")));
				miPaciente.setCorreo(result.getString("correo"));
				listaPersonas.add(miPaciente);
			}
		} catch (SQLException e) {
			//System.out.println("Error en la consulta de personas: "+e.getMessage());
		}finally {
			result.close();
			preStatement.close();
			connection.close();
			miConexion.desconectar();
		}
		
		return listaPersonas;
    }
     
     public ArrayList<PacienteVO> consultarListaPacientes2() throws SQLException {
		ArrayList<PacienteVO> listaPersonas=new ArrayList<PacienteVO>();
		
		if (!conectar().equals("conectado")) {
			return listaPersonas;
		}
		
		ResultSet result=null;
		PacienteVO miPaciente=null;
		FechaVO fechaNac=null,fechaReg=null;
		
		String consulta="SELECT id,nombre,apellido,estado"
				+ " FROM pacientes ";
		
		try {
			preStatement=connection.prepareStatement(consulta);
			result=preStatement.executeQuery();
			
			while(result.next()==true){
				miPaciente=new PacienteVO();
				
				miPaciente.setId(result.getInt("id"));
				miPaciente.setNombre(result.getString("nombre"));
				miPaciente.setApellido(result.getString("apellido"));
				//miPaciente.setCedula(result.getString("cedula"));
                                miPaciente.setEstado(EstadoVO.ACTIVO.valor(result.getString("estado")));
				listaPersonas.add(miPaciente);
			}
		} catch (SQLException e) {
			//System.out.println("Error en la consulta de personas: "+e.getMessage());
		}finally {
			result.close();
			preStatement.close();
			connection.close();
			miConexion.desconectar();
		}
		
		return listaPersonas;
	}
     
    public PacienteVO buscarPaciente(int id) throws SQLException{
	PacienteVO miPaciente=null;
		
	if (!conectar().equals("conectado")) {
		return miPaciente;
	}
		
	ResultSet result=null;
			
	String consulta="SELECT id,nombre,apellido,cedula,genero,fecha_nac,tipo_sangre,numero_telefono,municipio,fecha_reg,correo"
		+ " FROM pacientes where id= ? ";
		
	try {
		preStatement=connection.prepareStatement(consulta);
		preStatement.setInt(1, id);
			
		result=preStatement.executeQuery();
		if(result.next()){
			miPaciente=new PacienteVO();
		
			miPaciente.setId(result.getInt("id"));
			miPaciente.setNombre(result.getString("nombre"));
			miPaciente.setApellido(result.getString("apellido"));
			miPaciente.setCedula(result.getString("cedula"));
                        miPaciente.setGenero(GeneroVO.MASCULINO.valor(result.getString("genero")));
                        miPaciente.setFechaNacimiento(miPaciente.devolverFecha(result.getString("fecha_nac")));
                        miPaciente.setTipoSangre(miPaciente.obtenerTipo(result.getString("tipo_sangre")));
                        miPaciente.setNumeroTelefono(result.getString("numero_telefono"));
                        miPaciente.setMunicipio(MunicipioVO.SUCRE.obtenerMunicipio(result.getString("municipio")));
                        miPaciente.setFechaRegistro(miPaciente.devolverFecha(result.getString("fecha_reg")));
                        miPaciente.setCorreo(result.getString("correo"));
				
		}	
	} catch (SQLException e) {
			//System.out.println("Error en la consulta de la persona: "+e.getMessage());
		miPaciente=null;
	}finally {
		result.close();
		preStatement.close();
		connection.close();
		miConexion.desconectar();
	}
		return miPaciente;
    } 
    
    public PacienteVO buscarPaciente2(int id) throws SQLException{
	PacienteVO miPaciente=null;
		
	if (!conectar().equals("conectado")) {
		return miPaciente;
	}
		
	ResultSet result=null;
			
	String consulta="SELECT id,nombre,apellido,estado"
		+ " FROM pacientes where id= ? ";
		
	try {
		preStatement=connection.prepareStatement(consulta);
		preStatement.setInt(1, id);
			
		result=preStatement.executeQuery();
		if(result.next()){
			miPaciente=new PacienteVO();
		
			miPaciente.setId(result.getInt("id"));
			miPaciente.setNombre(result.getString("nombre"));
			miPaciente.setApellido(result.getString("apellido"));
			miPaciente.setEstado(EstadoVO.ACTIVO.valor(result.getString("estado")));
				
		}	
	} catch (SQLException e) {
			//System.out.println("Error en la consulta de la persona: "+e.getMessage());
		miPaciente=null;
	}finally {
		result.close();
		preStatement.close();
		connection.close();
		miConexion.desconectar();
	}
		return miPaciente;
    } 
    
    
    public PacienteVO buscarPaciente3(String cedula) throws SQLException{
	PacienteVO miPaciente=null;
		
	if (!conectar().equals("conectado")) {
		return miPaciente;
	}
		
	ResultSet result=null;
			
	String consulta="SELECT cedula"
		+ " FROM pacientes where cedula= ? ";
		
	try {
		preStatement=connection.prepareStatement(consulta);
		preStatement.setString(1, cedula);
			
		result=preStatement.executeQuery();
		if(result.next()){
			miPaciente=new PacienteVO();
		
                        miPaciente.setCedula(result.getString("cedula"));
			
				
		}	
	} catch (SQLException e) {
			//System.out.println("Error en la consulta de la persona: "+e.getMessage());
		miPaciente=null;
	}finally {
		result.close();
		preStatement.close();
		connection.close();
		miConexion.desconectar();
	}
		return miPaciente;
    } 
    
    
    
    public PacienteVO buscarPaciente(String cedula) throws SQLException{
	PacienteVO miPaciente=null;
		
	if (!conectar().equals("conectado")) {
		return miPaciente;
	}
		
	ResultSet result=null;
			
	String consulta="SELECT id,nombre,apellido,cedula,genero,fecha_nac,tipo_sangre,numero_telefono,municipio,fecha_reg,correo"
		+ " FROM pacientes where cedula= ? ";
		
	try {
		preStatement=connection.prepareStatement(consulta);
		preStatement.setString(1, cedula);
			
		result=preStatement.executeQuery();
		if(result.next()){
			miPaciente=new PacienteVO();
		
			miPaciente.setId(result.getInt("id"));
			miPaciente.setNombre(result.getString("nombre"));
			miPaciente.setApellido(result.getString("apellido"));
			miPaciente.setCedula(result.getString("cedula"));
                        miPaciente.setGenero(GeneroVO.MASCULINO.valor(result.getString("genero")));
                        miPaciente.setFechaNacimiento(miPaciente.devolverFecha(result.getString("fecha_nac")));
                        miPaciente.setTipoSangre(miPaciente.obtenerTipo(result.getString("tipo_sangre")));
                        miPaciente.setNumeroTelefono(result.getString("numero_telefono"));
                        miPaciente.setMunicipio(MunicipioVO.SUCRE.obtenerMunicipio(result.getString("municipio")));
                        miPaciente.setFechaRegistro(miPaciente.devolverFecha(result.getString("fecha_reg")));
			miPaciente.setCorreo(result.getString("correo"));
		}	
	} catch (SQLException e) {
			//System.out.println("Error en la consulta de la persona: "+e.getMessage());
		miPaciente=null;
	}finally {
		result.close();
		preStatement.close();
		connection.close();
		miConexion.desconectar();
	}
		return miPaciente;
    } 
    
    
    public String modificarPaciente(PacienteVO miPacienteVO) throws SQLException{
	String resultado="";
		
	if (!conectar().equals("conectado")) {
		return "error";
	}
		
	String consulta="UPDATE pacientes "
		+ "SET nombre = ? , "
		+ "apellido= ? , "
		+ "cedula= ? , "
		+ "genero= ? , "
		+ "fecha_nac= ? , "
		+ "tipo_sangre= ? , "
                + "numero_telefono= ? , "
                +" municipio= ? , "
                +"fecha_reg= ? ,"
                +"correo= ? "
		+ "WHERE id= ?;";
		
	try {
		preStatement = connection.prepareStatement(consulta);
		
                String fechaNac=miPacienteVO.getFechaNacimiento().getAn()+"-"+miPacienteVO.getFechaNacimiento().getMes()+"-"+miPacienteVO.getFechaNacimiento().getDia();
                String fechaReg=miPacienteVO.getFechaRegistro().getAn()+"-"+miPacienteVO.getFechaRegistro().getMes()+"-"+miPacienteVO.getFechaRegistro().getDia();
                
		preStatement.setString(1,miPacienteVO.getNombre());
		preStatement.setString(2, miPacienteVO.getApellido());
		preStatement.setString(3, miPacienteVO.getCedula());
		preStatement.setString(4, miPacienteVO.getGenero().name());
		preStatement.setString(5, fechaNac);
		preStatement.setString(6,miPacienteVO.obtenerTipoCadena(miPacienteVO.getTipoSangre()));
                preStatement.setString(7, miPacienteVO.getNumeroTelefono());
                preStatement.setString(8, miPacienteVO.getMunicipio().name());
                preStatement.setString(9, fechaReg);
                preStatement.setString(10, miPacienteVO.getCorreo());

		preStatement.setInt(11, miPacienteVO.getId());
		preStatement.executeUpdate();
		resultado="ok";
	} catch(SQLException	 e){
              //System.out.println("Ocurrio una excepcion de SQL "
            	//	+ "al momento de actualizar: "+e);
            resultado="error";
        }finally {
		preStatement.close();
		connection.close();
		miConexion.desconectar();
	}

		return resultado;
    }
    
    public String modificarPaciente2(PacienteVO miPacienteVO) throws SQLException{
	String resultado="";
		
	if (!conectar().equals("conectado")) {
		return "error";
	}
		
	String consulta="UPDATE pacientes "
		+ "SET estado = ? "
		+ "WHERE id= ?;";
		
	try {
		preStatement = connection.prepareStatement(consulta);
		
		preStatement.setString(1,miPacienteVO.getEstado().name());
		
		preStatement.setInt(2, miPacienteVO.getId());
		preStatement.executeUpdate();
		resultado="ok";
	} catch(SQLException	 e){
              //System.out.println("Ocurrio una excepcion de SQL "
            	//	+ "al momento de actualizar: "+e);
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
    
    
    
    
    public PacienteVO LabeltxtPaciente(int id) throws SQLException
    {
	PacienteVO miPaciente=null;
		
	if (!conectar().equals("conectado")) {
		return miPaciente;
	}
		
	ResultSet result=null;
			
	String consulta="SELECT nombre,apellido"
		+ " FROM pacientes where id= ? ";
		
	try {
		preStatement=connection.prepareStatement(consulta);
		preStatement.setInt(1, id);
			
		result=preStatement.executeQuery();
		if(result.next()){
			miPaciente=new PacienteVO();
		
			//miPaciente.setId(result.getInt("id"));
			miPaciente.setNombre(result.getString("nombre"));
			miPaciente.setApellido(result.getString("apellido"));
				
		}	
	} catch (SQLException e) {
			//System.out.println("Error en la consulta de la persona: "+e.getMessage());
		miPaciente=null;
	}finally {
		result.close();
		preStatement.close();
		connection.close();
		miConexion.desconectar();
	}
		return miPaciente;
    }
}
