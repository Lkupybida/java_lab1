package ua.lviv.iot.algo.part1.lamp;

import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class DeskLamp extends Light {
    private boolean isOn = false;
    private int brightness = 5;
    private String color = "white";
    private String producer = "Unknown";

    public DeskLamp(String producer, int workTimeInMinutes) {
        this.producer = producer;
        this.workTimeInMinutes = workTimeInMinutes;
    }


    public void setBrightness(int value) {
        if (value >= 1 && value <= 10) {
            this.brightness = value;
        }
    }

}