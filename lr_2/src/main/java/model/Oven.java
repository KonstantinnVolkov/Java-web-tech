package model;

public class Oven extends Appliance{

    private int powerConsumption;
    private double weight;
    private double depth;
    private double height;
    private double width;
    private int capacity;

    public Oven(String type, int powerConsumption, double weight,
                double depth, double height, double width, int capacity) {
        super(type);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.capacity = capacity;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDepth() {
        return depth;
    }
    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
