package ua.lviv.iot.algo.part1.lamp;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeskLamp extends Light {
    private boolean isOn = false;
    private int brightness = 5;
    private String color = "white";
    private String producer = "Unknown";

    public DeskLamp(String producer,int workTimeInMinutes){
        this.producer = producer;
        this.workTimeInMinutes = workTimeInMinutes;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void setBrightness(int value) {
        if (value >= 1 && value <= 10) {
            this.brightness = value;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }
/*
    private static DeskLamp instance;

    public static DeskLamp getInstance() {
        instance = new DeskLamp();
        return instance;
    }
*/
}