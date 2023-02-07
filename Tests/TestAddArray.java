package Tests;

import org.junit.jupiter.api.Test;

import src.ListUsingArray;
import src.List;

public class TestAddArray {
    
    @Test
    void TestAdd() {
          
            System.out.println(" Add Arrayyy test");
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

