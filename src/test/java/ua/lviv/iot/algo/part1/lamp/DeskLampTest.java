package ua.lviv.iot.algo.part1.lamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeskLampTest {

    @Test
    void testSetBrightness() {
        DeskLamp deskLamp = new DeskLamp();
        deskLamp.setBrightness(5);
        assertEquals(0, deskLamp.getWorkTimeInMinutes());

    }

    @Test
    public void testDeskLampConstructor() {
        String producer = "Test producer";
        int workTimeInMinutes = 120;
        DeskLamp deskLamp = new DeskLamp(producer, workTimeInMinutes);
        assertEquals(producer, deskLamp.getProducer());
        assertEquals(workTimeInMinutes, deskLamp.getWorkTimeInMinutes());
    }
}
