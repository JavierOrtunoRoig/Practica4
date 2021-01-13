package Ejercicio1;

public class Proxy implements Servicio {

    X x;
    Object consumidor;

    public Proxy(X s, Object consumidor) {
        x = s;
        this.consumidor = consumidor;
    }

    @Override
    public void rutina1() {
        this.x.rutina1();
    }

    @Override
    public void rutina2(Double y) {
        if (consumidor instanceof A || consumidor instanceof B) {
            this.x.rutina2(y);
        } else {
            System.out.println("El objeto no tiene permiso para usar esta clase.");
        }
    }

    @Override
    public Boolean rutina3(Integer i) {
        if (consumidor instanceof A || consumidor instanceof C) {
            return this.x.rutina3(i);
        } else {
            System.out.println("El objeto no tiene permiso para usar esta clase.");
            return null;
        }
    }
}