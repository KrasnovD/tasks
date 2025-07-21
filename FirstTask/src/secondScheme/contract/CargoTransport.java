package src.secondScheme.contract;

public interface CargoTransport {
    void loadCargo(double weight);
    void unloadCargo();
    double getMaxLoadCapacity();
}
