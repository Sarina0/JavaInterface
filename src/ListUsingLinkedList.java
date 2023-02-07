package src;
import src.CapacityReachedListException;

public class ListUsingLinkedList<E> implements List<E> {

    Node<E> front;
    int numberOfElements;
  
    public ListUsingLinkedList() {
      front = null;
      numberOfElements = 0;
    }
  
    public int getCurrentSize() {
        return numberOfElements;
      }

      public boolean isEmpty(){
        if(this.front == null){
          return true;
          }
          else {
            return false;
          }
      }

    public void add(E element) throws CapacityReachedListException {
      add(numberOfElements + 1, element);
      
    }
  
    public void remove(int position) throws RemovalOnAnEmptyListException {
      // try {1
      if (numberOfElements > 1) {
        Node<E> prevNode = getNode(position - 1);
        Node<E> tmp = prevNode.next;
        // 1
        prevNode.next = prevNode.next.next;
        // 2
        tmp.next = null;
        numberOfElements--;
      } else if (numberOfElements == 1) {
        Node<E> tmp = front;
  
        front = front.next;
  
        tmp.next = null;
        numberOfElements--;
      } else {
        // System.out.println("You should remove from an empty List ");
        // throw new RuntimeException("You should remove from an empty List "); //
        // UnChecked Exception
        throw new RemovalOnAnEmptyListException("You should remove from an empty List "); // Checked Exception
        // not reachable
      }
      // } catch (Exception e) {
      // System.out.println(e.getMessage());
      // // cleaning
      // }
    }
    public void clear(){
     
     front = null;
     numberOfElements = 0;
    }
    public boolean contains(E num){

   
      if (front == null) {
        return false;
    }
  
    int index = 0;
    Node temp = front;
  
    while (temp != null) {
  
        // Returns the index of that particular element,
        // if found.
        if (temp.data == num) {
            return true;
        }
  
        // Gradually increases index while traversing through the Linked List
        index++;
        temp = temp.next;
    }
  
    // Returns -1 if the element is not found
    return false;
  }
    
  
    public E[] toArray(){
      return null;

    }
 
    public void add(int position, E element) {
      Node<E> aNewNode = new Node<E>();
      aNewNode.data = element;
      if (position > 1) {
  
        Node<E> prevNode = getNode(position - 1);
  
        // 1
        aNewNode.next = prevNode.next;
  
        // 2
        prevNode.next = aNewNode;
        numberOfElements++;
      } else if (position == 1) {
        // position is 1
        aNewNode.next = front;
        front = aNewNode;
        numberOfElements++;
      } else {
        System.out.println("You should not use position < 1 ");
      }
    }
  
   
    Node<E> getNode(int position) {
      if (position > numberOfElements)
        return null;
  
      Node<E> tmp = front;
      if (front != null) {
        int counter = 1;
        while (counter < position) {
  
          tmp = tmp.next;
          counter++;
        }
      }
      return tmp;
    }
  
 
  
  
    public E get(int position) {
      if (position >= 1)
        return getNode(position).data;
      else
        return null;
    }
  
  
    public static void main(String[] args) {
      List<Integer> x = new ListUsingLinkedList<Integer>();
   
  
    }
  
  }
  