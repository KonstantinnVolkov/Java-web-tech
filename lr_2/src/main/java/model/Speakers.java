package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Speakers{

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
