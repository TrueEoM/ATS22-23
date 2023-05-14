/*
 * This file was automatically generated by EvoSuite
 * Sun May 14 08:29:13 GMT 2023
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import Model.Pedido;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Pedido_ESTest extends Pedido_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, (String) null, (String) null, "|x", (String) null, false);
      String string0 = pedido0.getTipo();
      assertFalse(pedido0.getMode());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "i=#llaMQ", "i=#llaMQ", "i=#llaMQ", "i=#llaMQ", true);
      pedido0.getTipo();
      assertTrue(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Pedido pedido0 = new Pedido(localDateTime0, "Pedido{date=", "t B>~Tg~+ iZ5}h", "", "t B>~Tg~+ iZ5}h", false);
      boolean boolean0 = pedido0.getMode();
      assertFalse(boolean0);
      assertEquals("Pedido{date=", pedido0.getTipo());
      assertEquals("", pedido0.getFuncao());
      assertEquals("t B>~Tg~+ iZ5}h", pedido0.getEspecificacoes());
      assertEquals("t B>~Tg~+ iZ5}h", pedido0.getId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Pedido pedido0 = new Pedido(localDateTime0, (String) null, (String) null, (String) null, (String) null, false);
      pedido0.getId();
      assertFalse(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "O[|UfcP[(+", "O[|UfcP[(+", "O[|UfcP[(+", "O[|UfcP[(+", true);
      pedido0.getId();
      assertTrue(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(zoneId0);
      Pedido pedido0 = new Pedido(localDateTime0, (String) null, "", "", (String) null, false);
      pedido0.setFuncao((String) null);
      pedido0.getFuncao();
      assertFalse(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Pedido pedido0 = new Pedido(localDateTime0, ", mode=", ", mode=", ", mode=", ", mode=", false);
      pedido0.getFuncao();
      assertFalse(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, (String) null, "\"2zoH", (String) null, "\"2zoH", true);
      String string0 = pedido0.getEspecificacoes();
      assertNotNull(string0);
      assertTrue(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, (String) null, (String) null, "|x", (String) null, false);
      pedido0.setEspecificacoes("");
      pedido0.getEspecificacoes();
      assertFalse(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      Pedido pedido0 = new Pedido(localDateTime0, "7QF`", "7QF`", "7QF`", "", false);
      pedido0.getDate();
      assertEquals("7QF`", pedido0.getTipo());
      assertFalse(pedido0.getMode());
      assertEquals("", pedido0.getEspecificacoes());
      assertEquals("7QF`", pedido0.getFuncao());
      assertEquals("7QF`", pedido0.getId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "", "", "", "", true);
      pedido0.getFuncao();
      assertTrue(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "", "", "", "", true);
      pedido0.setId("");
      assertTrue(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "", "", "", "", true);
      pedido0.getTipo();
      assertTrue(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, (String) null, (String) null, (String) null, (String) null, true);
      pedido0.setMode(true);
      assertTrue(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "", "", "", "", true);
      pedido0.setDate((LocalDateTime) null);
      assertTrue(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "", "", "", "", true);
      pedido0.getDate();
      assertTrue(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "", "", "", "", true);
      String string0 = pedido0.toString();
      assertEquals("Pedido{date=null, tipo='', id='', funcao='', especificacoes='', mode=true}", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "", "", "", "", true);
      pedido0.setTipo("");
      assertTrue(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "", "", "", "", true);
      pedido0.getId();
      assertTrue(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "", "", "", "", true);
      boolean boolean0 = pedido0.getMode();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, (String) null, (String) null, (String) null, (String) null, true);
      pedido0.getEspecificacoes();
      assertTrue(pedido0.getMode());
  }
}