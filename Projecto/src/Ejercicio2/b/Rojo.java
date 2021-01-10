package Ejercicio2.b;

public class Rojo extends Estado {
    @Override
    public void abrir(Buffer buffer) {
        if (buffer instanceof Biestable) {
            buffer.setEstado(new Verde());
        } else {
            buffer.setEstado(new Amarillo());
        }
    }

    @Override
    public void cerrar(Buffer buffer) {
        throw new RuntimeException("No se puede cerrar estando en el estado rojo");
    }

    @Override
    public void estado(Buffer buffer) {
        System.out.println("Cerrado");
    }
}
