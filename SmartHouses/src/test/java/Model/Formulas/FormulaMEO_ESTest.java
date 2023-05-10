/*
 * This file was automatically generated by EvoSuite
 * Wed May 10 16:53:37 GMT 2023
 */

package Model.Formulas;

import org.junit.Test;
import static org.junit.Assert.*;
import Model.Formulas.FormulaEnergia;
import Model.Formulas.FormulaMEO;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FormulaMEO_ESTest extends FormulaMEO_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FormulaMEO formulaMEO0 = new FormulaMEO();
      double double0 = formulaMEO0.calculo(913.4, 913.4, 913.4, 2012.1085651704);
      assertEquals(5513579.89027993, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FormulaMEO formulaMEO0 = new FormulaMEO();
      double double0 = formulaMEO0.calculo(1319.4891544, (-1192.671385262305), 1319.4891544, (-1192.671385262305));
      assertEquals((-1724968.8820101651), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FormulaMEO formulaMEO0 = new FormulaMEO();
      double double0 = formulaMEO0.calculo(0.0, 0.0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FormulaMEO formulaMEO0 = new FormulaMEO();
      double double0 = formulaMEO0.calculo(1.0, 1.0, (-2344.972401), 1.0);
      assertEquals((-2342.972401), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FormulaMEO formulaMEO0 = new FormulaMEO();
      String string0 = formulaMEO0.getId();
      assertEquals("MEO", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FormulaMEO formulaMEO0 = new FormulaMEO();
      FormulaEnergia formulaEnergia0 = formulaMEO0.clone();
      assertNotSame(formulaMEO0, formulaEnergia0);
  }
}
