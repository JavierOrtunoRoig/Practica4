package Ejercicio3;

public class OrdenacionDate implements Ordenacion{

    public Boolean before(Email m1, Email m2) {	// m1 va detras de m2
        boolean resultado;

        if(m1.date.compareTo(m2.date) > 0) { // <
            resultado = true;
        }else {
            resultado = false;
        }

        return resultado;
    }
}