package AVLtree;

import java.util.Stack;

/**
* <h1>AVL Node</h1>
* Node class for AVL.
*
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-04-19
*/
class node { 
    int data; 
    node left; 
    node right; 
    int height;
    
    /**
     * instance variable to keep track of duplicated
    */
    int count; 
}

/**
* <h1>AVL Tree</h1>
* Class to construct an AVL tree with insert, delete, countOcurrences, preOrdertraversal methods.
*
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-04-19
*/
public class AVL{ 
  
    private node root;
    
    /**
     * Constructor that sets root to null
    */
    public AVL()        {root = null;}
    
    /**
     * Method that returns the root of the AVL tree.
    */
    public node getRoot()       {return root;}
    
    /**
     * Helper to create nodes.
     * 
     * @param a data for the new node
    */ 
    static node newNode(int data) 
    { 
        node node = new node(); 
        node.data = data; 
        node.left = null; 
        node.right = null; 
        node.height = 1; // new node is initially added at leaf 
        node.count = 1; 
        return node; 
    } 
    
    /**
     * Method that returns height of the tree.
     * 
     * @param Node node
    */
    static int height(node Node) 
    { 
        if (Node == null) 
            return 0; 
        return Node.height; 
    } 
  
    /**
     * Method that returns maximum of a and b.
     * 
     * @param a integer corresponding to height of a node
     * @param b integer corresponding to height of a node
    */ 
    static int max(int a, int b) 
    { 
    	if (a > b) 
    		  return a;
    	else 
    		  return b;
    		
    } 
  
    /**
     * Method to right rotate tree rooted with node y.
     * 
     * @param y root node to right rotate
    */ 
    static node rightRotate(node y) 
    { 
        node x = y.left; 
        node z = x.right; 
  
        x.right = y; 
        y.left = z; 
  
        y.height = max(height(y.left), height(y.right)) + 1; 
        x.height = max(height(x.left), height(x.right)) + 1; 
   
        return x; 
    } 
  
    /**
     * Method to left rotate tree rooted with node x.
     * 
     * @param x root node to left rotate
    */  
    static node leftRotate(node x) 
    { 
        node y = x.right; 
        node z = y.left; 
  
        y.left = x; 
        x.right = z; 
  
        x.height = max(height(x.left), height(x.right)) + 1; 
        y.height = max(height(y.left), height(y.right)) + 1; 
  
        return y; 
    } 
  
    /**
     * Method to calculate the difference between the two child of the Node.
     * 
     * @param Node Node to calculate
    */  
    static int getBalance(node Node) 
    { 
        if (Node == null) 
            return 0; 
        return height(Node.left) - height(Node.right); 
    } 
    
    /**
     * Method to insert node on the AVL tree
     * 
     * @param data data to be inserted
    */
    public void insert(int data){
        root = insert(root, data);
    }
  
    /**
     * Method to delete node on the AVL tree
     * 
     * @param data data to be inserted
    */
    public boolean deleteNode(int e){
        if (search(root, e)) {
            root = deleteNode(root, e);
            return true;
        }
        else
            return false;
    }
    
    /**
     * Method to insert node on the AVL tree
     * 
     * @param data data to be inserted
     * @param node node where we begin to search
    */
    private node insert(node node, int data) 
    { 
        if (node == null) 
            return (newNode(data)); 
   
        if (data == node.data) { 
            (node.count)++; 
            return node; 
        } 
  
        if (data < node.data) 
            node.left = insert(node.left, data); 
        else
            node.right = insert(node.right, data); 
  
        node.height = max(height(node.left), height(node.right)) + 1; 
  
        // Check balance
        int balance = getBalance(node);  
  
        // Case1: Left Left
        if (balance > 1 && data < node.left.data) 
            return rightRotate(node); 
  
        // Case 2: Right Right
        if (balance < -1 && data > node.right.data) 
            return leftRotate(node); 
  
        // Case 3: Left Right 
        if (balance > 1 && data > node.left.data) { 
            node.left = leftRotate(node.left); 
            return rightRotate(node); 
        } 
  
        // Case 4: Right Left
        if (balance < -1 && data < node.right.data) { 
            node.right = rightRotate(node.right); 
            return leftRotate(node); 
        } 
        return node; 
    } 
  
