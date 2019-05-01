package Queue_lab;

import java.util.NoSuchElementException;

/**
* <h1>ArrayQueue with ArrayInterface interface</h1>
* ArrayQueue class implementing ArrayInterface with enqueue,dequeue,front,size and isBoolean methods.
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-03-14
*/
public class ArrayQueue<T> implements QueueInterface<T> 
{
    /**
     * index of first element in queue
     */
	int first;
	
    /**
     * index of last element in queue
     */
	int last;
	
    /**
     * Array to store all the queue elements
     */
	private Object[] array;
	
    /**
     * elements on the queue
     */
	int n;
	
    /**
     * Constructor that sets n, first and last to 0 and create a new array of 2 elements
     */
	public ArrayQueue()
	{
        n = 0;
        first = 0;
        last = 0;
		array = new Object[2];
	}
	
	/**
     * Adds the given item to the queue.
     * @param element  element to be inserted at the queue
     */
    public void enqueue(Object element) {
        if (n == array.length) 
        	resize(2*array.length);   
        array[last++] = element;                        
        if (last == array.length) 
        	last = 0;         
        n++;
        
    }
	
    /**
     * Removes the front element from the queue and returns it.
     */
    public Object dequeue()
    {
        if (isEmpty()) 
        	throw new NoSuchElementException("Queue empty");
        Object item = array[first];
        array[first] = null;                          
        n--;
        first++;
        if (first == array.length) 
        	first = 0;         
        if (n > 0 && n == array.length/4) resize(array.length/2); 
        return item;
    }

    /**
     * Returns the front element from the queue without popping it.
     */
    public Object front() {
        if (isEmpty()) 
        	throw new NoSuchElementException("Queue empty");
        return array[first];
    }

    /**
     * Returns the number of elements currently in the queue.
     */
    public int size() {
    	return n;
    }
    
    /**
     * Returns whether the queue is empty or not.
     */
    public boolean isEmpty() {
    	return n == 0;
    }
    
    /**
     * Resize the array
     */
    private void resize(int capacity) {
        assert capacity >= n;
        Object[] temp = (Object[]) new Object[capacity];
        for (int i = 0; i < n; i++) {
            temp[i] = array[(first + i) % array.length];
        }
        array = temp;
        first = 0;
        last  = n;
    }
}	