package com.examplee.lab6L;

import java.io.BufferedWriter;
import java.io.IOException;

public class GasLight extends Light{
    private Long id;
    private String name;
    private String model;
    private Integer year;
    private Integer seats;
    private String serialNumber;
    private String manufacturer;
    private Integer workTimeInMinutes;
    private Integer range;



    public GasLight(Long id, String name, String model, Integer year, Integer seats, String serialNumber,
                 String manufacturer, Integer workTimeInMinutes, Integer range) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.year = year;
        this.seats = seats;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.workTimeInMinutes = workTimeInMinutes;
        this.range = range;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getWorkTimeInMinutes() {
        return workTimeInMinutes;
    }

    public void setWorkTimeInMinutes(Integer workTimeInMinutes) {
        this.workTimeInMinutes = workTimeInMinutes;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }


    private String outOfGas;
    private int volume;

    private static boolean headerWritten = false;
    private final static GasLight defaultGasLamp = new GasLight();

    public GasLight(String producer, int workTimeInMinutes) {
        this.producer = producer;
        this.workTimeInMinutes = workTimeInMinutes;
    }

    public GasLight() {}

    public GasLight brightness(int tankVolume) {
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
            writer.write(new GasLight().getHeaders());
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
