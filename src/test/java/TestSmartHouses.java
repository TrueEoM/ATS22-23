import Model.SmartHouses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class TestSmartHouses {

    @Test
    void parser() {
        //TODO
    }

    /*
    @Test
    void guardarEstado() {
        SmartHouses smartHouses = new SmartHouses();
        String fileName = "estado.obj";

        try {
            smartHouses.guardarEstado();
        } catch (IOException e) {
            Assertions.fail("IOException occurred while saving the state.");
        }

        Path filePath = Paths.get(fileName);
        Assertions.assertTrue(Files.exists(filePath), "The state file should be created.");

        File file = new File(fileName);
        file.delete();
    }

    @Test
    void carregarEstado() throws IOException, ClassNotFoundException {
        SmartHouses smartHouses = new SmartHouses(); // Create an instance of the class to test
        String fileName = "estado.obj"; // Name of the file to be used for loading the state

        // Prepare the state file to be loaded
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        out.writeObject(smartHouses);
        out.close();

        // Invoke the method to be tested
        smartHouses.carregarEstado(fileName);

        Assertions.assertEquals(expectedDispositivos, smartHouses.getDispositivos());

        File file = new File(fileName);
        file.delete();
    }*/

    @Test
    void existsDevice() {
    }

    @Test
    void existsFornecedor() {
    }

    @Test
    void adicionaDevice() {
    }

    @Test
    void adicionaFornecedor() {
    }

    @Test
    void removeDevice() {
    }

    @Test
    void removePermanenteDevice() {
    }

    @Test
    void addDeviceToRoomSameHouse() {
    }

    @Test
    void gestaoDevices() {
    }

    @Test
    void colocaTon() {
    }

    @Test
    void colocaVol() {
    }

    @Test
    void existsHome() {
    }

    @Test
    void existsHomeInFornecedor() {
    }

    @Test
    void existeDeviceHomes() {
    }

    @Test
    void existeDeviceInHome() {
    }

    @Test
    void adicionaHome() {
    }

    @Test
    void removeHome() {
    }

    @Test
    void dispositovosTostring() {
    }

    @Test
    void casasTostring() {
    }

    @Test
    void getCasas() {
    }

    @Test
    void setCasas() {
    }

    @Test
    void getDispositivos() {
    }

    @Test
    void setDispositivos() {
    }

    @Test
    void getFornecedores() {
    }

    @Test
    void getFormulas() {
    }

    @Test
    void setFornecedores() {
    }

    @Test
    void setFormulas() {
    }

    @Test
    void getDate() {
    }

    @Test
    void setDate() {
    }

    @Test
    void lerFicheiro() {
    }

    @Test
    void atualiza() {
    }

    @Test
    void getFaturas() {
    }

    @Test
    void getLogsDevice() {
    }

    @Test
    void alteraFornecedor() {
    }

    @Test
    void setAllDevicesHome() {
    }

    @Test
    void setAlldivision() {
    }

    @Test
    void addLogExecute() {
    }

    @Test
    void addLogChangeMode() {
    }

    @Test
    void testAddLogChangeMode() {
    }

    @Test
    void addDeviceToRoom() {
    }

    @Test
    void setFornecedor() {
    }

    @Test
    void getFornecedor() {
    }

    @Test
    void containsFornecedor() {
    }

    @Test
    void addFornecedor() {
    }

    @Test
    void removeFornecedor() {
    }

    @Test
    void testClone() {
    }

    @Test
    void casaGastouMaisPeriodoVariosFornecedores() {
    }

    @Test
    void fornecedorComMaisFaturacao() {
    }

    @Test
    void ordenarFornecedores() {
    }

    @Test
    void addRoom() {
    }

    @Test
    void changeFormula() {
    }
}