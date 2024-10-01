public class MoveDownCommand implements Command{
private Jugador jugador;

    public MoveDownCommand(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void execute() {
        jugador.moveDown();
    }

    @Override
    public void undo() {
        jugador.undoMoveDown();
    }
}
