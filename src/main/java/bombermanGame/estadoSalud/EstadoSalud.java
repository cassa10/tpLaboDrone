package bombermanGame.estadoSalud;

import bombermanGame.Bomberman;
import bombermanGame.contenidoMapa.direccion.Coordinate;
import bombermanGame.contenidoMapa.direccion.Direction;
import bombermanGame.Juego;
import bombermanGame.contenidoMapa.Item;
import bombermanGame.contenidoMapa.poder.estadoPoder.EstadoPoder;

public abstract class EstadoSalud {

    public boolean siEstaMuerto(){return true;}

    public void morir(Bomberman b){}

    public void accionBomba(Juego juego, EstadoPoder miPoder) {}

    public void obtenerPoder(Bomberman b,EstadoPoder estadoPoder){}

    public boolean noTieneNingunPoder(EstadoPoder estadoPoder){return false;}

    public boolean tienePoderLanzarBombas(EstadoPoder miPoder){return false;}

    public boolean tienePoderSaltarPared(EstadoPoder miPoder){return false;}

    public boolean tienePoderSaltarYLanzarBombas(EstadoPoder miPoder){return false;}


    public void moverse(EstadoPoder miPoder, Item item, Juego juego, Coordinate hacia) throws Exception{}

    public Direction cambiarDondeMira(Direction dir){return null;}
}
