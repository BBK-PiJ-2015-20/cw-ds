/**
 * an implementation of interface List based on pointers called LinkedList
 * @author Ahla Arbid
 */
 public class LinkedList implements List{
 
	protected Node head;
	private int list_size = 0;
	
	
	/**
	*Constructor sets the head to null
	*/
	public LinkedList(){
		this.head = null;
	}
	
	/**
	 * Returns true if the list is empty, false otherwise. 
	 * 
	 * @return true if the list is empty, false otherwise. 
	 */
	 public boolean isEmpty(){
			return (list_size == 0);
	 }
	 
	 /**
	 * Returns the number of items currently in the list.
	 * 
	 * @return the number of items currently in the list
	 */
	 public int size(){
		 return list_size;
		 
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
		 if (isEmpty())
		 {
			 return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		 }	
		if (index < 0 || index >= size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		Node current = head;
		for (int i=0; i<index; i++)
			current = current.getNext();
		return new ReturnObjectImpl(current.getItem());
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
		if (isEmpty())
		 {
			 return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		 }	
		if (index < 0 || index >= size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		if (index == 0){
			Node temp = new Node(head.getItem());
			head = head.getNext();
			list_size--;
			return new ReturnObjectImpl(temp.getItem());
		}
		/**ReturnObjectImpl current = new ReturnObjectImpl(head);
		for (int i=0; i<(index-1); i++)
			current = current.getNext();
		*/
		else {
			Node current = head;
			for (int i = 0; i< index-1; i++){
				current = current.getNext();
			}
			Node temp = new Node(current);
			current.setNext(current.getNext().getNext());
			list_size--;
			return new ReturnObjectImpl(temp.getItem());
			
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
		 if (item == null) {
			 return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		 }
		 else {
			 if ((index < 0) || (index > size())) {
				 return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			 }
			else {
				Node node = new Node(item);
				Node current = head;
				if (isEmpty()) {
					head = node;
					list_size++;
					return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
				}
				
				else {
					if(index == 0){
						Node temp = head;
						head = node;
						node.setNext(temp);
						temp.setNext(current.getNext());
						list_size++;
						return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
					}
					else {
					for (int i=0; i < (index-1); i++){
						current = current.getNext();
						}
						node.setNext(current.getNext());
						current.setNext(node);
						list_size++;
						return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
					}
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
		 return add(list_size, item);
	 }
	
	
 }