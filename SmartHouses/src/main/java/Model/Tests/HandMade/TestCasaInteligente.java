package Model.Tests.HandMade;

import Model.*;
import Model.Exceptions.SmartDeviceAlreadyExistsException;
import Model.Exceptions.SmartDeviceNotExistsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
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
        ArrayList<String> l = new ArrayList<>();
        l.add("S");
        l.add("S2");
        HashMap<String, List<String>> space = new HashMap<>();
        space.put("A", l);

        HashMap<String, SmartDevice> dv = new HashMap<>();
        dv.put("S", new SmartSpeaker("id", false, 10, "asd", "abc", 0.2));
        dv.put("S2", new SmartSpeaker("id2", true, 10, "asd", "abc", 0.2));
        dv.put("S3", new SmartSpeaker("id3", false, 10, "asd", "abc", 0.2));

        CasaInteligente def2 = new CasaInteligente("123", "abc", 123456789, "Rua A", "ID");
        def2.setDevices(dv);
        def2.setLocations(space);

        assertTrue(def.equals(def2));
        assertTrue(def2.equals(def));
    }

    @Test
    public void testToString()
    {

        String expected = "\nID Home: " + def.getIdHome() + "\n"
                + "Morada: " + def.getMorada() + "\n"
                + "Fornecedor: " + def.getIdFornecedor() + "\n"
                + "Proprietario: " + def.getProprietario() + "\n"
                + "NIF: " + def.getNIF() + "\n"
                + "----------------------Divisão/Dispositivos----------------------" + "\n"
                + "Divisão: A - Dispositos -> [S, S2]\n"
                + "----------------------------------------------------------------";

        assertEquals(expected, def.toString());
    }

    @Test
    public void testParseCasa()
    {
        String line = "Vicente de Carvalho Castro,365597405,Iberdrola,casa1,Yubetsu-tanko 564-000 nº 383";

        CasaInteligente casa = CasaInteligente.parseCasa(line);

        assertEquals("casa1", casa.getIdHome());
        assertEquals("Vicente de Carvalho Castro", casa.getProprietario());
        assertEquals(365597405, casa.getNIF());
        assertEquals("Yubetsu-tanko 564-000 nº 383", casa.getMorada());
        assertEquals("Iberdrola", casa.getIdFornecedor());
    }

    @Test
    public void testClone()
    {
        CasaInteligente def2 = def.clone();

        assertNotSame(def, def2);
        assertEquals(def.getIdHome(), def2.getIdHome());
        assertEquals(def.getProprietario(), def2.getProprietario());
        assertEquals(def.getNIF(), def2.getNIF());
        assertEquals(def.getMorada(), def2.getMorada());
        assertEquals(def.getIdFornecedor(), def2.getIdFornecedor());
    }

    @Test
    public void testAddDevice()
    {
        SmartDevice s = new SmartSpeaker("id090", true, 11, "abc", "def", 0.2);

        int result = def.addDevice(s);
        assertEquals(0, result);


        int duplicateResult = def.addDevice(s);
        assertEquals(1, duplicateResult);
    }

    @Test
    public void testGetDevice()
    {
        // Create a SmartDevice object
        SmartDevice device = new SmartSpeaker("id090", true, 11, "abc", "def", 0.2);

        // Add the device to the CasaInteligente object
        def.addDevice(device);

        // Test getting an existing device
        try {
            SmartDevice retrievedDevice = def.getDevice(device.getID());
            assertNotNull(retrievedDevice);
            assertEquals(device, retrievedDevice);
        } catch (SmartDeviceNotExistsException e) {}

        // Test getting a non-existing device
        String nonExistingDeviceID = "non-existing-device-id";
        try {
            def.getDevice(nonExistingDeviceID);
        } catch (SmartDeviceNotExistsException e) {
            assertEquals("O Model.SmartDevice com id " + nonExistingDeviceID + " não existe", e.getMessage());
        }
    }

    @Test
    public void testAddFatura()
    {
        String idFornecedor = "FornecedorXYZ";
        LocalDateTime init = LocalDateTime.of(2023, 5, 1, 0, 0);
        LocalDateTime finit = LocalDateTime.of(2023, 5, 31, 23, 59);
        double valor = 100.0;

        def.addFatura(idFornecedor,init,finit,valor);

        List<Fatura> addedFatura = def.getFaturas(idFornecedor);

        assertNotNull(addedFatura);
        assertEquals(1, addedFatura.size());

        Fatura fatura = addedFatura.get(0);
        assertEquals(idFornecedor, fatura.getIdFornecedor());
        assertEquals(init,fatura.getInicio());
        assertEquals(finit,fatura.getFim());
        assertEquals(valor, fatura.getValor(), 0.001);
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
