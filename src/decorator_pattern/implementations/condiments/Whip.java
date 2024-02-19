package decorator_pattern.implementations.condiments;

import decorator_pattern.components.Beverage;
import decorator_pattern.components.CondimentDecorator;

public class Whip extends CondimentDecorator {
  public Whip(Beverage beverage) {
      super(beverage);
  }

  public String getDescription() {
      return beverage.getDescription() + ", Whip";
  }

  public double cost() {
      return .10 + beverage.cost();
  }
}
