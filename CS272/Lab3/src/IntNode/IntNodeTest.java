package IntNode;

/**
* <h1>Linked List Data Structure</h1>
* We test methods of IntNode.java
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-02-08
*/
public class IntNodeTest {

	/**
	 * main method to test all of our methods in IntNode.java
	 */
	public static void main(String[] args) {
		IntNode node6 = new IntNode();
		IntNode node5 = new IntNode();
		IntNode node4 = new IntNode();
		IntNode node3 = new IntNode();
		IntNode node2 = new IntNode();
		IntNode node1 = new IntNode(4,node2);

		System.out.println("Node1 value: " + node1.getNodeData());
		System.out.println("Node2 value: " + node2.getNodeData());
		
		System.out.println("Node1 link: " + node1.getNodeLink());
		System.out.println("Node2 link: " + node2.getNodeLink());
		
		node2.setNodeData(12);
		node2.setNodeLink(node3);
		node3.setNodeData(3);
		
		System.out.println("New Node2 value: " + node2.getNodeData());
		System.out.println("New Node2 link: " + node2.getNodeLink());
		
		System.out.println("Node1 to string: " + node1.toString());
		System.out.println("Node1 length: " + IntNode.listLength(node1));
		
		System.out.println("Node2 to string: " + node2.toString());
		System.out.println("Node2 length: " + IntNode.listLength(node2));
		
		node2.AddNodeAfterThis(34);
		node2.AddNodeAfterThis(7);
		
		System.out.println("Node2 to string: " + node2.toString());
		System.out.println("Is 34 in node2?: " + IntNode.search(node2,34));
		
		node2.removeNodeAfterThis();
		System.out.println("After remove node after node2: " + node2.toString());
		
	}

}