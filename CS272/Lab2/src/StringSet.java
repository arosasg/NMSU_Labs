import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
* <h1>String Data Structure</h1>
* We create methods to modify a string array, changing it's capacity
* add strings, delete strings, check size...
* and then we check the information, or clone some objects...
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-02-04
*/
public class StringSet {
	
	/**
	 * the authors names
	 */
	private String[] stringValues;
	/**
	 * the number of authors
	 * always positive value
	 */
	private int stringNumber;
	/**
	 * the capacity of the string array
	 * always positive value
	 */
	private int capacity;
	
	/**
	 *Constructor that assigns capacity to 2, stringNumber 
	 *to 0 and creates a string array named StringValues with 
	 *size length
	 */
	public StringSet() {
		capacity = 2;
		stringValues = new String[2];
		stringNumber = 0;
	}
	
	/**
	 *Constructor that assigns capacity to _capacity value, stringNumber 
	 *to 0 and creates a string array named StringValues with capacity size.
	 *@param _capacity  Elements number that the String array is able to store. Needs to be positive.
	 */
	public StringSet(int _capacity) {
		if (_capacity > 0) {
			capacity = _capacity;
			stringValues = new String[capacity];
			stringNumber = 0;
		}
	}
	
	/**
	 * A copy constructor, which creates a new StringSet instance and 
	 * copies the content of the given object to the new instance.
	 *@param obj  Object that we want to copy into. Should not be null and be an instance of the class StringSet
	 */
	public StringSet (Object obj) {
		//Precondition is that obj should not be 
		//null and should be an instance of the Book class. 
		if ((obj != null) && (obj instanceof StringSet)){
			StringSet temp = (StringSet)obj;
			capacity = temp.capacity;
			stringValues = temp.stringValues;
			stringNumber = temp.stringNumber;
		}	
	}
	
	/**
	 *Gives size of the String array without the 'null' values.
	 *@return stringNumber  String array size.
	 */
	public int size() {
		List<String> list = new ArrayList(Arrays.asList(stringValues));
		list.removeAll(Collections.singleton(null));  //remove all the 'null' elements
		stringNumber = list.size();
		return stringNumber;
	}
	
	/**
	 *Gives capacity of the object.
	 *@return capacity  Elements that the String array is able to store.
	 */
	public int capacity() {
		return capacity;
	}
	
	/**
	 *Modifies the string array to store the parameter. If the String array size is equal to the capacity 
	 *of the object, then we double the capacity calling ensureCapacity method. When we add the author, 
	 *we remove all the 'null' values on the list for a correct sorting of the list, for after
	 *converting another time to an String array with size equal to capacity.
	 *@param elem  String desired to be added to the String array. Should not be null.
	 */
	public void add(String elem) {
		if (elem != null){
			if (stringNumber == capacity) {
				ensureCapacity(2*capacity);
			}
			List<String> list = new ArrayList(Arrays.asList(stringValues)); //convert to list to modify 
			list.add(elem);
			list.removeAll(Collections.singleton(null)); //remove all the 'null' elements
			Collections.sort(list);
			String[] newString = new String[capacity]; 
			stringValues = list.toArray(newString);
			stringNumber = stringNumber + 1; //add 1 to the StringNumber
		}
	}
	
	/**
	 *Check if some element of the String array is equal to the parameter a.
	 *@param author  String desired to check if it's contained on String array. 
	 *@return true  If the element is indeed in the String array, then returns true.
	 *@return false  If the parameter is not in the String array or is 'null', then the method return false. 
	 */
	public boolean contains(String author) {
		if (author == null){
			return false;
		}
		else {
			List<String> list = new ArrayList(Arrays.asList(stringValues));
			for (String e1: list) {  //Iterates through the elements of the list
		        if(e1 == author){
		        	return true;
		        }
			}
			return false;
		}
	}
	
	/**
	 *Deletes the parameter a if it's contained on the String array. We call the method
	 *contains to condition through this method.
	 *@param author String desired to remove from the String array.
	 *@return true  If the String was removed
	 *@return false  Elsewhere
	 */
	public boolean remove(String author) {
		if (contains(author)) {
			List<String> list = new ArrayList(Arrays.asList(stringValues));
			list.remove(author);
			String[] newString = new String[capacity];
			stringValues = list.toArray(newString);	
			stringNumber = stringNumber - 1;
			return true;
		}
		return false;
	}
	
