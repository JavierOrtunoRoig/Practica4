package Ejercicio2.b;

public class Biestable implements Buffer {

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

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void estado() {
        this.estado.estado(this);
    }
}
