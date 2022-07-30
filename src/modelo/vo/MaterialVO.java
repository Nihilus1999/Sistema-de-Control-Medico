/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.vo;

/**
 *
 * @author victo
 */
public class MaterialVO {
    private int id;
    private AmbulanciaVO ambulancia;
    private String nombre;
    private int cantidad;

    public int getId() {
        return id;
    }

    public AmbulanciaVO getAmbulancia() {
        return ambulancia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmbulancia(AmbulanciaVO ambulancia) {
        this.ambulancia = ambulancia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
