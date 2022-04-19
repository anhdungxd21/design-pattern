package factory.chicago;

import factory.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("ChicagoStyleClamPizza prepare");
    }


    public void bake() {
        System.out.println("ChicagoStyleClamPizza bake");
    }


    public void cut() {
        System.out.println("ChicagoStyleClamPizza cut");
    }

    public void box() {
        System.out.println("ChicagoStyleClamPizza box");
    }
}
