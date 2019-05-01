package HashTables;

import java.util.Arrays;

/**
* <h1>HashTable</h1>
* We created methods to put, remove and search pair of key-values in a hash table.
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-05-01
*/

public class BookTable {
	
	/**
	* @param size size of the data on the arrays
	* @param capacity capacity of the array
	* @param keys array to store the keys
	* @param data  array to store the values of the keys
	* @param used  array that store if data[idx] is used
	*/
	
	private int size;
	private int capacity;
	private int[] keys;
	private Object[] data;
	private boolean[] used;
	
	/**
	 * No-argument constructor
	 */
	public BookTable() {
		size = 0;
		capacity = 10;
		keys = new int[capacity];
		data = new Object[capacity];
		used = new boolean[capacity];
		Arrays.fill(used, Boolean.FALSE);
	}
	
	/**
	 * Method to ensure capacity of our arrays
	 */
	private void ensureExtraCapacity() {
		int i;
		if (size == capacity) {
			System.out.println("The HashTable is full, creating new one with double capacity");
			capacity = capacity * 2;
			int [] keystemp = new int[capacity];
			Object[] datatemp = new Object[capacity];
			boolean[] usedtemp = new boolean[capacity];
			for(i=0; i < data.length; i++) {
				int idx = Hash(keys[i]);
				while (usedtemp[idx] == true) {
					if (idx == capacity - 1) idx = -1;
					idx += 1;
				}
				keystemp[idx] = keys[i];
				datatemp[idx] = data[i];
				usedtemp[idx] = true;
			}
			keys = keystemp;
			data = datatemp;
			used = usedtemp;
		}
	}
	
	/**
	 * Hash function that maps an index
	 */
	private int Hash(int key) {
		return	Math.abs(key % capacity);
	}
	
	/**
	 * Method to return the value of a given key
	 * 
	 * @param key key that we are searching
	 */
	public Object get(int key) {
		int idx = search(key);
		if (idx == -1) return null;
		else return data[idx];
	}
	
	/**
	 * Add key-value pair to the hash table
	 * 
	 * @param key key to be added
	 * @param data data to be added
	 */
	public void put(int key, Object data) {
		ensureExtraCapacity();
		int idx = search(key);
		if (idx != -1) {
			this.data[idx] = data;			
		}
		else {
			idx = Hash(key);
			while (used[idx] == true) {
				if (idx == capacity - 1) idx = -1;
				idx += 1;
			}
			keys[idx] = key;
			this.data[idx] = data;
			used[idx] = true;
			size++;
		}
	}
	
	/**
	 * method to remove a given pair of key-values
	 * 
	 * @param key key to remove from the hash table
	 */
	public boolean remove(int key) {
		int idx = search(key);
		if (idx == -1) return false;
		keys[idx] = -1;
		data[idx] = null;
		used[idx] = false;
		size--;
		return true;
	}
	
	/**
	 * method to search for a given key on the hash table
	 * 
	 * @param key key to be searched
	 */
	public int search(int key) {		
		int idx1 = Hash(key);
		int counter = 0;
		while (counter < data.length && ((used[idx1] == false) || (data[idx1] != null))){
			if (key == keys[idx1]) return idx1;
			if (idx1 == capacity - 1) idx1 = -1;
			idx1 += 1;
			counter += 1;
		}
		return -1;	
	}
	
	/**
	 * Main method to test our other methods
	 */
	public static void main(String[] args) {
		BookTable booksData = new BookTable();
		booksData.put(23, "Eclipse");
		booksData.put(10, "harry potter");
		booksData.put(13, "avatar");
		booksData.put(1, "GOT");
		booksData.put(2, "urgency");

		System.out.println("the index of 23 in the array is: " + booksData.search(23)); //expected 3
		System.out.println("the index of 10 in the array is: " + booksData.search(10)); //expected 0
		System.out.println("the index of 13 in the array is: " + booksData.search(13)); //expected 4
		System.out.println("the index of 1 in the array is: " + booksData.search(1)); //expected 1
		System.out.println("the index of 2 in the array is: " + booksData.search(2)); //expected 2
		
		System.out.println(booksData.remove(1)); //expected true
		System.out.println("the index of 23 in the array is: " + booksData.search(1)); //expected -1
		
		System.out.println("Data for key 23 is: " + booksData.get(1)); //expected null
		System.out.println("Data for key 13 is: " + booksData.get(13)); //expected "avatar"
		System.out.println("Data for key 2 is: " + booksData.get(2)); //expected "urgency"
		
		booksData.put(32, "toronto");
		booksData.put(33, "nyc");
		booksData.put(34, "paris");
		booksData.put(35, "bcn");
		booksData.put(36, "madrid");
		booksData.put(37, "tenerife");
		booksData.put(38, "galicia");	
		
		System.out.println("the index of 13 in the array is: " + booksData.search(13)); //expected 	13
		
	}

}
