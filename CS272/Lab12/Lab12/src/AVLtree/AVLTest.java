package AVLtree;

/**
* Class to test AVL methods
*
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-04-19 
*/
public class AVLTest {

    public static void main(String args[]) 
    { 
        AVL root = new AVL(); 
  
        root.insert(3); 
        root.insert(3); 
        root.insert(10); 
        root.insert(4); 
        root.insert(6); 
        root.insert(7); 
        root.insert(12);
        root.insert(0);
        root.insert(-3);
        root.insert(12);
        root.insert(3);
  
        System.out.printf("PreOrder traversal: \n"); 
        root.preOrderPrtNonRecursive(); 
  
        System.out.println("\nElement '3' was deleted? " + root.deleteNode(3)); 
        System.out.println("Element '9' was deleted? " + root.deleteNode(9)); 
  
        System.out.printf("PreOrder traversal: \n"); 
        root.preOrderPrtNonRecursive(); 
        
        System.out.println("\nElement '3' was deleted? " + root.deleteNode(3)); 
        
        System.out.printf("PreOrder traversal: \n"); 
        root.preOrderPrtNonRecursive(); 
        
        System.out.println("\nOccurrences of element '5': " + root.countOccurrences(5)); 
        System.out.println("Occurrences of element '12': " + root.countOccurrences(2)); 

    }

}
