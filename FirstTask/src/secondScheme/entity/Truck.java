package src.secondScheme.entity;

import src.secondScheme.contract.CargoTransport;
import src.secondScheme.contract.HasWeels;

public class Truck extends Vehicle implements HasWeels, CargoTransport {
    private double currentCargo;

    public Truck(String name, int maxSpeed) {
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
        return 100;
    }

    @Override
    public int getWheelCount() {
        return 0;
    }

    @Override
    public void move() {

    }
}
