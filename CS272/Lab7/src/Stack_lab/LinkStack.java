package Stack_lab;

import java.util.EmptyStackException;

/**
* <h1>LinkStack with StackInterface interface</h1>
* LinkStack class implementing StackInterface with pop,push,peek,size and isBoolean methods.
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-03-04
*/
public class LinkStack<T> implements StackInterface<T> 
{
    /**
     * First Node
     */
	private SNode<T> first;
	
    /**
     * COnstructor to set first to null
     */
	public LinkStack()
	{
		first = null;
	}
	
    /**
     * Adds the given element to the first node to access it immediately
     */
    public void push (Object element) 
    {
        SNode<T> temp = new SNode<T> (element);
        temp.setNext(first);
        first = temp;
    }
	
    /**
     * Removes the first Node and returns it
     */
    public Object pop()
    {
        if(this.isEmpty())
            throw new EmptyStackException();
        Object value = first.getValue();
        first = first.getNext();
        return value;
    }

    /**
     * Returns the first Node without removing it
     */
    public Object peek() {
        if(this.isEmpty())
            throw new EmptyStackException();
        return first.getValue();
    }

    /**
     * Returns the number of Nodes in the stack
     */
    public int size()
    {
    	SNode<T> temp = first;
    	int count = 0;
    	if (isEmpty()) {
    		return count;
    	}
    	++count;
    	while (temp.getNext() != null) {
    		temp = temp.getNext();
    		++count;
    	}
    	return count;
    }
    
    /**
     * Returns whether the stack is empty or not.
     */
    public boolean isEmpty() {
    	return first == null;
    }

}
