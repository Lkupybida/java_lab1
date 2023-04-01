package ua.lviv.iot.algo.part1.lamp;

public class Searchlight extends Light {
    private int theNumberOfDiodes;

   public Searchlight(String producer,int workTimeInMinutes){
        this.producer = producer;
        this.workTimeInMinutes = workTimeInMinutes;
    }

    public Searchlight(){}

    private final static Searchlight Searchlight = new Searchlight();
    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
    public Searchlight brightness(int theNumberOfDiodes){
       if (theNumberOfDiodes == 1000){
           System.out.println("very bright");
       }
       if (theNumberOfDiodes == 100){
           System.out.println("normally");
       }
       return Searchlight;
    }
}
