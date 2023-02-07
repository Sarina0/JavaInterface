package Tests;

import org.junit.jupiter.api.Test;


import src.List;
import src.ListUsingLinkedList;
public class TestAddLinkList {
    
  
    @Test
    void TestAdd() {
      System.out.println("Add test using linked list");
        List<Integer> x = new ListUsingLinkedList<Integer>();
    try {
      // Position starts from 1
      x.add(10);
      x.add(20);
      x.add(30);
      System.out.println(x.get(3));// 30
     
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

}}
