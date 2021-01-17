package Ejercicio2.c;

public class Rojo extends Estado {

    private static Rojo instance;

    private Rojo() {

    }

    public static Rojo getInstance() {
        if (instance == null) {
            instance = new Rojo();
            
        }
        return instance;
    }

    @Override
    public void abrir(Buffer buffer) {
        buffer.setEstado(Verde.getInstance());
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
