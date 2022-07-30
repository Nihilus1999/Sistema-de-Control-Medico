/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package modelo.vo;

/**
 *
 * @author victo
 */
public enum EstadoVO {
   ACTIVO, INACTIVO; 
   
   public EstadoVO valor(String aux){
       if(aux.equals("ACTIVO"))
           return EstadoVO.ACTIVO;
       else
           return EstadoVO.INACTIVO;
   }
   
   
}
