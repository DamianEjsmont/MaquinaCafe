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
public class Normal extends Cafe {
    
    
     @Override
    public String getDescripcion() {
        return "Normal"; //Retorno la descripción
    }

    @Override
    public double getPrecio() {
        return 90; //Retorno el precio del café normal
    }

    public void setAzucar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
