

/**
 *
 * @author karla
 */
public class Jugador extends Constantes {
    public Escenario escenario;
    public Celda jugador; //Posicion
    
      public Jugador(Escenario escenario, int x, int y){
        this.escenario = escenario;
        jugador = new Celda(x,y,"[J]");// no lo puedo creer
        escenario.celdas[jugador.x][jugador.y].tipo = jugador.tipo;
       
    }

   public boolean puedeMoverse(int x, int y){
       if(x<ANCHO && x>-1 && y<ALTO && y>-1 && escenario.celdas[x][y].tipo!="[#]"){
           return true;
           
       }    
       return false;
   }
   
   public boolean termino(int jx,int jy){
      System.out.println("jx: "+jx+"\nyx:"+jy);
       //System.out.println("Tipo de celda:"+escenario.celdas[jx][jy].toString());
       if(jx<ANCHO && jx>-1 && jy<ALTO && jy>-1 && escenario.celdas[jx][jy].toString().equals("[F]")){
           //System.out.println("fx: "+escenario.celdas[jx][jy].x+"\nfy: "+escenario.celdas[jx][jy].y);
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
        
          if(jugador.x>-1 && puedeMoverse(jugador.x-1,jugador.y)){
              jugador.x--;
              escenario.celdas[jugador.x][jugador.y].tipo=jugador.tipo;
              escenario.celdas[jugador.x+1][jugador.y].tipo="[ ]";
          }
    }
    
    public void moverCeldaIzquierda(){
        if(jugador.y>-1 && puedeMoverse(jugador.x,jugador.y-1)){
         jugador.y--;
         escenario.celdas[jugador.x][jugador.y].tipo=jugador.tipo;
         escenario.celdas[jugador.x][jugador.y+1].tipo="[ ]";
            
        }
    }
    
    
   public void moverCeldaDerecha(){
       if(jugador.y< ANCHO && puedeMoverse(jugador.x,jugador.y+1)){
        jugador.y++;
        escenario.celdas[jugador.x][jugador.y].tipo=jugador.tipo;
        escenario.celdas[jugador.x][jugador.y-1].tipo="[ ]";
           
       }
   }
   
    
   

}