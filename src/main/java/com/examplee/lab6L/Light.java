package com.examplee.lab6L;


abstract class Light {
    protected String producer;
    protected int workTimeInMinutes;


    public Integer getWorkTimeInMinutes() {
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
