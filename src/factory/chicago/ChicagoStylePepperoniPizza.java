package factory.chicago;

import factory.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("ChicagoStylePepperoniPizza prepare");
    }


    public void bake() {
        System.out.println("ChicagoStylePepperoniPizza bake");
    }


    public void cut() {
        System.out.println("ChicagoStylePepperoniPizza cut");
    }

    public void box() {
        System.out.println("ChicagoStylePepperoniPizza box");
    }
}
