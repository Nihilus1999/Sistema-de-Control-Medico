/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package modelo.vo;

/**
 *
 * @author victo
 */
public enum TipoSangreVO {
    A,Aneg,B,Bneg,O,Oneg,AB,ABneg;
    
    public String valor(TipoSangreVO aux){
        
        if(aux==TipoSangreVO.Aneg)
            return"A-";
        else{
            if(aux==TipoSangreVO.Bneg)
                return"B-";
            else{
                if(aux==TipoSangreVO.Oneg)
                    return "O-";
                else{
                    if(aux==TipoSangreVO.ABneg)
                        return "AB-";
                }
            }
        }
        return aux.name();
    }
    
     public TipoSangreVO valor(String aux){
        if(aux.equals("A-"))
            return TipoSangreVO.Aneg;
        else{
            if(aux.equals("B-"))
                return TipoSangreVO.Bneg;
            else{
                if(aux.equals("O-"))
                    return TipoSangreVO.Oneg;
                else{
                    if(aux.equals("AB-"))
                        return TipoSangreVO.ABneg;
                    else{
                        if(aux.equals("A"))
                            return TipoSangreVO.A;
                        else{
                            if(aux.equals("B"))
                                return TipoSangreVO.B;
                            else{
                                if(aux.equals("O"))
                                    return TipoSangreVO.O;
                                else
                                    return TipoSangreVO.AB;
                            }
                        }
                    }
                }
            }
        }
        //return (TipoSangreVO) aux;
    }
    
}
