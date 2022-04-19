package factory.california;

import factory.Pizza;

public class CaliforniaStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("CaliforniaStyleCheesePizza prepare");
    }


    public void bake() {
        System.out.println("CaliforniaStyleCheesePizza bake");
    }


    public void cut() {
        System.out.println("CaliforniaStyleCheesePizza cut");
    }


    public void box() {
        System.out.println("CaliforniaStyleCheesePizza box");
    }
}
