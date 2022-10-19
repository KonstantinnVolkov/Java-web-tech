package model;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
public class Refrigerator extends Appliance{

    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public Refrigerator(int powerConsumption, String filterType,
                        String bagType, String wandType,
                        int motorSpeedRegulation, int cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }
}
