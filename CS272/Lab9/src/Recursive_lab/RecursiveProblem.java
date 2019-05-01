package Recursive_lab;

public class RecursiveProblem {
	
	public static int FibBinaryRecursive(int k) {
		
		// For the cases where initial k < 0
    	if (k < 0)
    		throw new IllegalArgumentException("Only Positive Numbers Please!"); 
		
		// Base Case
		if (k <= 1) 
		       return k; 
		
		return FibBinaryRecursive(k-1) + FibBinaryRecursive(k-2); 
	} 
	
	/*
	 * Algorithm: 
	 * Move n-1 disks from 'A' to 'B'.	 * 
	 * Move disk n from 'A' to 'C'. 
	 * Move n-1 disks from 'B' to 'C'.
	 */
    public static void TowersOfHanoi(int n, char intitial_rod, char final_rod, char support_rod) { 
    	// Base Case
        if (n == 1) { 
        	
        	//This is always our last and first move for n>2
        	System.out.println("Move disk 1 from " +  intitial_rod + " to " + final_rod);    
        	return; 
        } 
        else {
        	// Change order of param for appropriate recursion
	        TowersOfHanoi(n-1, intitial_rod, support_rod, final_rod); 
	        System.out.println("Move disk " + n + " from " +  intitial_rod + " to " + final_rod); 
	        TowersOfHanoi(n-1, support_rod, final_rod, intitial_rod); 
        }
    } 
    
    public static void showCallLevel(int L, int curl) {
    	if ((L == 1) && (curl == 1)) {
    		System.out.println("This was written by call number " + L + "x.");
    		return;
    	}
    	showCallLevel(L-1,curl);
    	System.out.println("This was written by call number " + L + "x.");
    	showCallLevel(L,curl-1);
    	
    }

    public static int BinaryPrint (int n) {
    	if (n < 0)
    		throw new IllegalArgumentException("Only Positive Numbers Please!"); 
    	
    	if (n == 0) 
    		return 0;  
    	
    	else          
    		return (n % 2 + 10 * BinaryPrint(n / 2));        	
    }
    
    public static void Permutation(int[] array, int size, int n) {
		if (size == 1) {
			for (int i=0; i<n; i++) 
				System.out.print(array[i] + " "); 
			System.out.println(); 
    	}
		for (int i=0; i<size; i++) 
		{ 
			Permutation(array, size-1, n); 

			// if size is odd, swap first and last 
			// element 
			if (size % 2 == 1) 
			{ 
				int temp = array[0]; 
				array[0] = array[size-1]; 
				array[size-1] = temp; 
			} 

			// If size is even, swap ith and last 
			// element 
			else
			{ 
				int temp = array[i]; 
				array[i] = array[size-1]; 
				array[size-1] = temp; 
			} 
		} 
	} 

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(FibBinaryRecursive(4));
		System.out.println(FibBinaryRecursive(6));
		System.out.println(FibBinaryRecursive(1));
		System.out.println(FibBinaryRecursive(0));
		
		TowersOfHanoi(3, 'A', 'C', 'B'); 
		System.out.println("");
		TowersOfHanoi(2, 'A', 'C', 'B'); 		
		System.out.println("");
		
		//showCallLevel(4,1);
		
		System.out.println(BinaryPrint(100));
		System.out.println("");
	
		int a[] = {1}; 
		int b[] = {1,2}; 
		int c[] = {1,2,3,4,5}; 
		int d[] = {1,2,3,4,5,6,7,8,9,10}; 
		Permutation(a, a.length, a.length);
		System.out.println("");
		Permutation(b, b.length, b.length); 
		System.out.println("");
		Permutation(c, c.length, c.length); 
		System.out.println("");
		//Permutation(d, d.length, d.length); 
		//System.out.println("");
	}
}
