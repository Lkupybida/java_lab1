package ua.lviv.iot.algo.part1.lamp;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasLampTest {
    @Test
    public void testBrightness() {
        GasLamp gasLamp = new GasLamp();
        gasLamp.brightness(10);
        int expectedBrightness = 0;
        int actualBrightness = gasLamp.getWorkTimeInMinutes();
        assertEquals(expectedBrightness, actualBrightness);

        gasLamp.brightness(50);
        int expectedBrightness1 = 0;
        int actualBrightness1 = gasLamp.getWorkTimeInMinutes();
        assertEquals(expectedBrightness1, actualBrightness1);

        gasLamp.brightness(100);
        int expectedBrightness2 = 0;
        int actualBrightness2 = gasLamp.getWorkTimeInMinutes();
        assertEquals(expectedBrightness2, actualBrightness2);
    }

    @Test
    public void testGasLampConstructor() {
        String producer = "Test producer";
        int workTimeInMinutes = 120;
        GasLamp gasLamp = new GasLamp(producer, workTimeInMinutes);
        assertEquals(producer, gasLamp.getProducer());
        assertEquals(workTimeInMinutes, gasLamp.getWorkTimeInMinutes());
    }
}

