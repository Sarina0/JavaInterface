package Tests;


import org.junit.jupiter.api.Test;


import src.List;
import src.ListUsingLinkedList;


public class Test_isEmpty_linklist {
    @Test
    void Test_isEmpty(){

        System.out.println("Is Empty test using linked list");
        List<Integer> x = new ListUsingLinkedList<Integer>();
        try {
          // Position starts from 1
          x.add(10);
          //x.add(20);
         // x.add(30);
         //x.isEmpty();
         System.out.println(x.isEmpty());  // expected false
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
}}

    

