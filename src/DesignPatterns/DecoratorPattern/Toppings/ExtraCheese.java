package DesignPatterns.DecoratorPattern.Toppings;

import DesignPatterns.DecoratorPattern.BasePizza.BasePizza;

public class ExtraCheese implements ToppingDecorator{
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza= basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
