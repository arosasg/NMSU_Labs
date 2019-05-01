package Queue_lab;

/**
* <h1>Test LinkedQueue and ArrayQueue</h1>
* class with main method to test LinkedQueue and ArrayQueue
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-03-14
*/
public class QueueTest {
	
	public static void main(String[] args) {
		
		ArrayQueue<Integer> array1 = new ArrayQueue<>();
		ArrayQueue<String> array2 = new ArrayQueue<>();
		LinkedQueue<Integer> linkedqueue = new LinkedQueue<>();
		LinkedQueue<String> linkedqueue2 = new LinkedQueue<>();		
		
		System.out.println(array1.isEmpty());  //expected true
		array1.enqueue(4);
		array1.enqueue(5);
		array1.enqueue(9);
		array1.enqueue(12);
		
		System.out.println(array1.front());  //expected 4
		System.out.println(array1.dequeue());  //expected 4
		System.out.println(array1.front());  //expected 5
		System.out.println(array1.size());  //expected 3
		System.out.println(array1.dequeue());  //expected 5
		System.out.println(array1.isEmpty());  //expected false
		
		array2.enqueue("Hello");
		array2.enqueue("World");
		array2.enqueue("This");
		array2.enqueue("is");
		array2.enqueue("Alejandro");		
		
		System.out.println(array2.front()); //expected Hello
		System.out.println(array2.dequeue());  //expected Hello
		System.out.println(array2.front());  //expected World
		System.out.println(array2.size());  //expected 4
		System.out.println(array2.dequeue());  //expected World
		System.out.println(array2.isEmpty());  //expected false
		
		System.out.println(linkedqueue.isEmpty());  //expected true
		System.out.println(linkedqueue.size());  //expected 0

		linkedqueue.enqueue(22);
		linkedqueue.enqueue(5);
		linkedqueue.enqueue(92);
		linkedqueue.enqueue(18);
		
		System.out.println(linkedqueue.front());  //expected 22
		System.out.println(linkedqueue.dequeue());  //expected 22
		System.out.println(linkedqueue.front());  //expected 5
		System.out.println(linkedqueue.size());  //expected 3
		System.out.println(linkedqueue.dequeue());  //expected 5
		System.out.println(linkedqueue.isEmpty());  //expected false
		
		linkedqueue2.enqueue("This");
		linkedqueue2.enqueue("is");
		linkedqueue2.enqueue("a");
		linkedqueue2.enqueue("linked");
		linkedqueue2.enqueue("list");	
		
		System.out.println(linkedqueue2.front());  //expected This
		System.out.println(linkedqueue2.dequeue());  //expected This
		System.out.println(linkedqueue2.front());  //expected is
		System.out.println(linkedqueue2.size());  //expected 4
		System.out.println(linkedqueue2.dequeue());  //expected is
		System.out.println(linkedqueue2.isEmpty());  //expected false
		
	}
}
