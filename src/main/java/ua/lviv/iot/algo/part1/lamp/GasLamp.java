package ua.lviv.iot.algo.part1.lamp;

import lombok.Getter;

import java.io.BufferedWriter;
import java.io.IOException;

@Getter
public class GasLamp extends Light {
    private String outOfGas;
    private int volume;

    private static boolean headerWritten = false;
    private final static GasLamp defaultGasLamp = new GasLamp();

    public GasLamp(String producer, int workTimeInMinutes) {
        this.producer = producer;
        this.workTimeInMinutes = workTimeInMinutes;
    }

    public GasLamp() {
    }

    public GasLamp brightness(int tankVolume) {
        if (tankVolume == 100) {
            System.out.println("high brightness");
        }
        if (tankVolume == 50) {
            System.out.println("medium brightness");
        }
        if (tankVolume == 10) {
            System.out.println("low brightness");
        }
        return defaultGasLamp;
    }

    public String getHeaders() {
        return super.getHeaders()+","
                +"outOfGas"+","
                +"chargeConsumptionPerMinuteOfFlight";
    }

    public String toCSV() {
        return super.toCSV()+","
                +outOfGas+","
                +volume;
    }

    public static void writeHeader(BufferedWriter writer) throws IOException {
        if (!headerWritten) {
            writer.write(new GasLamp().getHeaders());
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
