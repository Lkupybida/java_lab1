package ua.lviv.iot.algo.part1.lamp;

import lombok.ToString;

import java.util.List;

@ToString
abstract class Light {
    public String producer;
    public int workTimeInMinutes;

    public abstract void turnOn();

    public abstract void turnOff();

    public  int getWorkTimeInMinutes(){return workTimeInMinutes; }
    public  String getProducer(){return  producer;}

}
