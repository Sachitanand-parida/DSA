package DesignPatterns.DecoratorPattern.Toppings;

import DesignPatterns.DecoratorPattern.BasePizza.BasePizza;

public class Mushroom implements ToppingDecorator{
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza= basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+50;
    }
}
