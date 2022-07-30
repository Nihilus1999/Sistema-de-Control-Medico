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
import modelo.vo.MaterialVO;


/**
 *
 * @author victo
 */
public class MaterialDAO {
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

     public MaterialVO buscarMaterial(int id, String placa) throws SQLException{
	MaterialVO miMaterial=null;
	AmbulanciaVO miAmbulancia=null;	
	if (!conectar().equals("conectado")) {
		return miMaterial;
	}
		
	ResultSet result=null;
			
	String consulta="select p.*"
				+"from materiales p inner join ambulancias u"
				+ " on p.placa=u.placa and u.placa=? and p.id_material= ? ;";
		
	try {
		preStatement=connection.prepareStatement(consulta);
		
		preStatement.setString(1, placa);
                preStatement.setInt(2, id);
		result=preStatement.executeQuery();
                
		if(result.next()){
			miMaterial=new MaterialVO();
                        miAmbulancia=new AmbulanciaVO();
                        miAmbulancia.setPlaca(placa);
                        
			miMaterial.setId(result.getInt("id_material"));
			miMaterial.setNombre(result.getString("nombre"));
			miMaterial.setAmbulancia(miAmbulancia);
			miMaterial.setCantidad(result.getInt("cantidad"));
				
		}	
	} catch (SQLException e) {
			//System.out.println("Error en la consulta de la persona: "+e.getMessage());
		miMaterial=null;
	}finally {
		result.close();
		preStatement.close();
		connection.close();
		miConexion.desconectar();
	}
		return miMaterial;
    } 
     
     
     public ArrayList<MaterialVO> consultarListaMateriales(String placa) throws SQLException {
		ArrayList<MaterialVO> listaMateriales=new ArrayList<MaterialVO>();
		
		if (!conectar().equals("conectado")) {
			return listaMateriales;
		}
		
		ResultSet result=null;
		MaterialVO miMaterial=null;
		AmbulanciaVO miAmbulancia=new AmbulanciaVO();
		miAmbulancia.setPlaca(placa);
                
		String consulta="select p.*"
				+"from materiales p inner join ambulancias u"
				+ " on p.placa=u.placa and u.placa=?";
		
		try {
			preStatement =connection.prepareStatement(consulta);
			preStatement.setString(1, placa);
			result=preStatement.executeQuery();
			
			while(result.next()==true){
				miMaterial=new MaterialVO();
				
                                miMaterial.setId(result.getInt("id_material"));
                                miMaterial.setNombre(result.getString("nombre"));
                                miMaterial.setCantidad(result.getInt("cantidad"));
                                miMaterial.setAmbulancia(miAmbulancia);
				listaMateriales.add(miMaterial);
			}
		} catch (SQLException e) {
			//System.out.println("Error en la consulta de personas: "+e.getMessage());
		}finally {
			result.close();
			preStatement.close();
			connection.close();
			miConexion.desconectar();
		}
		
		return listaMateriales;
	}
     
     
     public String modificarMaterial(MaterialVO miMaterial) throws SQLException{
	String resultado="";
		
	if (!conectar().equals("conectado")) {
		return "error";
	}
		
	String consulta="UPDATE materiales "
		+ "SET cantidad = ? "
		+ "WHERE id_material= ? and placa= ?;";
		
	try {
		preStatement = connection.prepareStatement(consulta);
		
		preStatement.setInt(1,miMaterial.getCantidad());
		
		preStatement.setInt(2, miMaterial.getId());
                preStatement.setString(3, miMaterial.getAmbulancia().getPlaca());
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
}
