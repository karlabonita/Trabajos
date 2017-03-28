

/**
 *
 * @author karla
 */
public class Jugador extends Constantes {
    public Escenario escenario;
    public Celda posicion; //Posicion
    
      public Jugador(Escenario escenario, int x, int y){
        this.escenario = escenario;
        posicion = new Celda(x,y,"[J]");// no lo puedo creer
        escenario.celdas[posicion.x][posicion.y].tipo = posicion.tipo;
       
    }

   public boolean puedeMoverse(int x, int y){
       if(x<ANCHO && x>-1 && y<ALTO && y>-1 && escenario.celdas[x][y].tipo!="[#]"){
           return true;
           
       }    
       return false;
   }
   
  /* public boolean termino(int jx,int jy){
      System.out.println("jx: "+jx+"\nyx:"+jy);
       //System.out.println("Tipo de celda:"+escenario.celdas[jx][jy].toString());
       if(jx<ANCHO && jx>-1 && jy<ALTO && jy>-1 && escenario.celdas[jx][jy].toString().equals("[F]")){
           //System.out.println("fx: "+escenario.celdas[jx][jy].x+"\nfy: "+escenario.celdas[jx][jy].y);
           return true;
       }
       return false;
   }
   */
     
    public void moverCeldaAbajo(){
         if(posicion.x<ALTO && puedeMoverse(posicion.x+1,posicion.y)){
            posicion.x++;
            if(escenario.celdas[posicion.x][posicion.y].tipo=="[F]"){
                System.out.println("termino");
                escenario.celdas[posicion.x][posicion.y].tipo=posicion.tipo;
                escenario.celdas[posicion.x-1][posicion.y].tipo="[ ]";
                escenario.imprimir();
                System.exit(0);
            }
            escenario.celdas[posicion.x][posicion.y].tipo=posicion.tipo;
            escenario.celdas[posicion.x-1][posicion.y].tipo="[ ]";
             
            
         }
    }
    public void moverCeldaArriba(){
        
          if(posicion.x>-1 && puedeMoverse(posicion.x-1,posicion.y)){
              posicion.x--;
         if(escenario.celdas[posicion.x][posicion.y].tipo=="[F]"){
                System.out.println("termino");
                escenario.celdas[posicion.x][posicion.y].tipo=posicion.tipo;
                escenario.celdas[posicion.x+1][posicion.y].tipo="[ ]";
                escenario.imprimir();
                System.exit(0);
            }
              escenario.celdas[posicion.x][posicion.y].tipo=posicion.tipo;
              escenario.celdas[posicion.x+1][posicion.y].tipo="[ ]";
          }
    }
    
    public void moverCeldaIzquierda(){
        if(posicion.y>-1 && puedeMoverse(posicion.x,posicion.y-1)){
         posicion.y--;
         if(escenario.celdas[posicion.x][posicion.y].tipo=="[F]"){
                System.out.println("termino");
                escenario.celdas[posicion.x][posicion.y].tipo=posicion.tipo;
                escenario.celdas[posicion.x][posicion.y+1].tipo="[ ]";
                escenario.imprimir();
                System.exit(0);
            }
         escenario.celdas[posicion.x][posicion.y].tipo=posicion.tipo;
         escenario.celdas[posicion.x][posicion.y+1].tipo="[ ]";
            
        }
    }
    
    
   public void moverCeldaDerecha(){
       if(posicion.y< ANCHO && puedeMoverse(posicion.x,posicion.y+1)){
        posicion.y++;
        if(escenario.celdas[posicion.x][posicion.y].tipo=="[F]"){
                System.out.println("termino");
                escenario.celdas[posicion.x][posicion.y].tipo=posicion.tipo;
                escenario.celdas[posicion.x][posicion.y-1].tipo="[ ]";
                escenario.imprimir();
                System.exit(0);
            }
        escenario.celdas[posicion.x][posicion.y].tipo=posicion.tipo;
        escenario.celdas[posicion.x][posicion.y-1].tipo="[ ]";
           
       }
   }
   
    
   

}