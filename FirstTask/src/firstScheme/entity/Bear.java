package src.firstScheme.entity;

import src.firstScheme.feature.Fur;
import src.firstScheme.feature.Spine;

public class Bear extends Mammal{
    private String wildness;
    private Fur fur;

    public Bear(Spine spine, String wildness, String furColor, int furLength) {
        super(spine);
        this.wildness = wildness;
        this.fur = new Fur(furColor, furLength);
    }

    public void setFur(Fur fur) {
        this.fur = fur;
    }
}
