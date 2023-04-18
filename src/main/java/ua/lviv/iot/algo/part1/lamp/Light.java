package ua.lviv.iot.algo.part1.lamp;


abstract class Light {
    protected String producer;
    protected int workTimeInMinutes;


    public int getWorkTimeInMinutes() {
        return workTimeInMinutes;
    }

    public String getProducer() {
        return producer;
    }

}
