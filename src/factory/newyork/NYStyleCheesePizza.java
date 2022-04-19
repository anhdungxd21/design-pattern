package factory.newyork;

import factory.Pizza;

public class NYStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("NYStyleCheesePizza prepare");
    }


    public void bake() {
        System.out.println("NYStyleCheesePizza bake");
    }


    public void cut() {
        System.out.println("NYStyleCheesePizza cut");
    }


    public void box() {
        System.out.println("NYStyleCheesePizza box");
    }
}
