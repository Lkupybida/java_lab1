package ua.lviv.iot.algo.part1.lamp;

import java.util.LinkedList;
import java.util.List;
public class LightManager {

    private static final List<Light> list = new LinkedList<>();

    public static Light addLight(final Light light ){
        list.add(light);
        return light;
    }
    public static void main(String[] args) {
        DeskLamp deskLamp = new DeskLamp("China", 596);
        Candle candle = new Candle("USA", 60);
        Searchlight searchlight = new Searchlight("China",1000);
        GasLamp gasLamp = new GasLamp("USA",345);



        addLight(deskLamp);
        addLight(candle);
        addLight(searchlight);
        addLight(gasLamp);

        for (Light element : list) {
            System.out.println(element.toString());
        }

        for (Light element : list) {
            System.out.println(gasLamp.brightness(100));
            System.out.println(searchlight.brightness(100));
            System.out.println(candle.brightness(100).smell(0));
        }

        System.out.println(" ");
        list.stream().filter(light -> light.getWorkTimeInMinutes()> 34).forEach(System.out::println);

        System.out.println(" ");
        list.stream().filter(light -> light.getProducer() == " USA ").forEach(System.out::println);
    }

}


