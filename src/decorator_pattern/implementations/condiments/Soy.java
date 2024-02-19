package decorator_pattern.implementations.condiments;

import decorator_pattern.components.Beverage;
import decorator_pattern.components.CondimentDecorator;

public class Soy extends CondimentDecorator {
  public Beverage beverage;

  public Soy(Beverage beverage) {
      this.beverage = beverage;
  }

  public String getDescription() {
      return beverage.getDescription() + ", Soy";
  }

  public double cost() {
      return .15 + beverage.cost();
  }
}
