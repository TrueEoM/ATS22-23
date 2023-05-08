package Model.Tests.HandMade;

import Model.CasaInteligente;
import Model.Formulas.FormulaCoopernico;
import Model.Formulas.FormulaEnergia;
import Model.Formulas.FormulaEnergiaSimples;
import Model.Fornecedor;
import Model.SmartBulb;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FornecedorTest {

    private Fornecedor forn;
    private FormulaEnergia formula;
    @BeforeEach
    void setUp() {

        forn = new Fornecedor("f001", 0.23);
        formula = new FormulaEnergiaSimples();
        forn.setFormula(formula);

        CasaInteligente casa1 = new CasaInteligente("casa1", "Joao",123456789,"Rua de cima", "MEO");
        forn.addCasa(casa1);

        CasaInteligente casa2 = new CasaInteligente("casa2", "Ana",987654321,"Rua de baixo", "NOS");
        forn.addCasa(casa2);
    }

    @Test
    void getCasa() {
    }

    @Test
    void getCasaWithoutExceptions() {
    }

    @Test
    void setId() {
        forn.setId("fornecedor3");
        assertEquals("fornecedor3",forn.getId());
    }

    @Test
    void setImposto() {
        forn.setImposto(4.0);
        assertEquals(4.0,forn.getImposto());
    }

    @Test
    void getId() {
        assertEquals("f001",forn.getId());
    }

    @Test
    void getImposto() {
        assertEquals(0.23,forn.getImposto());
    }

    @Test
    void getFormula() {
        assertEquals(formula, forn.getFormula());
    }

    @Test
    void setFormula() {
        FormulaEnergia form =  new FormulaCoopernico();
        forn.setFormula(form);
        assertEquals(form,forn.getFormula());
    }

    @Test
    void addCasa() {

        CasaInteligente casa3 = new CasaInteligente("casa3", "Joana",123456775,"Rua de la", "MEO");

        assertEquals(0, forn.addCasa(casa3));

        assertEquals(1, forn.addCasa(casa3));
    }

    @Test
    void hasCasa() {
        assertTrue(forn.hasCasa("casa1"));
    }

    @Test
    void removeCasa() {
        forn.removeCasa("casa1");
        assertFalse(forn.hasCasa("casa1"));
    }

    @Test
    void getAllCasas() {
        Map<String,CasaInteligente> allCasas = forn.getAllCasas();
        assertEquals(2,allCasas.size());
    }

    @Test
    void setAllCasas() {
        CasaInteligente casa3 = new CasaInteligente("casa3","Americo",234567890,"Rua do Americo", "NOS");
        CasaInteligente casa4 = new CasaInteligente("casa4","Joaquim",345123456,"Rua da Joaquina","MEO");
        Map<String, CasaInteligente> casas = new HashMap<>();
        casas.put(casa3.getIdHome(), casa3);
        casas.put(casa4.getIdHome(), casa4);

        forn.setAllCasas(casas);
        Map<String, CasaInteligente> allCasas = forn.getAllCasas();
        assertEquals(2, allCasas.size());
        assertTrue(allCasas.containsKey(casa3.getIdHome()));
        assertTrue(allCasas.containsKey(casa4.getIdHome()));
        assertNotSame(casas, allCasas);
        assertNotSame(casa3, allCasas.get(casa3.getIdHome()));
        assertNotSame(casa4, allCasas.get(casa4.getIdHome()));
    }

    @Test
    void parseFornecedor() {

    }

    @Test
    void testEquals() {
    }

    @Test
    void testToString() {
    }

    @Test
    void testClone() {
    }

    @Test
    void casaGastouMaisPeriodo() {
    }

    @Test
    void getValorFornecedor() {
    }

    @Test
    void addFatura() {
    }

    @Test
    void faturasEmitidas() {
    }

    @Test
    void faturaçaoFornecedor() {
    }

    @Test
    void compareTo() {
    }
}