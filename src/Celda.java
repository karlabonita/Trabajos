/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karla
 */
public class Celda {
    
    public String tipo;
    public int x;
    public int y;
    
    public Celda(int x, int y, String tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }
    
    
     
    public void insertarFinal(){
       
        tipo = "[F]";
    }
     
    public void insertarPared(){
        
         tipo="[#]";
    }
    
    public String toString() {
        return tipo;
    }
    
    
}
