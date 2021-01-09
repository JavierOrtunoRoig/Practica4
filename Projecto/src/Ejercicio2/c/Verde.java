package Ejercicio2.c;

public class Verde extends Estado {

    @Override
    public void abrir(Buffer buffer) {
        throw new RuntimeException("No se puede abrir estando en el estado verde");
    }

    @Override
    public void cerrar(Buffer buffer) {

        if (buffer instanceof Biestable) {
            buffer.setEstado(new Rojo());
        } else {
            buffer.setEstado(new Amarillo());
        }
    }

    @Override
    public void estado(Buffer buffer) {
        System.out.println("Abierto");
    }
}
