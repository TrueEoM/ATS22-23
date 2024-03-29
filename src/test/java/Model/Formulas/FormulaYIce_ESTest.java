/*
 * This file was automatically generated by EvoSuite
 * Sun May 14 08:34:04 GMT 2023
 */

package Model.Formulas;

import org.junit.Test;
import static org.junit.Assert.*;
import Model.Formulas.FormulaEnergia;
import Model.Formulas.FormulaYIce;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FormulaYIce_ESTest extends FormulaYIce_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FormulaYIce formulaYIce0 = new FormulaYIce();
      double double0 = formulaYIce0.calculo(0.0, 2339.99559091025, 0.0, 2339.99559091025);
      assertEquals(5475579.365479411, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FormulaYIce formulaYIce0 = new FormulaYIce();
      double double0 = formulaYIce0.calculo((-546.2513768103), (-546.2513768103), (-1.0), 159.296967008);
      assertEquals((-172939.87234602927), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FormulaYIce formulaYIce0 = new FormulaYIce();
      String string0 = formulaYIce0.getId();
      assertEquals("YIce", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FormulaYIce formulaYIce0 = new FormulaYIce();
      double double0 = formulaYIce0.calculo(0.0, 0.0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FormulaYIce formulaYIce0 = new FormulaYIce();
      FormulaEnergia formulaEnergia0 = formulaYIce0.clone();
      assertEquals("YIce", formulaEnergia0.getId());
  }
}
