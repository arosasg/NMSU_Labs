package Binary_Search_Tree;

/**
 *  Node for Binary Tree
 * 
 * @author Huiping Cao and forked by Alejandro Rosas
 */
class BSTNode{
	private int data;   //the element value for this node
	BSTNode left;	//the left child of this node
	BSTNode right;	//the right child of this node
	
	/**
	 * No-argument constructor
	 */
	public BSTNode(){}
	
	/**
	 * Constructor with the initial element
	 * @param initData: the initial element
	 */
	public BSTNode(int initData){
		data = initData; 
		left = null;
		right = null;
	}
	
	/**
	 * Constructor with the initial element, initial left and right children
	 * @param initData: the initial element
	 * @param initParent: the initial parent tree
	 * @param initLeft: left child
	 * @param initRight: right child
	 */
	public BSTNode(int initData, BSTNode initLeft, BSTNode initRight){
		data = initData;
		left = initLeft;
		right = initRight;
	}

	/**
	 * Evaluate whether this node is a leaf node or not
	 * @return true if it is a leaf node; otherwise, return false.
	 */
	public boolean isLeaf()
	{
		return (((left==null)||(left!=null && left==null))
				&&((right==null)||(right!=null && right==null)));
	}
	
	
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param set the element in this node
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the left child
	 */
	public BSTNode getLeft() {
		return left;
	}

	/**
	 * @param the left child to be set
	 */
	public void setLeft(BSTNode left) {
		this.left = left;
	}

	/**
	 * @return the right child
	 */
	public BSTNode getRight() {
		return right;
	}

	/**
	 * @param the right child to be set
	 */
	public void setRight(BSTNode right) {
		this.right = right;
	}
	
	
	/**
	 * Convert this BTNode to a string
	 */
	public String toString()
	{
		String str="";
		
		if((left==null)||(left!=null && left==null)) str +="(null)";
		else str +="("+left.getData()+")";
		
		str += data;
		
		if((right==null)||(right!=null&&right==null)) str +="(null)";
		else str +="("+right.getData()+")";
		
		return str;
	}

	public void inOrderPrt(int i) {
		// TODO Auto-generated method stub
		
	}
}


/**
 * The class for Binary Search Tree
 * @author Huiping Cao and forked by Alejandro Rosas
 *
 */
public class BST {
	protected BSTNode root; //the tree root
	
	/**
	 * Print the tree using in-order traversal strategy
	 */
	public void inOrderPrt(){
		inOrderPrt(root, 0);
	}
	
	/**
	 * private, recursive function
	 *     I slightly changed the method to print right subtree first
	 *     It is to make the display more easier to read
	 * 
	 * @param node
	 * @param indentation
	 * @param branch
	 */
	private void inOrderPrt(BSTNode r, int indentation){
		if(r!=null){
			if(r.right!=null) inOrderPrt(r.right, indentation+1);
			
			for(int i=0;i<indentation*4;i++) System.out.print(" ");
			
			System.out.println(r.getData());
			
			if(r.left!=null) inOrderPrt(r.left, indentation+1);
		}
	}
	
	/**
	 * Debug function, print the tree for debugging purpose
	 */
	public String toString()
	{
		if(root!=null) return root.toString();
		else return null;
	}
	
	/**
	 * Insert a new element e into the binary search tree. 
	 * NO duplicate values are allowed in the tree. When e exists in the tree, return false; 
	 * Otherwise, insert e to the tree and return true. 
	 * 
	 * @param e  element to be inserted
	 * @return false or true
	 */
    public boolean insert(int e)
    {
        if (root == null) {
        	root = insert(root, e);
        	return true;
        }
        else if (searchRecursion(e) == null){
        	root = insert(root, e);
            return true;
        }
        else
        {
            return false;
        }
    }
    
	/**
	 * private recursion function to insert element.
	 * 
	 * @param n  Node where we begin to search
	 * @param e  element to be inserted
	 * @return n root of the tree with the element inserted
	 */
    private BSTNode insert(BSTNode n, int e)
    {

        if (n == null)
            n = new BSTNode(e);
        else
        {
            if (e <= n.getData())
                n.left = insert(n.left, e);
            else
                n.right = insert(n.right, e);
        }
        return n;
    }
    
