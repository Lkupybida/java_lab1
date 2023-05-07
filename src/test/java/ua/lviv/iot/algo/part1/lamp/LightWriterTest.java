package ua.lviv.iot.algo.part1.lamp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LightWriterTest {
    private static final String filename = "test.csv";

    private LightWriter writer;
    private List<Light> vehicles;

    @BeforeEach
    public void setup() {
        writer = new LightWriter();
        vehicles = new ArrayList<>();
        vehicles.add(new Candle());
        vehicles.add(new DeskLamp());
        vehicles.add(new GasLamp());
        vehicles.add(new Searchlight());
    }

    @Test
    public void testWriteToFile() throws IOException {
        writer.writeToFile(vehicles, filename);
        File file = new File(filename);
        assertTrue(file.exists());

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        assertEquals("fetus, length, " +
                "isOn, brightness, color, producer, outOfGas, " +
                "volume, producer, power, workTimeInMinutes", line);

        line = reader.readLine();
        List<String> headers = Arrays.asList(line.split(", "));
        assertEquals(1, headers.size());
        assertFalse(headers.contains("producer"));
        assertFalse(headers.contains("workTimeInMinutes"));

        line = reader.readLine();
        List<String> vehicleData = Arrays.asList(line.split(", "));
        assertEquals(1, vehicleData.size());
        assertEquals("null,0,false,5,white,Unknown", vehicleData.get(0));
        assertEquals("null,0,false,5,white,Unknown", vehicleData.get(0));
        assertEquals("null,0,false,5,white,Unknown", vehicleData.get(0));

        reader.close();

    }

    @Test
    public void testCsvCandle() throws IOException {
        Candle candle = new Candle("Lviv",1000);

        BufferedWriter writer1 = new BufferedWriter(new FileWriter("candles.csv"));
        writer1.write(candle.getHeaders() + "\n");
        candle.write(writer1);
        writer1.close();
    }

    @Test
    public void testCSVDeskLamp() throws IOException {
        DeskLamp deskLamp = new DeskLamp("USA",4000);

        BufferedWriter writer2 = new BufferedWriter(new FileWriter("deskLamps.csv"));
        writer2.write(deskLamp.getHeaders() + "\n");
        deskLamp.write(writer2);
        writer2.close();
    }

    @Test
    public void testCSVGasLamp() throws IOException {
        GasLamp gasLamp = new GasLamp("China",5000);

        BufferedWriter writer3 = new BufferedWriter(new FileWriter("gasLamps.csv"));
        writer3.write(gasLamp.getHeaders() + "\n");
        gasLamp.write(writer3);
        writer3.close();
    }

    @Test
    public void testCSVSearchlight() throws IOException {
        Searchlight searchlight = new Searchlight("China",1000000);

        BufferedWriter writer4 = new BufferedWriter(new FileWriter("searchlights.csv"));
        writer4.write(searchlight.getHeaders() + "\n");
        searchlight.write(writer4);
        writer4.close();
    }
}
