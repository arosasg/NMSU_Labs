package DoublyLinkedListDummy;

/**
* <h1>Doubly Linked List Data Structure with Dummy Nodes</h1>
* We tested basic methods in a Doubly linked list Data Structure
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-02-25
*/
public class DoublyLinkedListDummyTest {
	
	public	static void main (String arg[]) {
		
		DIntNode node1 = new DIntNode(1);
		DIntNode node3 = new DIntNode(12);
		DIntNode node2 = new DIntNode(10,node1,node3);
		node3.setPrev(node2);
		node1.setNext(node2);
		
		DoublyLinkedListDummy xxx = new DoublyLinkedListDummy();
		
		xxx.addEnd(8);
		xxx.addEnd(2);
		xxx.addEnd(4);		
		System.out.println(xxx.getHead());
		System.out.println(xxx.toString());
		System.out.println(xxx.getHead());
		System.out.println(xxx.getTail());
		xxx.setHead(node2);
		xxx.setTail(node3);
		System.out.println(xxx.toString());	
		xxx.removeFromHead();
		System.out.println(xxx.toString());	
		xxx.addEnd(2);		
		System.out.println(xxx.countOccurrence(2));	
		System.out.println(xxx.removeAll(2));
		System.out.println(xxx.toString());	
		System.out.println(xxx.lengthList());	
		
		DoublyLinkedListDummy yyy;
		yyy = xxx.subList(0,2);
		
		System.out.println(yyy.toString());	
	}
}
