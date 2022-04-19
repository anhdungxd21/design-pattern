package factory;

import factory.chicago.ChicagoStyleStore;
import factory.newyork.NYPizzaStore;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);

    public static void main(String[] args) {
        PizzaStore ny = new NYPizzaStore();
        PizzaStore chicago = new ChicagoStyleStore();

        ny.orderPizza("cheese");
        chicago.orderPizza("cheese");
    }
}
