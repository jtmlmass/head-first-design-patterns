package decorator_pattern.implementations.beverages;

import decorator_pattern.components.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.setDescription("Dark Roast Coffee");
    }

    public double cost() {
        return .99;
    }
}
