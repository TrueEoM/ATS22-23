/*
 * This file was automatically generated by EvoSuite
 * Sun May 14 08:16:06 GMT 2023
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.SmartBulb;
import Model.SmartDevice;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SmartBulb_ESTest extends SmartBulb_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("&I@$~&#B'Y2UU{", "\n", false, 47, 47);
      smartBulb0.setDimensao(20);
      SmartBulb smartBulb1 = new SmartBulb(smartBulb0);
      smartBulb1.setDimensao(47);
      boolean boolean0 = smartBulb0.equals(smartBulb1);
      assertEquals(47, smartBulb1.getDimensao());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("", "", 1, 1);
      assertEquals(3.4, smartBulb0.consumoDiario(), 0.01);
      
      smartBulb0.changetoNeutral();
      smartBulb0.getMode();
      assertEquals(1, smartBulb0.getDimensao());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("", "", 0, 1.5);
      int int0 = smartBulb0.getDimensao();
      assertEquals(0, int0);
      assertEquals(3.4, smartBulb0.consumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("&I@$~&#B'Y2UU{", "\n", false, 47, 47);
      int int0 = smartBulb0.getDimensao();
      assertEquals(47, int0);
      assertEquals(3.4, smartBulb0.consumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("!xsSJbDP~NoaKaj\b", "n*5T", false, 0, 0);
      SmartBulb smartBulb1 = (SmartBulb)smartBulb0.clone();
      assertEquals(0, smartBulb1.getDimensao());
      assertEquals(3.4, smartBulb1.consumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        SmartBulb.parseSmartBulb((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartBulb", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        SmartBulb.parseSmartBulb("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("Model.SmartBulb", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        SmartBulb.fromString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartBulb", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SmartBulb smartBulb0 = null;
      try {
        smartBulb0 = new SmartBulb("", (String) null, true, (-1), (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartBulb", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SmartBulb smartBulb0 = null;
      try {
        smartBulb0 = new SmartBulb("Tt!CvZ[)>1WtI&z", (String) null, (-2724), (-2724));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartBulb", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SmartBulb smartBulb0 = null;
      try {
        smartBulb0 = new SmartBulb((SmartBulb) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartDevice", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SmartBulb.fromString("!xsSJbDP~NoaKaj\b");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SmartBulb.Mode smartBulb_Mode0 = SmartBulb.fromString("Neutral");
      assertEquals(SmartBulb.Mode.NEUTRAL, smartBulb_Mode0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("&I@$~&#B'Y2UU{", "\n", false, 47, 47);
      double double0 = smartBulb0.calculaCold();
      assertEquals(3.4, smartBulb0.consumoDiario(), 0.01);
      assertEquals(8.8, double0, 0.01);
      assertEquals(47, smartBulb0.getDimensao());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("", "", 1, 1);
      smartBulb0.getMode();
      assertEquals(1, smartBulb0.getDimensao());
      assertEquals(3.4, smartBulb0.consumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("", "tfuH", (-515), (-719.33085472231));
      int int0 = smartBulb0.getDimensao();
      assertEquals(3.4, smartBulb0.consumoDiario(), 0.01);
      assertEquals((-515), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("&I@$~*,&#B'UU{", "&I@$~*,&#B'UU{", true, 65, 65);
      SmartDevice smartDevice0 = smartBulb0.clone();
      smartBulb0.setDimensao(14);
      boolean boolean0 = smartDevice0.equals(smartBulb0);
      assertEquals(14, smartBulb0.getDimensao());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("60?h]^!>sg ~", "60?h]^!>sg ~", false, (-5), (-5));
      SmartBulb smartBulb1 = (SmartBulb)smartBulb0.clone();
      smartBulb1.changetoCold();
      boolean boolean0 = smartBulb0.equals(smartBulb1);
      assertTrue(smartBulb1.getModo());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("\t5.n ", "Cold", 2106116, 2106116);
      SmartBulb smartBulb1 = new SmartBulb("Cold", "Cold", false, 2106116, 2106116);
      boolean boolean0 = smartBulb0.equals(smartBulb1);
      assertEquals(2106116, smartBulb0.getDimensao());
      assertEquals(2106116, smartBulb1.getDimensao());
      assertEquals(8.8, smartBulb0.consumoDiario(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("&I@$~*,&#B'UU{", "&I@$~*,&#B'UU{", true, 65, 65);
      SmartBulb smartBulb1 = new SmartBulb(smartBulb0);
      boolean boolean0 = smartBulb0.equals(smartBulb1);
      assertEquals(65, smartBulb0.getDimensao());
      assertEquals(3.4, smartBulb1.consumoDiario(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb((String) null, "", true, 892, (-1864.1497906));
      SmartBulb smartBulb1 = new SmartBulb(smartBulb0);
      // Undeclared exception!
      try { 
        smartBulb0.equals(smartBulb1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartDevice", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("^JfA4K_>", "^JfA4K_>", (-145), (-145));
      boolean boolean0 = smartBulb0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(3.4, smartBulb0.consumoDiario(), 0.01);
      assertEquals((-145), smartBulb0.getDimensao());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb((String) null, "", true, 892, (-1864.1497906));
      boolean boolean0 = smartBulb0.equals(smartBulb0);
      assertEquals(3.4, smartBulb0.consumoDiario(), 0.01);
      assertTrue(boolean0);
      assertEquals(892, smartBulb0.getDimensao());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("asI?teV9", "asI?teV9", 2566, 2566);
      Object object0 = new Object();
      boolean boolean0 = smartBulb0.equals(object0);
      assertEquals(2566, smartBulb0.getDimensao());
      assertFalse(boolean0);
      assertEquals(3.4, smartBulb0.consumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("asI?teV9", "asI?teV9", 2566, 2566);
      assertEquals(3.4, smartBulb0.consumoDiario(), 0.01);
      
      smartBulb0.changetoWarm();
      double double0 = smartBulb0.consumoDiario();
      assertEquals(1.8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("asI?teV9", "asI?teV9", 2566, 2566);
      double double0 = smartBulb0.consumoDiario();
      assertEquals(3.4, double0, 0.01);
      assertEquals(2566, smartBulb0.getDimensao());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("asI?teV9", "asI?teV9", 2566, 2566);
      SmartBulb.Mode smartBulb_Mode0 = SmartBulb.Mode.COLD;
      smartBulb0.setMode(smartBulb_Mode0);
      assertEquals(8.8, smartBulb0.consumoDiario(), 0.01);
      
      smartBulb0.changetoNeutral();
      assertEquals(8.8, smartBulb0.calculaCold(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("60?h]^!>sg ~", "60?h]^!>sg ~", false, (-5), (-5));
      smartBulb0.changetoWarm();
      assertEquals(1.8, smartBulb0.consumoDiario(), 0.01);
      
      smartBulb0.changetoNeutral();
      assertEquals(1.8, smartBulb0.calculaWarm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("60?h]^!>sg ~", "60?h]^!>sg ~", false, (-5), (-5));
      smartBulb0.changetoNeutral();
      assertEquals(3.4, smartBulb0.consumoDiario(), 0.01);
      
      smartBulb0.changetoWarm();
      assertEquals(3.4, smartBulb0.calculaNeutral(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("asI?teV9", "asI?teV9", 2566, 2566);
      smartBulb0.changetoWarm();
      smartBulb0.changetoCold();
      assertTrue(smartBulb0.getModo());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("\tOn: ", "\tOn: ", (-1), (-4425.106564627478));
      smartBulb0.turnOFFlamp();
      assertEquals((-1), smartBulb0.getDimensao());
      assertEquals(3.4, smartBulb0.consumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SmartBulb.Mode smartBulb_Mode0 = SmartBulb.fromString("Warm");
      assertEquals(SmartBulb.Mode.WARM, smartBulb_Mode0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SmartBulb.Mode smartBulb_Mode0 = SmartBulb.fromString("Cold");
      assertEquals(SmartBulb.Mode.COLD, smartBulb_Mode0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("Neutral", "Neutral", false, (-82), (-82));
      smartBulb0.changetoCold();
      assertTrue(smartBulb0.getModo());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("&I@$~*,&#B'UU{", "&I@$~*,&#B'UU{", true, 65, 65);
      assertEquals(3.4, smartBulb0.consumoDiario(), 0.01);
      
      smartBulb0.changetoCold();
      double double0 = smartBulb0.consumoDiario();
      assertEquals(8.8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("asI?teV9", "asI?teV9", 2566, 2566);
      String string0 = smartBulb0.toString();
      assertEquals("ID: asI?teV9\n\tOn: false;\n\tConsumo Base: 2566.0;\n\tModo: null; \tDimensao: 2566; ", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("asI?teV9", "asI?teV9", 2566, 2566);
      SmartBulb.Mode smartBulb_Mode0 = SmartBulb.Mode.COLD;
      smartBulb0.setMode(smartBulb_Mode0);
      assertEquals(8.8, smartBulb0.consumoDiario(), 0.01);
      
      smartBulb0.changetoWarm();
      assertEquals(2566, smartBulb0.getDimensao());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("\tOn: ", "\tOn: ", (-1), (-4425.106564627478));
      double double0 = smartBulb0.calculaWarm();
      assertEquals(1.8, double0, 0.01);
      assertEquals((-1), smartBulb0.getDimensao());
      assertEquals(3.4, smartBulb0.consumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("\tOn: ", "\tOn: ", (-1), (-4425.106564627478));
      double double0 = smartBulb0.calculaNeutral();
      assertEquals((-1), smartBulb0.getDimensao());
      assertEquals(3.4, smartBulb0.consumoDiario(), 0.01);
      assertEquals(3.4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("\tOn: ", "\tOn: ", (-1), (-4425.106564627478));
      smartBulb0.turnOnLamp();
      assertEquals((-1), smartBulb0.getDimensao());
      assertEquals(3.4, smartBulb0.consumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        SmartBulb.parseSmartBulb("u!,6,$LIQ1$,K");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }
}
