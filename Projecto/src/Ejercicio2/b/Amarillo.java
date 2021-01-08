package Ejercicio2.b;

public class Amarillo extends Estado {
    @Override
    public void abrir(Buffer buffer) {
        if (buffer instanceof Biestable) {
            throw new RuntimeException("Un biestable no puede estar en el estado amarillo");
        } else {
            buffer.setEstado(new Verde());
        }
    }

    @Override
    public void cerrar(Buffer buffer) {
        if (buffer instanceof Biestable) {
            throw new RuntimeException("Un biestable no puede estar en el estado amarillo");
        } else {
            buffer.setEstado(new Rojo());
        }
    }

    @Override
    public void estado(Buffer buffer) {
        System.out.println("precaucion");
    }
}
