/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidas;

/**
 *
 * @author Marcos
 */
public abstract class Bebidas {
    
    private int azucar;
    private int leche;
    

    public int getAzucar() {
        return azucar;
    }

    public int getLeche() {
        return leche;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }//Creado para reemplazar al constructor

    public void setLeche(int leche) {
        this.leche = leche;
    }//Creado para reemplazar al constructor

    
    @Override
    public String toString() {
        return getClase() 
                +","+getDescripcion()+
                ",azúcar x"+getAzucar()+
                ",leche x"+getLeche();
    }//Sobreescribo toString para facilitar impresión por consola
   
    //métodos abtractos
    public abstract String getDescripcion();
    
    public abstract double getPrecio();
    
    public abstract String getClase();//para poder usarlo con polimorfismo
}