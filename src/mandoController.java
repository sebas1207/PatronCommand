import java.util.Stack;

public class MandoController {
    private Stack<Command> movimientos = new Stack<>();

    public void executeCommand(Command command) {
      command.execute();
      movimientos.push(command);
    }
    public void undoLastCommand(){
       if(!movimientos.isEmpty()) {
           Command lastCommand=movimientos.pop();
           lastCommand.undo();
       } else {
           System.out.println("NO hay movimiento");
       }
    }
}
