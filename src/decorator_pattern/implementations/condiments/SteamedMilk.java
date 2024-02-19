package decorator_pattern.implementations.condiments;

import decorator_pattern.components.Beverage;
import decorator_pattern.components.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {
  public SteamedMilk(Beverage beverage) {
      super(beverage);
  }

  public String getDescription() {
      return beverage.getDescription() + ", Steamed Milk";
  }

  public double cost() {
      return .10 + beverage.cost();
  }
}
