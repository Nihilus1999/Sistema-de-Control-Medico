/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.vo;

/**
 *
 * @author victo
 */
public class ReporteVO {
    private int Id;
    private int IdReporte;

    
    private MunicipioVO municipio;
    private FechaVO fechaRegistro;
    private String clinica;
    private String descripcion;
    private String placa;

    public int getId() {
        return Id;
    }

    public int getIdReporte() {
        return IdReporte;
    }
    
    public MunicipioVO getMunicipio() {
        return municipio;
    }

    public FechaVO getFechaRegistro() {
        return fechaRegistro;
    }

    public String getClinica() {
        return clinica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPlaca() {
        return placa;
    }
    
    //////////////////////////////////////////////////

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setMunicipio(MunicipioVO municipio) {
        this.municipio = municipio;
    }

    public void setFechaRegistro(FechaVO fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setClinica(String clinica) {
        this.clinica = clinica;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setIdReporte(int IdReporte) {
        this.IdReporte = IdReporte;
    }
    
    
    ////////////////////////////////////////
    
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