	/**
	 *Ensure the capacity of the String array. It's called from either add or addOrdered methods
	 *if the String array is already full. If it's the case, then we double the capacity.
	 *@param minimumCapacity  Set the capacity of the String array to the value of the parameter if the capacity is less than the parameter.
	 */
	private void ensureCapacity(int minimumCapacity) {
		if (capacity < minimumCapacity) {
			capacity = minimumCapacity;
			List<String> list = new ArrayList(Arrays.asList(stringValues));
			String[] newString = new String[capacity];
			stringValues = list.toArray(newString);
		}
	}
	
	/**
	 *Adds the parameter a to the String array already sorted and in the correct index 
	 *to keep having the String array sorted. We iterate through the elements of the String array
	 *and we find where a should be added.
	 *@param elem  String to be added to the String array. Should not be null.
	 */
	public void addOrdered(String elem) {
		if ((elem != null) && (isSorted(stringValues))) {
			if (stringNumber == capacity) {
				ensureCapacity(2*capacity);
			}
			List<String> list = new ArrayList(Arrays.asList(stringValues));
			String previous = ""; 
			for (final String current: list) {
			    if (elem.compareTo(current) < 0) { //compare if the parameter is less than the current index
			    	list.add(list.indexOf(current),elem);
					String[] newString = new String[capacity];
					stringValues = list.toArray(newString);
			    	break;
			    }
			    previous = current;
			}
			stringNumber = stringNumber + 1;
		}
	}
	
	/**
	 *Check if the String array is sorted. The way to do this is to iterate through the array and check 
	 *if the current element is bigger than the previous one.
	 *We created a String variable to check previous over this variable on the first iteration.
	 *@param array  String array of the object.
	 *@return true  If the the String array is sorted
	 *@return false  If the String is not sorted
	 */
	public boolean isSorted(String[] array) {
		String previous = ""; 
		List<String> list = new ArrayList(Arrays.asList(array));
	    list.removeAll(Collections.singleton(null));
		for (final String current: list) {
		    if (current.compareTo(previous) < 0) { //conditional to check if the current elem is less than the previous
		        return false;
		    }
		    previous = current;
		}
		return true;
	}
	
	/**
	 *Return the String array with all the authors. We remove first all the 'null' elements.
	 *@return   String array without 'null'.
	 */
	public String[] authors() {
		List<String> list = new ArrayList(Arrays.asList(stringValues));
	    list.removeAll(Collections.singleton(null));
	    return list.toArray(new String[list.size()]);

	}
	
	/**
	 *Main method where we test all our methods and check that our program is 100% 
	 *functional and ready to be implemented.
	 */
	public static void main(String[] args) {
		
		StringSet array1 = new StringSet();
		StringSet array2 = new StringSet(8);
		
		array1.add("Welcome");
		array1.add("scoop");
		array1.add("rafael");
		array1.add("nadal");
		array1.add("test");
		
		System.out.println("Size of array1 : " + array1.size());
		System.out.println("Capacity of array1 : " + array1.capacity());
		System.out.println("Capacity of array2 : " + array2.capacity());
		System.out.println("Array1 contains 'nadal' : " + array1.contains("nadal"));
		System.out.println("Array1 contains 'brady' : " + array1.contains("brady"));
		
		System.out.println("Array1 remove 'nadal' : " + array1.remove("nadal"));
		System.out.println("Array1 contains 'nadal' : " + array1.contains("nadal"));
		System.out.println("Array1 contains : " + Arrays.toString(array1.authors()));
		
		StringSet array3 = new StringSet(array1);
		
		System.out.println("Capacity of array3 : " + array3.capacity());
		System.out.println("Array3 contains : " + Arrays.toString(array3.authors()));
		
		array3.addOrdered("art");
		array3.addOrdered("consele");
		array3.addOrdered("art2");
		array3.addOrdered("consele2");
		array3.addOrdered("art3");
		array3.addOrdered("consele3");
		
		System.out.println("Array3 contains : " + Arrays.toString(array3.authors()));
		
		System.out.println("Capacity of array3 : " + array3.capacity());
	
	}
}
