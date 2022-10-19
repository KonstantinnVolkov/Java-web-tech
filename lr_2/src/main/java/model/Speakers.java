package model;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
public class Speakers extends Appliance{

    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    public Speakers(int powerConsumption, int numberOfSpeakers,
                    String frequencyRange, int cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }
}
