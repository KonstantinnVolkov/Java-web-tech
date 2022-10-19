package model;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
public class Oven extends Appliance{

    private int powerConsumption;
    private double weight;
    private double depth;
    private double height;
    private double width;
    private int capacity;

    public Oven(int powerConsumption, double weight,
                double depth, double height, double width, int capacity) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.capacity = capacity;
    }
}
