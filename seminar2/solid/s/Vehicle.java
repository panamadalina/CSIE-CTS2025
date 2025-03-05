package seminar2.solid.s;

public class Vehicle {
    private int weight;
    private String color;
    private String model;

    public Vehicle(int weight, String color, String model) {
        this.weight = weight;
        this.color = color;
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void printDetails() {
        System.out.println("Vehicle " + model + " has weight: " + weight + " color: " + color);
    }
}