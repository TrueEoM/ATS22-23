/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 16 16:19:56 GMT 2023
 */

package Model.Tests.Test;

import Model.Tests.Scaffolding.FormulaEDP_ESTest_scaffolding;
import org.junit.Test;
import static org.junit.Assert.*;
import Model.Formulas.FormulaEDP;
import Model.Formulas.FormulaEnergia;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FormulaEDP_ESTest extends FormulaEDP_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FormulaEDP formulaEDP0 = new FormulaEDP();
      double double0 = formulaEDP0.calculo(2045.4398, 246.5929209, (-1.0), (-1.0));
      assertEquals((-1008781.9496142237), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FormulaEDP formulaEDP0 = new FormulaEDP();
      double double0 = formulaEDP0.calculo(0.0, 0.0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FormulaEDP formulaEDP0 = new FormulaEDP();
      double double0 = formulaEDP0.calculo((-2723.0), (-467.167932877675), (-2723.0), (-467.167932877675));
      assertEquals((-4.0582071442357016E9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FormulaEDP formulaEDP0 = new FormulaEDP();
      double double0 = formulaEDP0.calculo(43.81367249390123, 43.81367249390123, 43.81367249390123, 43.81367249390123);
      assertEquals(168212.77228737815, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FormulaEDP formulaEDP0 = new FormulaEDP();
      String string0 = formulaEDP0.getId();
      assertEquals("EDP", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FormulaEDP formulaEDP0 = new FormulaEDP();
      FormulaEnergia formulaEnergia0 = formulaEDP0.clone();
      assertEquals("EDP", formulaEnergia0.getId());
  }
}
