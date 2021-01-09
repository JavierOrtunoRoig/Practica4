package Ejercicio3;

public class OrdenacionPriority implements Ordenacion{

    public Boolean before(Email m1, Email m2) {	// m1 va detras de m2
        boolean resultado;

        if(m1.priority.prioridad < m2.priority.prioridad) {
            resultado = true;
        }else {
            resultado = false;
        }

        return resultado;
    }
}