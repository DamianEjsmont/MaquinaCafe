/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;
import cafe.Cafe;

/**
 *
 * @author Marcos
 */
public class Ristretto extends Cafe {
    
    
    @Override
    public String getDescripcion() {
        return "Ristretto"; //Retorno la descripción
    }

    @Override
    public double getPrecio() {
        return 110; //Retorno el precio del café ristretto
    }
    
    
    
    
    
    
}
