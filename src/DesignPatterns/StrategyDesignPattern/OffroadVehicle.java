package DesignPatterns.StrategyDesignPattern;

import DesignPatterns.StrategyDesignPattern.strategy.SpecialDrive;

public class OffroadVehicle extends Vehicle{
    public OffroadVehicle() {
        super(new SpecialDrive());
    }
}
