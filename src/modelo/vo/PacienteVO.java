/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.vo;

/**
 *
 * @author victo
 */
public class PacienteVO {
    private int id;
    private String nombre;
    private String apellido;
    private String cedula;
    private GeneroVO genero;
    private FechaVO fechaNacimiento;
    private TipoSangreVO tipoSangre;
    private String numeroTelefono;
    private MunicipioVO municipio;
    private FechaVO fechaRegistro;
    private EstadoVO estado;
    private String correo;

    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public GeneroVO getGenero() {
        return genero;
    }

    public FechaVO getFechaNacimiento() {
        return fechaNacimiento;
    }

    public TipoSangreVO getTipoSangre() {
        return tipoSangre;
    }

    
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public MunicipioVO getMunicipio() {
        return municipio;
    }

    public FechaVO getFechaRegistro() {
        return fechaRegistro;
    }

    public EstadoVO getEstado() {
        return estado;
    }

    public String getCorreo() {
        return correo;
    }
    
    
////////////////////////////////////////////
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellidos) {
        this.apellido = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setGenero(GeneroVO genero) {
        this.genero = genero;
    }

    public void setFechaNacimiento(FechaVO fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTipoSangre(TipoSangreVO tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setMunicipio(MunicipioVO municipio) {
        this.municipio = municipio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaRegistro(FechaVO fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setEstado(EstadoVO estado) {
        this.estado = estado;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
//////////////////////////////////////////////////////////////
    public TipoSangreVO obtenerTipo(String aux) {
        return TipoSangreVO.A.valor(aux);
    }
    
    public String obtenerTipoCadena(TipoSangreVO aux){
        return TipoSangreVO.A.valor(aux);
    }
    
    public FechaVO devolverFecha(String fecha) {
		FechaVO devolver=new FechaVO();
		int n=0;
		char caracter;
		String aux=new String();
		for(int i=0; i<2; i++){
			do{
				caracter = fecha.charAt (n); 
				if(caracter!='-')
				 aux=aux+caracter;
				n++;
			}while(caracter!='-');
			if(i==0)
				devolver.setAn(Integer.parseInt(aux));
			else{
				if(i==1)
				devolver.setMes(Integer.parseInt(aux));	
			}	
			aux=new String();
		}
		while(n<fecha.length()){
			caracter = fecha.charAt (n); 
			aux=aux+caracter;
			n++;
		}
		devolver.setDia(Integer.parseInt(aux));
		
		return devolver;
	}
    
}
