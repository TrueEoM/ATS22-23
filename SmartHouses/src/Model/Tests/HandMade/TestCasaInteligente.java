package Model.Tests.HandMade;

import Model.CasaInteligente;
import Model.Exceptions.SmartDeviceAlreadyExistsException;
import Model.Exceptions.SmartDeviceNotExistsException;
import Model.SmartDevice;
import Model.SmartSpeaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestCasaInteligente {
    private CasaInteligente def;

    @BeforeEach
    public void initTestCase(){
        ArrayList<String> l = new ArrayList<>();
        l.add("S");
        l.add("S2");
        HashMap<String, List<String>> space = new HashMap<>();
        space.put("A", l);

        HashMap<String, SmartDevice> dv = new HashMap<>();
        dv.put("S", new SmartSpeaker("id", false, 10, "asd", "abc", 0.2));
        dv.put("S2", new SmartSpeaker("id2", true, 10, "asd", "abc", 0.2));
        dv.put("S3", new SmartSpeaker("id3", false, 10, "asd", "abc", 0.2));

        def = new CasaInteligente("123", "abc", 123456789, "Rua A", "ID");
        def.setDevices(dv);
        def.setLocations(space);
    }

    @Test
    public void CasaConstructorTest1(){
        CasaInteligente ci = new CasaInteligente("123", "abc", 123456789, "Rua A", "ID");
        assertEquals(ci, new CasaInteligente("123", "abc", 123456789, "Rua A", "ID"));
    }

    /*@Test
    public void CasaConstructorTest2(){
        ArrayList<String> l = new ArrayList<>();
        l.add("B");
        HashMap<String, List<String>> space = new HashMap<>();
        space.put("A", l);

        HashMap<String, SmartDevice> dv = new HashMap<>();
        dv.put("S", new SmartSpeaker("id", false, 10, "asd", "abc", 0.2));

        CasaInteligente ci = new CasaInteligente("123", "Rua A", dv, space, 123456789, "Name", "ID");

        space.put("C", l);
        assertNotEquals(ci, new CasaInteligente("123", "Rua A", dv, space, 123456789, "Name", "ID"));
    }*/

    @Test
    public void CasaConstructorTest3(){
        CasaInteligente ci = new CasaInteligente("123", "abc", 123456789, "Rua A", "ID");
        CasaInteligente ci2 = new CasaInteligente(ci);

        assertEquals(ci2, ci);
    }

    @Test
    public void testSetDeviceOff() throws SmartDeviceNotExistsException {
        def.setDeviceOff("S2");
        assertFalse(def.getDevice("S").getModo());
    }

    @Test
    public void testSetAll() throws SmartDeviceNotExistsException {
        def.setallDevices(false);
        assertFalse(def.getDevice("S").getModo());
    }

    @Test
    public void testSetAlldivision() throws SmartDeviceNotExistsException {
        def.setAlldivision(true, "A");
        assertTrue(def.getDevice("S").getModo());
        assertFalse(def.getDevice("S3").getModo());
    }

    @Test
    public void testNumeroDispositivos()
    {
        assertEquals(def.numeroDispositivos(), 2);
        def.addDeviceToRoom("S3", "A");
        assertEquals(def.numeroDispositivos(), 3);
    }

    @Test
    public void testNumeroDispositivosDivisao()
    {
        assertEquals(def.numeroDispositivosDivisao("A"), 2);
    }

    @Test
    public void testExistsDeviceHome()
    {
        assertTrue(def.existsDeviceHome("S"));
        assertFalse(def.existsDeviceHome("S4"));
    }

    @Test
    public void testChecksAllrooms()
    {
        assertTrue(def.checksAllrooms("S"));
        assertFalse(def.checksAllrooms("S3"));
    }

    @Test
    public void testSetDevice() throws SmartDeviceNotExistsException {
        def.setDevice("S3", true);
        assertTrue(def.getDevice("S3").getModo());
    }

    /*@Test
    public void testAddRoom()
    {
        def.addRoom("B");
        assertTrue(def.hasRoom("B"));
        def.addRoom("A");
        assertEquals(def.numeroDispositivosDivisao("A"), 2);
    }*/

    @Test
    public void testHasRoom()
    {
        assertFalse(def.hasRoom("B"));
        assertTrue(def.hasRoom("A"));
    }

    @Test
    public void testAddToRoom() throws SmartDeviceAlreadyExistsException {
        def.addToRoom("A","S3");
        assertTrue(def.checksAllrooms("S3"));
        assertThrows(SmartDeviceAlreadyExistsException.class, () -> {
            def.addToRoom("A","S2");
        });
    }

    @Test
    public void testHasDevice()
    {
        assertTrue(def.hasDevice("S"));
        assertFalse(def.hasDevice("S4"));
    }

    @Test
    public void testRoomHasDevice()
    {
        assertTrue(def.roomHasDevice("A", "S"));
        assertFalse(def.roomHasDevice("A", "S3"));
    }

    @Test
    public void testRemoveDevicesFromRoom()
    {
        def.removeDevicesFromRoom("S");
        assertFalse(def.roomHasDevice("A", "S"));
        assertTrue(def.hasDevice("S"));
    }

    @Test
    public void testEquals()
    {

    }

    @Test
    public void testToString()
    {
    }

    @Test
    public void testParseCasa()
    {
    }

    @Test
    public void testClone()
    {
    }

    @Test
    public void testAddDevice()
    {
    }

    @Test
    public void testGetDevice()
    {
    }

    @Test
    public void testAddFatura()
    {
    }

    @Test
    public void testHasFatura()
    {
    }

    @Test
    public void testRemoveFatura()
    {
    }

    @Test
    public void testLigadoPeriodoTempo()
    {
    }

    @Test
    public void testHasLog()
    {
    }

    @Test
    public void testHasLogByDay()
    {
    }

    @Test
    public void testAddLog()
    {
    }

    @Test
    public void testRemoveLog()
    {
    }

    @Test
    public void testAddAllLogs()
    {
    }

    @Test
    public void testAddAllLogsAllDays()
    {
    }

    @Test
    public void testGetAllLogs()
    {
    }

    @Test
    public void testNumberDevicesOn()
    {
    }

    @Test
    public void testConsumoAllDevicesDia()
    {
    }
}
