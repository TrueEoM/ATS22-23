import Model.CasaInteligente;
import Model.Exceptions.LogNotExistsException;
import Model.Fatura;
import Model.Formulas.FormulaCoopernico;
import Model.Formulas.FormulaEDP;
import Model.Formulas.FormulaEnergia;
import Model.Formulas.FormulaEnergiaSimples;
import Model.Fornecedor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
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
        String line = "ABC,123.45";
        Map<String, FormulaEnergia> formulas = new HashMap<>();
        formulas.put("ABC", new FormulaCoopernico());
        Fornecedor fornecedor = Fornecedor.parseFornecedor(line, formulas);
        assertNotNull(fornecedor);
        assertEquals("ABC", fornecedor.getId());
        assertEquals(123.45, fornecedor.getImposto(), 0.001);
        assertNotNull(fornecedor.getFormula());
    }

    @Test
    void testEquals() {
        Fornecedor forn2 = new Fornecedor("f001", 0.23);
        formula = new FormulaEnergiaSimples();
        forn2.setFormula(formula);

        CasaInteligente casa1 = new CasaInteligente("casa1", "Joao",123456789,"Rua de cima", "MEO");
        forn2.addCasa(casa1);

        CasaInteligente casa2 = new CasaInteligente("casa2", "Ana",987654321,"Rua de baixo", "NOS");
        forn2.addCasa(casa2);
        assertTrue(forn.equals(forn2));
    }

    @Test
    void testToString() {
        FormulaEDP form =  new FormulaEDP();

        Fornecedor forn = new Fornecedor(10,"EDP",form);
        assertEquals("Id: EDP; Imposto: 10.0;\n",forn.toString());
    }

    @Test
    void testClone() {
        Fornecedor forn2 =  forn.clone();
        assertEquals (forn,forn2);
    }

    @Test
    void casaGastouMaisPeriodo() {
        //TODO
    }

    @Test
    void getValorFornecedor() {
        String idCasa = "abc";
        LocalDateTime init = LocalDateTime.now();
        LocalDateTime finit = LocalDateTime.now();
    }

    @Test
    void addFatura(){
        LocalDateTime init = LocalDateTime.of(2023, 5, 1, 0, 0);
        LocalDateTime finit = LocalDateTime.of(2023, 5, 1, 23, 59);
        try {
            forn.addFatura(init,finit);
        } catch (LogNotExistsException e) {
            assertTrue(true);
        }
    }

    @Test
    void faturasEmitidas() {

        LocalDateTime inicio = LocalDateTime.of(2023, 5, 1, 0, 0, 0);
        LocalDateTime fim = LocalDateTime.of(2023, 5, 31, 23, 59, 59);
        double consumo = 100.0;
        String idFatura = "fatura";
        String morada = "Rua do Exemplo, 123";
        int NIF = 123456789;
        String idFornecedor = "MEO";
        double valor = 50.0;

        //CasaInteligente casa1 = new CasaInteligente("abc");
        //CasaInteligente casa2 = new CasaInteligente("def");
        Fatura fatura1 = new Fatura(consumo, idFatura, inicio, fim, morada, NIF, idFornecedor, valor);

        //forn.addFatura(fatura1);
    }

    @Test
    void faturaçaoFornecedor() {
    }

    @Test
    void compareTo() {

    }
}