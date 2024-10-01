public class MoveLeftCommand implements Command{
    private Jugador jugador;

    public MoveLeftCommand(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void execute() {
        jugador.moveLeft();
    }

    @Override
    public void undo() {
        jugador.undoMoveLeft();
    }
}
