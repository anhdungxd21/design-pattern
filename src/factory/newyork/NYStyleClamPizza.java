package factory.newyork;

import factory.Pizza;

public class NYStyleClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("NYStyleClamPizza prepare");
    }


    public void bake() {
        System.out.println("NYStyleClamPizza bake");
    }


    public void cut() {
        System.out.println("NYStyleClamPizza cut");
    }


    public void box() {
        System.out.println("NYStyleClamPizza box");
    }
}
