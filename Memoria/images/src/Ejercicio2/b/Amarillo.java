package Ejercicio2.b;

public class Amarillo extends Estado {

    private static Amarillo instance;

    private Amarillo() {  }

    public static Amarillo getInstance() {
        if (instance == null) {
            instance = new Amarillo();
            
        }
        return instance;
    }


    @Override
    public void abrir(Buffer buffer) {
        if (buffer instanceof Biestable) {
            throw new RuntimeException("Un biestable no puede estar en el estado amarillo");
        } else {
            buffer.setEstado(Verde.getInstance());
        }
    }

    @Override
    public void cerrar(Buffer buffer) {
        if (buffer instanceof Biestable) {
            throw new RuntimeException("Un biestable no puede estar en el estado amarillo");
        } else {
            buffer.setEstado(Rojo.getInstance());
        }
    }

    @Override
    public void estado(Buffer buffer) {
        System.out.println("precaucion");
    }
}
