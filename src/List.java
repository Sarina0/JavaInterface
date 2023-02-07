package src;

public interface List<T>
{
public int getCurrentSize();
public boolean isEmpty();

/** Adds a new entry to this set, avoiding duplicates.
 @param newEntry The object to be added as a new entry.
@return True if the addition is successful, or
false if the item already is in the set. */
//public boolean add(T newEntry);
public void add(T element) throws CapacityReachedListException;
/** Removes a specific entry from this set, if possible.
@param anEntry The entry to be removed.
@return True if the removal was successful, or false if
not. */
//public boolean remove(T anEntry);
public void remove(int position) throws RemovalOnAnEmptyListException;

public void clear();
public boolean contains(T anEntry);
public T[] toArray();


// add an element to specific position in the list
public void add(int position, T element);

//get method (sarina added)
public T get(int pos);
} // end SetInterface


