package factory.california;

import factory.Pizza;

public class CaliforniaStyleClamPizza extends Pizza {

    public void prepare() {
        System.out.println("CaliforniaStyleClamPizza prepare");
    }


    public void bake() {
        System.out.println("CaliforniaStyleClamPizza bake");
    }


    public void cut() {
        System.out.println("CaliforniaStyleClamPizza cut");
    }


    public void box() {
        System.out.println("CaliforniaStyleClamPizza box");
    }
}
