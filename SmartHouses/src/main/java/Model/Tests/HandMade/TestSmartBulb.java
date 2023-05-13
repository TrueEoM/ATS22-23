package main.java.Model.Tests.HandMade;

import Model.SmartBulb;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSmartBulb {

    @Test
    void fromString() {
        assertEquals(SmartBulb.Mode.COLD, SmartBulb.fromString("Cold"));
        assertEquals(SmartBulb.Mode.WARM, SmartBulb.fromString("Warm"));
        assertEquals(SmartBulb.Mode.NEUTRAL, SmartBulb.fromString("Neutral"));

        // Test with invalid mode string
        assertNull(SmartBulb.fromString("InvalidMode"));
    }

    @Test
    void getDimensao() {
        SmartBulb smartBulb = new SmartBulb("bulb1","NEUTRAL",false,3,10.0);
        Assertions.assertEquals(3, smartBulb.getDimensao());
    }

    @Test
    void setDimensao() {
        SmartBulb smartBulb = new SmartBulb("bulb1", "COLD", 5, 10.0);
        smartBulb.setDimensao(7);
        assertEquals(7, smartBulb.getDimensao());
    }

    @Test
    void getMode() {
        SmartBulb smartBulb = new SmartBulb("bulb1","NEUTRAL",false,3,10.0);
        Assertions.assertEquals(SmartBulb.fromString("NEUTRAL"), smartBulb.getMode());
    }

    @Test
    void setMode() {
        SmartBulb smartBulb = new SmartBulb("bulb1", "Cold", 5, 10.0);
        SmartBulb.Mode mode = smartBulb.getMode();

        assertEquals(SmartBulb.Mode.COLD, mode);
    }

    @Test
    void turnOFFlamp() {
        SmartBulb smartBulb = new SmartBulb("bulb1","NEUTRAL",true,3,10.0);
        smartBulb.turnOFFlamp();
        Assertions.assertFalse(smartBulb.getModo());
    }

    @Test
    void turnOnLamp() {
        SmartBulb smartBulb = new SmartBulb("bulb1","NEUTRAL",false,3,10.0);
        smartBulb.turnOnLamp();
        Assertions.assertTrue(smartBulb.getModo());
    }

    @Test
    void changetoCold() {
        SmartBulb smartBulb = new SmartBulb("bulb1","NEUTRAL",false,3,10.0);
        smartBulb.changetoCold();
        Assertions.assertEquals(SmartBulb.Mode.COLD, smartBulb.getMode());
    }

    @Test
    void changetoWarm() {
        SmartBulb smartBulb = new SmartBulb("bulb1","NEUTRAL",false,3,10.0);
        smartBulb.changetoWarm();
        Assertions.assertEquals(SmartBulb.Mode.WARM, smartBulb.getMode());
    }

    @Test
    void changetoNeutral() {
        SmartBulb smartBulb = new SmartBulb("bulb1","COLD",false,3,10.0);
        smartBulb.changetoNeutral();
        Assertions.assertEquals(SmartBulb.Mode.NEUTRAL, smartBulb.getMode());
    }

    @Test
    void calculaWarm() {
        SmartBulb smartBulb = new SmartBulb("bulb1","Cold",false,3,10.0);
        assertEquals(8.8,smartBulb.calculaCold());
    }

    @Test
    void calculaCold() {
        SmartBulb smartBulb = new SmartBulb("bulb1","Warm",false,3,10.0);
        assertEquals(1.8,smartBulb.calculaWarm());
    }

    @Test
    void calculaNeutral() {
        SmartBulb smartBulb = new SmartBulb("bulb1","Neutral",false,3,10.0);
        assertEquals(3.4,smartBulb.calculaNeutral());
    }

    @Test
    void consumoDiario() {
        SmartBulb smartBulb = new SmartBulb("bulb1","Cold",false,3,10.0);
        assertEquals(8.8,smartBulb.consumoDiario());
        smartBulb = new SmartBulb("bulb2","Warm",false,5,10.0);
        assertEquals(1.8,smartBulb.consumoDiario());
        smartBulb = new SmartBulb("bulb3","NEUTRAL",false,2,10.0);
        assertEquals(3.4,smartBulb.consumoDiario());
    }

    @Test
    void parseSmartBulb() {
        String input = "Cold,5,10.0,bulb1";
        // Call the parseSmartBulb() method
        SmartBulb parsedBulb = SmartBulb.parseSmartBulb(input);
        // Assert that the parsed bulb has the correct values
        assertEquals("bulb1", parsedBulb.getID());
        assertEquals(SmartBulb.Mode.COLD, parsedBulb.getMode());
        assertEquals(5, parsedBulb.getDimensao());
        assertEquals(10.0, parsedBulb.getConsumoBase(), 0.001);
    }

    @Test
    void testToString() {
        SmartBulb bulb = new SmartBulb("bulb1","NEUTRAL",3,10.0);
        Assertions.assertEquals("ID: bulb1\n\tOn: false;\n\tConsumo Base: 10.0;\n\tModo: null; \tDimensao: 3; ",
                bulb.toString());
    }

    @Test
    void testEquals() {
        SmartBulb bulb1 = new SmartBulb("bulb1", "COLD", 5, 10.0);
        SmartBulb bulb2 = new SmartBulb("bulb1", "COLD", 5, 10.0);

        assertEquals(bulb1, bulb1);

        assertEquals(bulb1, bulb2);
    }

    @Test
    void testClone() {
        SmartBulb bulb = new SmartBulb("bulb1","NEUTRAL",false,3,10.0);
        assertTrue(bulb.equals(bulb.clone()));
    }
}