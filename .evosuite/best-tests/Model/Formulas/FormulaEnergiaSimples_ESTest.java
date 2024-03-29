/*
 * This file was automatically generated by EvoSuite
 * Sun May 14 08:26:05 GMT 2023
 */

package Model.Formulas;

import org.junit.Test;
import static org.junit.Assert.*;
import Model.Formulas.FormulaEnergia;
import Model.Formulas.FormulaEnergiaSimples;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FormulaEnergiaSimples_ESTest extends FormulaEnergiaSimples_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FormulaEnergiaSimples formulaEnergiaSimples0 = new FormulaEnergiaSimples();
      double double0 = formulaEnergiaSimples0.calculo((-190.17655625698544), 0.0, 0.0, (-190.17655625698544));
      assertEquals((-209.194211882684), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FormulaEnergiaSimples formulaEnergiaSimples0 = new FormulaEnergiaSimples();
      double double0 = formulaEnergiaSimples0.calculo(3174.6, 1226.33816465293, 3174.6, 1226.33816465293);
      assertEquals(7698.171981118223, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FormulaEnergiaSimples formulaEnergiaSimples0 = new FormulaEnergiaSimples();
      double double0 = formulaEnergiaSimples0.calculo(0.0, 0.0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FormulaEnergiaSimples formulaEnergiaSimples0 = new FormulaEnergiaSimples();
      FormulaEnergia formulaEnergia0 = formulaEnergiaSimples0.clone();
      assertFalse(formulaEnergia0.equals((Object)formulaEnergiaSimples0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FormulaEnergiaSimples formulaEnergiaSimples0 = new FormulaEnergiaSimples();
      String string0 = formulaEnergiaSimples0.getId();
      assertEquals("EnergiaSimples", string0);
  }
}
