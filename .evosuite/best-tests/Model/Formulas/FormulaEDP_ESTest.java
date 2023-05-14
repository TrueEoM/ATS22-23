/*
 * This file was automatically generated by EvoSuite
 * Sun May 14 08:26:47 GMT 2023
 */

package Model.Formulas;

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
      double double0 = formulaEDP0.calculo((-380.2520917731529), (-380.2520917731529), 646.9399, (-593.126381986));
      assertEquals(7780985.5394183425, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FormulaEDP formulaEDP0 = new FormulaEDP();
      double double0 = formulaEDP0.calculo(858.74155, 0.0, 858.74155, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FormulaEDP formulaEDP0 = new FormulaEDP();
      double double0 = formulaEDP0.calculo(1.0, (-185.8658), 1.0, 1.0);
      assertEquals((-371.7316), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FormulaEDP formulaEDP0 = new FormulaEDP();
      String string0 = formulaEDP0.getId();
      assertEquals("EDP", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FormulaEDP formulaEDP0 = new FormulaEDP();
      FormulaEnergia formulaEnergia0 = formulaEDP0.clone();
      assertNotSame(formulaEDP0, formulaEnergia0);
  }
}
