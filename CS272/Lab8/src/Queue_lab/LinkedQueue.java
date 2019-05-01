package Queue_lab;

import java.util.NoSuchElementException;

/**
* <h1>LinkedQueue with QueueInterface interface</h1>
* LinkedQueue class implementing QueueInterface with enqueue,dequeue,front,size and isBoolean methods.
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-03-14
*/
public class LinkedQueue<T> implements QueueInterface<T> 
{
    /**
     * Front node
     */
	private SNode<T> front;
	
    /**
     * Rear Node
     */
	private SNode<T> rear;
	
    /**
     * Size of the Queue
     */
	private int n;
	
    /**
     * Constructor to set front, rear to null and size to 0
     */
	public LinkedQueue()
	{
		front = null;
		rear = null;
		n = 0;
	}
	
    /**
     * Adds the given element to the queue
     */
    public void enqueue (Object element) 
    {
        SNode<T> temp = rear;
        rear = new SNode<T> (element);
        rear.setNext(null);
        if(this.isEmpty())
        	front = rear;
        else
        	temp.setNext(rear);
        ++n;
    }
	
    /**
     * Removes the front Node and returns it
     */
    public Object dequeue()
    {
        if(this.isEmpty())
        	throw new NoSuchElementException("Queue empty");
        Object value = front.getValue();
        front = front.getNext();
        --n;
        if(this.isEmpty())    
        	rear = null;
        return value;
    }

    /**
     * Returns the front Node without removing it
     */
    public Object front() {
        if(this.isEmpty())
        	throw new NoSuchElementException("Queue empty");
        return front.getValue();
    }

    /**
     * Returns the number of Nodes in the queue
     */
    public int size() {
    	return n;
    }
    
    /**
     * Returns whether the queue is empty or not.
     */
    public boolean isEmpty() {
    	return front == null;
    }

}
