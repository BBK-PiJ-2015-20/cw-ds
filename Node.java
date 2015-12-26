/**
* class for pointers elements of the LinkedList
* @author Ahla Arbid
*/

public class Node{
	private Object item;
	private Node next;
	
	/**
	*Constructor
	*/
	public Node (Object item){
		this.item = item;
		this .next = null;
		
	}
	
	/**
	*getters
	*/
	public Object getItem(){
	return item;
	}
	
	public Node getNext(){
	return next;
	}
	

	
	/** 
	*Setters
	*/
	public void setItem(Object Item){
		this.item = item;
	}
	
	public void setNext(Node nextNode){
		this.next = nextNode;
	}
	

}