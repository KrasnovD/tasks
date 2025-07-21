package src.secondScheme.entity;

public abstract class Vehicle {
    protected String name;
    protected int maxSpeed;

    public Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public abstract void move();
}
