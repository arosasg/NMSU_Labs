package Queue_lab;

/**
* <h1>Generic Simple Node class</h1>
* Basic node class
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-03-14
*/
public class SNode<T> {
	
    /**
     * value of the node
     */
	private Object value;
	
    /**
     * link current node with next node
     */
	private SNode<T> next;
	
    /**
     * COnstructor to create a Node with some value
     * @param value_  value of the node created
     */
	public SNode(Object value_) {
		value = value_;
	}
	
    /**
     * Set Next node
     */
	public void setNext(SNode<T> next_) {
		next = next_;
	}
	
    /**
     * Get Next node
     */
	public SNode<T> getNext() {
		return next;
	}

    /**
     * Get value of the node
     */
	public Object getValue() {
		return value;
	}
}