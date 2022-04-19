package factory.california;

import factory.Pizza;

public class CaliforniaStyleVeggiePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("CaliforniaStyleVeggiePizza prepare");
    }


    public void bake() {
        System.out.println("CaliforniaStyleVeggiePizza bake");
    }


    public void cut() {
        System.out.println("CaliforniaStyleVeggiePizza cut");
    }


    public void box() {
        System.out.println("CaliforniaStyleVeggiePizza box");
    }
}
