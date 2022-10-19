package model;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
public class Laptop extends Appliance {

    private double batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private int displayInches;

    public Laptop(double batteryCapacity, String os,
                  int memoryRom, int systemMemory, double cpu, int displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }
}
