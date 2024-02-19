package decorator_pattern.implementations.beverages;

import decorator_pattern.components.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        setDescription("Decaf Coffee");
    }

    public double cost() {
        return 1.05;
    }
}
