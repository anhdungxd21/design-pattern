package factory.newyork;

import factory.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("NYStyleVeggiePizza prepare");
    }


    public void bake() {
        System.out.println("NYStyleVeggiePizza bake");
    }


    public void cut() {
        System.out.println("NYStyleVeggiePizza cut");
    }

    public void box() {
        System.out.println("NYStyleVeggiePizza box");
    }
}
