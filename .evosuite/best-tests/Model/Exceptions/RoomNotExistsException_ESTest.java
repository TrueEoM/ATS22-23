/*
 * This file was automatically generated by EvoSuite
 * Sun May 14 08:27:49 GMT 2023
 */

package Model.Exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import Model.Exceptions.RoomNotExistsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RoomNotExistsException_ESTest extends RoomNotExistsException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RoomNotExistsException roomNotExistsException0 = new RoomNotExistsException("Model.Exceptions.RoomNotExistsException");
  }
}
