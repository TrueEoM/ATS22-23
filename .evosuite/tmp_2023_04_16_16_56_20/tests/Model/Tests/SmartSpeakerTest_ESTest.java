/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 16 16:18:32 GMT 2023
 */

package Model.Tests;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.opentest4j.AssertionFailedError;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SmartSpeakerTest_ESTest extends SmartSpeakerTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SmartSpeakerTest smartSpeakerTest0 = new SmartSpeakerTest();
      smartSpeakerTest0.testeClone();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SmartSpeakerTest smartSpeakerTest0 = new SmartSpeakerTest();
      smartSpeakerTest0.testEquals();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SmartSpeakerTest smartSpeakerTest0 = new SmartSpeakerTest();
      smartSpeakerTest0.tearDown();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SmartSpeakerTest smartSpeakerTest0 = new SmartSpeakerTest();
      smartSpeakerTest0.testTurnSpeakerOFF();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SmartSpeakerTest smartSpeakerTest0 = new SmartSpeakerTest();
      smartSpeakerTest0.testTurnSpeakerOn();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SmartSpeakerTest smartSpeakerTest0 = new SmartSpeakerTest();
      smartSpeakerTest0.testSetMarca();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SmartSpeakerTest smartSpeakerTest0 = new SmartSpeakerTest();
      // Undeclared exception!
      try { 
        smartSpeakerTest0.testVolumeDown();
       //  fail("Expecting exception: AssertionFailedError");
       // Unstable assertion
      } catch(AssertionFailedError e) {
         //
         // expected: <0> but was: <49>
         //
         verifyException("org.junit.jupiter.api.AssertionUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SmartSpeakerTest smartSpeakerTest0 = new SmartSpeakerTest();
      smartSpeakerTest0.setUp();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SmartSpeakerTest smartSpeakerTest0 = new SmartSpeakerTest();
      // Undeclared exception!
      try { 
        smartSpeakerTest0.testToString();
       //  fail("Expecting exception: AssertionFailedError");
       // Unstable assertion
      } catch(AssertionFailedError e) {
         //
         // expected: <ID: Speaker1; On: true; Consumo base: 5.0; Volume: 0, Marca: JBL, Canal: Radio Comercial> but was: <ID: speaker1
         // \tOn: false;
         // \tConsumo Base: 5.0;
         // \tVolume: 50; \tMarca: JBL; \tCanal: Radio Comercial
         // >
         //
         verifyException("org.junit.jupiter.api.AssertionUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SmartSpeakerTest smartSpeakerTest0 = new SmartSpeakerTest();
      smartSpeakerTest0.testSetChannel();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SmartSpeakerTest smartSpeakerTest0 = new SmartSpeakerTest();
      smartSpeakerTest0.testSetVolume();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SmartSpeakerTest smartSpeakerTest0 = new SmartSpeakerTest();
      smartSpeakerTest0.testGetVolume();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SmartSpeakerTest smartSpeakerTest0 = new SmartSpeakerTest();
      smartSpeakerTest0.testConstructor();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SmartSpeakerTest smartSpeakerTest0 = new SmartSpeakerTest();
      smartSpeakerTest0.testGetMarca();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SmartSpeakerTest smartSpeakerTest0 = new SmartSpeakerTest();
      // Undeclared exception!
      try { 
        smartSpeakerTest0.testVolumeUp();
       //  fail("Expecting exception: AssertionFailedError");
       // Unstable assertion
      } catch(AssertionFailedError e) {
         //
         // expected: <1> but was: <51>
         //
         verifyException("org.junit.jupiter.api.AssertionUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SmartSpeakerTest smartSpeakerTest0 = new SmartSpeakerTest();
      smartSpeakerTest0.testGetChannel();
  }
}