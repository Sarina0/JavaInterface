package Tests;

import org.junit.Test;

import src.ListUsingLinkedList;
import src.List;
public class TestContains_linklist {
    

    @Test
    public void TestContains(){
        System.out.println("contains this is gog to  test using linked list");
        List<Integer> x = new ListUsingLinkedList<Integer>();

    try {
      // Position starts from 1
      //x.add(10);
      //x.add(20);
      x.add(30);
      //System.out.println(x.get(3));// 30
     // x.add(1, 5);

      System.out.println(x.getCurrentSize());//  expected 3
      // if (x.size() > 1)
      //x.remove(1); // this is illegal and an exception will be raised
      
      System.out.println(x.contains(30)); //expected false
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
 
}}