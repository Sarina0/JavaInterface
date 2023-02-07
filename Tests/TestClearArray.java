package Tests;

import org.junit.Test;
import src.ListUsingArray;
import src.List;
public class TestClearArray {
    

@Test
public void TestClear(){
    System.out.println(" clear Arrayyy test");
    List<Integer> x = new ListUsingArray<Integer>();
  try {
      x.add(10);
      x.add(20);
      x.add(30);
      
      System.out.println(x.getCurrentSize());   // expected 3
      x.clear();
      System.out.println(x.getCurrentSize());  // expected 0
     x.add(5);
     System.out.println(x.getCurrentSize());  // expected 1

  } catch (Exception e) {
    System.out.println(e.getMessage());
  }
    }
  }