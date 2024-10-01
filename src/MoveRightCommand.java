public class MoveRightCommand  implements Command{
    private Jugador jugador;

    public MoveRightCommand(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void execute() {
        jugador.moveRight();
    }

    @Override
    public void undo() {
        jugador.undoMoveRight();
    }
}
