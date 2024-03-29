/*
 * This file was automatically generated by EvoSuite
 * Sun May 14 08:23:30 GMT 2023
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Menu_ESTest extends Menu_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Menu menu0 = new Menu(linkedList0);
      menu0.setOpcao(682);
      menu0.getOpcao();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      Menu menu0 = new Menu(linkedList0);
      menu0.getOpcoes();
      linkedList0.add("");
      linkedList0.add("NoBrd1|Z,`.");
      linkedList0.iterator();
      // Undeclared exception!
      menu0.executa();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      List<String> list0 = null;
      Menu menu0 = null;
      try {
        menu0 = new Menu((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.iterator();
      String string0 = "WV>u0";
      // Undeclared exception!
      try { 
        linkedList0.set(0, "");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.addFirst("2<lP");
      linkedList0.add("~n,WNCMn&0s");
      Menu menu0 = new Menu(linkedList0);
      menu0.getOpcoes();
      linkedList0.add("~n,WNCMn&0s");
      int int0 = 0;
      menu0.setOpcao(0);
      // Undeclared exception!
      menu0.executa();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<String> linkedList1 = new LinkedList<String>(linkedList0);
      linkedList1.add((String) null);
      linkedList1.add("");
      linkedList1.add("");
      Menu menu0 = new Menu(linkedList1);
      linkedList1.add((String) null);
      linkedList0.add("");
      linkedList1.removeFirst();
      // Undeclared exception!
      try { 
        menu0.setOpcoes((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Menu menu0 = new Menu(linkedList0);
      menu0.setOpcoes(linkedList0);
      menu0.getOpcao();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      linkedList0.sort(comparator0);
      Menu menu0 = new Menu(linkedList0);
      menu0.setOpcoes(linkedList0);
      menu0.setOpcoes(linkedList0);
      menu0.getOpcoes();
      menu0.setOpcoes(linkedList0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "A]o";
      stringArray0[1] = "";
      linkedList0.toArray(stringArray0);
      menu0.setOpcao(0);
      menu0.getOpcoes();
      int int0 = (-5047);
      menu0.setOpcao((-5047));
      menu0.getOpcao();
      // Undeclared exception!
      menu0.executa();
  }
}