	/**
	 * Remove a specified element from the binary search tree. When e exists in the tree 
	 * and one instance is successfully removed, return true; Otherwise, return false.
	 * 
	 * @param e  element to be removed
	 * @return true or false
	 */
    public boolean remove(int e)
    {
        if (root == null) {
        	return false;
        }
        else if (searchRecursion(e) == null) {
            return false;
        }
        else
        {
            root = remove(root, e);
            return true;
        }
    }
    
	/**
	 * private, recursive function to remove element
	 * 
	 * @param r  where we begin to search
	 * @param e element to be removed
	 * @return root of the tree with the element inserted
	 */
    private BSTNode remove(BSTNode r, int e)
    {
        BSTNode n1, n2, n3;
        
        // if we the node is the element we want to remove enter condition
        if (r.getData() == e) {
            BSTNode left_tree, right_tree;
            left_tree = r.getLeft();
            right_tree = r.getRight();
            
            if (left_tree == null) {
                n1 = right_tree;
                return n1;
            }
            else if (right_tree == null) {
                n1 = left_tree;
                return n1;
            }
            else {
                n2 = right_tree;
                n1 = right_tree;
                while (n1.getLeft() != null)
                    n1 = n1.getLeft();
                n1.setLeft(left_tree);
                return n2;
            }
        }
        
        // if the element is less than the value of the node, explore to the left
        if (e < r.getData()) {
            n3 = remove(r.getLeft(), e);
            r.setLeft(n3);
        }
        // else explore the right tree
        else {
            n3 = remove(r.getRight(), e);
            r.setRight(n3);             
        }
        return r;
    }
    
	/**
	 * recursive function to search whether an element exists in a binary search tree. 
	 * If e exists, return the node that contains this element; Otherwise, return null
	 * 
	 * @param e element to search
	 * @return node containing element or null otherwise
	 * 
	 */
    public BSTNode searchRecursion(int e)
    {
        return searchRecursion(root, e);
    }
    
	/**
	 * recursive function to search an element
	 * 
	 * @param r node where we begin to search
	 * @param e  element to be searched
	 * @return node if find it, else null
	 * 
	 * worst case scenario is O(log_2(n)) for n= nodes in the tree
	 * and for a perfect tree
	 */
    private BSTNode searchRecursion(BSTNode r, int e) {          
	    if (r == null) 
	    	return null;
	    if(r.getData() == e) {
	    	   return r;
	    	  } 
	    else if(e < r.getData())
	    	return searchRecursion(r.left,e);
	    
	    else 
	        return searchRecursion(r.right,e);
    }

	/**
	 * non-recursive function to search whether an element exists in a binary search tree. 
	 * If e exists, return the node that contains this element; Otherwise, return null.
	 * 
	 * @param e
	 * @return node 
	 */
    public BSTNode searchNonRecursion(int e)
    {
        return searchNonRecursion(root, e);
    }

	/**
	 * private non-recursive function to search an element
	 * 
	 * @param r node where we begin to search
	 * @param e element to be searched
	 * @return node
	 */
    private BSTNode searchNonRecursion(BSTNode r, int e)
    {

        while ((r != null))
        {
            int value = r.getData();
            if (e < value)
                r = r.getLeft();
            else if (e > value)
                r = r.getRight();
            else
            {
                break;
            }
        }
        return r;
    }
	
	/**
	 * function to add up all the elements in this binary search tree. 
	 * Return the summation of all the elements.
	 * 
	 * @return sum of the nodes
	 */
    public int sum() {
    	return sum(root);
    }
    
	/**
	 * private recursive function to add up all the elements in this binary search tree. 
	 * Return the summation of all the elements.
	 * 
	 * @param r  root node
	 * @return sum of the nodes
	 */
	public int sum(BSTNode r) 
	{  
	    if (r == null)  
	        return 0;  
	    return (r.getData() + sum(r.left) +  
	    		sum(r.right));  
	}  
	
