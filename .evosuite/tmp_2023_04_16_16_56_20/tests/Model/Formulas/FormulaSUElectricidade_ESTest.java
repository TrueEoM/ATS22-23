/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 16 16:25:36 GMT 2023
 */

package Model.Formulas;

import org.junit.Test;
import static org.junit.Assert.*;
import Model.Formulas.FormulaEnergia;
import Model.Formulas.FormulaSUElectricidade;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FormulaSUElectricidade_ESTest extends FormulaSUElectricidade_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FormulaSUElectricidade formulaSUElectricidade0 = new FormulaSUElectricidade();
      double double0 = formulaSUElectricidade0.calculo((-167.0), 97.92538996134, (-167.0), 97.92538996134);
      assertEquals(1129614.4067853664, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FormulaSUElectricidade formulaSUElectricidade0 = new FormulaSUElectricidade();
      double double0 = formulaSUElectricidade0.calculo(0.0, 0.0, 0.0, 2962.04481602);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FormulaSUElectricidade formulaSUElectricidade0 = new FormulaSUElectricidade();
      double double0 = formulaSUElectricidade0.calculo((-4690.7537865), (-4690.7537865), 2334.810092274, 2334.810092274);
      assertEquals((-5.114177029654926E10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FormulaSUElectricidade formulaSUElectricidade0 = new FormulaSUElectricidade();
      FormulaEnergia formulaEnergia0 = formulaSUElectricidade0.clone();
      assertNotSame(formulaEnergia0, formulaSUElectricidade0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FormulaSUElectricidade formulaSUElectricidade0 = new FormulaSUElectricidade();
      String string0 = formulaSUElectricidade0.getId();
      assertEquals("SUElectricidade", string0);
  }
}
