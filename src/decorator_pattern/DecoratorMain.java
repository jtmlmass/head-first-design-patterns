package decorator_pattern;

import decorator_pattern.components.Beverage;
import decorator_pattern.implementations.beverages.DarkRoast;
import decorator_pattern.implementations.beverages.Espresso;
import decorator_pattern.implementations.beverages.HouseBlend;
import decorator_pattern.implementations.condiments.Mocha;
import decorator_pattern.implementations.condiments.Soy;
import decorator_pattern.implementations.condiments.Whip;

public class DecoratorMain {
    public static void main(String[] args) {
      // This method of creating the Beverages/condiments can be improved with Factory Pattern and the Builder Pattern
      // Create a new Espresso Beverage 1
      Beverage beverage1 = new Espresso();
      System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

      // Create a new DarkRoast Beverage 2
      Beverage beverage2 = new DarkRoast();
      beverage2 = new Mocha(beverage2);
      beverage2 = new Mocha(beverage2);
      beverage2 = new Whip(beverage2);
      System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

      // Create a new Beverage 3 of House Blend
      Beverage beverage3 = new HouseBlend();
      beverage3 = new Soy(beverage3);
      beverage3 = new Mocha(beverage3);
      beverage3 = new Whip(beverage3);
      System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}