package com.examplee.lab6L;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.BufferedWriter;
import java.io.IOException;


@Getter
@NoArgsConstructor
public class DeskLamp extends Light {
    private boolean isOn = false;
    private int brightness = 5;
    private String color = "white";
    private String producer = "Unknown";

    private static boolean headerWritten = false;

    public DeskLamp(String producer, int workTimeInMinutes) {
        this.producer = producer;
        this.workTimeInMinutes = workTimeInMinutes;
    }


    public void setBrightness(int value) {
        if (value >= 1 && value <= 10) {
            this.brightness = value;
        }
    }

    public String getHeaders() {
        return super.getHeaders()+","
                +"isOn"+","
                +"brightness"+","
                +"color"+","
                +"producer";
    }

    public String toCSV() {
        return super.toCSV()+","
                +isOn+","
                +brightness+","
                +color+","
                +producer;
    }

    public static void writeHeader(BufferedWriter writer) throws IOException {
        if (!headerWritten) {
            writer.write(new DeskLamp().getHeaders());
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