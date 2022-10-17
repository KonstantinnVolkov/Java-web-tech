package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class TablePC {

    private double batteryCapacity;
    private int displayInchs;
    private int memoryROM;
    private int flashMemoryCapacity;
    private String color;

    public TablePC(double batteryCapacity, int displayInchs, int memoryROM,
                   int flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInchs = displayInchs;
        this.memoryROM = memoryROM;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }
}
