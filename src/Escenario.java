/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karla
 */
public class Escenario extends Constantes{
    public Celda [][] celdas;
    public Jugador jugador;
    
    Escenario(){
    
    celdas = new Celda[ANCHO][ALTO];
    for (int i = 0; i <ANCHO; i++) {
            for (int j = 0; j <ALTO; j++) {
                celdas[i][j] = new Celda(i,j,"[ ]");
            }
        }
    
        celdas[0][3].insertarPared();
        celdas[0][7].insertarPared();
        celdas[1][4].insertarPared();
        celdas[1][8].insertarPared();
        celdas[2][1].insertarPared();
        celdas[3][4].insertarPared();
        celdas[2][5].insertarPared();
        celdas[4][4].insertarPared();
        celdas[3][7].insertarPared();
        celdas[3][8].insertarPared();
        celdas[3][7].insertarPared();
    
        celdas[9][9].insertarFinal();
        
       
        jugador = new Jugador(this,6,7);
        
    
    }
    
    public void imprimir() {
        for (int i = 0; i < ANCHO; i++) {
            for (int j = 0; j <ALTO; j++) {
                System.out.print(celdas[i][j].toString()+" ");
            }
            System.out.println(" ");
        }
    }
    
}