	/**
	 * Test cases provided by the instructor
	 * @throws Exception
	 */
	private static void test1() throws Exception{
		BST tree = new BST();
		System.out.println("Initial tree:");
		tree.inOrderPrt(); //test inOrder traversal
		
		boolean rc = true;
		
		//test 1: insert method, and test 2 in-order traversal
		rc = tree.insert(12); System.out.println("\nInsert 12, inserted="+rc+", after adding 12:"); tree.inOrderPrt();
		rc = tree.insert(6);  System.out.println("\nInsert 6, inserted="+rc+", after adding 6:"); tree.inOrderPrt();
		rc = tree.insert(19); System.out.println("\nInsert 19, inserted="+rc+", after adding 19:"); tree.inOrderPrt();
		rc = tree.insert(4);  System.out.println("\nInsert 4, inserted="+rc+", after adding 4:"); tree.inOrderPrt();
		rc = tree.insert(8);  System.out.println("\nInsert 8, inserted="+rc+", after adding 8:"); tree.inOrderPrt();
		rc = tree.insert(16); System.out.println("\nInsert 16, inserted="+rc+", after adding 16:"); tree.inOrderPrt();
		rc = tree.insert(8);  System.out.println("\nInsert 8 (second), inserted="+rc+", after adding 8:"); tree.inOrderPrt();
		rc = tree.insert(5);  System.out.println("\nInsert 5, inserted="+rc+", after adding 5:"); tree.inOrderPrt();
		rc = tree.insert(9);  System.out.println("\nInsert 9, inserted="+rc+", after adding 9:"); tree.inOrderPrt();
		rc = tree.insert(20);  System.out.println("\nInsert 20, inserted="+rc+", after adding 20:"); tree.inOrderPrt();
		
		System.out.println("Inorder traversal results:");
		tree.inOrderPrt(); 
		System.out.print("\n\n");
		
		//test 3: search method
		BSTNode node = tree.searchRecursion(6);
		System.out.println("searchRecursion 6, node="+node);
		node = tree.searchRecursion(22);
		System.out.println("searchRecursion 22, node="+node);
		node = tree.searchRecursion(8);
		System.out.println("searchRecursion 8, node="+node+"\n");
		
		node = tree.searchNonRecursion(6);
		System.out.println("searchNonRecursion 6, node="+node);
		node = tree.searchNonRecursion(22);
		System.out.println("searchNonRecursion 22, node="+node);
		node = tree.searchNonRecursion(8);
		System.out.println("searchNonRecursion 8, node="+node);
		
		//test 4: remove method
		rc = tree.remove(30); //test case 0: e does not exist
		System.out.println("\nRemove 30, rc="+rc);
		tree.inOrderPrt();
		
		rc = tree.remove(20); //test case 1: leaf
		System.out.println("\nRemove 20, rc="+rc);
		tree.inOrderPrt();
		
		rc = tree.remove(4); //test case 2: left is empty
		System.out.println("\nRemove 4, rc="+rc);
		tree.inOrderPrt();
		
		
		rc = tree.remove(19); //test case 3: right is empty
		System.out.println("\nRemove 19, rc="+rc);
		tree.inOrderPrt();
		
		rc = tree.remove(6); //test case 4: no subtree is empty
		System.out.println("\nRemove 6, rc="+rc);
		tree.inOrderPrt();
		
		rc = tree.remove(12); //more tests: remove root
		System.out.println("\nRemove 12, rc="+rc);
		tree.inOrderPrt();
		
		rc = tree.remove(8); //more tests
		System.out.println("\nRemove 8, rc="+rc);
		tree.inOrderPrt();
		
		rc = tree.remove(5); //more tests
		System.out.println("\nRemove 5, rc="+rc);
		tree.inOrderPrt();
		
		rc = tree.remove(8); //more tests
		System.out.println("\nRemove 8, rc="+rc);
		tree.inOrderPrt();
		rc = tree.remove(16); //more tests
		System.out.println("\nRemove 16, rc="+rc);
		tree.inOrderPrt();
		System.out.print("sum="+tree.sum()+"\n");
		
		System.out.println("\nAdding a series of numbers:");
		tree.insert(30);
		tree.insert(20);tree.insert(10);tree.insert(25);tree.insert(28);tree.insert(24);
		tree.insert(11);tree.insert(5);tree.insert(11);tree.insert(12);
		tree.insert(50);tree.insert(40);tree.insert(35);
		tree.inOrderPrt();
		System.out.print("sum="+tree.sum()+"\n");
		
		System.out.print("sum="+tree.sum()+"\n");
		System.out.print("\n\n");
		
		System.out.println("\nRemove 20 (removeNode case 4):");
		tree.remove(20);
		tree.inOrderPrt();
		System.out.print("sum="+tree.sum()+"\n");
		
		System.out.println("Inorder traversal results: ");
		tree.inOrderPrt();
		System.out.print("\n");
		System.out.print("sum="+tree.sum()+"\n");
	}
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//You need to let your program pass the  test cases in this function
		test1(); 
		
		//You can add your own test cases here. 
		
	}

}