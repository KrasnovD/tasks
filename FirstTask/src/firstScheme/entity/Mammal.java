package src.firstScheme.entity;

import src.firstScheme.feature.Spine;

public abstract class Mammal extends Animal {
    private Spine spine;

    public Mammal(Spine spine) {
        this.spine = spine;
    }

    public void setSpine(Spine spine) {
        this.spine = spine;
    }

    public Spine getSpine() {
        return spine;
    }
}
