package Stack_lab;

/**
* <h1>Generic Stack Interface</h1>
* Stack Interface with methods pop, peek, push, isEMpty and size
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-03-04
*/
public interface StackInterface<T> {
    /**
     * Adds the given item to the top of the stack.
     */
    void push(Object item);

    /**
     * Removes the top item from the stack and returns it.
     */
    Object pop();

    /**
     * Returns the top item from the stack without popping it.
     */
    Object peek();

    /**
     * Returns the number of items currently in the stack.
     */
    int size();

    /**
     * Returns whether the stack is empty or not.
     */
    boolean isEmpty();
}
