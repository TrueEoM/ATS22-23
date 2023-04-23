/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 16 16:07:13 GMT 2023
 */

package Model.Tests.Test;

import Model.Tests.Scaffolding.SmartHouses_ESTest_scaffolding;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.CasaInteligente;
import Model.Formulas.FormulaEndesa;
import Model.Formulas.FormulaEnergia;
import Model.Formulas.FormulaEnergiaSimples;
import Model.Fornecedor;
import Model.Log;
import Model.SmartCamera;
import Model.SmartDevice;
import Model.SmartHouses;
import Model.SmartSpeaker;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.nio.file.InvalidPathException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SmartHouses_ESTest extends SmartHouses_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.addRoom("i:gNny!>#cUS-q{S\";7A", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      smartHouses0.addRoom(";", "P\"+Yz");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      List<Fornecedor> list0 = smartHouses0.ordenarFornecedores((LocalDateTime) null, localDateTime0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      SmartCamera smartCamera0 = new SmartCamera("8JtD%ueVZp", "8JtD%ueVZp", (-890.240790919), (-890.240790919));
      // Undeclared exception!
      try { 
        smartHouses0.addDeviceToRoom("8JtD%ueVZp", "Model.Exceptions.FornecedorAlreadyExistsException", smartCamera0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      Log log0 = new Log();
      // Undeclared exception!
      try { 
        smartHouses0.addLogExecute("*ID DEVICE ->  * \n - INFO -> ID: Casa\n\tOn: true;\n\tConsumo Base: 608.46174358571;\n\tVolume: 2688676; \tMarca: ; \tCanal: \n\n\n", "", log0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.alteraFornecedor(",", "~ob6Ny9sd\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.existeDeviceInHome((String) null, "WsR?]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      smartHouses0.colocaTon(":\")*>\",xpB*x0CXj_e", "Imposto: ", 3);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      smartHouses0.colocaTon("hX@_c_`", "%]e*L-&", 3955);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      smartHouses0.colocaTon(":\")*>\",xpB*x0CXj_e", "Imposto: ", 2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      smartHouses0.colocaTon(":\")*>\",xpB*x0CXj_e", "Imposto: ", 1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.gestaoDevices("YIce", (String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.addDeviceToRoomSameHouse("Fornecedor", "*(A-)<nz8H(:P6D=M", "Gold Energy");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Fornecedor fornecedor0 = new Fornecedor("Pjg>4O+&*", 0.7);
      Map<String, CasaInteligente> map0 = fornecedor0.getAllCasas();
      CasaInteligente casaInteligente0 = new CasaInteligente("", "Pjg>4O+&*", 0, "", "Model.Exceptions.LinhaException");
      Map<String, SmartDevice> map1 = casaInteligente0.getDevices();
      HashMap<String, Fornecedor> hashMap0 = new HashMap<String, Fornecedor>();
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(0);
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      SmartHouses smartHouses0 = new SmartHouses(map0, map1, hashMap0, localDateTime0);
      HashMap<String, CasaInteligente> hashMap1 = new HashMap<String, CasaInteligente>();
      smartHouses0.setCasas(hashMap1);
      assertTrue(hashMap1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      HashMap<String, Fornecedor> hashMap0 = new HashMap<String, Fornecedor>();
      smartHouses0.setFornecedor(hashMap0);
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      Fornecedor fornecedor0 = new Fornecedor("", 608.46174358571);
      smartHouses0.adicionaFornecedor("", fornecedor0);
      smartHouses0.changeFormula("", "R@GB/o");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FormulaEnergiaSimples formulaEnergiaSimples0 = new FormulaEnergiaSimples();
      Fornecedor fornecedor0 = new Fornecedor(0.0, "", formulaEnergiaSimples0);
      Map<String, CasaInteligente> map0 = fornecedor0.getAllCasas();
      SmartHouses smartHouses0 = new SmartHouses();
      Map<String, SmartDevice> map1 = smartHouses0.getDispositivos();
      HashMap<String, Fornecedor> hashMap0 = new HashMap<String, Fornecedor>();
      hashMap0.put("", fornecedor0);
      SmartHouses smartHouses1 = new SmartHouses(map0, map1, hashMap0, (LocalDateTime) null);
      List<Fornecedor> list0 = smartHouses1.ordenarFornecedores((LocalDateTime) null, (LocalDateTime) null);
      assertTrue(list0.contains(fornecedor0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      FormulaEndesa formulaEndesa0 = new FormulaEndesa();
      Fornecedor fornecedor0 = new Fornecedor((-9.131208008292617), "", formulaEndesa0);
      smartHouses0.addFornecedor(fornecedor0);
      Map<String, Fornecedor> map0 = smartHouses0.getFornecedores();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      FormulaEndesa formulaEndesa0 = new FormulaEndesa();
      Fornecedor fornecedor0 = new Fornecedor(0.0, "", formulaEndesa0);
      smartHouses0.addFornecedor(fornecedor0);
      Fornecedor fornecedor1 = smartHouses0.getFornecedor("");
      assertEquals(0.0, fornecedor1.getImposto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      FormulaEndesa formulaEndesa0 = new FormulaEndesa();
      Fornecedor fornecedor0 = new Fornecedor((-9.131208008292617), "", formulaEndesa0);
      smartHouses0.addFornecedor(fornecedor0);
      Fornecedor fornecedor1 = smartHouses0.getFornecedor("");
      assertTrue(fornecedor1.equals((Object)fornecedor0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("Model.SmartHouses", true, (-955981111), "JQcE8mAI", "M-HxZ!de_E<p", 0.0);
      smartHouses0.adicionaDevice("M-HxZ!de_E<p", smartSpeaker0);
      Map<String, SmartDevice> map0 = smartHouses0.getDispositivos();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      LocalDateTime localDateTime0 = smartHouses0.getDate();
      assertNotNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FormulaEnergiaSimples formulaEnergiaSimples0 = new FormulaEnergiaSimples();
      Fornecedor fornecedor0 = new Fornecedor(0.0, "", formulaEnergiaSimples0);
      SmartHouses smartHouses0 = new SmartHouses();
      smartHouses0.adicionaFornecedor("", fornecedor0);
      boolean boolean0 = smartHouses0.existsHomeInFornecedor("", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("Casa", true, 2688677, "", "", 610.6712183760771);
      smartHouses0.adicionaDevice("", smartSpeaker0);
      String string0 = smartHouses0.dispositovosTostring();
      assertEquals("*ID DEVICE ->  * \n - INFO -> ID: Casa\n\tOn: true;\n\tConsumo Base: 610.6712183760771;\n\tVolume: 2688677; \tMarca: ; \tCanal: \n\n\n", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.setFornecedores((Map<String, Fornecedor>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.setDispositivos((Map<String, SmartDevice>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.setAlldivision("", "6{8", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.parser(":\")*>\",xpB*x0CXj_e");
        fail("Expecting exception: InvalidPathException");
      
      } catch(InvalidPathException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.parser((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.lerFicheiro("}Vh<<jle2dMXY<PC@");
        fail("Expecting exception: InvalidPathException");
      
      } catch(InvalidPathException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.lerFicheiro((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("estado.obj");
      FileSystemHandling.createFolder(evoSuiteFile0);
      SmartHouses smartHouses0 = new SmartHouses();
      try { 
        smartHouses0.guardarEstado();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.carregarEstado((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("bHxL@b!gn;vbAx7mA");
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      try { 
        smartHouses0.carregarEstado("bHxL@b!gn;vbAx7mA");
        fail("Expecting exception: StreamCorruptedException");
      
      } catch(StreamCorruptedException e) {
         //
         // invalid stream header: 00000000
         //
         verifyException("java.io.ObjectInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("bHxL@b!gn;vbAx7mA");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "AF");
      try { 
        smartHouses0.carregarEstado("bHxL@b!gn;vbAx7mA");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ObjectInputStream$PeekInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.adicionaFornecedor((String) null, (Fornecedor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.adicionaDevice("*Z)k", (SmartDevice) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HashMap<String, CasaInteligente> hashMap0 = new HashMap<String, CasaInteligente>();
      HashMap<String, SmartDevice> hashMap1 = new HashMap<String, SmartDevice>();
      HashMap<String, Fornecedor> hashMap2 = new HashMap<String, Fornecedor>();
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      SmartHouses smartHouses0 = new SmartHouses(hashMap0, hashMap1, hashMap2, localDateTime0);
      Boolean boolean0 = new Boolean(true);
      // Undeclared exception!
      try { 
        smartHouses0.addLogChangeMode("", localDateTime0, boolean0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      LocalDateTime localDateTime0 = MockLocalDateTime.of(1, 1, 1, 1, 1, 1, 1);
      Boolean boolean0 = Boolean.FALSE;
      // Undeclared exception!
      try { 
        smartHouses0.addLogChangeMode("6>", localDateTime0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.addFornecedor((Fornecedor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      Map<String, SmartDevice> map0 = smartHouses0.getDispositivos();
      HashMap<String, Fornecedor> hashMap0 = new HashMap<String, Fornecedor>();
      ZoneId zoneId0 = ZoneId.systemDefault();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(zoneId0);
      SmartHouses smartHouses1 = null;
      try {
        smartHouses1 = new SmartHouses((Map<String, CasaInteligente>) null, map0, hashMap0, localDateTime0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FormulaEnergiaSimples formulaEnergiaSimples0 = new FormulaEnergiaSimples();
      Fornecedor fornecedor0 = new Fornecedor(0.0, "[#O[}Sfa8(1YQ?", formulaEnergiaSimples0);
      HashMap<String, CasaInteligente> hashMap0 = new HashMap<String, CasaInteligente>();
      SmartHouses smartHouses0 = new SmartHouses();
      Map<String, SmartDevice> map0 = smartHouses0.getDispositivos();
      HashMap<String, Fornecedor> hashMap1 = new HashMap<String, Fornecedor>();
      hashMap1.put("", fornecedor0);
      hashMap1.put("[#O[}Sfa8(1YQ?", fornecedor0);
      SmartHouses smartHouses1 = null;
      try {
        smartHouses1 = new SmartHouses(hashMap0, map0, hashMap1, (LocalDateTime) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Duplicate key Id: [#O[}Sfa8(1YQ?; Imposto: 0.0;Formula: Model.Formulas.FormulaEnergiaSimples@1;
         //
         verifyException("java.util.stream.Collectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SmartHouses smartHouses0 = null;
      try {
        smartHouses0 = new SmartHouses((SmartHouses) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FormulaEnergiaSimples formulaEnergiaSimples0 = new FormulaEnergiaSimples();
      Fornecedor fornecedor0 = new Fornecedor(0.0, "", formulaEnergiaSimples0);
      Map<String, CasaInteligente> map0 = fornecedor0.getAllCasas();
      SmartHouses smartHouses0 = new SmartHouses();
      Map<String, SmartDevice> map1 = smartHouses0.getDispositivos();
      HashMap<String, Fornecedor> hashMap0 = new HashMap<String, Fornecedor>();
      hashMap0.put("", fornecedor0);
      SmartHouses smartHouses1 = new SmartHouses(map0, map1, hashMap0, (LocalDateTime) null);
      boolean boolean0 = smartHouses1.containsFornecedor("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      boolean boolean0 = smartHouses0.containsFornecedor("O fornecedor nao possui a casa");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      try { 
        smartHouses0.lerFicheiro("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // Ficheiro n\u00E3o encontrado
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      Map<String, CasaInteligente> map0 = smartHouses0.getCasas();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      Map<String, Fornecedor> map0 = smartHouses0.getFornecedores();
      smartHouses0.setFornecedores(map0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.setCasas((Map<String, CasaInteligente>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      Map<String, SmartDevice> map0 = smartHouses0.getDispositivos();
      smartHouses0.setDispositivos(map0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HashMap<String, CasaInteligente> hashMap0 = new HashMap<String, CasaInteligente>();
      HashMap<String, SmartDevice> hashMap1 = new HashMap<String, SmartDevice>(938);
      HashMap<String, Fornecedor> hashMap2 = new HashMap<String, Fornecedor>();
      SmartHouses smartHouses0 = new SmartHouses(hashMap0, hashMap1, hashMap2, (LocalDateTime) null);
      LocalDateTime localDateTime0 = smartHouses0.getDate();
      assertNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      smartHouses0.addRoom("O fornecedor ", "0Ss2K<)fVXEZy^");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FormulaEnergiaSimples formulaEnergiaSimples0 = new FormulaEnergiaSimples();
      Fornecedor fornecedor0 = new Fornecedor(0.0, "", formulaEnergiaSimples0);
      Map<String, CasaInteligente> map0 = fornecedor0.getAllCasas();
      SmartHouses smartHouses0 = new SmartHouses();
      Map<String, SmartDevice> map1 = smartHouses0.getDispositivos();
      HashMap<String, Fornecedor> hashMap0 = new HashMap<String, Fornecedor>();
      hashMap0.put("", fornecedor0);
      SmartHouses smartHouses1 = new SmartHouses(map0, map1, hashMap0, (LocalDateTime) null);
      String string0 = smartHouses1.fornecedorComMaisFaturacao((LocalDateTime) null, (LocalDateTime) null);
      assertEquals("O fornecedor com mais fatura\u00E7\u00E3o \u00E9 o N\u00E3o h\u00E1 faturas registadas.", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      String string0 = smartHouses0.casaGastouMaisPeriodoVariosFornecedores(localDateTime0, localDateTime0);
      assertEquals("Nenhuma casa tem valor superior a 0\u20AC", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HashMap<String, SmartDevice> hashMap0 = new HashMap<String, SmartDevice>();
      HashMap<String, Fornecedor> hashMap1 = new HashMap<String, Fornecedor>();
      Fornecedor fornecedor0 = new Fornecedor((String) null, 938);
      hashMap1.put("O fornecedor nao possui a casa", fornecedor0);
      HashMap<String, CasaInteligente> hashMap2 = new HashMap<String, CasaInteligente>();
      SmartHouses smartHouses0 = new SmartHouses(hashMap2, hashMap0, hashMap1, (LocalDateTime) null);
      try { 
        smartHouses0.removeFornecedor((String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // O Model.Fornecedor com id null n\u00E3o existe
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      smartHouses0.removeFornecedor("O fornecedor nao possui a casa");
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      Fornecedor fornecedor0 = new Fornecedor("A casa que consumiu mais foi a ", 0.0);
      smartHouses0.addFornecedor(fornecedor0);
      try { 
        smartHouses0.addFornecedor(fornecedor0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // O Model.Fornecedor com id A casa que consumiu mais foi a  j\u00E1 existe
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      try { 
        smartHouses0.getFornecedor("Z=%l$z'");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // O Model.Fornecedor com id Z=%l$z' n\u00E3o existe
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      FormulaEndesa formulaEndesa0 = new FormulaEndesa();
      Fornecedor fornecedor0 = new Fornecedor(1.7, "", formulaEndesa0);
      smartHouses0.addFornecedor(fornecedor0);
      Fornecedor fornecedor1 = smartHouses0.getFornecedor("");
      assertNotSame(fornecedor1, fornecedor0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FormulaEnergiaSimples formulaEnergiaSimples0 = new FormulaEnergiaSimples();
      Fornecedor fornecedor0 = new Fornecedor(0.0, "", formulaEnergiaSimples0);
      SmartHouses smartHouses0 = new SmartHouses();
      smartHouses0.adicionaFornecedor("", fornecedor0);
      smartHouses0.atualiza((LocalDateTime) null);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      smartHouses0.parser("");
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      try { 
        smartHouses0.removeHome("]", "YQ#$l");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // O fornecedor ] n\u00E3o existe.
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      boolean boolean0 = smartHouses0.existeDeviceHomes("Y,;");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      boolean boolean0 = smartHouses0.existsHome("!f7HqkE+RR");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      smartHouses0.colocaVol((String) null, "", 320);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("Casa", true, 2688677, "", "", 610.6712183760771);
      smartHouses0.adicionaDevice("", smartSpeaker0);
      try { 
        smartHouses0.adicionaDevice("", smartSpeaker0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Device com esse id j\u00E1 existe
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FormulaEnergiaSimples formulaEnergiaSimples0 = new FormulaEnergiaSimples();
      Fornecedor fornecedor0 = new Fornecedor(0.0, "", formulaEnergiaSimples0);
      SmartHouses smartHouses0 = new SmartHouses();
      smartHouses0.adicionaFornecedor("", fornecedor0);
      boolean boolean0 = smartHouses0.existsFornecedor("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      boolean boolean0 = smartHouses0.existsFornecedor("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("", true, 2688677, "", "", 608.46174358571);
      smartHouses0.adicionaDevice("", smartSpeaker0);
      boolean boolean0 = smartHouses0.existsDevice("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      boolean boolean0 = smartHouses0.existsDevice("]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.getLogsDevice("JfLZ.ILuS", ">D0cV/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.setAllDevicesHome("QPat^B", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      Map<String, FormulaEnergia> map0 = smartHouses0.getFormulas();
      smartHouses0.setFormulas(map0);
      assertEquals(14, map0.size());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      SmartHouses smartHouses1 = smartHouses0.clone();
      assertNotSame(smartHouses1, smartHouses0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      String string0 = smartHouses0.dispositovosTostring();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      SmartHouses smartHouses1 = new SmartHouses(smartHouses0);
      assertFalse(smartHouses1.equals((Object)smartHouses0));
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.getFaturas("!f7HqkE+RR");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      CasaInteligente casaInteligente0 = new CasaInteligente("l#}Phb*o$jCG", "l#}Phb*o$jCG", 0, "?1F-lP_", "l#}Phb*o$jCG");
      // Undeclared exception!
      try { 
        smartHouses0.adicionaHome("l#}Phb*o$jCG", casaInteligente0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      Fornecedor fornecedor0 = new Fornecedor("", 608.46174358571);
      smartHouses0.adicionaFornecedor("", fornecedor0);
      try { 
        smartHouses0.removeHome("", "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // O fornecedor  n\u00E3o tem a casa 
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.setFornecedor((Map<String, Fornecedor>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      try { 
        smartHouses0.guardarEstado();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.changeFormula("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      smartHouses0.setDate((LocalDateTime) null);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      try { 
        smartHouses0.carregarEstado("bHxL@b!gn;vbAx7mA");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.removePermanenteDevice("&zn.x0Ip!`OZA`h33!", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.removeDevice("", "S93");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      // Undeclared exception!
      try { 
        smartHouses0.existsHomeInFornecedor("]", "\n");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartHouses", e);
      }
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      SmartHouses smartHouses0 = new SmartHouses();
      String string0 = smartHouses0.casasTostring();
      assertEquals("", string0);
  }
}
