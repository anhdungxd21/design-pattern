package factory;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("GreekPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("GreekPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("GreekPizza bake");
    }

    @Override
    public void box() {
        System.out.println("GreekPizza bake");
    }
}
