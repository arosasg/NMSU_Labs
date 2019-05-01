package DoublyLinkedListDummy;

/**
* <h1>Doubly Linked List Data Structure with Dummy Nodes</h1>
* We created basic methods in a Doubly linked list Data Structure
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-02-25
*/
public class DoublyLinkedListDummy {
    
	/**
	 * Dummy head
	 */
    DIntNode dummyHead;
    
	/**
	 * Dummy tail
	 */
    DIntNode dummyTail;
    
	/**
	 * Method to get head of the Doubly linked list
	 */
    public DIntNode getHead() {
        return dummyHead.getNext();
    }
    
	/**
	 * Method to get tail of the Doubly linked list
	 */
    public DIntNode getTail() {
        return dummyTail.getPrev();
    }
    
	/**
	 * Method to set head of the Doubly linked list
	 */
    public void setHead(DIntNode node) {
    	DIntNode afterHead = dummyHead.getNext();   	
        dummyHead.setNext(node);
        node.setPrev(dummyHead);
        node.setNext(afterHead);
        afterHead.setPrev(node);
    }
    
	/**
	 * Method to set tail of the Doubly linked list
	 */
    public void setTail(DIntNode node) {
    	DIntNode beforeTail = dummyTail.getPrev(); 
        dummyTail.setPrev(node);
        node.setNext(dummyTail);
        node.setPrev(beforeTail);
        beforeTail.setNext(node);
    }
    
	/**
	 * The no-argument constructor which creates the 
	 * dummy head and tail and link them together.
	 */
    public DoublyLinkedListDummy() {
        dummyHead = new DIntNode();
        dummyTail = new DIntNode();
        dummyHead.setNext(dummyTail);
        dummyTail.setPrev(dummyHead);
    }
    
	/**
	 * A method to add an element from the end of the list.
	 * @param element  Node to be added to the end of list
	 */
    public void addEnd(int element) {
    	DIntNode nextToLast = dummyTail.getPrev();
    	DIntNode newNode = new DIntNode(element, nextToLast, dummyTail);

    	nextToLast.setNext(newNode);
    	dummyTail.setPrev(newNode);
    }
    
	/**
	 * A method to remove the first actual node 
	 * (i.e., the node that the dummy head points to).
	 * Time Complexity: O(1)
	 */
    public void removeFromHead() {
        dummyHead.setNext(dummyHead.getNext().getNext());
        dummyHead.getNext().setPrev(dummyHead);
    }
    
	/**
	 * This method should return a String with two lines where 
	 * the first line lists all the nodes starting from the first node, 
	 * and the second line lists all the nodes starting from the last node. 
	 * @return buf.toString()  string of the list
	 */
    public String toString() {
    	StringBuilder buf = new StringBuilder("(Forward)    ");
    	DIntNode curr = dummyHead.getNext();
    	while (curr != dummyTail) {
    		if (curr != dummyHead.getNext())
    		    {
    			buf.append("<->");
    		    }
    		buf.append(curr.getData());
    		
    		curr = curr.getNext();
    	    }
    	buf.append("\n(Backward)    ");
    	curr = curr.getPrev();
    	while (curr != dummyHead) {
			if (curr != dummyTail.getPrev())
			    {
				buf.append("<->");
			    }
			buf.append(curr.getData());
			
			curr = curr.getPrev();
		    }   	
	    	return buf.toString();
	    }
    
	/**
	 * A method to compute the number of times that the 
	 * given value e occurs in nodes in this linked list.
	 * @param e  element to be counted
	 * @return count  number of occurrences of the element in the list
	 * Time Complexity: O(n) given n is the length of the list
	 */
    public int countOccurrence(int e) {
        DIntNode curr = dummyHead.getNext();
        int count = 0;
        while (curr != dummyTail) {
            if (curr.getData() == e) {
                count++;
            }
            curr = curr.getNext();
        }
        return count;
    }
    
	/**
	 * A method to remove all the nodes that contains element e from the list.
	 * @param e  element to be removed
	 * @return true  element was found and deleted
	 * @return false  element was not found
	 * Time Complexity: O(n) given n is the length of the list
	 */
    public boolean removeAll(int e) {
        int count = 0;
        DIntNode curr = dummyHead.getNext();
        while (curr != dummyTail) {
            if (curr.getData() == e) {
                curr.getPrev().setNext(curr.getNext());
                curr.getNext().setPrev(curr.getPrev());
                count++;
            }
            curr = curr.getNext();
        }  
        if (count == 0){
            return false;
        }
        else {
            return true;
        }
    }
    
	/**
	 * Method to get length of the List
	 * @return count  length of the list
	 */
    public int lengthList() {
        int count = 0;
        DIntNode curr = dummyHead.getNext();
        while (curr != dummyTail) {
            count++;
            curr = curr.getNext();
        }
        return count;
    }
    
	/**
	 * A method to extract a sublist of this list.
	 * @param beginIdx  Idx where we begin to extract (0 is the node after the dummy head)
	 * @param endIdx  Idx where we finish to extract (actually endIdx - 1)
	 * @return other  Doubly linked list extracted
	 * Time Complexity: worstcase: O(n) given n is the length of the list
	 */
    public DoublyLinkedListDummy subList(int beginIdx, int endIdx) {
        DoublyLinkedListDummy other = new DoublyLinkedListDummy();
        if ((beginIdx >= 0) && (beginIdx <= lengthList()) && (beginIdx < endIdx)) {
            DIntNode curr = dummyHead.getNext();
            for(int i = 0; i < beginIdx; i++){
                curr = curr.getNext();
            }
            for(int i = 0; i < endIdx-beginIdx; i++) {
                other.addEnd(curr.getData());
                curr = curr.getNext();
            }
        }
        return other;
    }
}    
