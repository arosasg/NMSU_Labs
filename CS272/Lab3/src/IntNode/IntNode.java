package IntNode;

/**
* <h1>Linked List Data Structure</h1>
* We create methods to create, search, delete,and link nodes
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-02-08
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
}

