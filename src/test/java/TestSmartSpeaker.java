import Model.SmartSpeaker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSmartSpeaker {

    @Test
    void volumeUp() {
        SmartSpeaker smartSpeaker = new SmartSpeaker("123", true, 50, "Brand", "Channel", 10.0);

        smartSpeaker.volumeUp();
        assertEquals(51, smartSpeaker.getVolume());
    }

    @Test
    void volumeDown() {
        SmartSpeaker smartSpeaker = new SmartSpeaker("123", true, 50, "Brand", "Channel", 10.0);

        smartSpeaker.volumeDown();
        assertEquals(49, smartSpeaker.getVolume());

    }

    @Test
    void getVolume() {
        SmartSpeaker smartSpeaker = new SmartSpeaker("123", true, 50, "Brand", "Channel", 10.0);
        assertEquals(50, smartSpeaker.getVolume());


        smartSpeaker.volumeUp();
        assertEquals(51, smartSpeaker.getVolume());
    }

    @Test
    void getMarca() {
        SmartSpeaker smartSpeaker = new SmartSpeaker("123", true, 50, "Brand", "Channel", 10.0);

        assertEquals("Brand", smartSpeaker.getMarca());
    }

    @Test
    void getChannel() {
        SmartSpeaker smartSpeaker = new SmartSpeaker("123", true, 50, "Brand", "Channel", 10.0);

        assertEquals("Channel", smartSpeaker.getChannel());
    }

    @Test
    void setChannel() {
        SmartSpeaker smartSpeaker = new SmartSpeaker("123", true, 50, "Brand", "Channel", 10.0);

        // Test setting a new channel
        smartSpeaker.setChannel("New Channel");
        assertEquals("New Channel", smartSpeaker.getChannel());
    }

    @Test
    void setMarca() {
        SmartSpeaker smartSpeaker = new SmartSpeaker("123", true, 50, "Brand", "Channel", 10.0);

        smartSpeaker.setMarca("New Brand");
        assertEquals("New Brand", smartSpeaker.getMarca());

    }

    @Test
    void setVolume() {
        SmartSpeaker smartSpeaker = new SmartSpeaker("123", true, 50, "Brand", "Channel", 10.0);

        smartSpeaker.setVolume(75);
        assertEquals(75, smartSpeaker.getVolume());
    }

    @Test
    void consumoDiario() {
        SmartSpeaker smartSpeaker = new SmartSpeaker("123", true, 50, "Brand", "Channel", 10.0);

        assertEquals(5.0, smartSpeaker.consumoDiario(), 0.01);
    }

    @Test
    void parseSmartSpeaker() {
        String line = "2,Radio Renascenca,LG,5.54,speaker1";

        SmartSpeaker smartSpeaker = SmartSpeaker.parseSmartSpeaker(line);

        assertEquals("speaker1", smartSpeaker.getID());
        assertEquals(2, smartSpeaker.getVolume());
        assertEquals("LG", smartSpeaker.getMarca());
        assertEquals("Radio Renascenca", smartSpeaker.getChannel());
        assertEquals(5.54, smartSpeaker.getConsumoBase(), 0.01);
    }

    @Test
    void testToString() {
        SmartSpeaker smartSpeaker = new SmartSpeaker("123", true, 50, "Brand", "Channel", 10.0);

        String expectedToString = "ID: 123\n" +
                "\tOn: true;\n" +
                "\tConsumo Base: 10.0;\n" +
                "\tVolume: 50; \tMarca: Brand; \tCanal: Channel\n";

        assertEquals(expectedToString, smartSpeaker.toString());
    }

    @Test
    void testEquals() {
        SmartSpeaker smartSpeaker1 = new SmartSpeaker("123", true, 50, "Brand", "Channel", 10.0);
        SmartSpeaker smartSpeaker2 = new SmartSpeaker("123", true, 50, "Brand", "Channel", 10.0);

        assertTrue(smartSpeaker1.equals(smartSpeaker2));
    }

    @Test
    void testClone() {
        SmartSpeaker smartSpeaker1 = new SmartSpeaker("123", true, 50, "Brand", "Channel", 10.0);
        assertTrue(smartSpeaker1.equals(smartSpeaker1.clone()));
    }
}