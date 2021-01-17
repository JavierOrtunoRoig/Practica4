package Ejercicio2.a;

public class Biestable {

    Estado estado;

    public Biestable() {
        this.estado = Rojo.getInstance();
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
