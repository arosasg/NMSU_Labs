package Stack_lab;

/**
* <h1>Test LinkStack and ArraylistStack</h1>
* class with main method to test LinkStack and ArraylistStack
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-03-04
*/
public class StackTest {

	public static void main(String[] args) {
		
		ArraylistStack<Integer> array1 = new ArraylistStack<>();
		ArraylistStack<String> array2 = new ArraylistStack<>();
		LinkStack<Integer> linkstack = new LinkStack<>();
		LinkStack<String> linkstack2 = new LinkStack<>();		
		
		System.out.println(array1.isEmpty());  //expected true
		array1.push(4);
		array1.push(5);
		array1.push(9);
		array1.push(12);
		
		System.out.println(array1.peek());  //expected 12
		System.out.println(array1.pop());  //expected 12
		System.out.println(array1.peek());  //expected 9
		System.out.println(array1.size());  //expected 3
		System.out.println(array1.pop());  //expected 9
		System.out.println(array1.isEmpty());  //expected false
		
		array2.push("Hello");
		array2.push("World");
		array2.push("This");
		array2.push("is");
		array2.push("Alejandro");		
		
		System.out.println(array2.peek()); //expected Alejandro
		System.out.println(array2.pop());  //expected Alejandro
		System.out.println(array2.peek());  //expected is
		System.out.println(array2.size());  //expected 4
		System.out.println(array2.pop());  //expected is
		System.out.println(array2.isEmpty());  //expected false
		
		System.out.println(linkstack.isEmpty());  //expected true
		System.out.println(linkstack.size());  //expected 0

		linkstack.push(22);
		linkstack.push(5);
		linkstack.push(92);
		linkstack.push(18);
		
		System.out.println(linkstack.peek());  //expected 18
		System.out.println(linkstack.pop());  //expected 18
		System.out.println(linkstack.peek());  //expected 92
		System.out.println(linkstack.size());  //expected 3
		System.out.println(linkstack.pop());  //expected 92
		System.out.println(linkstack.isEmpty());  //expected false
		
		linkstack2.push("This");
		linkstack2.push("is");
		linkstack2.push("a");
		linkstack2.push("linked");
		linkstack2.push("list");	
		
		System.out.println(linkstack2.peek());  //expected list
		System.out.println(linkstack2.pop());  //expected list
		System.out.println(linkstack2.peek());  //expected linked
		System.out.println(linkstack2.size());  //expected 4
		System.out.println(linkstack2.pop());  //expected linked
		System.out.println(linkstack2.isEmpty());  //expected false
		
	}

}
