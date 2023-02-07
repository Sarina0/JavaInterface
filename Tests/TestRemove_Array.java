package Tests;

import org.junit.Test;
import src.ListUsingArray;
import src.List;;

public class TestRemove_Array {
   @Test
   public void TestRemove(){
    System.out.println(" Remove from Arrayyy test");
    List<Integer> x = new ListUsingArray<Integer>();
  try {
      x.add(10);
      x.add(20);
      x.add(30);
  
      x.add(1, 5);
 
      x.remove(3); // 20
   
      System.out.println(x.getCurrentSize());   // expected 3
  } catch (Exception e) {
    System.out.println(e.getMessage());
  }
    }
  }

