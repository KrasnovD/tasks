package src.secondScheme.entity;

import src.secondScheme.contract.HasWeels;

public class Taxi extends Vehicle implements HasWeels {
    public Taxi(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public int getWheelCount() {
        return 4;
    }

    @Override
    public void move() {

    }
}