    /**
     * Method to search the node with minimum data on the AVL.
     * 
     * @param node node where we begin to search
    */
    static node minValueNode(node node) 
    { 
        node current = node; 
  
        while (current.left != null) 
            current = current.left; 
  
        return current; 
    } 
  
    private node deleteNode(node root, int data) 
    { 
        if (root == null) 
            return root; 
 
        if (data < root.data) 
            root.left = deleteNode(root.left, data); 
  
        else if (data > root.data) 
            root.right = deleteNode(root.right, data); 
  
        else { 
        	// duplicates reduction
            if (root.count > 1) { 
                (root.count)--; 
                return root; 
            } 
            if ((root.left == null) || (root.right == null)) { 
                node temp = root.left != null ? root.left : root.right; 
   
                if (temp == null) { 
                    temp = root; 
                    root = null; 
                } 
                else 
                    root = temp; 
            } 
            else { 
                node temp = minValueNode(root.right); 
  
                root.data = temp.data; 
  
                root.right = deleteNode(root.right, temp.data); 
            } 
        } 
        if (root == null) 
            return root; 
   
        root.height = max(height(root.left), height(root.right)) + 1; 
  
        // Check balance
        int balance = getBalance(root); 
  
        // Case 1: Left Left
        if (balance > 1 && getBalance(root.left) >= 0) 
            return rightRotate(root); 
  
        // Case 2: Left Right
        if (balance > 1 && getBalance(root.left) < 0) { 
            root.left = leftRotate(root.left); 
            return rightRotate(root); 
        } 
  
        // Case 3: Right Right
        if (balance < -1 && getBalance(root.right) <= 0) 
            return leftRotate(root); 
  
        // Case 4: Right Left
        if (balance < -1 && getBalance(root.right) > 0) { 
            root.right = rightRotate(root.right); 
            return leftRotate(root); 
        } 
        return root; 
    } 
  
    /**
     * Method to print tree in preOrder non-recursively
    */
    public void preOrderPrtNonRecursive(){
        preOrderPrtNonRecursive(root);
    }
 
    /**
     * Method to print tree in preOrder non-recursively. We use stack.
     * 
     * @param root root node of the AVL tree
    */ 
    private void preOrderPrtNonRecursive(node root) 
    { 
    	if (root == null) {
    		return;
    	}

    	Stack<node> stack = new Stack();
    	stack.push(root);

    	while (!stack.empty())
    	{
    		node curr = stack.pop();

    		System.out.printf("%d(%d) ", curr.data, curr.count);

    		if (curr.right != null) {
    			stack.push(curr.right);
    		}
    		if (curr.left != null) {
    			stack.push(curr.left);
    		}

    	}
    
    } 
    
    /**
     * Method to count occurrences of an element
     * 
     * @param e integer to search and count
    */
    public int countOccurrences (int e) {
        return countOccurrences(root, e);
    }
    
    /**
     * Method to count occurrences of an element
     * 
     * @param e integer to search and count
     * @param r root of the tree
    */
    public int countOccurrences (node r,int e) {
        boolean found = false;
        while ((r != null) && !found) {
            int rval = r.data;
            if (e < rval)
                r = r.left;
            else if (e > rval)
                r = r.right;
            else {
                found = true;
                break;
            }
            found = search(r, e);
        }
        
        if (found) {
            return r.count;
        }
        else    
            return 0;
    }
        
    /**
     * Method to search for an element
     * 
     * @param e element to be searched
    */    
    public boolean search(int e) {
        return search(root, e);
    }
    
    /**
     * Method to search for an element
     * 
     * @param e element to be searched
     * @param r root of the tree
    */    
    private boolean search(node r, int e) {
        boolean found = false;
        while ((r != null) && !found) {
            int rval = r.data;
            if (e < rval)
                r = r.left;
            else if (e > rval)
                r = r.right;
            else {
                found = true;
                break;
            }
            found = search(r, e);
        }
        return found;
    }

} 
