package Ejercicio2.b;

public class Verde extends Estado {

    private static Verde instance;
    
    private Verde() { }

    public static Verde getInstance() {
        if (instance == null) {
            instance = new Verde();
            
        }
        return instance;
    }

    @Override
    public void abrir(Buffer buffer) {
        throw new RuntimeException("No se pue   de abrir estando en el estado Verde");
    }
    
    @Override
    public void cerrar(Buffer buffer) {
        buffer.setEstado(Amarillo.getInstance());
    }

    @Override
    public void estado(Buffer buffer) {
        System.out.println("Abierto");
    }
}
