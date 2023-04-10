package ua.lviv.iot.algo.part1.lamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandleTest {
    Candle candle = new Candle();
    @Test
    public void testSmell() {
        Candle candle = new Candle();
        candle.smell(100);
        int expectedSmell = 0;
        int actualSmell = candle.getWorkTimeInMinutes();
        assertEquals(expectedSmell, actualSmell);
    }
    @Test
    public void testSmell1() {

        candle.smell(50);
        int expectedSmell1 = 0;
        int actualSmell1 = candle.getWorkTimeInMinutes();
        assertEquals(expectedSmell1, actualSmell1);
    }
    @Test
    public void testSmell2() {
        candle.smell(0);
        int expectedSmell2 = 0;
        int actualSmell2 = candle.getWorkTimeInMinutes();
        assertEquals(expectedSmell2, actualSmell2);


    }

    @Test
    public void testBrightness() {
        Candle candle = new Candle();
        candle.brightness(100);
        int expectedBrightness = 0;
        int actualBrightness = candle.getWorkTimeInMinutes();
        assertEquals(expectedBrightness, actualBrightness);
    }
    @Test
    public void testBrightness1() {
        candle.brightness(50);
        int expectedBrightness1 = 0;
        int actualBrightness1 = candle.getWorkTimeInMinutes();
        assertEquals(expectedBrightness1, actualBrightness1);
    }
    @Test
    public void testBrightness2() {
        candle.brightness(10);
        int expectedBrightness2 = 0;
        int actualBrightness2 = candle.getWorkTimeInMinutes();
        assertEquals(expectedBrightness2, actualBrightness2);

    }

    @Test
    public void testCandleConstructor() {
        String producer = "Test producer";
        int workTimeInMinutes = 120;
        Candle candle = new Candle(producer, workTimeInMinutes);
        assertEquals(producer, candle.getProducer());
        assertEquals(workTimeInMinutes, candle.getWorkTimeInMinutes());
    }

}
