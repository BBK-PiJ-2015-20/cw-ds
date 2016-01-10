/**
 * An implementation of a stack with additional methods. 
 
 * @author Ahla Arbid
 */

 public class ImprovedStackImpl implements ImprovedStack{
	
	private List stack;
	
	public ImprovedStackImpl(List list){
		this.stack = list;
	}
	
	/**
	 * Returns true if the stack is empty, false otherwise. 
	 * 
	 * @return true if the stack is empty, false otherwise. 
	 */
	public boolean isEmpty(){
		return (stack == null);
	}
	
	/**
	 * Returns the number of items currently in the stack.
	 * 
	 * @return the number of items currently in the stack
	 */
	public int size(){
		return stack.size();
	}
	
	
	/**
	 * Adds an element at the top of the stack. 
	 * 
	 * @param item the new item to be added
	 */
	public void push(Object item){
		if (stack == null){
			stack = new ArrayList();
		}
		stack.add(item);
	}
	
	/**
	 * Returns the element at the top of the stack. The stack is
	 * left unchanged.
	 * 
	 * @return If stack is not empty, the item on the top is returned. If the
	 *         stack is empty, an appropriate error.
	 */
	public ReturnObject top(){
		if (stack.size() == 0){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);	
		} else {
			int stack_size = stack.size();
			return stack.get(stack_size - 1);
		}
	}
	
	/**
	 * Returns the element at the top of the stack. The element is
	 * removed from the stack.
	 * 
	 * @return If stack is not empty, the item on the top is returned. If the
	 *         stack is empty, an appropriate error.
	 */
	public ReturnObject pop(){
		if (stack.size() == 0){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			 return stack.remove(stack.size() - 1);
		 }	
		
	}
	
	/**
	 * Returns a copy of this stack with the items reversed, the top
	 * elements on the original stack is at the bottom of the new
	 * stack and viceversa.
	 * 
	 * @return a copy of this stack with the items reversed. 
	 */
	public ImprovedStack reverse(){
		
		List array_reversed = new ArrayList();
		ImprovedStack reversed_stack = new ImprovedStackImpl(array_reversed);
			
		for(int i = 0; i < stack.size(); i++){
			reversed_stack.push(stack.get(i).getReturnValue());
		}
		
		return reversed_stack;
	}
	
	
	/**
	 * Removes the given object from the stack if it is
	 * there. Multiple instances of the object are all removed.
	 *
	 * Classes implementing this method must use method .equals() to
	 * check whether the item is in the stack or not.
	 * 
	 * @param object the object to remove
	 */
	public void remove(Object object){
		int current_position = 0;
		for (int i = 0; i< stack.size(); i++){
			if(stack.get(current_position).getReturnValue().equals(object)){
				stack.remove(current_position);
			} else {
				current_position++;
			}
		}
	}

 }