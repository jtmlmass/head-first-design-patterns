package decorator_pattern.components;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Beverage {
  private String description = "Unknown Beverage";
  public abstract double cost();
}
