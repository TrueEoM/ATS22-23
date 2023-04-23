/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 16 16:24:54 GMT 2023
 */

package Model.Tests.Test;

import Model.Tests.Scaffolding.FormulaEndesa_ESTest_scaffolding;
import org.junit.Test;
import static org.junit.Assert.*;
import Model.Formulas.FormulaEndesa;
import Model.Formulas.FormulaEnergia;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FormulaEndesa_ESTest extends FormulaEndesa_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FormulaEndesa formulaEndesa0 = new FormulaEndesa();
      double double0 = formulaEndesa0.calculo(0.0, 1.0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FormulaEndesa formulaEndesa0 = new FormulaEndesa();
      double double0 = formulaEndesa0.calculo(0.0, 0.0, 1650.6, (-1.0));
      assertEquals((-1650.6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FormulaEndesa formulaEndesa0 = new FormulaEndesa();
      double double0 = formulaEndesa0.calculo((-840.40382752154), (-840.40382752154), (-840.40382752154), (-840.40382752154));
      assertEquals(2118835.7799385637, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FormulaEndesa formulaEndesa0 = new FormulaEndesa();
      FormulaEnergia formulaEnergia0 = formulaEndesa0.clone();
      assertNotSame(formulaEnergia0, formulaEndesa0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FormulaEndesa formulaEndesa0 = new FormulaEndesa();
      String string0 = formulaEndesa0.getId();
      assertEquals("Endesa", string0);
  }
}