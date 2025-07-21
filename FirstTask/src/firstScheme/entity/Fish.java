package src.firstScheme.entity;

import src.firstScheme.contract.WaterDweller;

public class Fish extends Animal implements WaterDweller {
    private String size;

    public Fish(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void swim() {

    }
}
