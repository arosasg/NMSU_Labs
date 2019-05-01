package Stack_lab;

import java.util.EmptyStackException;

/**
* <h1>ArraylistStack with StackInterface interface</h1>
* ArraylistStack class implementing StackInterface with pop,push,peek,size and isBoolean methods.
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-03-04
*/
public class ArraylistStack<T> implements StackInterface<T> 
{
    /**
     * capacity of the array
     */
	int capacity;
	
    /**
     * top index of the array
     */
	int top;
	
    /**
     * Array to store all the values
     */
	private Object[] array;
	
    /**
     * COnstructor that sets capacity to 2 and create a new array with this capacity
     */
	public ArraylistStack()
	{
		capacity = 2;
		top = -1;
		array = new Object[capacity];
	}
	
	/**
     * Adds the given item to the top of the stack.
     * @param element  element to be inserted at the top of the stack
     */
    public void push(Object element) {
        if (this.size() == capacity) {
            resizeArray();
            array[++top] = element;
        }
        else {
            ++top;
            array[top] = element;
        }
    }
	
    /**
     * Removes the top element from the stack and returns it.
     */
    public Object pop()
    {
        if(this.isEmpty())
            throw new EmptyStackException();
        return element(top--);
    }

    /**
     * Returns the top element from the stack without popping it.
     */
    public Object peek() {
        if(this.isEmpty())
            throw new EmptyStackException();
        return element(top);
    }

    /**
     * Returns the number of items currently in the stack.
     */
    public int size()
    {
    	return top + 1;
    }
    
    /**
     * Returns whether the stack is empty or not.
     */
    public boolean isEmpty() {
    	return top == -1;
    }
    
    /**
     * Private method to return the value of the array at the given index
     * @param index  index of the array
     */
    private Object element(int index) 
    {
        return (Object)array[index];
    }
    
    /**
     * Resize the array to store more values
     */
    private void resizeArray() 
    {
    	int length = size();
    	Object[] newStack = new Object[capacity * 2];
    	System.arraycopy(array, 0, newStack, 0, length);
    	array = newStack;
    	capacity *= 2;
    }
}	