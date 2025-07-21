package src.secondScheme.entity;

import src.secondScheme.contract.CargoTransport;
import src.secondScheme.contract.HasPropeller;
import src.secondScheme.contract.HasWeels;
import src.secondScheme.contract.HasWings;

public class Airplane extends Vehicle implements HasWeels, HasPropeller, HasWings, CargoTransport {
    private double currentCargo;

    public Airplane(String name, int maxSpeed) {
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
        return 500;
    }

    @Override
    public boolean isPropellerWorking() {
        return false;
    }

    @Override
    public int getWheelCount() {
        return 3;
    }

    @Override
    public double getWingspan() {
        return 40;
    }

    @Override
    public void move() {

    }
}
