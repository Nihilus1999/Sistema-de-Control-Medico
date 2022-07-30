/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package modelo.vo;

/**
 *
 * @author victo
 */
public enum MunicipioVO {
    SUCRE,BARUTA,CHACAO,LIBERTADOR,HATILLO;
    
    public MunicipioVO obtenerMunicipio(String aux){
        if(aux.equals("SUCRE"))
                return MunicipioVO.SUCRE;
        else{
            if(aux.equals("BARUTA"))
                return MunicipioVO.BARUTA;
            else{
                if(aux.equals("CHACAO"))
                    return MunicipioVO.CHACAO;
                else{
                    if(aux.equals("LIBERTADOR"))
                        return MunicipioVO.LIBERTADOR;
                    else
                        return MunicipioVO.HATILLO;
                }
                
            }
        }
    }
}
