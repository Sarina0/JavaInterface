package Tests;

import org.junit.Test;
import src.ListUsingLinkedList;
import src.List;
public class TestRemove_linklist {
    @Test
    public void TestRemove(){
        System.out.println("Add test using linked list");
        List<Integer> x = new ListUsingLinkedList<Integer>();
    try {
      // Position starts from 1
      x.add(10);
      x.add(20);
      x.add(30);
      System.out.println(x.get(3));// 30
      x.add(1, 5);
      System.out.println(x.get(3));// 20
      x.remove(3);
      System.out.println(x.getCurrentSize());// 3
      x.remove(1);
      x.remove(1);
      x.remove(1);
      System.out.println(x.getCurrentSize());// 0
      // if (x.size() > 1)
      x.remove(1); // this is illegal and an exception will be raised
      System.out.println(x.getCurrentSize()); // 0
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

}}
