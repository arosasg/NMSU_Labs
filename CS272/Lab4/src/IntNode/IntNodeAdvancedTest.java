package IntNode;

/**
* <h1>Linked List Data Structure</h1>
* We test methods of IntNode.java
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-02-14
*/
public class IntNodeAdvancedTest {

	/**
	 * main method to test all of our methods in IntNode.java
	 */
	public static void main(String[] args) {
		IntNode node8 = new IntNode();
		IntNode node7 = new IntNode();
		IntNode node6 = new IntNode();
		IntNode node5 = new IntNode(4,null);
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
		
		System.out.println("Number of even nodes beggining with node2: " + IntNode.listEvenNumber(node2));
		System.out.println("Node1 to string: " + node1.toString());
		System.out.println("Number of even nodes beggining with node1: " + IntNode.listEvenNumber(node1));
	
		node1.addToEnd(5);
		System.out.println("add 5 to end of Node1: " + node1.toString());
	
		System.out.println("Sum of nodes from node 1 length 2: " + IntNode.sumLast(node1,2));
		System.out.println("Sum of nodes from node 1 length 1: " + IntNode.sumLast(node1,1));
		System.out.println("Sum of nodes from node 1 length 8: " + IntNode.sumLast(node1,8));
		
		node4 = IntNode.copyOdd(node1);
		System.out.println("Node4 to string: " + node4.toString());
		
		node6 = IntNode.copyOdd(node5);
		try {
			System.out.println("Node6 to string: " + node6.toString());
		}
        catch(NullPointerException e) { 
            System.out.println("Caught NullPointerException"); 
        } 
		
		node1.addToEnd(4);
		System.out.println("Node1 to string: " + node1.toString());
		node7 = IntNode.removeAll(node1, 4);
		try {
			System.out.println("Node7 to string: " + node7.toString());
		}
        catch(NullPointerException e) { 
            System.out.println("Caught NullPointerException"); 
        } 
		
		node8 = IntNode.reverse(node1.getNodeLink());
		try {
			System.out.println("Node8 to string: " + node8.toString());
		}
        catch(NullPointerException e) { 
            System.out.println("Caught NullPointerException"); 
        } 
		
		System.out.println("Node1 is a cycle?: " + IntNode.hasCycle(node1));
		node1.setNodeLink(node1);
		System.out.println("Node1 is a cycle?: " + IntNode.hasCycle(node1));
	}

}