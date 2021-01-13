package Ejercicio2.c;

public class Rojo extends Estado {
    @Override
    public void abrir(Buffer buffer) {
        buffer.setEstado(new Verde());
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
