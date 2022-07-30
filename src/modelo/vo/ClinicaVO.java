/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.vo;

/**
 *
 * @author victo
 */
public class ClinicaVO {
    private String nombre;
    private MunicipioVO municipio;

    public String getNombre() {
        return nombre;
    }

    public MunicipioVO getMunicipio() {
        return municipio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMunicipio(MunicipioVO municipio) {
        this.municipio = municipio;
    }
    
    
}
