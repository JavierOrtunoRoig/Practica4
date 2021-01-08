public class Verde extends Estado {

    @Override
    public void abrir(Biestable biestable) {
        throw new RuntimeException("No se puede abrir estando en el estado verde");
    }

    @Override
    public void cerrar(Biestable biestable) {
        biestable.setEstado(new Rojo());
    }
}
