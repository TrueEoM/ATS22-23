/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 16 15:46:33 GMT 2023
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.Fatura;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Fatura_ESTest extends Fatura_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.of(1, 1, 1, 1, 1, 1, 1);
      Fatura fatura0 = new Fatura(1909.425617, "hM]t\")7", localDateTime0, localDateTime0, "hM]t\")7", 1, "hM]t\")7", 1.0);
      Fatura fatura1 = fatura0.clone();
      fatura1.setConsumo((-1));
      boolean boolean0 = fatura1.equals(fatura0);
      assertEquals((-1.0), fatura1.getConsumo(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.of(1, 1, 1, 1, 1, 1, 1);
      Fatura fatura0 = new Fatura(1909.425617, "hM]t\")7", localDateTime0, localDateTime0, "U/E;G)M!", 1, "hM]t\")7", 1.0);
      Fatura fatura1 = new Fatura(fatura0);
      fatura0.setNIF((-1));
      boolean boolean0 = fatura0.equals(fatura1);
      assertFalse(boolean0);
      assertEquals((-1), fatura0.getNIF());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.of(1, 1, 1, 1, 1);
      Fatura fatura0 = new Fatura(1909.425617, "hMM]t\"7", localDateTime0, localDateTime0, "hMM]t\"7", 1, "hMM]t\"7", 1909.425617);
      Fatura fatura1 = new Fatura(1909.425617, "hMM]t\"7", localDateTime0, localDateTime0, "hMM]t\"7", 1, "hMM]t\"7", 1);
      boolean boolean0 = fatura1.equals(fatura0);
      assertEquals(1, fatura1.getNIF());
      assertFalse(fatura0.equals((Object)fatura1));
      assertEquals(1.0, fatura1.getValor(), 0.01);
      assertEquals(1909.425617, fatura1.getConsumo(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Fatura fatura0 = new Fatura(1.0, "", (LocalDateTime) null, (LocalDateTime) null, "", 63, "\"9sG[Cp/-^tw", 156.14187317);
      double double0 = fatura0.getValor();
      assertEquals("", fatura0.getMorada());
      assertEquals("\"9sG[Cp/-^tw", fatura0.getIdFornecedor());
      assertEquals(63, fatura0.getNIF());
      assertEquals(156.14187317, double0, 0.01);
      assertEquals(1.0, fatura0.getConsumo(), 0.01);
      assertEquals("", fatura0.getIdFatura());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      fatura0.setValor((-611.141));
      double double0 = fatura0.getValor();
      assertEquals((-611.141), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Fatura fatura0 = new Fatura(1.0, "", (LocalDateTime) null, (LocalDateTime) null, "", 63, "\"9sG[Cp/-^tw", 156.14187317);
      int int0 = fatura0.getNIF();
      assertEquals(1.0, fatura0.getConsumo(), 0.01);
      assertEquals("", fatura0.getIdFatura());
      assertEquals("", fatura0.getMorada());
      assertEquals(63, int0);
      assertEquals("\"9sG[Cp/-^tw", fatura0.getIdFornecedor());
      assertEquals(156.14187317, fatura0.getValor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      fatura0.setNIF((-72));
      int int0 = fatura0.getNIF();
      assertEquals((-72), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Fatura fatura0 = new Fatura(1.0, "", (LocalDateTime) null, (LocalDateTime) null, (String) null, (-1), (String) null, 1.0);
      String string0 = fatura0.getMorada();
      assertEquals((-1), fatura0.getNIF());
      assertNull(string0);
      assertEquals(1.0, fatura0.getConsumo(), 0.01);
      assertEquals(1.0, fatura0.getValor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      fatura0.setMorada("9A;!m.S]35{YO`");
      fatura0.getMorada();
      assertEquals(0, fatura0.getNIF());
      assertEquals(0.0, fatura0.getValor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      fatura0.getInicio();
      assertEquals(0, fatura0.getNIF());
      assertEquals(0.0, fatura0.getValor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      fatura0.setIdFornecedor((String) null);
      fatura0.getIdFornecedor();
      assertEquals(0, fatura0.getNIF());
      assertEquals(0.0, fatura0.getValor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      fatura0.setIdFornecedor("OdyfWJr'e1");
      fatura0.getIdFornecedor();
      assertEquals(0.0, fatura0.getValor(), 0.01);
      assertEquals(0, fatura0.getNIF());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(1452);
      LocalDateTime localDateTime0 = MockLocalDateTime.ofEpochSecond((-1126L), 1452, zoneOffset0);
      Fatura fatura0 = new Fatura((-826.932185789435), (String) null, localDateTime0, localDateTime0, "\nValor: ", 0, "\nValor: ", (-1126L));
      String string0 = fatura0.getIdFatura();
      assertEquals(0, fatura0.getNIF());
      assertNull(string0);
      assertEquals((-1126.0), fatura0.getValor(), 0.01);
      assertEquals((-826.932185789435), fatura0.getConsumo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.of(1, 1, 1, 1, 1, 1, 1);
      Fatura fatura0 = new Fatura(1909.425617, "hM]t\")7", localDateTime0, localDateTime0, "U/E;G)M!", 1, "hM]t\")7", 1.0);
      String string0 = fatura0.getIdFatura();
      assertEquals(1909.425617, fatura0.getConsumo(), 0.01);
      assertEquals(1, fatura0.getNIF());
      assertEquals("U/E;G)M!", fatura0.getMorada());
      assertEquals("hM]t\")7", fatura0.getIdFornecedor());
      assertEquals(1.0, fatura0.getValor(), 0.01);
      assertEquals("hM]t\")7", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      Clock clock0 = MockClock.tickSeconds(zoneOffset0);
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Fatura fatura0 = new Fatura((-1489.6474958071), "8J}bG,$J-n{7e8D.?{", localDateTime0, localDateTime0, "8J}bG,$J-n{7e8D.?{", 1, "U&6HZ[?", 0.0);
      fatura0.getFim();
      assertEquals("8J}bG,$J-n{7e8D.?{", fatura0.getMorada());
      assertEquals(1, fatura0.getNIF());
      assertEquals("U&6HZ[?", fatura0.getIdFornecedor());
      assertEquals((-1489.6474958071), fatura0.getConsumo(), 0.01);
      assertEquals("8J}bG,$J-n{7e8D.?{", fatura0.getIdFatura());
      assertEquals(0.0, fatura0.getValor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      fatura0.setConsumo(802.74954064);
      double double0 = fatura0.getConsumo();
      assertEquals(802.74954064, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      fatura0.setConsumo((-1809.269648));
      double double0 = fatura0.getConsumo();
      assertEquals((-1809.269648), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      Fatura fatura1 = fatura0.clone();
      assertEquals(0.0, fatura0.getConsumo(), 0.01);
      assertEquals(0, fatura1.getNIF());
      assertEquals(0.0, fatura0.getValor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Fatura fatura0 = new Fatura((-2739.51118091173), "", (LocalDateTime) null, (LocalDateTime) null, "'7t%k@C", (-1), "", (-1));
      Fatura fatura1 = fatura0.clone();
      assertEquals((-1.0), fatura1.getValor(), 0.01);
      assertEquals("", fatura1.getIdFornecedor());
      assertEquals((-1.0), fatura0.getValor(), 0.01);
      assertEquals("", fatura1.getIdFatura());
      assertEquals((-1), fatura0.getNIF());
      assertEquals("'7t%k@C", fatura1.getMorada());
      assertEquals((-2739.51118091173), fatura0.getConsumo(), 0.01);
      assertEquals((-2739.51118091173), fatura1.getConsumo(), 0.01);
      assertEquals((-1), fatura1.getNIF());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      int int0 = fatura0.getNIF();
      assertEquals(0.0, fatura0.getValor(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      fatura0.getMorada();
      assertEquals(0, fatura0.getNIF());
      assertEquals(0.0, fatura0.getValor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      double double0 = fatura0.getValor();
      assertEquals(0, fatura0.getNIF());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      fatura0.getFim();
      assertEquals(0, fatura0.getNIF());
      assertEquals(0.0, fatura0.getValor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      fatura0.getIdFornecedor();
      assertEquals(0.0, fatura0.getValor(), 0.01);
      assertEquals(0, fatura0.getNIF());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      double double0 = fatura0.getConsumo();
      assertEquals(0.0, fatura0.getValor(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, fatura0.getNIF());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      fatura0.getIdFatura();
      assertEquals(0, fatura0.getNIF());
      assertEquals(0.0, fatura0.getValor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Fatura fatura0 = new Fatura(19.593637829154908, "", localDateTime0, localDateTime0, "", (-1001057531), "", 19.593637829154908);
      fatura0.getInicio();
      assertEquals(19.593637829154908, fatura0.getValor(), 0.01);
      assertEquals((-1001057531), fatura0.getNIF());
      assertEquals(19.593637829154908, fatura0.getConsumo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.of(1, 1, 1, 1, 1);
      Fatura fatura0 = new Fatura(1909.425617, "hMM]t\"7", localDateTime0, localDateTime0, "hMM]t\"7", 1, "hMM]t\"7", 1909.425617);
      Fatura fatura1 = fatura0.clone();
      fatura1.setConsumo(1);
      boolean boolean0 = fatura0.equals(fatura1);
      assertEquals(1.0, fatura1.getConsumo(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Fatura fatura0 = new Fatura(1889.1806276, "{MTM\"7", localDateTime0, localDateTime0, "{MTM\"7", 32, "{MTM\"7", 32);
      Fatura fatura1 = new Fatura(fatura0);
      fatura1.setNIF(1);
      boolean boolean0 = fatura0.equals(fatura1);
      assertEquals(1, fatura1.getNIF());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Fatura fatura0 = new Fatura((-3727.3755389351063), "M<`\"7", localDateTime0, localDateTime0, "M<`\"7", (-37), "M<`\"7", (-3727.3755389351063));
      Fatura fatura1 = new Fatura(fatura0);
      assertTrue(fatura1.equals((Object)fatura0));
      
      fatura1.setMorada("Y:]\"7");
      boolean boolean0 = fatura0.equals(fatura1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.of(1, 1, 1, 1, 1);
      Fatura fatura0 = new Fatura(1909.425617, "hMM]t\"7", localDateTime0, localDateTime0, "hMM]t\"7", 1, "hMM]t\"7", 1909.425617);
      Fatura fatura1 = fatura0.clone();
      boolean boolean0 = fatura0.equals(fatura1);
      assertEquals(1, fatura1.getNIF());
      assertEquals(1909.425617, fatura0.getValor(), 0.01);
      assertEquals(1909.425617, fatura1.getConsumo(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Fatura fatura0 = new Fatura(19.593637829154908, "", localDateTime0, localDateTime0, "", (-1001057531), "", 19.593637829154908);
      Fatura fatura1 = new Fatura();
      fatura1.setFim(localDateTime0);
      boolean boolean0 = fatura0.equals(fatura1);
      assertEquals(0.0, fatura1.getValor(), 0.01);
      assertFalse(boolean0);
      assertEquals(19.593637829154908, fatura0.getValor(), 0.01);
      assertEquals(0, fatura1.getNIF());
      assertEquals((-1001057531), fatura0.getNIF());
      assertEquals(19.593637829154908, fatura0.getConsumo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.of(1, 1, 1, 1, 1);
      Fatura fatura0 = new Fatura(1909.425617, "hMM]t\"7", localDateTime0, localDateTime0, "hMM]t\"7", 1, "hMM]t\"7", 1909.425617);
      Fatura fatura1 = new Fatura(1909.425617, "hMM]t\"7", localDateTime0, localDateTime0, "hMM]t\"7", 1, "hMM]t\"7", 1);
      boolean boolean0 = fatura0.equals(fatura1);
      assertEquals(1909.425617, fatura1.getConsumo(), 0.01);
      assertFalse(fatura1.equals((Object)fatura0));
      assertEquals(1, fatura1.getNIF());
      assertEquals(1.0, fatura1.getValor(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Fatura fatura0 = new Fatura(19.593637829154908, "", localDateTime0, localDateTime0, "", (-1001057531), "", 19.593637829154908);
      Fatura fatura1 = new Fatura();
      boolean boolean0 = fatura0.equals(fatura1);
      assertFalse(boolean0);
      assertEquals(0, fatura1.getNIF());
      assertEquals((-1001057531), fatura0.getNIF());
      assertEquals(19.593637829154908, fatura0.getConsumo(), 0.01);
      assertEquals(0.0, fatura1.getValor(), 0.01);
      assertEquals(19.593637829154908, fatura0.getValor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.of(11, 11, 11, 11, 11);
      Fatura fatura0 = new Fatura((-1753.6989608291065), "MA`\"7", localDateTime0, localDateTime0, "MA`\"7", 11, "MA`\"7", (-1753.6989608291065));
      Fatura fatura1 = new Fatura((-1753.6989608291065), "MA`\"7", localDateTime0, localDateTime0, "MA`\"7", 11, "MA`\"7", (-1753.6989608291065));
      assertTrue(fatura1.equals((Object)fatura0));
      
      fatura1.setIdFornecedor("YI].7");
      boolean boolean0 = fatura1.equals(fatura0);
      assertFalse(fatura1.equals((Object)fatura0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Fatura fatura0 = new Fatura();
      Fatura fatura1 = new Fatura();
      fatura1.setIdFatura("N");
      boolean boolean0 = fatura0.equals(fatura1);
      assertEquals(0.0, fatura1.getValor(), 0.01);
      assertEquals(0, fatura1.getNIF());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Fatura fatura0 = new Fatura(19.593637829154908, "", localDateTime0, localDateTime0, "", (-1001057531), "", 19.593637829154908);
      boolean boolean0 = fatura0.equals("");
      assertFalse(boolean0);
      assertEquals(19.593637829154908, fatura0.getValor(), 0.01);
      assertEquals((-1001057531), fatura0.getNIF());
      assertEquals(19.593637829154908, fatura0.getConsumo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Fatura fatura0 = new Fatura(1.0, "", (LocalDateTime) null, (LocalDateTime) null, "", 63, "\"9sG[Cp/-^tw", 156.14187317);
      boolean boolean0 = fatura0.equals(fatura0);
      assertEquals(1.0, fatura0.getConsumo(), 0.01);
      assertEquals(63, fatura0.getNIF());
      assertEquals(156.14187317, fatura0.getValor(), 0.01);
      assertEquals("", fatura0.getMorada());
      assertEquals("\"9sG[Cp/-^tw", fatura0.getIdFornecedor());
      assertEquals("", fatura0.getIdFatura());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Fatura fatura0 = new Fatura(1.0, "", (LocalDateTime) null, (LocalDateTime) null, "", 63, "\"9sG[Cp/-^tw", 156.14187317);
      boolean boolean0 = fatura0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(156.14187317, fatura0.getValor(), 0.01);
      assertEquals("", fatura0.getIdFatura());
      assertEquals(63, fatura0.getNIF());
      assertEquals(1.0, fatura0.getConsumo(), 0.01);
      assertEquals("", fatura0.getMorada());
      assertEquals("\"9sG[Cp/-^tw", fatura0.getIdFornecedor());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Fatura fatura0 = new Fatura(1.0, "", (LocalDateTime) null, (LocalDateTime) null, "", 63, "\"9sG[Cp/-^tw", 156.14187317);
      String string0 = fatura0.toString();
      assertEquals("\nIdFatura: \nIdFornecedor: \"9sG[Cp/-^tw\nNIF: 63\nConsumo: 1\nValor: 156.14", string0);
      assertEquals("", fatura0.getMorada());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Fatura fatura0 = new Fatura((-3727.3755389351063), "M<`\"7", localDateTime0, localDateTime0, "M<`\"7", (-37), "M<`\"7", (-3727.3755389351063));
      fatura0.setInicio(localDateTime0);
      assertEquals((-37), fatura0.getNIF());
      assertEquals((-3727.3755389351063), fatura0.getConsumo(), 0.01);
      assertEquals((-3727.3755389351063), fatura0.getValor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Fatura fatura0 = new Fatura(1.0, "", (LocalDateTime) null, (LocalDateTime) null, "", 63, "\"9sG[Cp/-^tw", 156.14187317);
      Fatura fatura1 = fatura0.clone();
      // Undeclared exception!
      try { 
        fatura0.equals(fatura1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Fatura fatura0 = null;
      try {
        fatura0 = new Fatura((Fatura) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Fatura", e);
      }
  }
}
