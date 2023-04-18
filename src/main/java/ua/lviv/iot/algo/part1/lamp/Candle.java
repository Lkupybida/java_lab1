package ua.lviv.iot.algo.part1.lamp;

import lombok.Getter;

@Getter
public class Candle extends Light {


    private final static Candle defaultCandle = new Candle();

    public Candle(String producer, int workTimeInMinutes) {
        this.producer = producer;
        this.workTimeInMinutes = workTimeInMinutes;
    }

    public Candle() {
    }

    public Candle smell(int howManyCandlesCurned) {
        if (howManyCandlesCurned == 100) {
            System.out.println(" no smell");
        }
        if (howManyCandlesCurned == 50) {
            System.out.println("the smell of lavender");
        }
        if (howManyCandlesCurned == 0) {
            System.out.println("the smell of a burning curtain");
        }
        return defaultCandle;
    }

    public Candle brightness(int brightness) {
        if (brightness == 100) {
            System.out.println("high brightness");
        }
        if (brightness == 50) {
            System.out.println("medium brightness");
        }
        if (brightness == 10) {
            System.out.println("low brightness");
        }
        return defaultCandle;
    }

}
