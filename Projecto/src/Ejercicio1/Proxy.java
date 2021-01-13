package Ejercicio1;

public class Proxy implements Servicio {

    X x;

    public Proxy(X s) {
        x = s;
    }

    @Override
    public void rutina1() {
        this.x.rutina1();
    }

    @Override
    public void rutina2(Double y, Object consumidor) {
        if (consumidor instanceof A || consumidor instanceof B) {
            this.x.rutina2(y, consumidor);
        } else {
            System.out.println("El objeto no tiene permiso para usar esta clase.");
        }
    }

    @Override
    public Boolean rutina3(Integer i, Object consumidor) {
        if (consumidor instanceof A || consumidor instanceof C) {
            return this.x.rutina3(i,consumidor);
        } else {
            System.out.println("El objeto no tiene permiso para usar esta clase.");
            return null;
        }
    }
}