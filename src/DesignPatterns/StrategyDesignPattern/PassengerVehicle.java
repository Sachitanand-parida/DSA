package DesignPatterns.StrategyDesignPattern;

import DesignPatterns.StrategyDesignPattern.strategy.NormalDrive;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
