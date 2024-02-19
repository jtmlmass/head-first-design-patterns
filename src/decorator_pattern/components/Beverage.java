package decorator_pattern.components;

public abstract class Beverage {
  public String description = "Unknown Beverage";
  public abstract double cost();
  public String getDescription() {
    return this.description;
  }
}
