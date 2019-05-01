package IntNode;

/**
* <h1>Linked List Data Structure</h1>
* We create advanced methods in a linked list Data Structure
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-02-14
*/
public class IntNode {
	
	/**
	 * data of the node
	 */
	private int data;
	
	/**
	 * link pointing to another IntNode object
	 */
	private IntNode link;
	
	/**
	 * constructor that initializes data as 0 and link as null
	 */
	public IntNode() {
		data = 0;
		link = null;
	}
	
	/**
	 * constructor that initializes data as 0 and link as null
	 * @param _data  to assign this value to the Node
	 * @param _node  to assign this link to the Node
	 */
	public IntNode(int _data, IntNode _node) {
		data = _data;
		link = _node;
	}
	
	/**
	 * to access the value of the Node
	 * @return data  value of the node
	 */
	public int getNodeData() {
		return data;
	}
	
	/**
	 * to access the link of the Node
	 * @return link  link of the node
	 */
	public IntNode getNodeLink() {
		return link;
	}
	
	/**
	 * to modify the value of the Node
	 * @param _data  to assign this value to the Node
	 */
	public void setNodeData(int _data) {
		data = _data;
	}
	
	/**
	 * to modify the value of the link Node
	 * @param _node  to assign this link to the Node
	 */
	public void setNodeLink(IntNode _node) {
		link = _node;
	}
	
	/**
	 * to give the length starting from the given node
	 * @param head  to start counting from this node
	 * @return count  number of nodes
	 */
	public static int listLength(IntNode head) {
		int count = 0;
		IntNode temp = head;
		while (temp != null) {
			count ++;
			temp = temp.link;
		}
		return count;
	}
	
	/**
	 * to give a string representation of the nodes beginning with
	 * the node that you call the method
	 * @return result  string representation of the nodes
	 * @throws 
	 */
	public String toString() {
	    String result = data + "";
	    if (link != null) { //if does not have link, then we done
	    	result += "->";
	        result += link.toString(); //recursive method 
	    }
	    return result;    
	}
	
	/**
	 * to add a node after the node where you called the method
	 * @param data  value of the node to be added
	 */
	public void AddNodeAfterThis(int newdata) {
		link = new IntNode(newdata, link);
	}
	
	/**
	 * to give a string representation of the nodes beginning with
	 * the node that you call the method
	 * Precondition is to head to do not be null
	 * @param head  node where you want to begin searching
	 * @param data  value of the node to search
	 * @return false  no node with this value
	 * @return true  node found with this value
	 */
	public static boolean search(IntNode head, int data) {
		if (head != null){
			while (head != null) {
				if (head.data == data){  //check if the value of the node is the one we are searching
					return true;
				}
				head = head.link;
			}
		}
		return false;
	}
	
	/**
	 * to remove a node after the node where you called the method
	 */
	public void removeNodeAfterThis() {
		link = link.link;
	}
	
	/**
	 * return the number of even nodes after the head, including it
	 * @param head  node where we start counting
	 * @return count  number of even nodes
	 */
	public static int listEvenNumber(IntNode head) {
		int count = 0;
		while (head != null) {
			if ((head.data%2) == 0){  //check if the value of the node is even
				count++;
			}
			head = head.link;
		}
		return count;
	}
	
	/**
	 * A method to add the given newdata to the end of the 
	 * linked list that starts from the current node. 
	 * @param newdata  new int to be added
	 */
	public void addToEnd(int newdata) {
		IntNode temp = link;
		while (temp.link != null) {
			temp = temp.link;
		}
		temp.link = new IntNode(newdata, null);
	}
	
	/**
	 * method to calculate the summation of elements 
	 * in the last num nodes in a given linked list.
	 * @param head  where we begin counting
	 * @param num  number of elements to be counted
	 * @return count  total of the summation
	 */
	public static int sumLast(IntNode head, int num) {
		int count = 0;
		if (num > 0) {
			IntNode temp = head.link;
			for (int x = 0; x < num; x++) {
				if (temp != null) {
					count += temp.data;
					temp = temp.link;
				}
			}
		}
		return count;
	}
	
	/**
	 * Copy part of a given linked list.
	 * If head is not null, this method should 
	 * copy all the odd elements in the linked list 
	 * starting from the given head, create a new linked 
	 * list with all these odd numbers, and return 
	 * the linked list with the new head. 
	 * @param head  where we begin counting
	 * @return null  if no odd elements
	 * @return copyHead  new Linked list with all the odd elements
	 */
	public static IntNode copyOdd(IntNode head) {
		IntNode copyHead;
	    IntNode copyTail;
	      
	    if (head == null) {
	       return null;
	    }
	         
	    while ((head.data%2) != 1) { //while is not odd, keep looking
	    	head = head.link;
	    	if (head == null) { //return null if there is not any odd
	    		return null;
	    	}
	    }
	    
	    // Make the first node for the new linked list.
	    copyHead = new IntNode(head.data, null);
	    copyTail = copyHead;
	      
	    // Make the rest of the nodes 
	    while (head.link != null) {
	       head = head.link;
	       if ((head.data%2) == 1) { //if it's odd, the copy it.
	    	   copyTail.AddNodeAfterThis(head.data);
	    	   copyTail = copyTail.link;
	       }
	    }
	 
        return copyHead;
	}
	
	/**
	 * A method to remove ALL the nodes that have 
	 * the data value e from the linked list starting 
	 * from the given head. This method should 
	 * return the linked list with the new head. 
	 * @param head  where we begin counting
	 * @param e  element to be deleted
	 * @return null  if no odd elements
	 * @return copyHead  new Linked list with all elements that are not e
	 */
	public static IntNode removeAll(IntNode head, int e) {
		IntNode copyHead;
	    IntNode copyTail;
	    
	    if (head == null) {
	       return null;
	    }
	         
	    while (head.data == e) { //keep searching until the first node that is not e
	    	head = head.link;
	    	if (head == null) {
	    		return null;
	    	}
	    }
	    
	    // Make the first node for the new linked list.
	    copyHead = new IntNode(head.data, null);
	    copyTail = copyHead;
	      
	    // Make the rest of the nodes for the new linked list.
	    while (head.link != null) {
	       head = head.link;
	       if ((head.data) != e) { //if it's not e, then copy it.
	    	   copyTail.AddNodeAfterThis(head.data);
	    	   copyTail = copyTail.link;
	       }
	    }
	 
        return copyHead;
	}
	
	/**
	 * A method to reverse a linked list.
	 * @param head  where we begin counting
	 * @return head  new linked list where the head is now the tail, and viceversa
	 */
	public static IntNode reverse(IntNode head) {
        IntNode prev = null; 
        IntNode current = head; 
        IntNode next = null; 
        while (current != null) { 
            next = current.link; 
            current.link = prev; 
            prev = current; 
            current = next; 
        } 
        head = prev; 
        return head; 
    } 
	
	/**
	 * A method to test whether a linked list starting 
	 * from the given head is cyclic or acyclic. 
	 * @param head  where we begin counting
	 * @return true  if the linked list if cyclic
	 * @return false  if the linked list is not cyclic
	 */
	public static boolean hasCycle(IntNode head) {
	    IntNode slow = head;
	    IntNode fast = head;

	    // We create two nodes, with different velocities, if the slow one is equal
	    //to the fast one, then there is a cycle
	    while(fast != null && fast.link != null) {
	        slow = slow.link;          // slow "node" search
	        fast = fast.link.link;     // fast "node" search

	        if(slow == fast)  
	            return true;
	    }
	    return false;  // when fast reaches null, exit loop and then returns false
	}
}

