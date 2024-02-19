package decorator_pattern.implementations.beverages;

import decorator_pattern.components.Beverage;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "House Blend Coffee";
  }

  public double cost() {
    return .89;
  }
}
