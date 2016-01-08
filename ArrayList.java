/**
 * A list is a collection of objects that are sorted and can be
 * accessed by index. The first element in the list is at index 0.
 *
 * A list can store objects of any kind, and they can be of different
 * types: Integers, Doubles, String, or even other lists. However,
 * this list cannot store null objects.
 * 
 * There is no limit to the number of elements in the list (provided
 * that there is free memory in the Java Virtual Machine).
 * 
 * Not all operations on a list will always be successful. For
 * example, a programmer may try to remove an element from an empty
 * list, or from a position where there is nothing. 
 * methods of this list will return a
 * {@see ReturnObject} that will contain either an object or an error
 * value of the right kind (as defined in {@see ErrorMessage}). 
 * 
 * @author Ahla Arbid
 */
 public class ArrayList implements List{
	 /** 
	 *protected variables that can be used by subclasses
	 *an array of type object with maximum size 10
	 */
	protected Object[] array;
	protected int array_size;
	protected static final int max_size = 10000000;

	/**
	*Constructor that creates an empty array with maximum capacity of 10 elements 
	*and initial size 0
	*/
	public ArrayList(){
		array = new Object[max_size];
		array_size = 0;
	}
	/**
	 * Returns true if the list is empty, false otherwise. 
	 * 
	 * @return true if the list is empty, false otherwise. 
	 */
	 public boolean isEmpty(){
		 return (array_size == 0);
		 }
	
	/**
	 * Returns the number of items currently in the list.
	 * 
	 * @return the number of items currently in the list
	 */
	public int size(){
		return array_size;
	}
	
	/**
	 * Returns the element at the given position. 
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or an appropriate error message, 
	 *         encapsulated in a ReturnObject
	 */
	 public ReturnObject get(int index){
		 if (isEmpty()) {
			 return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		 }
		 if((index < 0) || (index >= size())){
			 return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		 }
		
			return new ReturnObjectImpl(array[index]);
		
		 }
	
	/**
	 * Returns the elements at the given position and removes it
	 * from the list. The indeces of elements after the removed
	 * element must be updated accordignly.
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or an appropriate error message, 
	 *         encapsulated in a ReturnObject
	 */	
	 public ReturnObject remove(int index){
		 if (isEmpty()) {
			 return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		 }
		 if((index < 0) || (index >= size())){
			 return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		 }
		 else {
			 ReturnObjectImpl object = new ReturnObjectImpl(array[index]);
			 for(int i = index; i < size(); i++){
				 array[i] = array[i+1];
			 }
			 array_size--;
			 return object;
		 }
	 }
	 
	 /**
	 * Adds an element to the list, inserting it at the given
	 * position. The indeces of elements at and after that position
	 * must be updated accordignly.
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * If a null object is provided to insert in the list, the
	 * request must be ignored and an appropriate error must be
	 * returned.
	 * 
	 * @param index the position at which the item should be inserted in
	 *              the list
	 * @param item the value to insert into the list
	 * @return an ReturnObject, empty if the operation is successful
	 *         or containing an appropriate error message otherwise
	 */
	 public ReturnObject add(int index, Object item){
		
		if(item == null)
			 return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		 
		 else {			 
			 if ((index < 0) || (index > size()))
				 return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			else {
					if(size() == max_size){
						Object[] biggerArray = new Object[size() * 2];
						for (int i = 0; i < size(); i++){
							biggerArray[i] = array[i];
						}
						array = biggerArray;
						array[size()] = item;
						array_size++;
						return new ReturnObjectImpl(ErrorMessage.NO_ERROR);		
						
					}
					else {
					for(int i = size(); i > index; i--)
						array[i] = array[i-1];
					
					array[index] = item;
					array_size++;
					return new ReturnObjectImpl(ErrorMessage.NO_ERROR);	
					}					
			}
		 }
	 }
	 
	 /**
	 * Adds an element at the end of the list.
	 * 
	 * If a null object is provided to insert in the list, the
	 * request must be ignored and an appropriate error must be
	 * returned.
	 * 
	 * @param item the value to insert into the list
	 * @return an ReturnObject, empty if the operation is successful
	 *         or containing an appropriate error message otherwise
	 */
	
	public ReturnObject add(Object item){
		return add(array_size, item);
		
		
	}
	
	/**public Object biggerArray(){
		
	}
	*/
	 }

	
	