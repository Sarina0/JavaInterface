package Tests;

import org.junit.Test;


import src.ListUsingArray;
import src.List;
public class TestContains_Array {
    
    @Test
    public void TestContain(){
        

        System.out.println(" Test contains using array list");
        List<Integer> x = new ListUsingArray<Integer>();

    try {
      // Position starts from 1
      //x.add(10);
      //x.add(20);
      x.add(30);
      //System.out.println(x.get(3));// 30
     // x.add(1, 5);

      System.out.println(x.getCurrentSize());//  expected 1
      // if (x.size() > 1)
      //x.remove(1); // this is illegal and an exception will be raised
      
      System.out.println(x.contains(30)); //expected false
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    }
}
