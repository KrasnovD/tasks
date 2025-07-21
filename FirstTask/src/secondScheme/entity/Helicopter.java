package src.secondScheme.entity;

import src.secondScheme.contract.CargoTransport;
import src.secondScheme.contract.HasPropeller;
import src.secondScheme.contract.HasWeels;

public class Helicopter extends Vehicle implements HasWeels, HasPropeller, CargoTransport {
    private double currentCargo;

    public Helicopter(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void loadCargo(double weight) {
        this.currentCargo = weight;
    }

    @Override
    public void unloadCargo() {
        currentCargo = 0;
    }

    @Override
    public double getMaxLoadCapacity() {
        return 600;
    }

    @Override
    public boolean isPropellerWorking() {
        return false;
    }

    @Override
    public int getWheelCount() {
        return 4;
    }

    @Override
    public void move() {

    }
}
