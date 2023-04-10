package ua.lviv.iot.algo.part1.lamp;

public class GasLamp extends Light{
    private int tankVolume;
    private String typeOfGas;

    public GasLamp(String producer,int workTimeInMinutes){
        this.producer = producer;
        this.workTimeInMinutes = workTimeInMinutes;
    }

    public GasLamp(){}
    private final static GasLamp defaultGasLamp = new GasLamp();
    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
    public GasLamp brightness(int tankVolume){
        if (tankVolume == 100){
            System.out.println("high brightness");
        }
        if (tankVolume == 50){
            System.out.println("medium brightness");
        }
        if ( tankVolume == 10){
            System.out.println("low brightness");
        }
        return defaultGasLamp;
    }
}
