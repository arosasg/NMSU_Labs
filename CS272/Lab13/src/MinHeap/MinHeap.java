package MinHeap;

import java.util.Arrays;

/**
* <h1>MinHeap</h1>
* We created methods to put, remove and top the elements of a minHeap.
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-05-01
*/

public class MinHeap {

	/**
	* @param size size of the data on the array
	* @param capacity capacity of the array
	* @param items array that stores our data	
	* */
	
	private int capacity;
	private int size;
	int[] items;
	
	/**
	 * No-argument constructor
	 */
	public MinHeap() {
		capacity = 10;
		size = 0;
		items = new int[capacity];
	}
	
	/**
	 * No-argument constructor
	 */
	private int getLeftChildIndex(int parentIndex) {
		return (2 * parentIndex + 1);
	}
	
	private int getRightChildIndex(int parentIndex) {
		return (2 * parentIndex + 2);
	}
	
	private int getParentIndex(int childIndex) {
		return ((childIndex - 1) / 2);
	}
	
	private boolean hasLeftChild(int index) {
		return (getLeftChildIndex(index) < size);
	}
	
	private boolean hasRightChild(int index) {
		return (getRightChildIndex(index) < size);
	}
	
	private boolean hasParent(int index) {
		return (getParentIndex(index) >= 0);
	}
	
	private int leftChild(int index) {
		return items[getLeftChildIndex(index)];
	}
	
	private int rightChild(int index) {
		return items[getRightChildIndex(index)];
	}
	
	private int parent(int index) {
		return items[getParentIndex(index)];
	}
	
	/**
	 * swap items on the array
	 */
	private void swap(int indexOne, int indexTwo) {
		int temp = items[indexOne];
		items[indexOne] = items[indexTwo];
		items[indexTwo] = temp;
	}
	
	/**
	 * Method to ensure capacity of our arrays
	 */
	private void ensureExtraCapacity() {
		if (size == capacity) {
			capacity = capacity * 2;
			items = Arrays.copyOf(items, capacity * 2);
		}
	}
	
	/**
	 * Method to add elements on the heap
	 * 
	 * @param e element to be added
	 */
	public void add(int e) {
		ensureExtraCapacity();
		items[size] = e;
		size++;
		heapifyUp();
	}
	
	/**
	 * Method to remove the minimum element on the array
	 */
	public int remove() {
		if (size == 0) 
			throw new IllegalStateException();
		int item = items[0];
		items[0] = items[size - 1];
		size--;
		heapifyDown();
		return item;
	}
	
	/**
	 * Method to get the minimum element on the array
	 */
	public int top() {
		if (size == 0) 
			throw new IllegalStateException();
		return items[0];
	}
	
	/**
	 * Method to put in their place the elements when we removed the minimum element
	 */
	public void heapifyDown() {
		int index = 0;
		while (hasLeftChild(index)) {
			int smallerChildIndex = getLeftChildIndex(index);
			if (hasRightChild(index) && rightChild(index) < leftChild(index)) 
				smallerChildIndex = getRightChildIndex(index);
			if (items[index] < items[smallerChildIndex]) 
				break;
			else 
				swap(index, smallerChildIndex);
			index = smallerChildIndex;
		}
	}
	
	/**
	 * Method to put in their place the elements when we added an element
	 */
	public void heapifyUp() {
		int index = size - 1;
		while (hasParent(index) && parent(index) > items[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}
	
	/**
	 * copy array on range of size
	 */
	public int[] copyarray() {
		return Arrays.copyOfRange(items, 0, size);
	}
	
	/**
	 * Method to do a binary search on a sorted array
	 * 
	 * @param A array
	 * @param e element to find on the array
	 */
	public static int binarySearch (int[] A, int e) {
        int left = 0, right = A.length - 1; 
        while (left <= right) { 
            int mid = left + (right - left) / 2; 
            if (A[mid] == e) 
                return mid; 
            if (A[mid] < e) 
            	left = mid + 1; 
            else
            	right = mid - 1; 
        } 
        return -1; 
    } 
	
	/**
	 * Main method to test the other methods
	 */
	public static void main(String[] args) {
		MinHeap heap = new MinHeap();
		
		heap.add(3);
		heap.add(1);
		heap.add(2);
		heap.add(9);
		heap.add(5);
		
		System.out.println("Remove minimum number of the array is: " + heap.remove()); //expected 1
		System.out.println("Remove minimum number of the array is: " + heap.remove()); //expected 2
		System.out.println("Remove minimum number of the array is: " + heap.top()); //expected 3
		
		heap.add(13);
		heap.add(23);
		heap.add(19);
		heap.add(52);
		heap.add(15);
		heap.add(42);
		heap.add(12);
		heap.add(53);
		
		int[] array = heap.copyarray();
		Arrays.sort(array);
		for (int i =0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("search index of key 42: " + binarySearch(array,42)); //expected 8	
	}

}
