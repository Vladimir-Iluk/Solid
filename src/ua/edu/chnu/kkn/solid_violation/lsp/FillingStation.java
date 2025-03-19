package ua.edu.chnu.kkn.solid_violation.lsp;

public class FillingStation {

    public void refuel(PetrolFiling vehicle) {
        vehicle.fillUpWithFuel();
    }

    public void charge(ChargeStation vehicle) {
        vehicle.chargeBattery();
    }
}
