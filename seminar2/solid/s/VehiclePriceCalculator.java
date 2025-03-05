package seminar2.solid.s;

public class VehiclePriceCalculator {
    public int calculatePrice(Vehicle vehicle) {
        int price = 0;

        price += (vehicle.getWeight() > 2) ? 2000 : 5000;
        price += vehicle.getColor().equalsIgnoreCase("black") ? 500 : 2000;
        price += (vehicle.getModel().equalsIgnoreCase("Renault") || vehicle.getModel().equalsIgnoreCase("Dacia")) ? 1000 : 4000;

        return price;
    }
}
