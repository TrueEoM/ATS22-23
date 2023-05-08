package Model.Tests.HandMade;

import Model.CasaInteligente;
import Model.Fatura;
import Model.SmartDevice;
import Model.SmartSpeaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestFatura {

    private Fatura fatura;
    @BeforeEach
    public void initTestCase(){
        LocalDateTime inicio = LocalDateTime.of(2023, 5, 1, 0, 0, 0);
        LocalDateTime fim = LocalDateTime.of(2023, 5, 31, 23, 59, 59);
        double consumo = 100.0;
        String idFatura = "fatura";
        String morada = "Rua do Exemplo, 123";
        int NIF = 123456789;
        String idFornecedor = "MEO";
        double valor = 50.0;

        fatura = new Fatura(consumo, idFatura, inicio, fim, morada, NIF, idFornecedor, valor);
    }

    @Test
    void testsetConsumo()
    {
        Fatura f = new Fatura();
        f.setConsumo(20.0);
        assertEquals(20.0,f.getConsumo());
    }

    @Test
    void testsetIdFatura() {
        Fatura f = new Fatura();
        f.setIdFatura("fatura1");
        assertEquals("fatura1",f.getIdFatura());
    }

    @Test
    void testsetValor() {
        Fatura f = new Fatura();
        f.setValor(300.0);
        assertEquals(300.0,f.getValor());
    }

    @Test
    void testsetMorada() {
        Fatura f = new Fatura();
        f.setMorada("Rua dali");
        assertEquals("Rua dali",f.getMorada());
    }

    @Test
    void testsetIdFornecedor() {
        Fatura f = new Fatura();
        f.setIdFornecedor("MEO");
        assertEquals("MEO",f.getIdFornecedor());
    }

    @Test
    void testsetInicio() {
        Fatura fatura = new Fatura();
        LocalDateTime ini = LocalDateTime.of(2022, 1, 1, 0, 0);
        fatura.setInicio(ini);
        assertEquals(ini, fatura.getInicio());
    }

    @Test
    void testsetFim() {
        Fatura fatura = new Fatura();
        LocalDateTime fim = LocalDateTime.of(2023, 5, 8, 23, 59);
        fatura.setFim(fim);
        assertEquals(fim, fatura.getFim());
    }

    @Test
    void testsetNIF() {
        Fatura f = new Fatura();
        f.setNIF(123456789);
        assertEquals(123456789,f.getNIF());
    }

    @Test
    void testgetConsumo() {
        assertEquals(100.0,fatura.getConsumo());
    }

    @Test
    void testgetValor() {
        assertEquals(50.0,fatura.getValor());
    }

    @Test
    void testgetNIF() {
        assertEquals(123456789,fatura.getNIF());
    }

    @Test
    void testgetIdFatura() {
        assertEquals("fatura",fatura.getIdFatura());
    }

    @Test
    void testgetMorada() {
        assertEquals("Rua do Exemplo, 123",fatura.getMorada());
    }

    @Test
    void testgetIdFornecedor() {
        assertEquals("MEO",fatura.getIdFornecedor());
    }

    @Test
    void testgetInicio() {
        LocalDateTime inicio = LocalDateTime.of(2023, 5, 1, 0, 0, 0);
        assertEquals(inicio,fatura.getInicio());
    }

    @Test
    void testgetFim() {
        LocalDateTime f = LocalDateTime.of(2023, 5, 31, 23, 59, 59);
        assertEquals(f,fatura.getFim());
    }

    @Test
    void testToString() {
        String expected = "IdFatura: fatura\n" +
                "IdFornecedor: MEO\n" +
                "NIF: 123456789\n" +
                "Consumo: 100.0\n" +
                "Valor: 50.0\n" +
                "Inicio: 2023-05-01 00:00\n" +
                "Fim: 2023-05-31 23:59;";
        String result = fatura.toString();
        assertEquals(expected, result);
    }

    @Test
    void testEquals() {
        LocalDateTime inicio = LocalDateTime.of(2023, 5, 1, 0, 0, 0);
        LocalDateTime fim = LocalDateTime.of(2023, 5, 31, 23, 59, 59);
        Fatura fatura2 = new Fatura(100.0,"fatura",inicio,fim,"Rua do Exemplo, 123",123456789,"MEO",50.0);

        assertTrue(fatura.equals(fatura2));

    }

    @Test
    void testClone() {
        Fatura fatura2 = fatura.clone();
        assertEquals(fatura, fatura2);
    }
}