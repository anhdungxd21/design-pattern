package factory.california;

import factory.Pizza;
import factory.PizzaStore;
import factory.chicago.ChicagoStyleCheesePizza;
import factory.chicago.ChicagoStyleClamPizza;
import factory.chicago.ChicagoStylePepperoniPizza;
import factory.chicago.ChicagoStyleVeggiePizza;

public class CaliforniaStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CaliforniaStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new CaliforniaStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new CaliforniaStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new CaliforniaStyleVeggiePizza();
        }
        return pizza;
    }
}
