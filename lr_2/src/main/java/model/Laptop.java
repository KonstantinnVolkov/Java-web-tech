package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Laptop {

    private double batteryCapacity;
    private String operatingSystem;
    private int memoryROM;
    private int systemMemory;
    private double cpu;
    private int displayInchs;

    public Laptop(double batteryCapacity, String operatingSystem,
                  int memoryROM, int systemMemory, double cpu, int displayInchs) {
        this.batteryCapacity = batteryCapacity;
        this.operatingSystem = operatingSystem;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
    }
}
