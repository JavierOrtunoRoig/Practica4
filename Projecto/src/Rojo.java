public class Rojo extends Estado{
    @Override
    public void abrir(Biestable biestable) {
        biestable.setEstado(new Verde());
    }

    @Override
    public void cerrar(Biestable biestable) {
        throw new RuntimeException("No se puede cerrar estando en el estado rojo");
    }
}
