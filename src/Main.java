
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karla
 */
public class Main {
    
        public static void main(String[ ] args){
        
            Escenario e = new Escenario();
            e.imprimir();
            
            Scanner sc = new Scanner(System.in);
            
            
            //System.out.println("Ingrese su movimiento");
                    
           //arreglar
           
           int jx,jy;
          
           
           //while(e.celdas[e.jugador.posicion.x][e.jugador.posicion.y].tipo!= "[F]"){
           do{
            System.out.println("Ingrese su movimiento");

            switch(sc.nextLine()){
            
                case "arriba":
                    
                    e.jugador.moverCeldaArriba();
                    break;
                case "abajo":

                    e.jugador.moverCeldaAbajo();
                    break;
                case "izquierda":
                    
                    e.jugador.moverCeldaIzquierda();
                    break;
                case "derecha":
                  
                    e.jugador.moverCeldaDerecha();
                    break;
            }
            
             System.out.println("---------------------");
             e.imprimir();
             
            }while(e.celdas[e.jugador.posicion.x][e.jugador.posicion.y].tipo!= "[F]");
           
            
           
           
           
            }
            
        }


