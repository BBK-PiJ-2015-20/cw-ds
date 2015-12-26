/**
 * A wrapper containing either an object (the result of an operation
 * on a data structure) or an error value.
 *
 * @author Ahla Arbid
 */
public class ReturnObjectImpl implements ReturnObject {
	private Object object;
	private ErrorMessage error_message;
	
	/**
	*Constructor passing object value if there is no error 
	*/
		
	public ReturnObjectImpl(Object object){
		this.object = object;
		this.error_message = ErrorMessage.NO_ERROR;;
	}
	
	/**
	*Constructor passing error message if there is an error, and assigning null to object 
	*/	
	public ReturnObjectImpl(ErrorMessage error_message){
		this.error_message = error_message;
		this.object = null;
	}
	/**
	* Returns whether there has been an error
	* @return whether there has been an error
	*/
	public boolean hasError(){
		return error_message != ErrorMessage.NO_ERROR;
	}
	/**
	* Returns the error message
	*@return the error message
	*/
	public ErrorMessage getError(){
		return this.error_message;
	}
	/**
	 * Returns the object wrapped in this ReturnObject, i.e. the
	 * result of the operation if it was successful, or null if
	 * there has been an error.
	 * @return the return value from the method or null if there has been an error
	 */
	public Object getReturnValue(){
		return object;
	}
	
}