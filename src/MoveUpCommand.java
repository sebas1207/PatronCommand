public class MoveUpCommand implements Command{
    private Jugador jugador;
    public MoveUpCommand(Jugador jugador){
        this.jugador=jugador;
    }
    @Override
    public void execute(){
        jugador.moveUp();
    }
    @Override
    public void undo(){
        jugador.undoMoveUp();
    }
}
