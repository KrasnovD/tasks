package src.secondScheme.entity;

import src.secondScheme.contract.CargoTransport;
import src.secondScheme.contract.HasPropeller;

public class Tanker extends Vehicle implements HasPropeller, CargoTransport {
    private double currentCargo;

    public Tanker(String name, int maxSpeed) {
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
        return 1000;
    }

    @Override
    public boolean isPropellerWorking() {
        return false;
    }

    @Override
    public void move() {

    }
}
