package factory.newyork;

import factory.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("NYStylePepperoniPizza prepare");
    }


    public void bake() {
        System.out.println("NYStylePepperoniPizza bake");
    }


    public void cut() {
        System.out.println("NYStylePepperoniPizza cut");
    }

    public void box() {
        System.out.println("NYStylePepperoniPizza box");
    }
}
