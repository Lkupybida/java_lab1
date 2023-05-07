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

    public String getHeaders() {
        return "producer"+","+"workTimeInMinutes";
    }

    public String toCSV() {
        return producer+","+workTimeInMinutes;
    }

}
