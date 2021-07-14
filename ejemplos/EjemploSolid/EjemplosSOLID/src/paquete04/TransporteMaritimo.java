/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author usuario
 */
public class TransporteMaritimo extends Transporte{
    private String cooperativaMaritima;
    
    
    public void establecerCooperativaMaritima(String n){
        cooperativaMaritima = n;
    }
    
    @Override
    public void establecerTarifa(){
        tarifa = 20.90;
    }
    
    
    public String obtenerCooperativaTaxi(){
        return cooperativaMaritima;
    }
}
