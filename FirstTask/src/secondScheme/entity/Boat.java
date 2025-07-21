package src.secondScheme.entity;

import src.secondScheme.contract.CargoTransport;
import src.secondScheme.contract.HasPropeller;

public class Boat extends Vehicle implements HasPropeller, CargoTransport {
    private double currentCargo;

    public Boat(String name, int maxSpeed) {
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
        return 200;
    }

    @Override
    public boolean isPropellerWorking() {
        return true;
    }

    @Override
    public void move() {

    }
}
