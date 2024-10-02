public class Jugador {
    private int movimientoEjeX =0;
    private int movimientoEjeY= 0;

    public void moveUp(){
        movimientoEjeY++;
        System.out.println("Jugador se mueve hacia arriba. Nueva posicion: ( "+movimientoEjeX+" ,"+movimientoEjeY+" )");

    }
    public void moveDown(){

        movimientoEjeY--;
        System.out.println("Jugador se mueve hacia abajo. Nueva posicion: ( "+movimientoEjeX+" ,"+movimientoEjeY+" )");
    }
    public void moveLeft(){
        movimientoEjeX--;
        System.out.println("Jugador se mueve hacia la izquierda. Nueva posicion: ( "+movimientoEjeX+" ,"+movimientoEjeY+" )");
    }
    public void moveRight(){
        movimientoEjeX++;
        System.out.println("Jugador se mueve hacia la derecha. Nueva posicion: ( "+movimientoEjeX+" ,"+movimientoEjeY+" )");
    }
    public void undoMoveUp(){
        movimientoEjeY--;
        System.out.println("Deshacer movimiento arriba. Nueva posición: (" + movimientoEjeX + ", " + movimientoEjeY + ")");
    }
    public void undoMoveDown() {
        movimientoEjeY ++;

        System.out.println("Deshacer movimiento abajo. Nueva posición: (" + movimientoEjeX + ", " + movimientoEjeY + ")");
    }

    public void undoMoveLeft() {
        movimientoEjeX++;
        System.out.println("Deshacer movimiento izquierda. Nueva posición: (" + movimientoEjeX + ", " + movimientoEjeY + ")");
    }

    public void undoMoveRight() {
        movimientoEjeX--;
        System.out.println("Deshacer movimiento derecha. Nueva posición: (" + movimientoEjeX + ", " + movimientoEjeY + ")");
    }
}