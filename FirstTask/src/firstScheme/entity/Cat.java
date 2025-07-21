package src.firstScheme.entity;

import src.firstScheme.feature.Fur;
import src.firstScheme.feature.Spine;

public class Cat extends Mammal {
    private String name;
    private Fur fur;

    public Cat(Spine spine, String name, String furColor, int furLength) {
        super(spine);
        this.name = name;
        this.fur = new Fur(furColor, furLength);
    }

    public void setFur(Fur fur) {
        this.fur = fur;
    }
}
