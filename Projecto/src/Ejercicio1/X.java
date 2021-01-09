package Ejercicio1;

public class X implements Servicio{

    @Override
    public void rutina1() {
        System.out.println("Ha entrado en la rutina 1");

    }

    @Override
    public void rutina2(Double y, Object consumidor) {
        System.out.println("Ha entrado en la rutina 2");

    }

    @Override
    public Boolean rutina3(Integer i, Object consumidor) {
        System.out.println("Ha entrado en la rutina 3");
        return true;
    }

    @Override
    public Integer rutina4() {
        System.out.println("Ha entrado en la rutina 4");
        return 1;
    }
}
