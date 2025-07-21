package src.firstScheme.entity;

import src.firstScheme.contract.WaterDweller;
import src.firstScheme.feature.Spine;

public class Whale extends Mammal implements WaterDweller {
    private String color;

    public Whale(Spine spine, String color) {
        super(spine);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Whale(Spine spine) {
        super(spine);
    }

    @Override
    public void swim() {

    }
}
