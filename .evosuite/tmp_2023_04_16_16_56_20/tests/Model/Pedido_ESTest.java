/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 16 16:20:18 GMT 2023
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import Model.Pedido;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
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
      Clock clock0 = MockClock.systemUTC();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Pedido pedido0 = new Pedido(localDateTime0, "", "", "", "f%xn:uJ.", false);
      String string0 = pedido0.getTipo();
      assertEquals("", pedido0.getId());
      assertEquals("", string0);
      assertEquals("", pedido0.getFuncao());
      assertEquals("f%xn:uJ.", pedido0.getEspecificacoes());
      assertFalse(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Clock clock0 = MockClock.systemUTC();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Pedido pedido0 = new Pedido(localDateTime0, "", "", "", "f%xn:uJ.", false);
      boolean boolean0 = pedido0.getMode();
      assertEquals("f%xn:uJ.", pedido0.getEspecificacoes());
      assertEquals("", pedido0.getFuncao());
      assertEquals("", pedido0.getTipo());
      assertFalse(boolean0);
      assertEquals("", pedido0.getId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "O[|UfcP[(+", "O[|UfcP[(+", "O[|UfcP[(+", "O[|UfcP[(+", true);
      pedido0.getId();
      assertTrue(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(zoneId0);
      Pedido pedido0 = new Pedido(localDateTime0, (String) null, "", "", (String) null, false);
      String string0 = pedido0.getId();
      assertFalse(pedido0.getMode());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "", "", "'&uVSDnLa*t", "))@xE#?x]", false);
      String string0 = pedido0.getFuncao();
      assertEquals("'&uVSDnLa*t", string0);
      assertFalse(pedido0.getMode());
      assertEquals("", pedido0.getId());
      assertEquals("))@xE#?x]", pedido0.getEspecificacoes());
      assertEquals("", pedido0.getTipo());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Pedido pedido0 = new Pedido(localDateTime0, "", "", "", "", false);
      pedido0.getFuncao();
      assertFalse(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "", "", "^uX#fL7('KS/%>`@+", ":Z?9dLJc", false);
      String string0 = pedido0.getEspecificacoes();
      assertEquals("", pedido0.getId());
      assertEquals("^uX#fL7('KS/%>`@+", pedido0.getFuncao());
      assertEquals(":Z?9dLJc", string0);
      assertEquals("", pedido0.getTipo());
      assertFalse(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "", "", "'&uVSDnLa*t", "))@xE#?x]", false);
      assertEquals("))@xE#?x]", pedido0.getEspecificacoes());
      
      pedido0.setEspecificacoes("");
      pedido0.getEspecificacoes();
      assertEquals("", pedido0.getTipo());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Clock clock0 = MockClock.systemUTC();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Pedido pedido0 = new Pedido(localDateTime0, "", "", "", "f%xn:uJ.", false);
      pedido0.getDate();
      assertEquals("", pedido0.getTipo());
      assertEquals("", pedido0.getFuncao());
      assertEquals("f%xn:uJ.", pedido0.getEspecificacoes());
      assertFalse(pedido0.getMode());
      assertEquals("", pedido0.getId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Pedido pedido0 = new Pedido(localDateTime0, (String) null, (String) null, (String) null, (String) null, false);
      pedido0.getFuncao();
      assertFalse(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "i=#llaMQ", "i=#llaMQ", "i=#llaMQ", "i=#llaMQ", true);
      pedido0.setId("i=#llaMQ");
      assertTrue(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "i=#llaMQ", "i=#llaMQ", "i=#llaMQ", "i=#llaMQ", true);
      pedido0.getTipo();
      assertTrue(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "i=#llaMQ", "i=#llaMQ", "i=#llaMQ", "i=#llaMQ", true);
      pedido0.setMode(true);
      assertTrue(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Pedido pedido0 = new Pedido(localDateTime0, (String) null, (String) null, (String) null, (String) null, false);
      pedido0.setDate(localDateTime0);
      assertFalse(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "i=#llaMQ", "i=#llaMQ", "i=#llaMQ", "i=#llaMQ", true);
      pedido0.getDate();
      assertTrue(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Pedido pedido0 = new Pedido(localDateTime0, (String) null, (String) null, (String) null, (String) null, false);
      String string0 = pedido0.toString();
      assertEquals("Pedido{date=2014-02-14T20:21:21.320, tipo='null', id='null', funcao='null', especificacoes='null', mode=false}", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Pedido pedido0 = new Pedido(localDateTime0, (String) null, (String) null, (String) null, (String) null, false);
      pedido0.setTipo((String) null);
      assertFalse(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Pedido pedido0 = new Pedido(localDateTime0, (String) null, (String) null, (String) null, (String) null, false);
      pedido0.getId();
      assertFalse(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Pedido pedido0 = new Pedido((LocalDateTime) null, "i=#llaMQ", "i=#llaMQ", "i=#llaMQ", "i=#llaMQ", true);
      boolean boolean0 = pedido0.getMode();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Pedido pedido0 = new Pedido(localDateTime0, (String) null, (String) null, (String) null, (String) null, false);
      pedido0.getEspecificacoes();
      assertFalse(pedido0.getMode());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Pedido pedido0 = new Pedido(localDateTime0, (String) null, (String) null, (String) null, (String) null, false);
      pedido0.setFuncao((String) null);
      assertFalse(pedido0.getMode());
  }
}