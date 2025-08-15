package DesignPatterns.StrategyDesignPattern;

import DesignPatterns.StrategyDesignPattern.strategy.SpecialDrive;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SpecialDrive());
    }
}
