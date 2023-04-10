package ua.lviv.iot.algo.part1.lamp;

import lombok.Getter;


@Getter


public class Searchlight extends Light {

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
}
