package Ejercicio2.c;

public class Verde extends Estado {

    private static Verde instance;

    private Verde() {

    }

    public static Verde getInstance() {
        if (instance == null) {
            instance = new Verde();
        }
        return instance;
    }

    @Override
    public void abrir(Buffer buffer) {
        throw new RuntimeException("No se puede abrir estando en el estado verde");
    }

    @Override
    public void cerrar(Buffer buffer) {

        if (buffer instanceof Biestable) {
            buffer.setEstado(Rojo.getInstance());
        } else {
            buffer.setEstado(Amarillo.getInstance());
        }
    }

    @Override
    public void estado(Buffer buffer) {
        System.out.println("Abierto");
    }
}
