package Ejercicio2.b;

public class Biestable {

    Estado estado;

    public Biestable() {
        this.estado = new Rojo();
    }

    public void abrir() {
        estado.abrir(this);
    }

    public void cerrar() {
        estado.cerrar(this);
    }

    protected void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void estado() {
        this.estado.estado(this);
    }
}
