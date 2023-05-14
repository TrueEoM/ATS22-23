/*
 * This file was automatically generated by EvoSuite
 * Sun May 14 08:19:16 GMT 2023
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.SmartDevice;
import Model.SmartSpeaker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SmartSpeaker_ESTest extends SmartSpeaker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("<:$utHJOJ", true, (-2016), "<:$utHJOJ", "<:$utHJOJ", (-2016));
      SmartSpeaker smartSpeaker1 = new SmartSpeaker(smartSpeaker0);
      assertEquals((-2016), smartSpeaker1.getVolume());
      
      smartSpeaker1.setVolume(100);
      boolean boolean0 = smartSpeaker0.equals(smartSpeaker1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("", (-1531), "", "", (-1531));
      String string0 = smartSpeaker0.toString();
      assertEquals("ID: \n\tOn: false;\n\tConsumo Base: -1531.0;\n\tVolume: -1531; \tMarca: ; \tCanal: \n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("\tCanal: ", 284, "\tCanal: ", "\tCanal: ", 0.0);
      smartSpeaker0.setVolume((-1067));
      assertEquals(0, smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("\tConsumo Base: ", 963, "\tConsumo Base: ", "Y/g)o0oQ iatrc+", (-936.49668));
      smartSpeaker0.volumeDown();
      assertEquals((-9009.0980616), smartSpeaker0.consumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("", (-1), "", "Pq[", (-1));
      smartSpeaker0.volumeDown();
      assertEquals("", smartSpeaker0.getMarca());
      assertEquals(0.01, smartSpeaker0.consumoDiario(), 0.01);
      assertEquals("Pq[", smartSpeaker0.getChannel());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("\tConsumo Base: ", 963, "\tConsumo Base: ", "Y/g)o0oQ iatrc+", (-936.49668));
      smartSpeaker0.volumeUp();
      assertEquals("Y/g)o0oQ iatrc+", smartSpeaker0.getChannel());
      assertEquals("\tConsumo Base: ", smartSpeaker0.getMarca());
      assertEquals(963, smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("M@xGk>", 0, "5E", "M@xGk>", 0.0);
      int int0 = smartSpeaker0.getVolume();
      assertEquals(0, int0);
      assertEquals("5E", smartSpeaker0.getMarca());
      assertEquals("M@xGk>", smartSpeaker0.getChannel());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("[/cxLB|AzZK", (-1659), "*FB0F Q[", "", (-1659));
      int int0 = smartSpeaker0.getVolume();
      assertEquals("*FB0F Q[", smartSpeaker0.getMarca());
      assertEquals((-1659), int0);
      assertEquals("", smartSpeaker0.getChannel());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("\tConsumo Base: ", 963, "\tConsumo Base: ", "Y/g)o0oQ iatrc+", (-936.49668));
      String string0 = smartSpeaker0.getMarca();
      assertEquals("Y/g)o0oQ iatrc+", smartSpeaker0.getChannel());
      assertEquals(963, smartSpeaker0.getVolume());
      assertEquals("\tConsumo Base: ", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(";\n", 1, "", ";\n", 1);
      String string0 = smartSpeaker0.getMarca();
      assertEquals(";\n", smartSpeaker0.getChannel());
      assertEquals("", string0);
      assertEquals(0.01, smartSpeaker0.consumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker((String) null, true, (-1), (String) null, (String) null, 0.0);
      smartSpeaker0.getChannel();
      assertEquals((-1), smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("", true, 0, "", "", 0.0);
      smartSpeaker0.getChannel();
      assertEquals(0, smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("M@xGk>", 0, "5E", "M@xGk>", 0.0);
      double double0 = smartSpeaker0.consumoDiario();
      assertEquals(0, smartSpeaker0.getVolume());
      assertEquals("M@xGk>", smartSpeaker0.getChannel());
      assertEquals("5E", smartSpeaker0.getMarca());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("\tConsumo Base: ", 963, "\tConsumo Base: ", "Y/g)o0oQ iatrc+", (-936.49668));
      double double0 = smartSpeaker0.consumoDiario();
      assertEquals((-9018.4630284), double0, 0.01);
      assertEquals("Y/g)o0oQ iatrc+", smartSpeaker0.getChannel());
      assertEquals("\tConsumo Base: ", smartSpeaker0.getMarca());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("\tConsumo Base: ", 963, "\tConsumo Base: ", "Y/g)o0oQ iatrc+", (-936.49668));
      smartSpeaker0.turnSpeakerOn();
      SmartSpeaker smartSpeaker1 = (SmartSpeaker)smartSpeaker0.clone();
      assertEquals((-9018.4630284), smartSpeaker1.consumoDiario(), 0.01);
      assertEquals("Y/g)o0oQ iatrc+", smartSpeaker1.getChannel());
      assertEquals("\tConsumo Base: ", smartSpeaker1.getMarca());
      assertEquals(963, smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("Q}2G|#sNvF&&T@q;0~i", false, 0, "?.Pgm{MT", "Q}2G|#sNvF&&T@q;0~i", 0);
      SmartSpeaker smartSpeaker1 = (SmartSpeaker)smartSpeaker0.clone();
      assertEquals(0, smartSpeaker1.getVolume());
      assertEquals("?.Pgm{MT", smartSpeaker1.getMarca());
      assertEquals("Q}2G|#sNvF&&T@q;0~i", smartSpeaker1.getChannel());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("\tVolume: ", false, 0, "\tVolume: ", "\tVolume: ", 2814.68852);
      SmartDevice smartDevice0 = smartSpeaker0.clone();
      assertEquals(0.0, smartDevice0.consumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        SmartSpeaker.parseSmartSpeaker("ID: ${,;{7+y?Or8kh+-,\n\tOn: false;\n\tConsumo Base: 30.0;\n\tVolume: 30; \tMarca: ${,;{7+y?Or8kh+-,; \tCanal: ${,;{7+y?Or8kh+-,\n");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"ID: ${\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        SmartSpeaker.parseSmartSpeaker((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartSpeaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker((String) null, true, (-1), (String) null, (String) null, 0.0);
      SmartSpeaker smartSpeaker1 = new SmartSpeaker(smartSpeaker0);
      // Undeclared exception!
      try { 
        smartSpeaker1.equals(smartSpeaker0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.SmartDevice", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = null;
      try {
        smartSpeaker0 = new SmartSpeaker((SmartSpeaker) null);
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
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("M@xGk>", 0, "5E", "M@xGk>", 0.0);
      String string0 = smartSpeaker0.getChannel();
      assertEquals("M@xGk>", string0);
      assertEquals("5E", smartSpeaker0.getMarca());
      assertEquals(0, smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("\tConsumo Base: ", 963, "\tConsumo Base: ", "Y/g)o0oQ iatrc+", (-936.49668));
      int int0 = smartSpeaker0.getVolume();
      assertEquals("Y/g)o0oQ iatrc+", smartSpeaker0.getChannel());
      assertEquals("\tConsumo Base: ", smartSpeaker0.getMarca());
      assertEquals(963, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker((String) null, true, (-1), (String) null, (String) null, 0.0);
      smartSpeaker0.getMarca();
      assertEquals((-1), smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("W}>", false, (-133), "W}>", "W}>", (-133));
      SmartSpeaker smartSpeaker1 = new SmartSpeaker(smartSpeaker0);
      boolean boolean0 = smartSpeaker0.equals(smartSpeaker1);
      assertTrue(boolean0);
      assertEquals((-133), smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("ox>kMh", (-46), "PiZMq_aJA", "PiZMq_aJA", (-46));
      assertEquals("PiZMq_aJA", smartSpeaker0.getChannel());
      
      smartSpeaker0.setChannel("PiZMq_aoA");
      SmartDevice smartDevice0 = smartSpeaker0.clone();
      smartSpeaker0.setChannel("PiZMq_aJA");
      boolean boolean0 = smartSpeaker0.equals(smartDevice0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("\tMarca: ", true, (-2021), "\tMarca: ", "\tMarca: ", (-2021));
      SmartSpeaker smartSpeaker1 = new SmartSpeaker(smartSpeaker0);
      smartSpeaker0.volumeUp();
      boolean boolean0 = smartSpeaker0.equals(smartSpeaker1);
      assertEquals((-2020), smartSpeaker0.getVolume());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("c\"`-D4,ZdV zv", 1941, "c\"`-D4,ZdV zv", "c\"`-D4,ZdV zv", 1941);
      SmartSpeaker smartSpeaker1 = new SmartSpeaker("SAcWm`gl", 1941, "c\"`-D4,ZdV zv", "SAcWm`gl", 1941);
      boolean boolean0 = smartSpeaker0.equals(smartSpeaker1);
      assertFalse(boolean0);
      assertEquals("SAcWm`gl", smartSpeaker1.getChannel());
      assertEquals(37674.81, smartSpeaker1.consumoDiario(), 0.01);
      assertEquals("c\"`-D4,ZdV zv", smartSpeaker1.getMarca());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("c\"`-D4,ZdV zv", 1941, "c\"`-D4,ZdV zv", "c\"`-D4,ZdV zv", 1941);
      boolean boolean0 = smartSpeaker0.equals("c\"`-D4,ZdV zv");
      assertEquals(37674.81, smartSpeaker0.consumoDiario(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("W}>", false, (-133), "W}>", "W}>", (-133));
      boolean boolean0 = smartSpeaker0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(176.89, smartSpeaker0.consumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("W}>", false, (-133), "W}>", "W}>", (-133));
      boolean boolean0 = smartSpeaker0.equals(smartSpeaker0);
      assertEquals((-133), smartSpeaker0.getVolume());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(";-;{2D()", 0, "Q", ";-;{2D()", 0);
      SmartSpeaker smartSpeaker1 = new SmartSpeaker(smartSpeaker0);
      assertEquals("Q", smartSpeaker1.getMarca());
      
      smartSpeaker1.setMarca("R");
      boolean boolean0 = smartSpeaker1.equals(smartSpeaker0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(";-;{2D()", 0, "Q", ";-;{2D()", 0);
      smartSpeaker0.setVolume(0);
      assertEquals(";-;{2D()", smartSpeaker0.getChannel());
      assertEquals("Q", smartSpeaker0.getMarca());
      assertEquals(0, smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("y_*;{_C=b!.0cq}", 1026, "y_*;{_C=b!.0cq}", (String) null, 1026);
      assertEquals(1026, smartSpeaker0.getVolume());
      
      smartSpeaker0.setVolume(1026);
      assertEquals(1026.0, smartSpeaker0.consumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("y_*;{_C=b!.0cq}", 1026, "y_*;{_C=b!.0cq}", (String) null, 1026);
      smartSpeaker0.setVolume(2);
      assertEquals(2, smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(";-;{2D()", 0, "Q", ";-;{2D()", 0);
      smartSpeaker0.volumeDown();
      assertEquals("Q", smartSpeaker0.getMarca());
      assertEquals(";-;{2D()", smartSpeaker0.getChannel());
      assertEquals(0, smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("sHmQky3Bv", 100, ";\n", ";\n", 100);
      smartSpeaker0.volumeUp();
      assertEquals(";\n", smartSpeaker0.getMarca());
      assertEquals(100.0, smartSpeaker0.consumoDiario(), 0.01);
      assertEquals(";\n", smartSpeaker0.getChannel());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("sHmQky3Bv", 100, ";\n", ";\n", 100);
      smartSpeaker0.turnSpeakerOff();
      assertEquals(";\n", smartSpeaker0.getMarca());
      assertEquals(100.0, smartSpeaker0.consumoDiario(), 0.01);
      assertEquals(";\n", smartSpeaker0.getChannel());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        SmartSpeaker.parseSmartSpeaker("sHmQky3Bv");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("Model.SmartSpeaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker("ox>kMh", (-46), "PiZMq_aJA", "PiZMq_aJA", (-46));
      double double0 = smartSpeaker0.consumoDiario();
      assertEquals("PiZMq_aJA", smartSpeaker0.getMarca());
      assertEquals(21.16, double0, 0.01);
      assertEquals("PiZMq_aJA", smartSpeaker0.getChannel());
  }
}
