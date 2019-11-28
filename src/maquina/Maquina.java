/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina;

import cafe.Cafe;
import cafe.Expresso;
import cafe.Normal;
import cafe.Ristretto;
import java.util.Scanner;
import te.Negro;
import te.Te;
import te.Rojo;
import te.Verde;


/**
 *
 * @author Marcos
 */
public class Maquina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       boolean nuevoPedido = true;
       int tipoCafe;
       double total;
        
        
        
        while(nuevoPedido){
            
            
            System.out.println("¿Qué  bebida quiere?\n "
                    + "1)Café"
                    + " 2)Té");
            
            
            Scanner entrada = new Scanner(System.in);
            
            int clase = entrada.nextInt();
            
            
            if(clase == 1){
            
            System.out.println(""
                        + "1-Normal : 90$ pesos\n"
                        + "2-Ristretto : 110$ pesos\n"
                        + "3-Expresso : 100$ pesos\n");
                Scanner entradacafe = new Scanner(System.in);
                
                
                
                
                tipoCafe = entradacafe.nextInt();//usuario define tipo            
              
                if(tipoCafe == 1){
                    
                    
                    
                    
                    
                   Normal guardarnor = new Normal();
                   System.out.println("¿ cuantas cucharadas de azucar quiere ? 1 a 3");
                   
                Scanner azucar123 = new Scanner(System.in);
                int azucar = azucar123.nextInt();
                guardarnor.setAzucar(azucar);
                
                System.out.println("¿Cuanto de leche? 1 a 3");
                Scanner entradaleche = new Scanner(System.in);
                int leche = entradaleche.nextInt();//usuario define leche
                guardarnor.setLeche(leche);
                
                
              
                
                    System.out.println(" Cafe" +guardarnor.getDescripcion()+ " con "+guardarnor.getAzucar()+" de azucar, con "+guardarnor.getLeche()+" de leche");
                    
                    total =guardarnor.getPrecio() + guardarnor.getAzucar()*5 + guardarnor.getLeche()*5;
                
                    System.out.println("el total a pagar es "+ total + " pesos");
                
                
                
                    
                }if(tipoCafe == 2){
                    
                    Ristretto guardarris = new Ristretto();
                    
                    System.out.println("¿ cuantas cucharadas de azucar quiere ? 1 a 3");
                    Scanner azucar123 = new Scanner(System.in);
                int azucar = azucar123.nextInt();
                     guardarris.setAzucar(azucar);
                
                
                System.out.println("¿Cuanto de leche? 1 a 3");
                Scanner entradaleche = new Scanner(System.in);
                int leche = entradaleche.nextInt();//usuario define leche
                guardarris.setLeche(leche);
                
                
                System.out.println(" Cafe" +guardarris.getDescripcion()+ " con "+guardarris.getAzucar()+" de azucar, con "+guardarris.getLeche()+" de leche");
                    
                    total =guardarris.getPrecio() + guardarris.getAzucar()*5 + guardarris.getLeche()*5;
                
                    System.out.println("el total a pagar es "+ total + " pesos");
                
                
                
                
                
                
                
                
                
                
                }
                
                if(tipoCafe == 3){
                
                Expresso guardarex = new Expresso();
                System.out.println("¿ cuantas cucharadas de azucar quiere ? 1 a 3");
                 
                Scanner azucar123 = new Scanner(System.in);
                int azucar = azucar123.nextInt();
                
                
                guardarex.setAzucar(azucar);
                
                
                System.out.println("¿Cuantao de leche? 1 a 3");
                Scanner entradaleche = new Scanner(System.in);
                int leche = entradaleche.nextInt();//usuario define leche
                guardarex.setLeche(leche);
                    
                
                
                
                
                
                
                
                System.out.println(" Cafe" +guardarex.getDescripcion()+ " con "+guardarex.getAzucar()+" de azucar, con "+guardarex.getLeche()+" de leche");
                    
                    total = guardarex.getPrecio() + guardarex.getAzucar()*5 + guardarex.getLeche()*5;
                
                    System.out.println("el total a pagar es "+ total + " pesos");
                
                
                
                
                
                
                
                
                
                }
                    
                
                
                
                
                
                } // final clase 1
            
            if(clase == 2){
            
            System.out.println(""
                        + "1-Negro : 70$ pesos\n"
                        + "2-Rojo : 70$ pesos\n"
                        + "3-Verde : 75$ pesos\n");
                
            
            
            Scanner entradacafe = new Scanner(System.in);
                
                
                
                
                tipoCafe = entradacafe.nextInt();//usuario define tipo            
              
                if(tipoCafe == 1){
                    
                    
                    
                    
                    
                   Negro guardarNegro = new Negro();
                   System.out.println("¿ cuantas cucharadas de azucar quiere ? 1 a 3");
                   
                Scanner azucar123 = new Scanner(System.in);
                int azucar = azucar123.nextInt();
                guardarNegro.setAzucar(azucar);
                
                System.out.println("¿Cuanto de leche? 1 a 3");
                Scanner entradaleche = new Scanner(System.in);
                int leche = entradaleche.nextInt();//usuario define leche
                guardarNegro.setLeche(leche);
                
                
              
                
                    System.out.println(" Te " +guardarNegro.getDescripcion()+ " con "+guardarNegro.getAzucar()+" de azucar, con "+guardarNegro.getLeche()+" de leche");
                    
                    total = guardarNegro.getPrecio() + guardarNegro.getAzucar()*5 + guardarNegro.getLeche()*5;
                
                    System.out.println("el total a pagar es "+ total + " pesos");
                
                
                
                    
                }if(tipoCafe == 2){
                    
                    Rojo guardarRojo = new Rojo();
                    
                    System.out.println("¿ cuantas cucharadas de azucar quiere ? 1 a 3");
                    Scanner azucar123 = new Scanner(System.in);
                int azucar = azucar123.nextInt();
                     guardarRojo.setAzucar(azucar);
                
                
                System.out.println("¿Cuanto de leche? 1 a 3");
                Scanner entradaleche = new Scanner(System.in);
                int leche = entradaleche.nextInt();//usuario define leche
                guardarRojo.setLeche(leche);
                
                
                System.out.println(" Te " +guardarRojo.getDescripcion()+ " con "+guardarRojo.getAzucar()+" de azucar, con "+guardarRojo.getLeche()+" de leche");
                    
                    total = guardarRojo.getPrecio() + guardarRojo.getAzucar()*5 + guardarRojo.getLeche()*5;
                
                    System.out.println("el total a pagar es "+ total + " pesos");
                
                
                
                
                
                
                
                
                
                
                }
                
                if(tipoCafe == 3){
                
                Verde guardarVerde = new Verde();
                System.out.println("¿ cuantas cucharadas de azucar quiere ? 1 a 3");
                 
                Scanner azucar123 = new Scanner(System.in);
                int azucar = azucar123.nextInt();
                
                
                guardarVerde.setAzucar(azucar);
                
                
                System.out.println("¿Cuantao de leche? 1 a 3");
                Scanner entradaleche = new Scanner(System.in);
                int leche = entradaleche.nextInt();//usuario define leche
                guardarVerde.setLeche(leche);
                    
                
                
                
                
                
                
                
                System.out.println(" Te " +guardarVerde.getDescripcion()+ " con "+guardarVerde.getAzucar()+" de azucar, con "+guardarVerde.getLeche()+" de leche");
                    
                    total = guardarVerde.getPrecio() + guardarVerde.getAzucar()*5 + guardarVerde.getLeche()*5;
                
                    System.out.println("el total a pagar es "+ total + " pesos");
                
                
                
                
                
                
                
                
                
                }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            }
            
            
            System.out.println("¿Desea ordenar algo más?\n"
                    + "1-Sí\n"
                    + "2-No\n");
            Scanner entradaOtroPedido = new Scanner(System.in);
            int otro = entradaOtroPedido.nextInt();
            if (otro == 2) {
                
                nuevoPedido = false;
                
                System.out.println("Disfrute su bebida");
            } 
        
        }
        
        
        
        
        
        
        
        
    }
}
       

       
    
             
