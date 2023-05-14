/*
 * This file was automatically generated by EvoSuite
 * Sun May 14 08:21:48 GMT 2023
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.SmartCamera;
import Model.SmartDevice;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SmartCamera_ESTest extends SmartCamera_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", false, "\tTamanho: ", 0.0, 3096.0);
      SmartCamera smartCamera1 = new SmartCamera(smartCamera0);
      assertEquals(0.0, smartCamera1.getTamanho(), 0.01);
      
      smartCamera1.setTamanho(3096.0);
      boolean boolean0 = smartCamera1.equals(smartCamera0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((String) null, (String) null, 0.0, (-783.2155802445834));
      double double0 = smartCamera0.getTamanho();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("J9,GmyvT|w4nD'Iww", "J9,GmyvT|w4nD'Iww", 3969.22610576112, (-2277.957009));
      double double0 = smartCamera0.getTamanho();
      assertEquals(3969.22610576112, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", true, "", (-1.0), 0.0);
      smartCamera0.setResolucao((String) null);
      smartCamera0.getResolucao();
      assertEquals((-1.0), smartCamera0.getTamanho(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", "", (-1395.0), 1998.4935507516);
      smartCamera0.setResolucao("h+D,ef");
      smartCamera0.getResolucao();
      assertEquals((-1395.0), smartCamera0.getTamanho(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("%8x8o", false, "%8x8o", 0.0, 0.0);
      double double0 = smartCamera0.consumoDiario();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("%8x8o", false, "%8x8o", 2527.52461637, 2527.52461637);
      double double0 = smartCamera0.consumoDiario();
      assertEquals(161761.57544768, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("%8x8o", "%8x8o", (-1256.5879576285245), (-1256.5879576285245));
      double double0 = smartCamera0.consumoDiario();
      assertEquals((-80421.62928822557), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        SmartCamera.parseSmartCamera((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartCamera", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        SmartCamera.parseSmartCamera("ID: ");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("Model.SmartCamera", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("2$aI6l1Gg3", (String) null, (-1.0), (-1.0));
      SmartDevice smartDevice0 = smartCamera0.clone();
      // Undeclared exception!
      try { 
        smartCamera0.equals(smartDevice0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("K|1^S", true, "K|1^S", (-1266.3888), (-1266.3888));
      // Undeclared exception!
      try { 
        smartCamera0.consumoDiario();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"|1^\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", true, "", (-1.0), 0.0);
      smartCamera0.setResolucao((String) null);
      // Undeclared exception!
      try { 
        smartCamera0.consumoDiario();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartCamera", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("-29*", false, "-29*", 33.770402449532, 33.770402449532);
      // Undeclared exception!
      try { 
        smartCamera0.consumoDiario();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("Model.SmartCamera", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SmartCamera smartCamera0 = null;
      try {
        smartCamera0 = new SmartCamera((SmartCamera) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartDevice", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("#KM]`'bBv", "#KM]`'bBv", (-1228.046), 2577.1365);
      double double0 = smartCamera0.getTamanho();
      assertEquals((-1228.046), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", "", (-1395.0), 1998.4935507516);
      smartCamera0.getResolucao();
      assertEquals((-1395.0), smartCamera0.getTamanho(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("Mode.SMatrCaera", "-o2nx", (-1902.2), (-1902.2));
      SmartCamera smartCamera1 = new SmartCamera(smartCamera0);
      assertEquals("-o2nx", smartCamera0.getResolucao());
      
      smartCamera0.setResolucao("-p2nx");
      boolean boolean0 = smartCamera1.equals(smartCamera0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("Model.SMatrtCamera", false, "Model.SMatrtCamera", (-3.4861204198794913), (-3.4861204198794913));
      SmartDevice smartDevice0 = smartCamera0.clone();
      boolean boolean0 = smartCamera0.equals(smartDevice0);
      assertEquals((-3.4861204198794913), smartCamera0.getTamanho(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", "", (-1395.0), 1998.4935507516);
      SmartCamera smartCamera1 = new SmartCamera("c5RD8?xe@9f-x@<*^", "8l ", (-1.0), 5448.035799);
      boolean boolean0 = smartCamera0.equals(smartCamera1);
      assertFalse(boolean0);
      assertEquals((-1.0), smartCamera1.getTamanho(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", "", (-1395.0), 1998.4935507516);
      boolean boolean0 = smartCamera0.equals("");
      assertEquals((-1395.0), smartCamera0.getTamanho(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("2$aI6l1Gg3", (String) null, (-1.0), (-1.0));
      boolean boolean0 = smartCamera0.equals((Object) null);
      assertEquals((-1.0), smartCamera0.getTamanho(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("Model.SMatrtCamera", false, "Model.SMatrtCamera", (-3.4861204198794913), (-3.4861204198794913));
      boolean boolean0 = smartCamera0.equals(smartCamera0);
      assertEquals((-3.4861204198794913), smartCamera0.getTamanho(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("Mb ", false, "Mb ", 0.391156641189, 0.391156641189);
      SmartDevice smartDevice0 = smartCamera0.clone();
      smartCamera0.setTamanho((-1704.0512151609998));
      boolean boolean0 = smartCamera0.equals(smartDevice0);
      assertEquals((-1704.0512151609998), smartCamera0.getTamanho(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("Mb ", false, "Mb ", 0.391156641189, 0.391156641189);
      String string0 = smartCamera0.toString();
      assertEquals("ID: Mb \n\tOn: false;\n\tConsumo Base: 0.391156641189;\n\tTamanho: 0.391156641189Mb ; \tResolu\u00E7\u00E3o: Mb ;\n", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("Mb ", false, "Mb ", 0.391156641189, 0.391156641189);
      smartCamera0.turnCameraOff();
      assertEquals(0.391156641189, smartCamera0.getTamanho(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", "", (-1395.0), 1998.4935507516);
      smartCamera0.turnCameraOn();
      assertEquals((-1395.0), smartCamera0.getTamanho(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        SmartCamera.parseSmartCamera("+M+T,,>W,SW%");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", true, "", (-1.0), 0.0);
      SmartCamera smartCamera1 = (SmartCamera)smartCamera0.clone();
      assertEquals((-1.0), smartCamera1.getTamanho(), 0.01);
      assertEquals((-1.0), smartCamera0.getTamanho(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", "", (-1395.0), 1998.4935507516);
      // Undeclared exception!
      try { 
        smartCamera0.consumoDiario();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
