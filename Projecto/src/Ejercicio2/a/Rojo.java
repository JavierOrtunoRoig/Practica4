package Ejercicio2.a;

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
    public void abrir(Biestable biestable) {
        biestable.setEstado(Verde.getInstance());
    }

    @Override
    public void cerrar(Biestable biestable) {
        throw new RuntimeException("No se puede cerrar estando en el estado rojo");
    }

    @Override
    public void estado(Biestable biestable) {
        System.out.println("Cerrado");
    }
}
