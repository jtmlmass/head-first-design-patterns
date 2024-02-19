package decorator_pattern.implementations.condiments;

import decorator_pattern.components.Beverage;
import decorator_pattern.components.CondimentDecorator;

public class Mocha extends CondimentDecorator {
  public Mocha(Beverage beverage) {
    super(beverage);
  }

  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }

  public double cost() {
      return .20 + beverage.cost();
  }
}
