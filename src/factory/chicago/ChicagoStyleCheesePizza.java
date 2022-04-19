package factory.chicago;

import factory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("ChicagoStyleCheesePizza prepare");
    }


    public void bake() {
        System.out.println("ChicagoStyleCheesePizza bake");
    }


    public void cut() {
        System.out.println("ChicagoStyleCheesePizza cut");
    }

    public void box() {
        System.out.println("ChicagoStyleCheesePizza box");
    }
}
