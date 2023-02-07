package Tests;

import org.junit.Test;
import src.ListUsingArray;
import src.List;
public class TestToArray_Array {
    
    @Test
    public void TestToArray(){
        System.out.println(" to array Arrayyy test");
        List<Integer> x = new ListUsingArray<Integer>();
      try {
          x.add(90);
          x.add(20);
          x.add(30);
      
          
          System.out.println(x.getCurrentSize());   // expected 3
          x.toArray();
         // System.out.println(x.toArray());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
        }
      }
