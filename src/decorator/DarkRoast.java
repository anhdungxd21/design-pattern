package decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super.description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 1d;
    }
}
