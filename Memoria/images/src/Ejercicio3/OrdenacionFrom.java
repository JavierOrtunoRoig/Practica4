package Ejercicio3;

public class OrdenacionFrom implements Ordenacion {

    public Boolean before(Email m1, Email m2) {    // m1 va detras de m2
        boolean resultado;

        if (m1.from.compareTo(m2.from) > 0) {
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }
}