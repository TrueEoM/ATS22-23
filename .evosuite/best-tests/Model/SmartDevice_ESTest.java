/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 16 16:19:21 GMT 2023
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.SmartBulb;
import Model.SmartCamera;
import Model.SmartDevice;
import Model.SmartSpeaker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SmartDevice_ESTest extends SmartDevice_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("$VALUES", "$VALUES", 0, 2211.2491);
      String string0 = smartBulb0.toString();
      assertEquals("ID: $VALUES\n\tOn: false;\n\tConsumo Base: 2211.2491;\n\tModo: null; \tDimensao: 0; ", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", true, ".AI(~M?", 917.00504412, (-2506.78786678981));
      boolean boolean0 = smartCamera0.getModo();
      assertTrue(boolean0);
      assertEquals((-2506.78786678981), smartCamera0.getConsumoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((String) null, false, (String) null, 0.0, 1.0);
      smartCamera0.getID();
      assertEquals(1.0, smartCamera0.getConsumoBase(), 0.01);
      assertFalse(smartCamera0.getModo());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("\tConsumo Base: ", " 8p&Y>onJG|Z)f", (-216.01), (-216.01));
      smartCamera0.getID();
      assertFalse(smartCamera0.getModo());
      assertEquals((-216.01), smartCamera0.getConsumoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("", false, 2106116, "", ",gyqQ2Co", 0.0);
      double double0 = smartSpeaker0.getConsumoBase();
      assertEquals(0.0, double0, 0.01);
      assertFalse(smartSpeaker0.getModo());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((String) null, false, "Mb ", 0.0, 2706.7252);
      double double0 = smartCamera0.getConsumoBase();
      assertEquals(2706.7252, double0, 0.01);
      assertFalse(smartCamera0.getModo());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("O/`[2d7xh", "O/`[2d7xh", true, 3647, 3647);
      smartBulb0.equals(smartBulb0);
      assertTrue(smartBulb0.getModo());
      assertEquals(3647.0, smartBulb0.getConsumoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", false, "", 2.2, 2.2);
      smartCamera0.equals("ID: \n\tOn: false;\n\tConsumo Base: 2.2;\n\tTamanho: 2.2Mb ; \tResolu\u00E7\u00E3o: ;\n");
      assertFalse(smartCamera0.getModo());
      assertEquals(2.2, smartCamera0.getConsumoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("/M3j[", false, 0, (String) null, "12q&PygiECO", 2218.9327258159);
      double double0 = smartSpeaker0.consumoDiario();
      assertEquals(0.0, double0, 0.01);
      assertFalse(smartSpeaker0.getModo());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("", true, (-1), "", "!9Ls`>[;%xxp?}", (-1.0));
      double double0 = smartSpeaker0.consumoDiario();
      assertEquals(0.01, double0, 0.01);
      assertTrue(smartSpeaker0.getModo());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("", true, (-1), "", "!9Ls`>[;%xxp?}", 993.14);
      double double0 = smartSpeaker0.consumoDiario();
      assertTrue(smartSpeaker0.getModo());
      assertEquals((-9.9314), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("%V=<3aaj;LEr&G9", true, 0, ">3|PC(3vnz)_,[,%=0X", "%V=<3aaj;LEr&G9", 0);
      SmartDevice smartDevice0 = smartSpeaker0.clone();
      assertTrue(smartDevice0.getModo());
      assertEquals(0.0, smartDevice0.getConsumoBase(), 0.01);
      assertEquals(0.0, smartSpeaker0.getConsumoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", "", 1.0, 1.0);
      SmartDevice smartDevice0 = smartCamera0.clone();
      assertEquals(1.0, smartDevice0.getConsumoBase(), 0.01);
      assertFalse(smartDevice0.getModo());
      assertEquals(1.0, smartCamera0.getConsumoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("u`Z8c", "u`Z8c", false, (-2635), (-2635));
      SmartDevice smartDevice0 = smartBulb0.clone();
      assertEquals((-2635.0), smartBulb0.getConsumoBase(), 0.01);
      assertFalse(smartDevice0.getModo());
      assertEquals((-2635.0), smartDevice0.getConsumoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("m$7#KiY=V%I`>_9", false, (String) null, 3.4, 3.4);
      SmartDevice smartDevice0 = smartCamera0.clone();
      // Undeclared exception!
      try { 
        smartDevice0.equals(smartCamera0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartCamera", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", true, "", 0.0, (-1805.52));
      // Undeclared exception!
      try { 
        smartCamera0.consumoDiario();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", true, ".AI(~M?", 917.00504412, (-2506.78786678981));
      // Undeclared exception!
      try { 
        smartCamera0.consumoDiario();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"AI(~M\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((String) null, false, (String) null, 199.923, 199.923);
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
  public void test18()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("\tConsumo Base: ", " 8p&Y>onJG|Z)f", (-216.01), (-216.01));
      boolean boolean0 = smartCamera0.getModo();
      assertFalse(boolean0);
      assertEquals((-216.01), smartCamera0.getConsumoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", "", 84.28, 84.28);
      smartCamera0.getID();
      assertFalse(smartCamera0.getModo());
      assertEquals(84.28, smartCamera0.getConsumoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("K.N0r5D.", "K.N0r5D.", (-1343.8753859263102), (-1343.8753859263102));
      double double0 = smartCamera0.getConsumoBase();
      assertEquals((-1343.8753859263102), double0, 0.01);
      assertFalse(smartCamera0.getModo());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera("", "", 1.0, 1.0);
      smartCamera0.setConsumoBase((-1363.8082));
      assertEquals((-1363.8082), smartCamera0.getConsumoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("8kL9/.AD", true, 1780, "8kL9/.AD", "8kL9/.AD", 1780);
      assertTrue(smartSpeaker0.getModo());
      
      smartSpeaker0.turnOff();
      assertFalse(smartSpeaker0.getModo());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("'ScYRV%jG#e&lkfm=", "'ScYRV%jG#e&lkfm=", true, 3660, 3660);
      SmartBulb smartBulb1 = new SmartBulb("'ScYRV%jG#e&lkfm=", "'ScYRV%jG#e&lkfm=", 3660, 3660);
      assertTrue(smartBulb1.equals((Object)smartBulb0));
      
      smartBulb1.changetoCold();
      smartBulb0.equals(smartBulb1);
      assertEquals(3660.0, smartBulb0.getConsumoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("8kL9/.AD", true, 1780, "8kL9/.AD", "8kL9/.AD", 1780);
      smartSpeaker0.setModo(true);
      assertTrue(smartSpeaker0.getModo());
      assertEquals(1780.0, smartSpeaker0.getConsumoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((String) null, false, (String) null, 199.923, 199.923);
      assertFalse(smartCamera0.getModo());
      
      smartCamera0.turnOn();
      assertTrue(smartCamera0.getModo());
  }
}
