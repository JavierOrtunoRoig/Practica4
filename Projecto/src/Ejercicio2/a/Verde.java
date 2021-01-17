package Ejercicio2.a;

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
    public void abrir(Biestable biestable) {
        throw new RuntimeException("No se puede abrir estando en el estado verde");
    }

    @Override
    public void cerrar(Biestable biestable) {
        biestable.setEstado(Rojo.getInstance());
    }

    @Override
    public void estado(Biestable biestable) {
        System.out.println("Abierto");
    }
}
