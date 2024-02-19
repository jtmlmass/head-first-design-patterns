package decorator_pattern.implementations.beverages;

import decorator_pattern.components.Beverage;

public class Espresso extends Beverage {
  public Espresso() {
    setDescription("Espresso");
  }

  public double cost() {
    return 1.99;
  }
}
