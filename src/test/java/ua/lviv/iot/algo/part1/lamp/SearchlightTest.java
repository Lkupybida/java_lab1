package ua.lviv.iot.algo.part1.lamp;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchlightTest {
    @Test
    void testBrightness() {
        Searchlight searchlight = new Searchlight();
        searchlight.brightness(1000);
        int expectedAltitude = 0;
        int actualAltitude = searchlight.getWorkTimeInMinutes();
        assertEquals(expectedAltitude, actualAltitude);

        searchlight.brightness(100);
        int expectedAltitude1 = 0;
        int actualAltitude1 = searchlight.getWorkTimeInMinutes();
        assertEquals(expectedAltitude1, actualAltitude1);
    }

    @Test
    public void testSearchlightConstructor() {
        String producer = "Test producer";
        int workTimeInMinutes = 120;
        Searchlight searchlight = new Searchlight(producer, workTimeInMinutes);
        assertEquals(producer, searchlight.getProducer());
        assertEquals(workTimeInMinutes, searchlight.getWorkTimeInMinutes());
    }
}
