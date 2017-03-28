
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
          
           while(e.celdas[e.jugador.jugador.x][e.jugador.jugador.y].tipo!= "[F]"){
            System.out.println("Ingrese su movimiento");
            jx = e.jugador.jugador.x;
            jy = e.jugador.jugador.y;
            switch(sc.nextLine()){
            
                case "arriba":
                     if(e.jugador.termino(--jx, jy)){
                        return;
                    }
                    e.jugador.moverCeldaArriba();
                    break;
                case "abajo":
                    if(e.jugador.termino(++jx, jy)){
                        return;
                    }
                    e.jugador.moverCeldaAbajo();
                    break;
                case "izquierda":
                     if(e.jugador.termino(jx,--jy)){
                        return;
                    }
                    e.jugador.moverCeldaIzquierda();
                    break;
                case "derecha":
                    if(e.jugador.termino(jx,++jy)){
                        return;
                    }
                    e.jugador.moverCeldaDerecha();
                    break;
            }
            
             System.out.println("---------------------");
             e.imprimir();
            }
           
            
           
           
           
            }
            
        }


