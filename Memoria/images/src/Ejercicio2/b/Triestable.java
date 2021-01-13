package Ejercicio2.b;

public class Triestable implements Buffer{

    Estado estado;

    public Triestable() {
        this.estado = new Rojo();
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
