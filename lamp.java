package ua.lviv.iot.algo.part1.lamp;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeskLamp {
    private boolean isOn = false;
    private int brightness = 5;
    private String color = "white";
    private String producer = "Unknown";

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

    private static DeskLamp instance;

    public static DeskLamp getInstance() {
        instance = new DeskLamp();
        return instance;
    }

    public static void main(String[] args) {
        DeskLamp lamp1 = new DeskLamp();
        DeskLamp lamp2 = new DeskLamp(true, 8, "yellow", "Philips");
        DeskLamp lamp3 = DeskLamp.getInstance();
        DeskLamp lamp4 = DeskLamp.getInstance();

        DeskLamp[] lamps = {lamp1, lamp2, lamp3, lamp4};

        for (DeskLamp lamp : lamps) {
            System.out.println(lamp.toString());
        }
    }
}
