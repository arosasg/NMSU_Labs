package Queue_lab;

/**
* <h1>Generic Stack Interface</h1>
* Stack Interface with methods pop, peek, push, isEMpty and size
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-03-14
*/
public interface QueueInterface<T> {
    /**
     * Adds the given item to the the queue.
     */
    void enqueue(Object item);

    /**
     * Removes the front item from the queue and returns it.
     */
    Object dequeue();

    /**
     * Returns the front item from the queue without dequeuing it.
     */
    Object front();

    /**
     * Returns the number of items currently in the queue.
     */
    int size();

    /**
     * Returns whether the queue is empty or not.
     */
    boolean isEmpty();
}
