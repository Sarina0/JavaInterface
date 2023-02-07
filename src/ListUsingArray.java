package src;
import src.CapacityReachedListException;

public class ListUsingArray<E> implements List<E> {
    Integer[] arr;
    int numberOfElements;
    int front;
    int num;
    int back;

    final int ARR_SIZE = 11;
    final int MAX_CAPACITY = ARR_SIZE - 1;
  


    public ListUsingArray() {
      arr = new Integer[ARR_SIZE]; // 10 items
      numberOfElements = 0;
    }

    public int getCurrentSize() {
      return numberOfElements;
    }

    public boolean isEmpty() {

      if (numberOfElements == 0)
        return true;
      else
        return false;
    }
  
  
    public void add(E element)  throws CapacityReachedListException {
      if (numberOfElements != MAX_CAPACITY) {
        numberOfElements = numberOfElements + 1;
        arr[numberOfElements] = (Integer) element;
      }
    }
  
    // position is >= 1
   
    public void add(int position, E element) {
      if (numberOfElements != MAX_CAPACITY) {
        // shifting to the right >>
        for (int i = numberOfElements; i > position; i--) {
          arr[i + 1] = arr[i];
        }
        arr[position] = (Integer) element;
        numberOfElements++;
      }
    }
  
    public void remove(int position) {
      if (numberOfElements >= 1
          && (position <= numberOfElements && position >= 1)) {
        // shifting to the left <<
        for (int i = position; i < numberOfElements; i++) {
          arr[i] = arr[i + 1];
        }
        numberOfElements--;
      }
    }
  
    private int pos(int index) {
      return (arr.length + back + index) % arr.length;
    }
    public void clear(){
      int Count =0;
      //int size = 100;
      Count++;

      // Let gc do its work
      for (int i = 0; i < numberOfElements; i++)
        arr[pos(i)] = null;
  
        numberOfElements = back = front = 0;
        
   
    }

    
    public boolean contains(E num){


      for (Integer array: arr){
        if (array == num){
          return true;
        }
        else {}
       }
    
       return false;
      }
      
    
    
    
    public E[] toArray(){
 return null;
    }



    public E get(int position) {
    
        return null;
    }

   /*  public int get(int position) {
      return arr[position];
    }*/
  
    
    public static void main(String[] args) {
      ListUsingArray x = new ListUsingArray();
     
    }
  }