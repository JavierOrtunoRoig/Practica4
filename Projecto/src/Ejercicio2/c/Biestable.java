package Ejercicio2.c;

public class Biestable implements Buffer {

    Estado estado;
    Buffer buffer;

    public Biestable() {
        this.estado = new Rojo();
        this.buffer = null;
    }

    public void abrir() {
        if (buffer == null) {
            estado.abrir(this);
        } else {
            buffer.abrir();
        }
    }

    public void cerrar() {
        if (buffer == null) {
            estado.cerrar(this);
        } else {
            buffer.cerrar();
        }
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void estado() {
        if (buffer == null) {
            this.estado.estado(this);
        } else {
            buffer.estado();
        }
    }

    public void cambio() { this.buffer = new Triestable(new Amarillo()); }
}
