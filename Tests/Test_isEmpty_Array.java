package Tests;


import org.junit.jupiter.api.Test;


import src.List;
import src.ListUsingArray;
public class Test_isEmpty_Array {
    @Test
    void Test_isEmpty(){
     
        System.out.println("Is Empty test using array list");
        List<Integer> x = new ListUsingArray<Integer>();
        try {
         
        x.add(20);
       
         System.out.println(x.isEmpty());  // expected ture
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
    }


}
