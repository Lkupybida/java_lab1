package ua.lviv.iot.algo.part1.lamp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LightWriter {
    private static final String CSVHeader = "fetus, length, " +
            "isOn, brightness, color, producer, outOfGas, " +
            "volume, producer, power, workTimeInMinutes";

    public static final String newLineSeparator = "\n";

    public void writeToFile(List<Light> LightList, String fileName)throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        writer.write(CSVHeader);
        writer.append(newLineSeparator);
        for ( Light light : LightList) {
            writer.write(light.toCSV());
            writer.append(newLineSeparator);
        }
        writer.close();

        Candle candle = new Candle("Lviv",1000);
        BufferedWriter writer1 = new BufferedWriter(new FileWriter("drones.csv"));
        candle.write(writer1);
        writer1.close();

        DeskLamp deskLamp = new DeskLamp("USA",4000);
        BufferedWriter writer2 = new BufferedWriter(new FileWriter("helicopters.csv"));
        deskLamp.write(writer2);
        writer2.close();

        GasLamp gasLamp = new GasLamp("China",5000);
        BufferedWriter writer3 = new BufferedWriter(new FileWriter("militaryDrones.csv"));
        gasLamp.write(writer3);
        writer3.close();

        Searchlight searchlight = new Searchlight("China",1000000);
        BufferedWriter writer4 = new BufferedWriter(new FileWriter("plane.csv"));
        searchlight.write(writer4);
        writer4.close();
    }

    }
