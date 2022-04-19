package factory.chicago;

import factory.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("ChicagoStyleVeggiePizza prepare");
    }


    public void bake() {
        System.out.println("ChicagoStyleVeggiePizza bake");
    }


    public void cut() {
        System.out.println("ChicagoStyleVeggiePizza cut");
    }

    public void box() {
        System.out.println("ChicagoStyleVeggiePizza box");
    }
}
