/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 16 16:10:00 GMT 2023
 */

package Model.Tests.Test;

import Model.Tests.Scaffolding.Fornecedor_ESTest_scaffolding;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.CasaInteligente;
import Model.Fatura;
import Model.Formulas.FormulaCoopernico;
import Model.Formulas.FormulaEDP;
import Model.Formulas.FormulaEnat;
import Model.Formulas.FormulaEnergia;
import Model.Formulas.FormulaEnergiaSimples;
import Model.Formulas.FormulaGalp;
import Model.Formulas.FormulaGoldEnergy;
import Model.Formulas.FormulaMuon;
import Model.Formulas.FormulaYIce;
import Model.Fornecedor;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Fornecedor_ESTest extends Fornecedor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor((-79.069019), "A fatura com o id ", formulaGoldEnergy0);
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      HashMap<String, CasaInteligente> hashMap0 = new HashMap<String, CasaInteligente>();
      CasaInteligente casaInteligente0 = new CasaInteligente("A fatura com o id ", "A fatura com o id ", 1, "A fatura com o id ", "A fatura com o id ");
      hashMap0.put("A fatura com o id ", casaInteligente0);
      fornecedor0.setAllCasas(hashMap0);
      fornecedor0.addFatura(localDateTime0, (LocalDateTime) null);
      String string0 = fornecedor0.casaGastouMaisPeriodo(localDateTime0, localDateTime0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("", 1.7);
      CasaInteligente casaInteligente0 = new CasaInteligente("", "", 121, "Id: ; Imposto: 1.7;Formula: null;\n", "D~bldoA3?(><n6");
      int int0 = fornecedor0.addCasa(casaInteligente0);
      assertEquals(0, int0);
      
      FormulaEnergiaSimples formulaEnergiaSimples0 = new FormulaEnergiaSimples();
      fornecedor0.setFormula(formulaEnergiaSimples0);
      double double0 = fornecedor0.getValorFornecedor("", (LocalDateTime) null, (LocalDateTime) null, 0.0);
      assertEquals(3.7199999999999998, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("4#rz:!b", 0.0);
      double double0 = fornecedor0.getImposto();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FormulaYIce formulaYIce0 = new FormulaYIce();
      Fornecedor fornecedor0 = new Fornecedor((-470.553), "P[0%jD", formulaYIce0);
      double double0 = fornecedor0.getImposto();
      assertEquals((-470.553), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FormulaGalp formulaGalp0 = new FormulaGalp();
      Fornecedor fornecedor0 = new Fornecedor(3114.0, "%IB-C3AJAr,Kzn", formulaGalp0);
      fornecedor0.getId();
      assertEquals(3114.0, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("W-|#3C#NHk", (-1.0));
      fornecedor0.getFormula();
      assertEquals((-1.0), fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FormulaCoopernico formulaCoopernico0 = new FormulaCoopernico();
      Fornecedor fornecedor0 = new Fornecedor(0.2, "", formulaCoopernico0);
      CasaInteligente casaInteligente0 = new CasaInteligente("", "", 0, "Id: ; Imposto: 0.0;Formula: null;\n", "Id: ; Imposto: 0.0;Formula: null;\n");
      int int0 = fornecedor0.addCasa(casaInteligente0);
      assertEquals(0, int0);
      
      fornecedor0.getCasaWithoutExceptions("");
      assertEquals(0.2, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor(1561.49, "A fatura com o id ", formulaGoldEnergy0);
      HashMap<String, CasaInteligente> hashMap0 = new HashMap<String, CasaInteligente>();
      CasaInteligente casaInteligente0 = new CasaInteligente("a/*)86a3 n&bC/[v5Y", "", 1, "a/*)86a3 n&bC/[v5Y", "");
      hashMap0.put("a/*)86a3 n&bC/[v5Y", casaInteligente0);
      fornecedor0.setAllCasas(hashMap0);
      fornecedor0.getCasaWithoutExceptions("a/*)86a3 n&bC/[v5Y");
      assertEquals(1561.49, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor(",", 1.7);
      CasaInteligente casaInteligente0 = new CasaInteligente(",", ",", (-2141073247), "Id: ,; Imposto: 1.7;Formula: null;\n", "Id: ,; Imposto: 1.7;Formula: null;\n");
      int int0 = fornecedor0.addCasa(casaInteligente0);
      assertEquals(0, int0);
      
      fornecedor0.getCasaWithoutExceptions(",");
      assertEquals(1.7, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("", (-16.527296322989464));
      CasaInteligente casaInteligente0 = new CasaInteligente("Id: ; Imposto: -16.527296322989464;Formula: null;\n", "", 0, "Id: ; Imposto: -16.527296322989464;Formula: null;\n", "Id: ; Imposto: -16.527296322989464;Formula: null;\n");
      int int0 = fornecedor0.addCasa(casaInteligente0);
      assertEquals(0, int0);
      
      fornecedor0.getCasa("Id: ; Imposto: -16.527296322989464;Formula: null;\n");
      assertEquals((-16.527296322989464), fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("", 1.1);
      CasaInteligente casaInteligente0 = new CasaInteligente("", "", (-1), "Pg9&g|r.SS#5H3~", "I9mxV");
      int int0 = fornecedor0.addCasa(casaInteligente0);
      assertEquals(0, int0);
      
      fornecedor0.getCasa("");
      assertEquals(1.1, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FormulaCoopernico formulaCoopernico0 = new FormulaCoopernico();
      Fornecedor fornecedor0 = new Fornecedor(0.2, "", formulaCoopernico0);
      CasaInteligente casaInteligente0 = new CasaInteligente("", "", 0, "Id: ; Imposto: 0.0;Formula: null;\n", "Id: ; Imposto: 0.0;Formula: null;\n");
      int int0 = fornecedor0.addCasa(casaInteligente0);
      assertEquals(0, int0);
      
      fornecedor0.getAllCasas();
      assertEquals(0.2, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor(1561.49, "A fatura com o id ", formulaGoldEnergy0);
      Clock clock0 = MockClock.systemDefaultZone();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      HashMap<String, CasaInteligente> hashMap0 = new HashMap<String, CasaInteligente>();
      CasaInteligente casaInteligente0 = new CasaInteligente("a/*)86a3 n&bC/[v5Y", "", 1, "a/*)86a3 n&bC/[v5Y", "<.gPS!Pu1EJ4");
      hashMap0.put("a/*)86a3 n&bC/[v5Y", casaInteligente0);
      fornecedor0.setAllCasas(hashMap0);
      fornecedor0.addFatura(localDateTime0, (LocalDateTime) null);
      List<Fatura> list0 = fornecedor0.faturasEmitidas();
      assertEquals(1, list0.size());
      assertEquals(1561.49, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor(1561.49, "A fatura com o id ", formulaGoldEnergy0);
      Clock clock0 = MockClock.systemDefaultZone();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Fornecedor fornecedor1 = fornecedor0.clone();
      assertTrue(fornecedor1.equals((Object)fornecedor0));
      
      HashMap<String, CasaInteligente> hashMap0 = new HashMap<String, CasaInteligente>();
      CasaInteligente casaInteligente0 = new CasaInteligente("a/*)86a3 n&bC/[v5Y", "", 1, "a/*)86a3 n&bC/[v5Y", "");
      hashMap0.put("a/*)86a3 n&bC/[v5Y", casaInteligente0);
      fornecedor0.setAllCasas(hashMap0);
      double double0 = fornecedor0.compareTo(fornecedor1, localDateTime0, localDateTime0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor(1561.49, "A fatura com o id ", formulaGoldEnergy0);
      Clock clock0 = MockClock.systemDefaultZone();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Fornecedor fornecedor1 = fornecedor0.clone();
      assertTrue(fornecedor1.equals((Object)fornecedor0));
      
      HashMap<String, CasaInteligente> hashMap0 = new HashMap<String, CasaInteligente>();
      CasaInteligente casaInteligente0 = new CasaInteligente("a/*)86a3 n&bC/[v5Y", "", 1, "a/*)86a3 n&bC/[v5Y", "<.gPS!Pu1EJ4");
      hashMap0.put("a/*)86a3 n&bC/[v5Y", casaInteligente0);
      fornecedor0.setAllCasas(hashMap0);
      double double0 = fornecedor1.compareTo(fornecedor0, (LocalDateTime) null, localDateTime0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FormulaCoopernico formulaCoopernico0 = new FormulaCoopernico();
      Fornecedor fornecedor0 = new Fornecedor(0.0, ")\"Er-SWGed'fM.F", formulaCoopernico0);
      Fornecedor fornecedor1 = fornecedor0.clone();
      assertTrue(fornecedor1.equals((Object)fornecedor0));
      assertEquals(0.0, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("", (-12.494999623424498));
      Fornecedor fornecedor1 = fornecedor0.clone();
      assertTrue(fornecedor1.equals((Object)fornecedor0));
      assertEquals((-12.494999623424498), fornecedor1.getImposto(), 0.01);
      assertEquals((-12.494999623424498), fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FormulaEnat formulaEnat0 = new FormulaEnat();
      Fornecedor fornecedor0 = new Fornecedor(1.8, ";\n", formulaEnat0);
      // Undeclared exception!
      try { 
        fornecedor0.setAllCasas((Map<String, CasaInteligente>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Fornecedor", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, FormulaEnergia> hashMap0 = new HashMap<String, FormulaEnergia>();
      // Undeclared exception!
      try { 
        Fornecedor.parseFornecedor("%IB-C3AJAr,Kzn", hashMap0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, FormulaEnergia> hashMap0 = new HashMap<String, FormulaEnergia>();
      // Undeclared exception!
      try { 
        Fornecedor.parseFornecedor((String) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Fornecedor", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, FormulaEnergia> hashMap0 = new HashMap<String, FormulaEnergia>();
      // Undeclared exception!
      try { 
        Fornecedor.parseFornecedor("", hashMap0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("Model.Fornecedor", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("", (-12.494999623424498));
      // Undeclared exception!
      try { 
        fornecedor0.getValorFornecedor("", (LocalDateTime) null, (LocalDateTime) null, (-12.494999623424498));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Fornecedor", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor(";\n", 1.1);
      Month month0 = Month.JUNE;
      LocalDateTime localDateTime0 = MockLocalDateTime.of(0, month0, 19, 0, 19, 0, 19);
      // Undeclared exception!
      try { 
        fornecedor0.compareTo((Fornecedor) null, localDateTime0, localDateTime0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Fornecedor", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor(1582.3428280002938, "A fatura com o id ", formulaGoldEnergy0);
      Clock clock0 = MockClock.systemDefaultZone();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      fornecedor0.setId((String) null);
      HashMap<String, CasaInteligente> hashMap0 = new HashMap<String, CasaInteligente>();
      CasaInteligente casaInteligente0 = new CasaInteligente("a/*)86a3 n&bC/[v5Y", "A fatura com o id ", 1, "a/*)86a3 n&bC/[v5Y", "A fatura com o id ");
      hashMap0.put("a/*)86a3 n&bC/[v5Y", casaInteligente0);
      fornecedor0.setAllCasas(hashMap0);
      fornecedor0.addFatura(localDateTime0, (LocalDateTime) null);
      // Undeclared exception!
      try { 
        fornecedor0.casaGastouMaisPeriodo(localDateTime0, localDateTime0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.CasaInteligente", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("", 1.7);
      CasaInteligente casaInteligente0 = new CasaInteligente("", "", 98, "Id: ; Imposto: 1.7;Formula: null;\n", "Id: ; Imposto: 1.7;Formula: null;\n");
      fornecedor0.addCasa(casaInteligente0);
      // Undeclared exception!
      try { 
        fornecedor0.addFatura((LocalDateTime) null, (LocalDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Fornecedor", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("", (-1054.890237359));
      // Undeclared exception!
      try { 
        fornecedor0.addCasa((CasaInteligente) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Fornecedor", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Fornecedor fornecedor0 = null;
      try {
        fornecedor0 = new Fornecedor((Fornecedor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Fornecedor", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor(1561.49, "A fatura com o id ", formulaGoldEnergy0);
      Clock clock0 = MockClock.systemDefaultZone();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      HashMap<String, CasaInteligente> hashMap0 = new HashMap<String, CasaInteligente>();
      CasaInteligente casaInteligente0 = new CasaInteligente("a/*)86a3 n&bC/[v5Y", "", 1, "a/*)86a3 n&bC/[v5Y", "");
      hashMap0.put("a/*)86a3 n&bC/[v5Y", casaInteligente0);
      fornecedor0.setAllCasas(hashMap0);
      double double0 = fornecedor0.getValorFornecedor("a/*)86a3 n&bC/[v5Y", (LocalDateTime) null, localDateTime0, (-84.659937447528));
      assertEquals((-264078.993449881), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor(1561.49, "A fatura com o id ", formulaGoldEnergy0);
      HashMap<String, CasaInteligente> hashMap0 = new HashMap<String, CasaInteligente>();
      CasaInteligente casaInteligente0 = new CasaInteligente("a/*)86a3 n&bC/[v5Y", "", 1, "a/*)86a3 n&bC/[v5Y", "<.gPS!Pu1EJ4");
      hashMap0.put("a/*)86a3 n&bC/[v5Y", casaInteligente0);
      fornecedor0.setAllCasas(hashMap0);
      fornecedor0.hasCasa("a/*)86a3 n&bC/[v5Y");
      assertEquals(1561.49, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor(1561.49, "A fatura com o id ", formulaGoldEnergy0);
      fornecedor0.hasCasa("v78ZWT4%S_Aj");
      assertEquals(1561.49, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FormulaCoopernico formulaCoopernico0 = new FormulaCoopernico();
      Fornecedor fornecedor0 = new Fornecedor(0.2, "", formulaCoopernico0);
      fornecedor0.getId();
      assertEquals(0.2, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FormulaCoopernico formulaCoopernico0 = new FormulaCoopernico();
      Fornecedor fornecedor0 = new Fornecedor(0.2, "", formulaCoopernico0);
      fornecedor0.getAllCasas();
      assertEquals(0.2, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FormulaMuon formulaMuon0 = new FormulaMuon();
      Fornecedor fornecedor0 = new Fornecedor(0.0, "`'s=N?,&gqzBT", formulaMuon0);
      fornecedor0.getFormula();
      assertEquals(0.0, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FormulaCoopernico formulaCoopernico0 = new FormulaCoopernico();
      Fornecedor fornecedor0 = new Fornecedor(0.2, "", formulaCoopernico0);
      double double0 = fornecedor0.getImposto();
      assertEquals(0.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FormulaEDP formulaEDP0 = new FormulaEDP();
      Fornecedor fornecedor0 = new Fornecedor(137.577343972986, "", formulaEDP0);
      Fornecedor fornecedor1 = new Fornecedor(fornecedor0);
      assertTrue(fornecedor1.equals((Object)fornecedor0));
      assertEquals(137.577343972986, fornecedor0.getImposto(), 0.01);
      assertEquals(137.577343972986, fornecedor1.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor(1561.49, "A fatura com o id ", formulaGoldEnergy0);
      // Undeclared exception!
      try { 
        fornecedor0.getCasaWithoutExceptions("a/*)86a3 n&bC/[v5Y");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Fornecedor", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("%Zt0C<LG\"M", 477.2901175163876);
      CasaInteligente casaInteligente0 = new CasaInteligente("Id: %Zt0C<LG\"M; Imposto: 477.2901175163876;Formula: null;\n", "%Zt0C<LG\"M", (-17), "Id: %Zt0C<LG\"M; Imposto: 477.2901175163876;Formula: null;\n", "Id: %Zt0C<LG\"M; Imposto: 477.2901175163876;Formula: null;\n");
      int int0 = fornecedor0.addCasa(casaInteligente0);
      assertEquals(0, int0);
      
      fornecedor0.faturasEmitidas();
      assertEquals(477.2901175163876, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor(1561.49, "A fatura com o id ", formulaGoldEnergy0);
      Clock clock0 = MockClock.systemDefaultZone();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      fornecedor0.setId("a/*)86a3 n&bC/[v5Y");
      HashMap<String, CasaInteligente> hashMap0 = new HashMap<String, CasaInteligente>();
      CasaInteligente casaInteligente0 = new CasaInteligente("a/*)86a3 n&bC/[v5Y", "", 1, "a/*)86a3 n&bC/[v5Y", "");
      hashMap0.put("a/*)86a3 n&bC/[v5Y", casaInteligente0);
      fornecedor0.setAllCasas(hashMap0);
      fornecedor0.addFatura(localDateTime0, (LocalDateTime) null);
      String string0 = fornecedor0.casaGastouMaisPeriodo(localDateTime0, localDateTime0);
      assertEquals("a/*)86a3 n&bC/[v5Y", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("", 1.7);
      CasaInteligente casaInteligente0 = new CasaInteligente("", "", 121, "Id: ; Imposto: 1.7;Formula: null;\n", "D~bldoA3?(><n6");
      int int0 = fornecedor0.addCasa(casaInteligente0);
      assertEquals(0, int0);
      
      fornecedor0.casaGastouMaisPeriodo((LocalDateTime) null, (LocalDateTime) null);
      assertEquals(1.7, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor(1561.49, "A fatura com o id ", formulaGoldEnergy0);
      Fornecedor fornecedor1 = fornecedor0.clone();
      assertTrue(fornecedor1.equals((Object)fornecedor0));
      
      HashMap<String, CasaInteligente> hashMap0 = new HashMap<String, CasaInteligente>();
      CasaInteligente casaInteligente0 = new CasaInteligente("a/*)86a3 n&bC/[v5Y", "", 1, "a/*)86a3 n&bC/[v5Y", "");
      hashMap0.put("a/*)86a3 n&bC/[v5Y", casaInteligente0);
      fornecedor0.setAllCasas(hashMap0);
      boolean boolean0 = fornecedor1.equals(fornecedor0);
      assertFalse(fornecedor1.equals((Object)fornecedor0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("?{@6&V?qsTY N", (-2883.26640693905));
      Fornecedor fornecedor1 = new Fornecedor("qrID", (-2883.26640693905));
      boolean boolean0 = fornecedor0.equals(fornecedor1);
      assertFalse(boolean0);
      assertEquals((-2883.26640693905), fornecedor1.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("", 1.1);
      boolean boolean0 = fornecedor0.equals((Object) null);
      assertEquals(1.1, fornecedor0.getImposto(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("%Zt0C<LG\"M", 477.2901175163876);
      boolean boolean0 = fornecedor0.equals(fornecedor0);
      assertEquals(477.2901175163876, fornecedor0.getImposto(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("", 1.7);
      boolean boolean0 = fornecedor0.equals("");
      assertFalse(boolean0);
      assertEquals(1.7, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("", 1.7);
      int int0 = fornecedor0.removeCasa((String) null);
      assertEquals(1.7, fornecedor0.getImposto(), 0.01);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor((-90.52877839738588), "${6;Hp,#^WzSmw", formulaGoldEnergy0);
      HashMap<String, CasaInteligente> hashMap0 = new HashMap<String, CasaInteligente>();
      CasaInteligente casaInteligente0 = new CasaInteligente("${6;Hp,#^WzSmw", "${6;Hp,#^WzSmw", 1, "${6;Hp,#^WzSmw", "${6;Hp,#^WzSmw");
      hashMap0.put("${6;Hp,#^WzSmw", casaInteligente0);
      fornecedor0.setAllCasas(hashMap0);
      int int0 = fornecedor0.removeCasa("${6;Hp,#^WzSmw");
      assertEquals(0, int0);
      assertEquals((-90.52877839738588), fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("", 1.7);
      CasaInteligente casaInteligente0 = new CasaInteligente("", "", 121, "Id: ; Imposto: 1.7;Formula: null;\n", "D~bldoA3?(><n6");
      int int0 = fornecedor0.addCasa(casaInteligente0);
      assertEquals(0, int0);
      
      int int1 = fornecedor0.addCasa(casaInteligente0);
      assertEquals(1, int1);
      assertEquals(1.7, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("[", 6.530262189671307);
      try { 
        fornecedor0.getCasa("89x");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // A casa com id 89x n\u00E3o existe
         //
         verifyException("Model.Fornecedor", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("", 1.1);
      CasaInteligente casaInteligente0 = new CasaInteligente("", "", 761, "Pg9&g|r.SS#5H3~", "I9mxV");
      int int0 = fornecedor0.addCasa(casaInteligente0);
      assertEquals(0, int0);
      
      fornecedor0.getCasa("");
      assertEquals(1.1, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor(1582.3428280002938, "A fatura com o id ", formulaGoldEnergy0);
      fornecedor0.setId((String) null);
      fornecedor0.getId();
      assertEquals(1582.3428280002938, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor(1582.3428280002938, "A fatura com o id ", formulaGoldEnergy0);
      Clock clock0 = MockClock.systemDefaultZone();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      HashMap<String, CasaInteligente> hashMap0 = new HashMap<String, CasaInteligente>();
      CasaInteligente casaInteligente0 = new CasaInteligente("a/*)86a3 n&bC/[v5Y", "A fatura com o id ", 1, "a/*)86a3 n&bC/[v5Y", "A fatura com o id ");
      hashMap0.put("a/*)86a3 n&bC/[v5Y", casaInteligente0);
      fornecedor0.setAllCasas(hashMap0);
      fornecedor0.compareTo(fornecedor0, localDateTime0, localDateTime0);
      assertEquals(1582.3428280002938, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("", 1.7);
      String string0 = fornecedor0.toString();
      assertEquals("Id: ; Imposto: 1.7;\n", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor(1582.3428280002938, "A fatura com o id ", formulaGoldEnergy0);
      fornecedor0.setImposto(1);
      assertEquals(1.0, fornecedor0.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HashMap<String, FormulaEnergia> hashMap0 = new HashMap<String, FormulaEnergia>();
      Fornecedor fornecedor0 = Fornecedor.parseFornecedor("_64O,5", hashMap0);
      assertEquals(5.0, fornecedor0.getImposto(), 0.01);
      assertEquals("_64O", fornecedor0.getId());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FormulaGoldEnergy formulaGoldEnergy0 = new FormulaGoldEnergy();
      Fornecedor fornecedor0 = new Fornecedor(1561.49, "A fatura com o id ", formulaGoldEnergy0);
      Fornecedor fornecedor1 = fornecedor0.clone();
      boolean boolean0 = fornecedor1.equals(fornecedor0);
      assertTrue(boolean0);
      assertEquals(1561.49, fornecedor0.getImposto(), 0.01);
      assertEquals(1561.49, fornecedor1.getImposto(), 0.01);
  }
}
