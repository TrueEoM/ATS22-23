/*
 * This file was automatically generated by EvoSuite
 * Wed May 10 16:51:41 GMT 2023
 */

package Model.Exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import Model.Exceptions.SmartDeviceNotExistsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SmartDeviceNotExistsException_ESTest extends SmartDeviceNotExistsException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SmartDeviceNotExistsException smartDeviceNotExistsException0 = new SmartDeviceNotExistsException((String) null);
  }
}
