/*
 * This file was automatically generated by EvoSuite
 * Sun May 14 08:29:35 GMT 2023
 */

package Model.Exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import Model.Exceptions.FaturaNotExistsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FaturaNotExistsException_ESTest extends FaturaNotExistsException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FaturaNotExistsException faturaNotExistsException0 = new FaturaNotExistsException("");
  }
}