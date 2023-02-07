package Tests;

import src.ListUsingLinkedList;

import org.junit.Test;

import src.List;

public class TestClearLinklist {
    
    @Test
    public void TestClear(){

        System.out.println("clear linked list");
        List<Integer> x = new ListUsingLinkedList<Integer>();
    try {
      // Position starts from 1
      x.add(10);
      x.add(20);
      x.add(30);


      System.out.println(x.getCurrentSize());// expected 3
      x.clear();
   
      System.out.println(x.getCurrentSize()); // 0
      x.add(99);
      System.out.println(x.getCurrentSize()); // 1
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    }
}
