package DesignPatterns.DecoratorPattern;

import DesignPatterns.DecoratorPattern.BasePizza.BasePizza;
import DesignPatterns.DecoratorPattern.BasePizza.Margherita;
import DesignPatterns.DecoratorPattern.Toppings.ExtraCheese;
import DesignPatterns.DecoratorPattern.Toppings.Mushroom;

public class Decorator {
    public static void main(String[] args) {
        //Margherita + extra cheese + mushroom

        BasePizza basePizza = new Mushroom(new ExtraCheese(new Margherita()));
        //same as Mushroom mushroomPizzaWithExtraCheese = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println(basePizza.cost());
    }
}
