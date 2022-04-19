package factory.california;

import factory.Pizza;

public class CaliforniaStylePepperoniPizza extends Pizza {

    public void prepare() {
        System.out.println("CaliforniaStylePepperoniPizza prepare");
    }


    public void bake() {
        System.out.println("CaliforniaStylePepperoniPizza bake");
    }

    public void cut() {
        System.out.println("CaliforniaStylePepperoniPizza cut");
    }

    public void box() {
        System.out.println("CaliforniaStylePepperoniPizza box");
    }
}
