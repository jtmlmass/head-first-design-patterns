package decorator_pattern.implementations.condiments;

import decorator_pattern.components.Beverage;
import decorator_pattern.components.CondimentDecorator;

public class Soy extends CondimentDecorator {
  public Soy(Beverage beverage) {
    super(beverage);
  }

  public String getDescription() {
      return beverage.getDescription() + ", Soy";
  }

  public double cost() {
      return .15 + beverage.cost();
  }
}
