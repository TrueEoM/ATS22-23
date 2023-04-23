/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 16 16:15:01 GMT 2023
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.Log;
import java.time.LocalDateTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Log_ESTest extends Log_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Log log0 = new Log((LocalDateTime) null, (Boolean) null);
      Boolean boolean0 = log0.getMode();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Boolean boolean0 = new Boolean("\tDia: ");
      Log log0 = new Log(localDateTime0, boolean0);
      Boolean boolean1 = log0.getMode();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Log log0 = new Log();
      log0.getDia();
      assertFalse(log0.getMode());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Log log0 = new Log();
      Log log1 = new Log(log0);
      // Undeclared exception!
      try { 
        log0.equals(log1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Log", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Log log0 = null;
      try {
        log0 = new Log((Log) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Log", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Boolean boolean0 = new Boolean("\tDia: ");
      Log log0 = new Log(localDateTime0, boolean0);
      LocalDateTime localDateTime1 = log0.getDia();
      assertSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Boolean boolean0 = Boolean.TRUE;
      Log log0 = new Log(localDateTime0, boolean0);
      Boolean boolean1 = log0.getMode();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Boolean boolean0 = Boolean.FALSE;
      Log log0 = new Log(localDateTime0, boolean0);
      Log log1 = new Log(localDateTime0, boolean0);
      boolean boolean1 = log1.equals(log0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Boolean boolean0 = Boolean.TRUE;
      Log log0 = new Log(localDateTime0, boolean0);
      Log log1 = new Log();
      log1.setDia(localDateTime0);
      boolean boolean1 = log1.equals(log0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Boolean boolean0 = Boolean.TRUE;
      Log log0 = new Log(localDateTime0, boolean0);
      Log log1 = new Log();
      boolean boolean1 = log0.equals(log1);
      assertFalse(boolean1);
      assertFalse(log1.getMode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Boolean boolean0 = Boolean.TRUE;
      Log log0 = new Log(localDateTime0, boolean0);
      boolean boolean1 = log0.equals(log0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Boolean boolean0 = Boolean.TRUE;
      Log log0 = new Log(localDateTime0, boolean0);
      Object object0 = new Object();
      boolean boolean1 = log0.equals(object0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Boolean boolean0 = Boolean.TRUE;
      Log log0 = new Log(localDateTime0, boolean0);
      String string0 = log0.toString();
      assertEquals("\tDia: 2014-02-14T20:21:21.320; \tEst\u00E1 ligado?: true; ", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Boolean boolean0 = Boolean.TRUE;
      Log log0 = new Log(localDateTime0, boolean0);
      Log log1 = log0.clone();
      assertTrue(log1.equals((Object)log0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Log log0 = new Log();
      boolean boolean0 = log0.equals((Object) null);
      assertFalse(log0.getMode());
      assertFalse(boolean0);
  }
}
