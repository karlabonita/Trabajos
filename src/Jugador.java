

/**
 *
 * @author karla
 */
public class Jugador extends Constantes {
    public Escenario escenario;
    public Celda jugador;
    
      public Jugador(Escenario escenario, int x, int y){
        this.escenario = escenario;
        jugador = new Celda(x,y,"[J]");// no lo puedo creer
        escenario.celdas[jugador.x][jugador.y].tipo = jugador.tipo;
       
    }

   public boolean puedeMoverse(int x, int y){
       if(escenario.celdas[x][y].tipo!="[#]"){
           return true;
           
       }    
       return false;
   }
   
     
    public void moverCeldaAbajo(){
         if(jugador.x<10 && puedeMoverse(jugador.x+1,jugador.y)){
            jugador.x++;
            escenario.celdas[jugador.x][jugador.y].tipo=jugador.tipo;
            escenario.celdas[jugador.x-1][jugador.y].tipo="[ ]";
             
         }
        
    }
    public void moverCeldaArriba(){
        
          if(jugador.x>0 && puedeMoverse(jugador.x-1,jugador.y)){
              jugador.x--;
              escenario.celdas[jugador.x][jugador.y].tipo=jugador.tipo;
              escenario.celdas[jugador.x+1][jugador.y].tipo="[ ]";
          }
    }
    
    public void moverCeldaIzquierda(){
        if(jugador.y>0 && puedeMoverse(jugador.x,jugador.y-1)){
         jugador.y--;
         escenario.celdas[jugador.x][jugador.y].tipo=jugador.tipo;
         escenario.celdas[jugador.x][jugador.y+1].tipo="[ ]";
            
        }
    }
    
    
   public void moverCeldaDerecha(){
       if(jugador.y< ANCHO -1 && puedeMoverse(jugador.x,jugador.y+1)){
        jugador.y++;
        escenario.celdas[jugador.x][jugador.y].tipo=jugador.tipo;
        escenario.celdas[jugador.x][jugador.y-1].tipo="[ ]";
           
       }
   }
   
    
   

}