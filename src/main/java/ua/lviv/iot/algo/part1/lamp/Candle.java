package ua.lviv.iot.algo.part1.lamp;

import lombok.Getter;

import java.io.BufferedWriter;
import java.io.IOException;

@Getter
public class Candle extends Light {
    private String fetus;
    private int length;



private static boolean headerWritten = false;
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

    public String getHeaders() {
        return super.getHeaders()+","
                +"fetus"+","
                +"length";
    }

    public String toCSV() {
        return super.toCSV()+","
                +fetus+","
                +length;
    }

    public static void writeHeader(BufferedWriter writer) throws IOException {
        if (!headerWritten) {
            writer.write(new Candle().getHeaders());
            writer.newLine();
            headerWritten = true;
        }
    }

    public void write(BufferedWriter writer) throws IOException {
        writeHeader(writer);
        writer.write(this.toCSV());
        writer.newLine();
    }


}
