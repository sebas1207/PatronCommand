public class Main {
    public static void main(String[] args) {

        Jugador jugador= new Jugador();
        Command moveUp = new MoveUpCommand(jugador);
        Command moveDown = new MoveDownCommand(jugador);
        Command moveLeft = new MoveLeftCommand(jugador);
        Command moveRight = new MoveRightCommand(jugador);

        mandoController mando = new mandoController();

        mando.executeCommand(moveUp);
        mando.executeCommand(moveDown);
        mando.executeCommand(moveLeft);
        mando.executeCommand(moveRight);
        mando.undoLastCommand();
        mando.undoLastCommand();
    }
}