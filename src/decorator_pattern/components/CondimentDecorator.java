package decorator_pattern.components;

public abstract class  CondimentDecorator extends Beverage{
  public final Beverage beverage;

  protected CondimentDecorator(Beverage beverage) {
    this.beverage = beverage;
  }
}
