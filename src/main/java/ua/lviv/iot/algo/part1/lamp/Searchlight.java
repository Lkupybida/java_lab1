package ua.lviv.iot.algo.part1.lamp;

import lombok.Getter;

import java.io.BufferedWriter;
import java.io.IOException;


@Getter


public class Searchlight extends Light {
    private String producer;
    private int power;

    private static boolean headerWritten = false;
    private final static Searchlight Searchlight = new Searchlight();

    public Searchlight(String producer, int workTimeInMinutes) {
        this.producer = producer;
        this.workTimeInMinutes = workTimeInMinutes;
    }

    public Searchlight() {
    }

    public Searchlight brightness(int theNumberOfDiodes) {
        if (theNumberOfDiodes == 1000) {
            System.out.println("very bright");
        }
        if (theNumberOfDiodes == 100) {
            System.out.println("normally");
        }
        return Searchlight;
    }

    public String getHeaders() {
        return super.getHeaders()+","
                +"producer"+","
                +"power";
    }

    public String toCSV() {
        return super.toCSV()+","
                +producer+","
                +power;
    }

    public static void writeHeader(BufferedWriter writer) throws IOException {
        if (!headerWritten) {
            writer.write(new Searchlight().getHeaders());
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
