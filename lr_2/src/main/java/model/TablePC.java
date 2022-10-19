package model;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
public class TablePC extends Appliance {

    private double batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;

    public TablePC(double batteryCapacity, int displayInches, int memoryRom,
                   int flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }
}
