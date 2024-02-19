package decorator_pattern.implementations.beverages;

import decorator_pattern.components.Beverage;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    setDescription("House Blend Coffee");
  }

  public double cost() {
    return .89;
  }
}
