/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package modelo.vo;

/**
 *
 * @author victo
 */
public enum GeneroVO {
    MASCULINO,FEMENINO;
    
    public GeneroVO valor(String aux){
        if(aux.equals("MASCULINO"))
            return GeneroVO.MASCULINO;
         else
            return GeneroVO.FEMENINO;
    }
}
